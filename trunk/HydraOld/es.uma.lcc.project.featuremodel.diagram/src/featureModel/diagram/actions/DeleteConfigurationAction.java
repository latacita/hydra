package featureModel.diagram.actions;

import java.io.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
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
import featureModel.diagram.misc.Configuration;
import featureModel.diagram.misc.XMLManagement;
import featureModel.diagram.part.MultiPageEditor;
import featureModel.diagram.part.MultiPageEditorContributor;

import specializationModel.diagram.part.SpecializationmodelDiagramEditor;

public class DeleteConfigurationAction extends Action {

	IEditorPart myEditor;
	MultiPageEditorContributor myContributor;
	XMLManagement myConfigurationFile;

	public DeleteConfigurationAction(MultiPageEditorContributor multiPageEditorContributor){
		myContributor = multiPageEditorContributor;
	}

	public void setEditorPart (IEditorPart editor){
		myEditor = editor;
	}

	public void run() {
		String path = null, completeName = null, name = null;
		int activePage = 0;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow(); 
		if ( window != null ) { 
			IWorkbenchPage page = window.getActivePage(); 
			if ( page != null ) { 
				IEditorPart editor = page.getActiveEditor(); 
				if ( editor != null ) { 
					IEditorInput input = editor.getEditorInput(); 
					activePage = ((MultiPageEditor)editor).getActivePage();
					myEditor = ((MultiPageEditor)editor).getEditor(activePage);
					completeName = myEditor.getTitle();

					if (completeName.endsWith(Configuration.diagramExtension))
						name = completeName.substring(0, completeName.indexOf(Configuration.diagramExtension));

					if ( input instanceof IFileEditorInput ) { 
						IFileEditorInput fileInput = (IFileEditorInput) input; 
						path = fileInput.getFile().getProject().getLocation().toString();
					} 
				} 
			} 
		} 

		if (myEditor instanceof SpecializationmodelDiagramEditor){
			boolean b = MessageDialog.openQuestion(null, "Remove configuration", "Are you sure you want to delete current configuration?");
			if (b){
				specializationModel.Project project = (specializationModel.Project)((View)((SpecializationmodelDiagramEditor)myEditor).getDiagramEditPart().getModel()).getElement();
				String configFileName = project.getNameConfigFile();
				
				
				myEditor = myContributor.getPage().getActiveEditor();
				((MultiPageEditor)myEditor).removePage(activePage);
				
				myConfigurationFile = new XMLManagement(configFileName);
				myConfigurationFile.setPath(path);
				
				myConfigurationFile.readFile();
				myConfigurationFile.getConfigList().removeConfiguration(name);
				myConfigurationFile.writeFile();

				String separator = System.getProperty("file.separator") ;
				File f = new File(path + separator + name + Configuration.modelExtension);
				String absolutePath = f.getAbsolutePath();
				f.delete();
				f = new File(path + separator + name + Configuration.diagramExtension);
				String absolutePath2 = f.getAbsolutePath();
				f.delete();
				
				refreshWorkspace(absolutePath);
				refreshWorkspace(absolutePath2);
			}
		}

	}

	private void refreshWorkspace(String absolutePath) {
		IWorkspace workspace= ResourcesPlugin.getWorkspace();
		
		IPath location= Path.fromOSString(absolutePath);
		IFile file= workspace.getRoot().getFileForLocation(location);
		try {
			file.refreshLocal(IResource.DEPTH_ZERO, null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
