package featureModel.diagram.part;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import specializationModel.SpecializationModelPackage;
import specializationModel.diagram.part.MainStatus;
import specializationModel.diagram.part.SpecializationmodelDiagramEditor;
import specializationModel.diagram.part.SpecializationmodelDiagramEditorUtil;
// import specializationModel.diagram.validator.ChocoValidator;
import featureModel.FeatureModelPackage;
import featureModel.Project;
import featureModel.diagram.edit.parts.ProjectEditPart;
import featureModel.diagram.misc.Configuration;
import featureModel.diagram.misc.ErrorException;
import featureModel.diagram.misc.FeatureToSpecialization;
import featureModel.diagram.misc.MinimiceFeatureSpecialization;
import featureModel.diagram.misc.MinimiceSpecialization;
import featureModel.diagram.misc.SpecializationToSpecialization;
import featureModel.diagram.misc.ValidateNames;
import featureModel.diagram.misc.XMLManagement;
import featureModel.diagram.validator.ConfigurationSet;
import featureModel.diagram.validator.ConfigurationSetFM;


/**
 * An example showing how to create a multi-page editor.
 * This example has 3 pages:
 * <ul>
 * <li>page 0 contains a nested text editor.
 * <li>page 1 allows you to change the font used in page 2
 * <li>page 2 shows the words in page 0 in sorted order
 * </ul>
 */
public class MultiPageEditor extends MultiPageEditorPart implements IResourceChangeListener{

	/** The text editor used in page 0. */
	private List<SpecializationmodelDiagramEditor> configurations;
	private FeaturemodelDiagramEditor model;
	private Object tefEditor;
	private EObject userConstraints;
	
	private String configFileName; 
	private String constraintFileName;
	
//	private HashMap<String, ChocoValidator> smValidators;
	
	private boolean initial = true;
	private MainStatus mainStatus;
	
	
	/**
	 * Creates a multi-page editor example.
	 */
	public MultiPageEditor() {
		super();
		configurations = new ArrayList<SpecializationmodelDiagramEditor>();
//		smValidators = new HashMap<String, ChocoValidator>();
		mainStatus = new MainStatus();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}
	
	public MainStatus getMainStatus(){
		return mainStatus;
	}

	/**
	 * Creates page 0 of the multi-page editor,
	 * which contains a text editor.
	 */
	void createPage0() {
		try {
			model = new FeaturemodelDiagramEditor();
			int index = addPage(model, getEditorInput());
			setPageText(index, "Main Model ");
			
			featureModel.Project project = (featureModel.Project)((View)model.getDiagramEditPart().getModel()).getElement();
			configFileName = project.getNameConfigFile();
			constraintFileName = project.getNameConstraintsFile();
			mainStatus.setModelState(project.isValidatedOCL());
			mainStatus.setConstraintState(project.isValidatedTEF());
		} catch (PartInitException e) {
			ErrorDialog.openError( getSite().getShell(),"Error creating nested text editor",null,e.getStatus());
		}
	}
	
