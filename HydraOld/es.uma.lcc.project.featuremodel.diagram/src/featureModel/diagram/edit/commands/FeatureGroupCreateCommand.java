package featureModel.diagram.edit.commands;

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
		return featureModel.FeatureModelPackage.eINSTANCE.getProject();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		featureModel.FeatureGroup newElement = featureModel.FeatureModelFactory.eINSTANCE
				.createFeatureGroup();

		featureModel.Project owner = (featureModel.Project) getElementToEdit();
		owner.getFeatures().add(newElement);

		featureModel.diagram.providers.FeaturemodelElementTypes
				.init_FeatureGroup_2009(newElement);
		return newElement;
	}

}
