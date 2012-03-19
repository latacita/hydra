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

import featureModel.Feature;
import featureModel.FeatureGroup;
import featureModel.Node;

/**
 * @generated
 */
public class RelationFGReorientCommand extends EditElementCommand {

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
	public RelationFGReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof featureModel.RelationFG) {
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
		if (!(oldEnd instanceof featureModel.Node && newEnd instanceof featureModel.Node)) {
			return false;
		}
		if (!(((oldEnd instanceof featureModel.Feature) == (newEnd instanceof featureModel.Feature)) || ((oldEnd instanceof featureModel.FeatureGroup) == (newEnd instanceof featureModel.FeatureGroup)))) {
			return false;
		}
		if (newEnd instanceof featureModel.Feature
				&& ((featureModel.Feature) newEnd).getReferences() != null) {
			return false;
		}
		featureModel.Node target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof featureModel.Project)) {
			return false;
		}
		featureModel.Project container = (featureModel.Project) getLink()
				.eContainer();
		return featureModel.diagram.edit.policies.FeaturemodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFG_4012(container, getNewSource(), target);
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof featureModel.Node && newEnd instanceof featureModel.Node)) {
			return false;
		}
		if (((featureModel.Node) newEnd).getFather() != null) {
			return false;
		}
		if (!(((oldEnd instanceof featureModel.Feature) == (newEnd instanceof featureModel.Feature)) || ((oldEnd instanceof featureModel.FeatureGroup) == (newEnd instanceof featureModel.FeatureGroup)))) {
			return false;
		}
		featureModel.Node source = getLink().getSource();
		if (!(getLink().eContainer() instanceof featureModel.Project)) {
			return false;
		}
		featureModel.Project container = (featureModel.Project) getLink()
				.eContainer();
		return featureModel.diagram.edit.policies.FeaturemodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFG_4012(container, source, getNewTarget());
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
		Node myNode = getLink().getSource();
		if (myNode instanceof Feature) {
			((Feature) myNode).getChildren().remove(getLink().getTarget());
		} else {
			((FeatureGroup) myNode).getChildren().remove(getLink().getTarget());
		}

		getLink().setSource(getNewSource());
		myNode = getLink().getSource();

		if (myNode instanceof Feature) {
			EList<Node> nodeList = ((Feature) myNode).getChildren();
			if (nodeList == null)
				nodeList = new BasicEList<Node>();
			nodeList.add(getLink().getTarget());
		} else {
			EList<Feature> nodeList = ((FeatureGroup) myNode).getChildren();
			if (nodeList == null)
				nodeList = new BasicEList<Feature>();
			nodeList.add((Feature) getLink().getTarget());
		}

		getLink().getTarget().setFather(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		Node myNode = getLink().getSource();

		if (myNode instanceof Feature) {
			((Feature) myNode).getChildren().remove(getLink().getTarget());
			((Feature) myNode).getChildren().add(getNewTarget());
		} else {
			((FeatureGroup) myNode).getChildren().remove(getLink().getTarget());
			((FeatureGroup) myNode).getChildren().add((Feature) getNewTarget());
		}

		getLink().setTarget(getNewTarget());

		getNewTarget().setFather(getOldTarget().getFather());
		getOldTarget().setFather(null);
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected featureModel.RelationFG getLink() {
		return (featureModel.RelationFG) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected featureModel.Node getOldSource() {
		return (featureModel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected featureModel.Node getNewSource() {
		return (featureModel.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected featureModel.Node getOldTarget() {
		return (featureModel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected featureModel.Node getNewTarget() {
		return (featureModel.Node) newEnd;
	}
}
