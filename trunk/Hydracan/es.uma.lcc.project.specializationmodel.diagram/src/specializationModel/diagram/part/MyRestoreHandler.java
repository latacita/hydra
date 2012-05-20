package specializationModel.diagram.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.commands.SetPropertyCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil; 

import specializationModel.ConfigState;
import specializationModel.Feature;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.SpecializationModelPackage;
import specializationModel.diagram.edit.parts.FeatureEditPart;
import specializationModel.diagram.edit.parts.ProjectEditPart;
// import specializationModel.diagram.validator.ChocoValidator;
import specializationModel.provider.SpecializationmodelEditPlugin;

public class MyRestoreHandler extends AbstractHandler { 

	FeatureEditPart selectedElement;

	@Override 
	public Object execute(ExecutionEvent event) throws ExecutionException { 
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event); 
		//		MyObject object = (MyObject) selection.getFirstElement(); 
		// do something with MyObject 
		selectedElement = (FeatureEditPart) selection.getFirstElement();
		ProjectEditPart projectEditPart = (ProjectEditPart)selectedElement.getParent();

		// ChocoValidator cv = projectEditPart.getMyChocoValidator();

		/**
		if (cv.canValidate()){


			Feature feature = (Feature) ((View)selectedElement.getModel()).getElement();
			//		run2();
			Shell s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			LabelProvider lp = new LabelProvider();
			ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
					specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());
			List<EObject> listA = new ArrayList();

			for (Object v : ((View)projectEditPart.getModel()).getChildren()){
				EObject eObject = ((View)v).getElement();
				if ( !((View)v).isVisible() && eObject instanceof Feature && ((Feature)eObject).getFather().equals(feature))
					listA.add(eObject);
			}
			**/



