package specializationModel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.Node;

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
	 * @generated NOT
	 */
	public boolean canExecute() {
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof specializationModel.Node && newEnd instanceof specializationModel.Node)) {
			return false;
		}
		if (!(((oldEnd instanceof specializationModel.Feature) == (newEnd instanceof specializationModel.Feature)) || ((oldEnd instanceof specializationModel.FeatureGroup) == (newEnd instanceof specializationModel.FeatureGroup)))) {
			return false;
		}
		specializationModel.Node target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof specializationModel.Project)) {
			return false;
		}
		specializationModel.Project container = (specializationModel.Project) getLink()
				.eContainer();
		return specializationModel.diagram.edit.policies.SpecializationmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFG_4001(container, getNewSource(), target);
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof specializationModel.Node && newEnd instanceof specializationModel.Node)) {
			return false;
		}
		if (((specializationModel.Node) newEnd).getFather() != null) {
			return false;
		}
		if (!(((oldEnd instanceof specializationModel.Feature) == (newEnd instanceof specializationModel.Feature)) || ((oldEnd instanceof specializationModel.FeatureGroup) == (newEnd instanceof specializationModel.FeatureGroup)))) {
			return false;
		}
		specializationModel.Node source = getLink().getSource();
		if (!(getLink().eContainer() instanceof specializationModel.Project)) {
			return false;
		}
		specializationModel.Project container = (specializationModel.Project) getLink()
				.eContainer();
		return specializationModel.diagram.edit.policies.SpecializationmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFG_4001(container, source, getNewTarget());
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
	protected specializationModel.RelationFG getLink() {
		return (specializationModel.RelationFG) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected specializationModel.Node getOldSource() {
		return (specializationModel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected specializationModel.Node getNewSource() {
		return (specializationModel.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected specializationModel.Node getOldTarget() {
		return (specializationModel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected specializationModel.Node getNewTarget() {
		return (specializationModel.Node) newEnd;
	}
}
