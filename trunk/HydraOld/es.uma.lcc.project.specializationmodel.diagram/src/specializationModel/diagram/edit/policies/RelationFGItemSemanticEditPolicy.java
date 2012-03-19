package specializationModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RelationFGItemSemanticEditPolicy
		extends
		specializationModel.diagram.edit.policies.SpecializationmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

}
