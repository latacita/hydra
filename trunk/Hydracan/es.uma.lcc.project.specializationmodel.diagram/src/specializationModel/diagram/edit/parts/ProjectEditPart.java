package specializationModel.diagram.edit.parts;

//import hub.sam.tef.Utilities;
//import hub.sam.tef.modelcreating.IModelCreatingContext;
//import hub.sam.tef.modelcreating.ModelCreating;
//import hub.sam.tef.modelcreating.ModelCreatingContext;
//import hub.sam.tef.semantics.DefaultIdentificationScheme;
//import hub.sam.tef.semantics.DefaultSemanticsProvider;
//import hub.sam.tef.tsl.Syntax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import specializationModel.Project;
import specializationModel.diagram.part.MainStatus;
// import specializationModel.diagram.validator.ChocoValidator;
import specializationModel.diagram.validator.PunisherValidator;
// import tef.project.ILangInstConstants;
// import tef.project.expressions.Model;

/**
 * @generated
 */
public class ProjectEditPart extends DiagramEditPart {
//	private ChocoValidator myChocoValidator = null;
	public String projectPath = "";
	private boolean isValidated = false;
	private MainStatus mainStatus;
	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Specializationmodel"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public ProjectEditPart(View view) {
		super(view);
	}


	public void executePunishment(){
	//	PunisherValidator pv = new PunisherValidator(this, myChocoValidator.getConfigurationSet());
	//	pv.vendetta();
	}
	
	public void delCurrentValidator(){
	//	myChocoValidator = null;
	}
	
	public void loadModel(){
	//	loadModel(getUserConstraints());
	}
	
	// public void loadModel(Model userConstraints){
	//	myChocoValidator = new ChocoValidator((Project) ((View)this.getModel()).getElement(), this.getEditingDomain(), getMainStatus(), false);
	//	myChocoValidator.loadModel();
	//	if (userConstraints != null) myChocoValidator.loadUserConstraints(userConstraints);
	// }
	
	public void setMainStatus(MainStatus mainStatus){
		this.mainStatus = mainStatus;
	}
	
	public MainStatus getMainStatus(){
		return mainStatus;
	}

	/**
	private Model getUserConstraints(){	
		Project project = (Project) ((View)this.getModel()).getElement();
		IWorkspace workspace= ResourcesPlugin.getWorkspace();
		String slash = System.getProperty("file.separator");
		String ruta =   project.getNameConstraintsFile();
		
		
		String path = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow(); 
		if ( window != null ) { 
			IWorkbenchPage page = window.getActivePage(); 
			if ( page != null ) { 
				IEditorPart editor = page.getActiveEditor(); 
				if ( editor != null ) { 
					IEditorInput input = editor.getEditorInput(); 
					if ( input instanceof IFileEditorInput ) { 
						IFileEditorInput fileInput = (IFileEditorInput) input; 
						path = fileInput.getFile().getProject().getLocation().toString();
						
					} 
				} 
			} 
		} 
				
		File myFile = new File(path + slash + ruta);
		FileReader fr = null;
		try {
			fr = new FileReader(myFile);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String allFileContent = "";
		try {
			String linea;
			while((linea=br.readLine())!=null)
				allFileContent += linea;
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}

		IModelCreatingContext context = new ModelCreatingContext(
				ILangInstConstants.epaMetamodels, new DefaultSemanticsProvider(
						DefaultIdentificationScheme.INSTANCE),
						new ResourceImpl(), allFileContent);

		EObject eoLangInstModel = null;

		try {
			Syntax sSyntax = Utilities.loadSyntaxDescription(ILangInstConstants.bSyntaxBundle,
					ILangInstConstants.sSyntaxPath, ILangInstConstants.epaMetamodels);

			eoLangInstModel = ModelCreating.createModelFromText(context, sSyntax);



		} catch (Exception e){
			e.printStackTrace();
		}
		


		// return (Model) eoLangInstModel;
		return null;
	} **/

	/**
	 * @generated NOT
	 */
	public void arrangeAll() {
		ArrangeRequest arrangeRequest = new ArrangeRequest(
				ActionIds.ACTION_ARRANGE_ALL);
		Command arrangeCmd = this.getCommand(arrangeRequest);

		try {
			arrangeCmd.execute();
		} catch (Exception ex) {
			System.out.println("LAYOUT" + ex.getMessage());
		}
		this.refresh();
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new specializationModel.diagram.edit.policies.ProjectItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new specializationModel.diagram.edit.policies.ProjectCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	public ChocoValidator getMyChocoValidator() {
		if (myChocoValidator == null) loadModel();
		return myChocoValidator;
	}
	
	public ChocoValidator getMyChocoValidator(Model userConstraints) {
		if (myChocoValidator == null) loadModel(userConstraints);
		return myChocoValidator;
	}

	public void setMyChocoValidator(ChocoValidator myChocoValidator) {
		this.myChocoValidator = myChocoValidator;
	}
	
	public ChocoValidator reloadChocoValidator(){
		loadModel();
		return myChocoValidator;
	}
	**/

	public boolean isValidated() {
		return isValidated;
	}


	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

}
