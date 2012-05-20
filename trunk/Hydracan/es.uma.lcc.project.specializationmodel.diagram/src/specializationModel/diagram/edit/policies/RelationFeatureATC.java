package specializationModel.diagram.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import choco.kernel.model.variables.integer.IntegerVariable;

import specializationModel.ConfigState;
import specializationModel.Project;
import specializationModel.RelationFeature;
import specializationModel.diagram.edit.parts.ProjectEditPart;
import specializationModel.diagram.edit.parts.RelationFeatureEditPart;
import specializationModel.diagram.edit.statics.PunisherTools;
// import specializationModel.diagram.validator.ChocoValidator;

public class RelationFeatureATC extends AbstractTransactionalCommand  {

	RelationFeatureEditPart myEditPart;
	EditingDomain otherEditingDomain;
	
	public RelationFeatureATC(TransactionalEditingDomain editingDomain, EditPart myEditPart) {
		super(editingDomain, "a message", null);
		otherEditingDomain = editingDomain;
		this.myEditPart =  (RelationFeatureEditPart) myEditPart; 
	} // RelationFeatureATC
	
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		RelationFeature thisObject = (RelationFeature) ((View)myEditPart.getModel()).getElement();
		Project project = (Project) thisObject.eContainer();
		if (!thisObject.getTarget().getState().equals(ConfigState.USER_SELECTED)){
			ProjectEditPart pep = (ProjectEditPart) myEditPart.getSource().getParent();
			/**
			if (!project.isInfiniteDomain()) {
				// ChocoValidator cv = pep.getMyChocoValidator();
				
				if (cv.canValidate()){
					IntegerVariable iv = (IntegerVariable) thisObject.getTarget().getIntegerVariable();
					cv.selectFeatureConstraint(iv);
					cv.validate();
					pep.executePunishment();
				}
			}else{
				PunisherTools pt = new PunisherTools(myEditPart, otherEditingDomain);
				
				pt.mainSetRelationFeature(myEditPart);
				if (!pt.checkInfiniteDomain(project)){
					ChocoValidator cv = pep.reloadChocoValidator();
					cv.validate();
					pep.executePunishment();
				} // if
			} // if
			**/
		} 
		// return CommandResult.newOKCommandResult(); **/
		return null;		
	} // 
	
}
