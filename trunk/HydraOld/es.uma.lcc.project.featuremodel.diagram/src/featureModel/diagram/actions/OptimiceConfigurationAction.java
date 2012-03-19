package featureModel.diagram.actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;

import specializationModel.Project;
import specializationModel.diagram.part.MainStatus;
import specializationModel.diagram.part.SpecializationmodelDiagramEditor;
import featureModel.diagram.edit.statics.CommonCommands;
import featureModel.diagram.misc.Configuration;
import featureModel.diagram.misc.XMLManagement;
import featureModel.diagram.part.FeaturemodelDiagramEditor;
import featureModel.diagram.part.MultiPageEditor;
import featureModel.diagram.part.MultiPageEditorContributor;
import featureModel.diagram.validator.ChocoValidator;
import featureModel.diagram.validator.ChocoValidatorFM;
import featureModel.diagram.validator.ValidatorInterface;

public class OptimiceConfigurationAction extends Action {
	IEditorPart myEditor;
	MultiPageEditorContributor myContributor;
	XMLManagement myConfigurationFile;
	boolean withFile;

	public OptimiceConfigurationAction(MultiPageEditorContributor multiPageEditorContributor, boolean withFile){
		myContributor = multiPageEditorContributor;
		this.withFile = withFile;
	}

	public void setEditorPart (IEditorPart editor){
		myEditor = editor;
	}

	private boolean canContinue(){
		boolean result = false;

		myEditor = myContributor.getPage().getActiveEditor();
		MainStatus mainStatus = ((MultiPageEditor)myEditor).getMainStatus();
		result = mainStatus.isConstraintState();
		if (!result) MessageDialog.openInformation(null, "MultipageProject Plug-in", "Can't create new diagram with bad user constraints");

		if (myContributor.isFeatureModelEditor()){ 
			result = result && mainStatus.isModelState();
			if (!mainStatus.isModelState()) MessageDialog.openInformation(null, "MultipageProject Plug-in", "Can't create new diagram from a bad main feature model");
		}

		return result;
	}

	public void run() {
		if (canContinue()){

			String path = null;
			String filename = null;
			Path projectsPath = null;
			View view = null;
			boolean result = false;
			DiagramEditPart w = null;
			EObject lol = null;
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow(); 
			if ( window != null ) { 
				IWorkbenchPage page = window.getActivePage(); 
				if ( page != null ) { 
					IEditorPart editor = page.getActiveEditor(); 
					if ( editor != null ) { 
						IEditorInput input = editor.getEditorInput(); 
						int activePage = ((MultiPageEditor)editor).getActivePage();

						EditorPart myEditor = ((MultiPageEditor)editor).getEditor(activePage);
						if ( input instanceof IFileEditorInput ) { 
							IFileEditorInput fileInput = (IFileEditorInput) input; 
							projectsPath = (Path) fileInput.getFile().getProject().getFullPath();
							path = fileInput.getFile().getProject().getLocation().toString();
							filename = fileInput.getFile().getName();
							filename = filename.substring(0, filename.length() - ".hydra_diagram".length());				
						} 
						if (myEditor instanceof FeaturemodelDiagramEditor){
							featureModel.Project project = (featureModel.Project)((View)((FeaturemodelDiagramEditor)myEditor).getDiagramEditPart().getModel()).getElement();
							myConfigurationFile = new XMLManagement(project.getNameConfigFile());
							myConfigurationFile.setPath(path);
							w = ((FeaturemodelDiagramEditor)myEditor).getDiagramEditPart();
							view = (View) w.getModel();
							lol = view.getElement();
						}else if (myEditor instanceof SpecializationmodelDiagramEditor){
							specializationModel.Project project = (specializationModel.Project)((View)((SpecializationmodelDiagramEditor)myEditor).getDiagramEditPart().getModel()).getElement();
							myConfigurationFile = new XMLManagement(project.getNameConfigFile());
							myConfigurationFile.setPath(path);
							w = ((SpecializationmodelDiagramEditor)myEditor).getDiagramEditPart();
							view = (View) w.getModel();
							lol = view.getElement();
						}
					}
				}
			}
			if (lol != null){

				ValidatorInterface validator = null;
				if (lol instanceof featureModel.Project){
					validator = new ChocoValidatorFM((featureModel.Project) lol, true);
				}else if (lol instanceof specializationModel.Project){
					validator = new ChocoValidator((Project) lol, true);
				}
				validator.loadModel();
				IEditorPart multipageEditor = myContributor.getPage().getActiveEditor();
				validator.loadUserConstraints((tef.project.expressions.Model) ((MultiPageEditor)multipageEditor).getUserConstraints());

				String fileDialogString = null;
				if (withFile){
					FileDialog fileDialog = new FileDialog(window.getShell(), SWT.OPEN);
					fileDialogString = fileDialog.open();
					System.out.println(fileDialogString);

					FileReader fr = null;
					BufferedReader bufferFichero = null;

					if (fileDialogString != null){
						try {
							fr = new FileReader(fileDialogString);
							bufferFichero = new BufferedReader(fr);
							String cadena = "";
							while ((cadena = bufferFichero.readLine())!= null) {

								StringTokenizer stringTokenizer = new StringTokenizer(cadena, ";");

								while(stringTokenizer.hasMoreTokens()){
									String token = stringTokenizer.nextToken();
									validator.setFeature(token);
								}


							}
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} finally{
							try {
								bufferFichero.close();
								fr.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}

				}

				if (!withFile || withFile && fileDialogString != null){


					Object losElegidos = validator.getMinConfiguration();

					String newFileName = CommonCommands.getNewSpecializationName(projectsPath, filename, path, window);
					if (newFileName != null){
						myConfigurationFile.readFile();
						Configuration myNewConfig = new Configuration(newFileName, "path"+ newFileName);
						myConfigurationFile.getConfigList().add(myNewConfig);
						myEditor = myContributor.getPage().getActiveEditor();

						myConfigurationFile.writeFile();
						((MultiPageEditor)myEditor).addPageAux(newFileName, losElegidos);
					}
				}
			}

		}	
	}

}