			//		for (specializationModel.Node node : feature.getChildren()){
			//			View v = findView((View) pep.getModel(), (EObject)node);
			//			if (!v.isVisible()) listA.add(node);
			//		}
			/**
			List<?> listB = new ArrayList();
			ResourceLocator resourceLocator = SpecializationmodelEditPlugin.INSTANCE;

			EClass ec = SpecializationModelPackage.eINSTANCE.getFeature();
			FeatureEditorDialog dialog = new FeatureEditorDialog(
					s,
					labelProvider,
					(EObject) feature,
					ec.getEStructuralFeature(SpecializationModelPackage.eINSTANCE.getFeature().getClassifierID()).getEType() ,
					listB,
					"Select Features you want to restore", listA);
			dialog.open();
			List<?> result =  dialog.getResult();

			if (result != null){
				for (Object o : result){
					run2(projectEditPart, feature, (specializationModel.Node)o);
					EList<Object> eList = new BasicEList(((Feature) o).getFather().getChildren());
					eList.add(o);

					IEditCommandRequest myRequestChildren = new SetRequest(selectedElement.getEditingDomain(), ((Feature)o).getFather(), SpecializationModelPackage.eINSTANCE.getFeature_Children(), eList);
					SetValueCommand mySVCChildren = new SetValueCommand((SetRequest)myRequestChildren);
					try {
						mySVCChildren.execute(new NullProgressMonitor(), null);
					} catch (ExecutionException e) {
						// TODO Auto-genera	ted catch block
						e.printStackTrace();
					}

				}
			}
			
			projectEditPart.loadModel();
			Project project = (Project)((View)projectEditPart.getModel()).getElement();
			if (!project.isInfiniteDomain()){
				cv = projectEditPart.getMyChocoValidator();
				cv.validate();
				projectEditPart.executePunishment();
			}
		}
		**/
		return null;
	} 
	
	private View findTargetEdgesView(View v){	
		EList<?> el = v.getTargetEdges();
		
		return (View) el.get(0);
	}
	
	private View findView(View project, EObject eObject){
		View result = null;
		Iterator<?> it = project.getChildren().iterator();
		
		while (result == null && it.hasNext()){
			View obj = (View) it.next();
			if (obj.getElement().equals(eObject)) result = obj; 
		}
		return result;
	}
	
	public void run() {
		Feature myFeature = (Feature) ((View)selectedElement.getModel()).getElement();
		ProjectEditPart pep = (ProjectEditPart) selectedElement.getParent();
		
		for ( specializationModel.Node n : myFeature.getChildren()){
			View v = findView((View) pep.getModel(), n);
			if ( !v.isVisible()){
				v.setVisible(true);
				cascadeVisible(n);
			}
		}
	}
	
	public void run2(ProjectEditPart pep, specializationModel.Node nodeFather, specializationModel.Node nodeChild){
//	SetPropertyCommand
		
		View v = findView((View) pep.getModel(), nodeChild);

		setViewVisible(v);
//		FeatureEditPart algo = (FeatureEditPart) selectedElement.findEditPart(selectedElement.getParent(), v.getElement());
		View temp = findTargetEdgesView(v);
		setViewVisible(temp);
		
		
		if (nodeChild instanceof Feature &&  ((Feature)nodeChild).getReferences() != null){
			Feature reference = ((Feature)nodeChild).getReferences();
			while ( reference.getReferences() != null){
				reference = reference.getReferences();
			}
			EList<Feature> listReferenciated = new BasicEList<Feature>(reference.getReferenciated());
			listReferenciated.add((Feature) nodeChild);
			IEditCommandRequest myRequestReferenciated = new SetRequest(selectedElement.getEditingDomain(), reference, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), listReferenciated);
			SetValueCommand mySVCReferenciated = new SetValueCommand((SetRequest)myRequestReferenciated);
			try {
				mySVCReferenciated.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				// TODO Auto-genera	ted catch block
				e.printStackTrace();
			}	
		}
		
		
		
		
		
		cascadeVisible(nodeChild);
	}
	
	
	private EditPart getEPRelationAndRestoreValues(ProjectEditPart project, specializationModel.Node source, specializationModel.Node target){
		EditPart result = null;
		Iterator<?> iterator = project.getConnections().iterator();
		EditPart s = selectedElement.findEditPart(selectedElement.getParent(), source);
		EditPart t = selectedElement.findEditPart(selectedElement.getParent(), target);
		while (result == null && iterator.hasNext()){
			ConnectionEditPart aux = (ConnectionEditPart) iterator.next();
			Relation r = (Relation) ((View)aux.getModel()).getElement();
			
			if ( r.getSource().equals(source) && r.getTarget().equals(target)) result = aux;
			
			Object a1 = aux.getSource();
			Object a2 = aux.getTarget();
			
			if (a1 == null) aux.setSource(s);
			if (a2 == null) aux.setTarget(t);
		}		
		return result;
	}
		
	public void setViewVisible(View v){
    	final ICommandProxy icp = new ICommandProxy( new SetPropertyCommand(selectedElement.getEditingDomain(), "Restore child", new EObjectAdapter(v), Properties.ID_ISVISIBLE, Boolean.TRUE));
    	
    	AbstractEMFOperation operation = new AbstractEMFOperation(((IGraphicalEditPart) selectedElement).getEditingDomain(),
    			StringStatics.BLANK, null) {
    			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
    				icp.execute();
    				return Status.OK_STATUS;
    			}
    		};

    		try {
    			operation.execute(new NullProgressMonitor(), null);
    		} catch (ExecutionException e) {
    			// nothing to do here
    		}
    		
    		EObject eObject = v.getElement();
    		if (eObject instanceof Feature){
    			setValue(selectedElement.getEditingDomain(), eObject, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.UNDECIDED);
    		}
	}
	
	private SetValueCommand setValue( TransactionalEditingDomain transactionalEditingDomain, EObject eObject, EStructuralFeature eStructuralFeature, Object value) {
		IEditCommandRequest myRequest = new SetRequest(transactionalEditingDomain, eObject, eStructuralFeature, value);
		SetValueCommand mySVC = new SetValueCommand((SetRequest) myRequest);
		try {
			mySVC.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return mySVC;
	}
	
	private void cascadeVisible(specializationModel.Node node) {
		// TODO Auto-generated method stub
		ProjectEditPart pep = (ProjectEditPart) selectedElement.getParent();
		for (Object n : node.getChildren()){
			View v = findView((View) pep.getModel(), (EObject) n);
			if ( !v.isVisible()){
				setViewVisible(v);

				View temp = findTargetEdgesView(v);
				setViewVisible(temp);
				Object algo4 = getEPRelationAndRestoreValues(pep, node, (specializationModel.Node) n);
				
				
				if (n instanceof Feature &&  ((Feature)n).getReferences() != null){
					Feature reference = ((Feature)n).getReferences();
					while ( reference.getReferences() != null){
						reference = reference.getReferences();
					}
					EList<Feature> listReferenciated = new BasicEList<Feature>(reference.getReferenciated());
					listReferenciated.add((Feature) n);
					IEditCommandRequest myRequestReferenciated = new SetRequest(selectedElement.getEditingDomain(), reference, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), listReferenciated);
					SetValueCommand mySVCReferenciated = new SetValueCommand((SetRequest)myRequestReferenciated);
					try {
						mySVCReferenciated.execute(new NullProgressMonitor(), null);
					} catch (ExecutionException e) {
						// TODO Auto-genera	ted catch block
						e.printStackTrace();
					}	
				}
				
				
				
				
				
				cascadeVisible((specializationModel.Node) n);
			}
		}
	}

	

}