package featureModel.diagram.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import featureModel.Feature;
import featureModel.FeatureGroup;
import featureModel.Node;
import featureModel.Relation;
import featureModel.RelationFG;
import featureModel.RelationFeature;

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

		if (thisObject instanceof Relation){
			if (thisObject instanceof RelationFeature){
				targetNode = ((RelationFeature)thisObject).getTarget();

				Feature sourceNode = ((RelationFeature)thisObject).getSource();
				if (sourceNode != null) sourceNode.getChildren().remove(targetNode);
			}else{
				targetNode = ((RelationFG)thisObject).getTarget();

				Node sourceNode = ((RelationFG)thisObject).getSource();
				if (sourceNode != null){
					if (sourceNode instanceof Feature){
						((Feature)sourceNode).getChildren().remove(targetNode);
					}else {
						((FeatureGroup)sourceNode).getChildren().remove(targetNode);
					}
				}
			}


			if (targetNode != null ) {
				targetNode.setFather(null);
			}

		}
		return CommandResult.newOKCommandResult();
	}

}
