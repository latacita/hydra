package specializationModel.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FeatureGroupCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public FeatureGroupCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return specializationModel.SpecializationModelPackage.eINSTANCE
				.getProject();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		specializationModel.FeatureGroup newElement = specializationModel.SpecializationModelFactory.eINSTANCE
				.createFeatureGroup();

		specializationModel.Project owner = (specializationModel.Project) getElementToEdit();
		owner.getFeatures().add(newElement);

		specializationModel.diagram.providers.SpecializationmodelElementTypes
				.init_FeatureGroup_2002(newElement);
		return newElement;
	}

}
