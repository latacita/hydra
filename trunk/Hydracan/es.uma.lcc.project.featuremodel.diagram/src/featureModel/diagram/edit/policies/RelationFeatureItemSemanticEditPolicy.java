package featureModel.diagram.edit.policies;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RelationFeatureItemSemanticEditPolicy
		extends
		featureModel.diagram.edit.policies.FeaturemodelBaseItemSemanticEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = new CompoundCommand();

		@SuppressWarnings("unused")
		EditingDomain myEditingDomain = getEditingDomain();

		cc.add((new ICommandProxy(new RelationFeatureSetFather(
				getEditingDomain(), req))));

		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

}
