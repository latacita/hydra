package featureModel.diagram.actions;

import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;

import featureModel.diagram.edit.statics.CommonCommands;
import featureModel.diagram.misc.Configuration;
import featureModel.diagram.misc.XMLManagement;
import featureModel.diagram.part.FeaturemodelDiagramEditor;
import featureModel.diagram.part.MultiPageEditor;
import featureModel.diagram.part.MultiPageEditorContributor;

import specializationModel.diagram.part.MainStatus;
import specializationModel.diagram.part.SpecializationmodelDiagramEditor;

public class SpecializeAction extends Action{

	IEditorPart myEditor;
	MultiPageEditorContributor myContributor;
	XMLManagement myConfigurationFile = null;

	public SpecializeAction(MultiPageEditorContributor multiPageEditorContributor){
		myContributor = multiPageEditorContributor;
	}

	public void setEditorPart (IEditorPart editor){
		myEditor = editor;
	}

	private boolean canContinue(){
		boolean result = false;

		myEditor = myContributor.getPage().getActiveEditor();
		MainStatus mainStatus = ((MultiPageEditor)myEditor).getMainStatus();
		result = mainStatus.isConstraintState();
		// if (!result) MessageDialog.openInformation(null, "MultipageProject Plug-in", "Can't create new diagram with bad user constraints");
		
		if (myContributor.isFeatureModelEditor()){ 
			result = result && mainStatus.isModelState();
			if (!mainStatus.isModelState()) MessageDialog.openInformation(null, "MultipageProject Plug-in", "Can't create new diagram from a bad main feature model");
		}

		// return result;
		return true;
	}

	public void run() {
		if (canContinue()){		


			String path = null;
			String filename = null;
			Path projectsPath = null;
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if ( window != null ) { 
				IWorkbenchPage page = window.getActivePage(); 
				if ( page != null ) { 
					IEditorPart editor = page.getActiveEditor();
					if ( editor != null ) { 
						IEditorInput input = editor.getEditorInput(); 
						int activePage = ((MultiPageEditor)editor).getActivePage();

						if (activePage != 1){
							EditorPart myEditor = ((MultiPageEditor)editor).getEditor(activePage);

							if ( input instanceof IFileEditorInput ) { 
								IFileEditorInput fileInput = (IFileEditorInput) input; 
								projectsPath = (Path) fileInput.getFile().getProject().getFullPath();
								path = fileInput.getFile().getProject().getLocation().toString();
								filename = fileInput.getFile().getName();
								filename = filename.substring(0, filename.length() - ".hydra_diagram".length());				
							} 
							if (myEditor instanceof SpecializationmodelDiagramEditor){
								specializationModel.Project project = (specializationModel.Project)((View)((SpecializationmodelDiagramEditor)myEditor).getDiagramEditPart().getModel()).getElement();
								myConfigurationFile = new XMLManagement(project.getNameConfigFile());
								myConfigurationFile.setPath(path);
							} else if (myEditor instanceof FeaturemodelDiagramEditor){
								featureModel.Project project = (featureModel.Project)((View)((FeaturemodelDiagramEditor)myEditor).getDiagramEditPart().getModel()).getElement();
								myConfigurationFile = new XMLManagement(project.getNameConfigFile());
								myConfigurationFile.setPath(path);
							}
						}
					} 
				} 
			} 

			if (myConfigurationFile != null){
				String message = CommonCommands.getNewSpecializationName(projectsPath, filename, path, window);

				if (message != null){

					myConfigurationFile.readFile();
					Configuration myNewConfig = new Configuration(message, "path"+ message);
					myConfigurationFile.getConfigList().add(myNewConfig);

					myConfigurationFile.writeFile();
					((MultiPageEditor)myEditor).addPageAux(message, null);
				}
			}

		}
	}
}