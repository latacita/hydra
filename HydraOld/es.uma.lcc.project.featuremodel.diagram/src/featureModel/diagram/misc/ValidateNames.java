package featureModel.diagram.misc;

import hub.sam.tef.Utilities;
import hub.sam.tef.modelcreating.IModelCreatingContext;
import hub.sam.tef.modelcreating.ModelCreating;
import hub.sam.tef.modelcreating.ModelCreatingContext;
import hub.sam.tef.semantics.DefaultIdentificationScheme;
import hub.sam.tef.semantics.DefaultSemanticsProvider;
import hub.sam.tef.tsl.Syntax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.EditorPart;
import featureModel.Feature;
import featureModel.Node;
import featureModel.Project;
import featureModel.diagram.part.FeaturemodelDiagramEditor;
import featureModel.diagram.part.MultiPageEditor;

//import tef.project.TextEditor;
import org.eclipse.ui.editors.text.TextEditor;
//import org.jaxen.JaxenException;

//import ca.ecliptical.emf.xpath.EMFXPath;

import tef.project.ILangInstConstants;
import tef.project.expressions.BinaryOperator;
import tef.project.expressions.ComparisonOperator;
import tef.project.expressions.Expression;
import tef.project.expressions.Function;
import tef.project.expressions.Model;
import tef.project.expressions.QuantifyOperator;
import tef.project.expressions.UnaryOperator;

public class ValidateNames{

	MultiPageEditor myMultiEditorPage;
	IEditorPart myEditor;
	private List<String> restricted = new ArrayList<String>();


	public ValidateNames(MultiPageEditor multiPageEditor){
		restricted.add("implies");
		restricted.add("or");
		restricted.add("and");
		restricted.add("not");
		restricted.add("count");
		restricted.add("any");
		restricted.add("all");
		myMultiEditorPage = multiPageEditor;
	}

	public void setEditorPart (IEditorPart editor){
		myEditor = editor;
	}

	public boolean validate() {
		int activePage = 1;

		EditorPart myEditor = myMultiEditorPage.getEditor(activePage);
		EditorPart modelEditor = myMultiEditorPage.getEditor(0);
		Project p = (Project) ((View)((FeaturemodelDiagramEditor)modelEditor).getDiagramEditPart().getModel()).getElement();
		String algo3 = ((TextEditor)myEditor).getDocumentProvider().getDocument(myEditor.getEditorInput()).get();

		IModelCreatingContext context = new ModelCreatingContext(
				ILangInstConstants.epaMetamodels, new DefaultSemanticsProvider(
						DefaultIdentificationScheme.INSTANCE),
						new ResourceImpl(), algo3);

		EObject eoLangInstModel = null;

		try {
			
			Syntax sSyntax = Utilities.loadSyntaxDescription(ILangInstConstants.bSyntaxBundle,
					ILangInstConstants.sSyntaxPath, ILangInstConstants.epaMetamodels);
			
			eoLangInstModel = ModelCreating.createModelFromText(context, sSyntax);

			myMultiEditorPage.setUserConstraints(eoLangInstModel);
		} catch (Exception e){
			e.printStackTrace();
		}

		return validateNamesFunction((Model) eoLangInstModel, p);

	}

	private boolean validateNamesFunction(Model userConstraints,Project p){
		boolean result = true;
		String message = "";
		int line = 1;
		if (userConstraints != null){
			for (Object e: userConstraints.getConstraints()){
				String lineMessage = "";
				if (e instanceof Expression){
					List<String> affectedFeatures = getNames((Expression) e);

					for (String s : affectedFeatures){
						if (!exists(p, s)){
							if (lineMessage.isEmpty()) lineMessage = "Line " + line + " : ";
							lineMessage += s + "  ";
						}
					}
				}
				if (!lineMessage.isEmpty()){
					if (message.isEmpty()) message = "Forbidden or incorrect words:\n";
					message += lineMessage + "\n";
				}
				line++;
			}
		}else{
			result = false;
		}

		if (!message.isEmpty()){
			MessageDialog.openInformation(null, "Hydra Message", message);
			result = false;
		}
		
		return result;
	}

	private List<String> getNames(Expression e){
		List<String> names = new ArrayList<String>();

		if ( e instanceof BinaryOperator){
			names.addAll(getNames(((BinaryOperator)e).getOp1()));
			names.addAll(getNames(((BinaryOperator)e).getOp2()));
		}else if (e instanceof ComparisonOperator){
			names.addAll(getNames(((ComparisonOperator)e).getOp1()));
			names.addAll(getNames(((ComparisonOperator)e).getOp2()));
		}else if (e instanceof UnaryOperator){
			names.addAll(getNames(((UnaryOperator)e).getOp()));
		}else if (e instanceof QuantifyOperator){
			names.add(((QuantifyOperator) e).getOp().getName());
		}else if (e instanceof tef.project.expressions.Feature){
			names.add(((tef.project.expressions.Feature)e).getName());
		} else if (e instanceof Function){
			names.add(((Function) e).getOp().getName());
		}
		return names;
	}

	private boolean exists(Project project, String name){
		boolean res = false;
		Iterator<?> it = project.getFeatures().iterator();
		while (!res && it.hasNext()){
			Node n = (Node) it.next();
			if (n instanceof Feature && ((Feature)n).getName().equals(name)) res = true;
		}

		return res;
	}
}