	void createConstraintPage(){
//		tefEditor = new tef.project.TextEditor();
		
		IWorkspace workspace= ResourcesPlugin.getWorkspace();
		String slash = System.getProperty("file.separator");
		String ruta = projectPath() + slash +  constraintFileName;
		
		File myFile = new File(ruta);
		if (!myFile.exists()){
			try {
				FileWriter fichero = new FileWriter(ruta);
				fichero.close();
				int i = 0;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	

		IPath location= Path.fromOSString(myFile.getAbsolutePath());
		IFile file= workspace.getRoot().getFileForLocation(location);
		try {
			file.refreshLocal(IResource.DEPTH_ZERO, null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		IEditorInput miEditorInput = new FileEditorInput(file);
		try {
			int index = addPage((IEditorPart) tefEditor , miEditorInput );
			setPageText(index, "Constraint editor ");
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String projectName(){
		String res = null;
		IProject activeProject = null;
		
		IEditorInput temporal = getEditorInput();
		if (temporal instanceof IFileEditorInput){
			IFileEditorInput fileInput = (IFileEditorInput) temporal;
			activeProject = fileInput.getFile().getProject();
			res = activeProject.getName();
		}
		return res;
	}
	
	public String projectPath(){
		String res = null;
		IProject activeProject = null;
		
		IEditorInput temporal = getEditorInput();
		if (temporal instanceof IFileEditorInput){
			IFileEditorInput fileInput = (IFileEditorInput) temporal;
			activeProject = fileInput.getFile().getProject();
			res = activeProject.getLocation().toString();
		}
		return res;
	}
	
	
	public boolean addPageAux(String filename, Object chosen) {
		boolean ok = true;
		try {
			SpecializationmodelDiagramEditor miEditor = new SpecializationmodelDiagramEditor();

			IWorkspace workspace= ResourcesPlugin.getWorkspace();
			String slash = System.getProperty("file.separator");
			String ruta = projectPath() + slash +  filename + Configuration.diagramExtension;
			
			File myFile = new File(ruta);
			if (!myFile.exists()){
				
				if (initial) throw new ErrorException();
				
				String configFileName = null;
				String constraintFileName = null;
				
				URI diagramURI = URI.createURI("platform:/resource/" + projectName() + "/" + filename + Configuration.diagramExtension);
				URI modelURI = URI.createURI("platform:/resource/" + projectName() + "/"+ filename + Configuration.modelExtension);
				IProgressMonitor progressMonitor = new NullProgressMonitor();
				
				EditorPart editorPart = getEditor(getActivePage());
				specializationModel.Project temporal = null;
				if (editorPart instanceof FeaturemodelDiagramEditor){
					ProjectEditPart pep = (ProjectEditPart)((FeaturemodelDiagramEditor) editorPart).getDiagramEditPart();
					featureModel.Project project = (Project) ((View)pep.getModel()).getElement();
					
					configFileName = project.getNameConfigFile();
					constraintFileName = project.getNameConstraintsFile();
					
					if (chosen != null && chosen instanceof ConfigurationSetFM){
						temporal = new MinimiceFeatureSpecialization((ConfigurationSetFM) chosen).transform();
					}else {
						temporal = new FeatureToSpecialization().transform(pep);
					}
					
				}else if (editorPart instanceof SpecializationmodelDiagramEditor){
					specializationModel.diagram.edit.parts.ProjectEditPart pep = (specializationModel.diagram.edit.parts.ProjectEditPart)((SpecializationmodelDiagramEditor) editorPart).getDiagramEditPart();
					specializationModel.Project project = (specializationModel.Project) ((View)pep.getModel()).getElement();
					
					configFileName = project.getNameConfigFile();
					constraintFileName = project.getNameConstraintsFile();
					if (chosen != null && chosen instanceof ConfigurationSet){
						temporal = new MinimiceSpecialization((ConfigurationSet) chosen).transform();
					}else{
						temporal = new SpecializationToSpecialization().transform(pep);
					}
				}
				Resource diagram = SpecializationmodelDiagramEditorUtil.createDiagram(diagramURI, modelURI, progressMonitor, temporal, configFileName, constraintFileName);
				
				featureModel.FeatureModelFactory.eINSTANCE.createFeature();
				specializationModel.SpecializationModelFactory.eINSTANCE.createFeature();
				
			}
			IPath location= Path.fromOSString(myFile.getAbsolutePath());
			IFile file= workspace.getRoot().getFileForLocation(location); 
			
			
			IEditorInput miEditorInput = new FileEditorInput(file);
			configurations.add(miEditor);
			int index = addPage(miEditor, miEditorInput);
			setPageText(index, filename);
			
			specializationModel.diagram.edit.parts.ProjectEditPart vamosAVer = (specializationModel.diagram.edit.parts.ProjectEditPart)miEditor.getDiagramEditPart();
			vamosAVer.arrangeAll();
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),"Error creating nested text editor",	null,e.getStatus());
			ok = false;
		} catch (ErrorException e) {
			// TODO Auto-generated catch block
			ok = false;
		}
		
		return ok;
		
	}
	
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages()	 {
		List<Configuration> blackList = null;
		
		createPage0();
		createConstraintPage();
		
		XMLManagement myConfigFile = new XMLManagement(configFileName);
		myConfigFile.setPath(projectPath());
		myConfigFile.readFile();
		if (myConfigFile.withElements()) {
			for (Configuration config : myConfigFile.getConfigList().configurationList){
				if (!addPageAux(config.getBaseName(), null)){
					if (blackList == null) blackList = new ArrayList<Configuration>();
					blackList.add(config);
				}
			}
			if (blackList != null){
				myConfigFile.getConfigList().configurationList.removeAll(blackList);
				myConfigFile.writeFile();
			}
		}
		
//		ValidateNames vn = new ValidateNames(this);
//		mainStatus.setConstraintState(vn.validate());
		
//		validateMainFeatureModel();
		initial = false;
		
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		if (getEditor(0).isDirty()){
			getEditor(0).doSave(monitor);
			
			validateMainFeatureModel();
			if (!getEditor(1).isDirty()) validateUserConstraints();
		}
		if (getEditor(1).isDirty()){
			getEditor(1).doSave(monitor);
			
			validateUserConstraints();
		}
				
		for (SpecializationmodelDiagramEditor myTextEditor : configurations)myTextEditor.doSave(monitor);
	}

	private void validateMainFeatureModel() {
		boolean modelStatus;
		View view = (View) model.getDiagramEditPart().getModel();
		ValidateAction.runValidation(view);
		modelStatus = ((featureModel.Project)view.getElement()).isValidatedOK();
		mainStatus.setModelState(modelStatus);
		featureModel.diagram.edit.parts.ProjectEditPart fpep = (featureModel.diagram.edit.parts.ProjectEditPart) model.getDiagramEditPart();
		setValue(fpep.getEditingDomain(), ((View)fpep.getModel()).getElement(), FeatureModelPackage.eINSTANCE.getProject_ValidatedOCL(), modelStatus);
		if (!modelStatus){ ErrorDialog.openError(null, "Hydra Feature Modelling", "Diagram doesn't pass OCL test", new Status(IStatus.ERROR, "Hydra", 0,
		        "Incorrect elements in main feature model", null));
		}
	}

	private void validateUserConstraints() {
		if (mainStatus.isModelState()){
			boolean userConstraintsStatus;
			ValidateNames vn = new ValidateNames(this);
			userConstraintsStatus = vn.validate();
			mainStatus.setConstraintState(userConstraintsStatus);
//			smValidators.clear();
			
			featureModel.diagram.edit.parts.ProjectEditPart fpep = (featureModel.diagram.edit.parts.ProjectEditPart) model.getDiagramEditPart();
			setValue(fpep.getEditingDomain(), ((View)fpep.getModel()).getElement(), FeatureModelPackage.eINSTANCE.getProject_ValidatedTEF(), userConstraintsStatus);
			for (SpecializationmodelDiagramEditor myTextEditor : configurations){
				specializationModel.diagram.edit.parts.ProjectEditPart pep = (specializationModel.diagram.edit.parts.ProjectEditPart) myTextEditor.getDiagramEditPart();
				setValue(pep.getEditingDomain(), ((View)pep.getModel()).getElement(), SpecializationModelPackage.eINSTANCE.getProject_UserConstraintsState(), userConstraintsStatus);
				pep.delCurrentValidator();
				pep.setValidated(false);
			}
			
			if (!userConstraintsStatus) ErrorDialog.openError(null, "Hydra Feature Modelling", "Incorrect or corrupted user constraints file", new Status(IStatus.ERROR, "Hydra", 0,
		            "Diagram doesn't pass OCL test", null));
		}
	}
	
	public void removePage(int pageIndex){
		configurations.remove(getEditor(pageIndex));
		super.removePage(pageIndex);
	}
	
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	public void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		
		if (newPageIndex > 1){
			
			SpecializationmodelDiagramEditor smde = (SpecializationmodelDiagramEditor) getEditor(newPageIndex);
			specializationModel.diagram.edit.parts.ProjectEditPart pep = (specializationModel.diagram.edit.parts.ProjectEditPart) smde.getDiagramEditPart();
			specializationModel.Project project = (specializationModel.Project) ((View)pep.getModel()).getElement();
			if (!project.isInfiniteDomain() && !pep.isValidated()){
				if (pep.getMainStatus() == null) pep.setMainStatus(mainStatus);

				/**
				ChocoValidator cv = pep.getMyChocoValidator((tef.project.expressions.Model)getUserConstraints());
				if (cv.canValidate()){
					cv.validate();
					pep.executePunishment();
					pep.setValidated(true);
				}
				**/
			}
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
	
	public int getActivePage(){
		return super.getActivePage();
	}
	
	public EditorPart getEditor(int pageIndex){
		return (EditorPart) super.getEditor(pageIndex);
	}

	
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						for (int j = 0; j < configurations.size(); j++)
						{
							if(((FileEditorInput)configurations.get(j).getEditorInput()).getFile().getProject().equals(event.getResource())){
								IEditorPart editorPart = pages[i].findEditor(configurations.get(j).getEditorInput());
								pages[i].closeEditor(editorPart,true);
							}
						}
					}
				}            
			});
		}
	}
	
	public EObject getUserConstraints() {
		if (userConstraints == null) validateUserConstraints();
		return userConstraints;
	}

	public void setUserConstraints(EObject userConstraints) {
		this.userConstraints = userConstraints;
	}

}
