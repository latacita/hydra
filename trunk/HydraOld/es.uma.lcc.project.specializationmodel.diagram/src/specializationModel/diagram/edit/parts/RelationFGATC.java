package specializationModel.diagram.edit.parts;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.Project;
import specializationModel.RelationFG;
import specializationModel.diagram.edit.statics.PunisherTools;
import specializationModel.diagram.validator.ChocoValidator;
import choco.kernel.model.variables.integer.IntegerVariable;

public class RelationFGATC extends AbstractTransactionalCommand {

	RelationFGEditPart myEditPart;


	public RelationFGATC(TransactionalEditingDomain editingDomain, EditPart myEditPart) {
		super(editingDomain, "a message", null);
		this.myEditPart =  (RelationFGEditPart) myEditPart;
	}


	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// TODO Auto-generated method stub
		
		IGraphicalEditPart editPart = (IGraphicalEditPart)myEditPart;
		RelationFG thisObject = (RelationFG) ((View)editPart.getModel()).getElement();
		if (thisObject.getSource() instanceof FeatureGroup && thisObject.getTarget() instanceof Feature){
			Project project = (Project) thisObject.eContainer();
			ProjectEditPart pep = (ProjectEditPart) myEditPart.getSource().getParent();
			if (!project.isInfiniteDomain()){
			ChocoValidator cv = pep.getMyChocoValidator();

			if (cv.canValidate()){

				IntegerVariable iv = (IntegerVariable) ((Feature) thisObject.getTarget()).getIntegerVariable();
				cv.selectFeatureConstraint(iv);
				cv.validate();
				pep.executePunishment();
			}
			}else{
				PunisherTools pt = new PunisherTools(myEditPart, myEditPart.getEditingDomain());
				
				pt.mainSetRelationFG(myEditPart);
				if (!pt.checkInfiniteDomain(project)){
					ChocoValidator cv = pep.reloadChocoValidator();
					cv.validate();
					pep.executePunishment();
				}
				
			}
		}
		return CommandResult.newOKCommandResult();
	}

}
