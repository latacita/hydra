package specializationModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class FeatureGroupItemSemanticEditPolicy
		extends
		specializationModel.diagram.edit.policies.SpecializationmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFG_4001 == req
				.getElementType()) {
			return getGEFWrapper(new specializationModel.diagram.edit.commands.RelationFGCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFG_4001 == req
				.getElementType()) {
			return getGEFWrapper(new specializationModel.diagram.edit.commands.RelationFGCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getGEFWrapper(new specializationModel.diagram.edit.commands.RelationFGReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
