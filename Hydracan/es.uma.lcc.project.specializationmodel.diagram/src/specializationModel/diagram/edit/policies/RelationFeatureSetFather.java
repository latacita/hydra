package specializationModel.diagram.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import specializationModel.Node;
import specializationModel.RelationFG;
import specializationModel.RelationFeature;

public class RelationFeatureSetFather extends AbstractTransactionalCommand {
	
	DestroyElementRequest req;
	EditingDomain otherEditingDomain;
		
	public RelationFeatureSetFather(TransactionalEditingDomain editingDomain, DestroyElementRequest req) {
		super(editingDomain, "a message", null);
		this.req =  req;
		this.otherEditingDomain = editingDomain;
	}
	
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// TODO Auto-generated method stub
		
		EObject thisObject = req.getElementToDestroy();
		Node targetNode;
		
		if (thisObject instanceof RelationFeature){
			targetNode = ((RelationFeature)thisObject).getTarget();
			
		}else{
			targetNode = ((RelationFG)thisObject).getTarget();
		}
		Object removeCommand = RemoveCommand.create(otherEditingDomain, targetNode);
		if (((Node)targetNode).eContainer() != null && ((AbstractOverrideableCommand) removeCommand).canExecute())	((AbstractOverrideableCommand) removeCommand).execute();
			return CommandResult.newOKCommandResult();
	}
	
	
}
