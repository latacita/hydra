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

import specializationModel.Node;

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
	 * @generated NOT
	 */
	public boolean canExecute() {
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof specializationModel.Feature && newEnd instanceof specializationModel.Feature)) {
			return false;
		}
		specializationModel.Feature target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof specializationModel.Project)) {
			return false;
		}
		specializationModel.Project container = (specializationModel.Project) getLink()
				.eContainer();
		return specializationModel.diagram.edit.policies.SpecializationmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFeature_4002(container, getNewSource(), target);
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof specializationModel.Feature && newEnd instanceof specializationModel.Feature)) {
			return false;
		}
		if (((specializationModel.Node) newEnd).getFather() != null) {
			return false;
		}
		specializationModel.Feature source = getLink().getSource();
		if (!(getLink().eContainer() instanceof specializationModel.Project)) {
			return false;
		}
		specializationModel.Project container = (specializationModel.Project) getLink()
				.eContainer();
		return specializationModel.diagram.edit.policies.SpecializationmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRelationFeature_4002(container, source, getNewTarget());
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
	protected specializationModel.RelationFeature getLink() {
		return (specializationModel.RelationFeature) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected specializationModel.Feature getOldSource() {
		return (specializationModel.Feature) oldEnd;
	}

	/**
	 * @generated
	 */
	protected specializationModel.Feature getNewSource() {
		return (specializationModel.Feature) newEnd;
	}

	/**
	 * @generated
	 */
	protected specializationModel.Feature getOldTarget() {
		return (specializationModel.Feature) oldEnd;
	}

	/**
	 * @generated
	 */
	protected specializationModel.Feature getNewTarget() {
		return (specializationModel.Feature) newEnd;
	}
}
