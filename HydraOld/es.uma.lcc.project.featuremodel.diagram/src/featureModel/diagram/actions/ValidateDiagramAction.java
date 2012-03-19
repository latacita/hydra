package featureModel.diagram.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;

import featureModel.diagram.part.FeaturemodelDiagramEditor;
import featureModel.diagram.part.MultiPageEditor;
import featureModel.diagram.part.ValidateAction;

import specializationModel.diagram.part.SpecializationmodelDiagramEditor;

public class ValidateDiagramAction extends Action{

	IEditorPart myEditor;
	
	public ValidateDiagramAction(){
	}

	public void setEditorPart (IEditorPart editor){
		myEditor = editor;
	}
	
	public void run() {
		View view = null;
		DiagramEditPart diagramEditPart = null;
		EObject project = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow(); 
		if ( window != null ) { 
			IWorkbenchPage page = window.getActivePage(); 
			if ( page != null ) { 
				IEditorPart editor = page.getActiveEditor(); 
				if ( editor != null ) { 
					int activePage = ((MultiPageEditor)editor).getActivePage();

					EditorPart myEditor = ((MultiPageEditor)editor).getEditor(activePage);

					if (myEditor instanceof FeaturemodelDiagramEditor){
						diagramEditPart = ((FeaturemodelDiagramEditor)myEditor).getDiagramEditPart();
						view = (View) diagramEditPart.getModel();
						project = view.getElement();
					}else if (myEditor instanceof SpecializationmodelDiagramEditor){
						diagramEditPart = ((SpecializationmodelDiagramEditor)myEditor).getDiagramEditPart();
						view = (View) diagramEditPart.getModel();
						project = view.getElement();
					}
				}
			}
		}
		
		if (project != null){
			if (project instanceof featureModel.Project){
				ValidateAction.runValidation(view);
				((featureModel.Project)project).isValidatedOK();
			}else if (project instanceof specializationModel.Project){
				specializationModel.diagram.part.ValidateAction.runValidation(view);
				((specializationModel.Project)project).isValidatedOK();
			}
		}

	}
}
