package featureModel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import featureModel.Node;

/**
 * @generated
 */
public class RelationFeatureReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public RelationFeatureReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof featureModel.RelationFeature) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof featureModel.Feature && newEnd instanceof featureModel.Feature)) {
			return false;
		}

		if (((featureModel.Feature) newEnd).getReferences() != null) {
			return false;
		}
		featureModel.Feature target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof featureModel.Project)) {
			return false;
		}
		featureModel.Project container = (featureModel.Project) getLink()
				.eContainer();
		return featureModel.diagram.edit.policies.FeaturemodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFeature_4013(container, getNewSource(), target);
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof featureModel.Feature && newEnd instanceof featureModel.Feature)) {
			return false;
		}
		if (((featureModel.Node) newEnd).getFather() != null) {
			return false;
		}
		featureModel.Feature source = getLink().getSource();
		if (!(getLink().eContainer() instanceof featureModel.Project)) {
			return false;
		}
		featureModel.Project container = (featureModel.Project) getLink()
				.eContainer();
		return featureModel.diagram.edit.policies.FeaturemodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFeature_4013(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult reorientSource() throws ExecutionException {

		getLink().getSource().getChildren().remove(getLink().getTarget());

		getLink().setSource(getNewSource());

		EList<Node> nodeList = getLink().getSource().getChildren();
		if (nodeList == null)
			nodeList = new BasicEList<Node>();
		nodeList.add(getLink().getTarget());

		getLink().getTarget().setFather(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		getLink().getSource().getChildren().remove(getLink().getTarget());
		getLink().getSource().getChildren().add(getNewTarget());

		getLink().setTarget(getNewTarget());

		getNewTarget().setFather(getOldTarget().getFather());
		getOldTarget().setFather(null);
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected featureModel.RelationFeature getLink() {
		return (featureModel.RelationFeature) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected featureModel.Feature getOldSource() {
		return (featureModel.Feature) oldEnd;
	}

	/**
	 * @generated
	 */
	protected featureModel.Feature getNewSource() {
		return (featureModel.Feature) newEnd;
	}

	/**
	 * @generated
	 */
	protected featureModel.Feature getOldTarget() {
		return (featureModel.Feature) oldEnd;
	}

	/**
	 * @generated
	 */
	protected featureModel.Feature getNewTarget() {
		return (featureModel.Feature) newEnd;
	}
}
