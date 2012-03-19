package specializationModel.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class SpecializationmodelDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getFeature()) {
			return true;
		}
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getTypedValue()) {
			return true;
		}
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getProject()) {
			return true;
		}
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getFeatureGroup()) {
			return true;
		}
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getNode()) {
			return true;
		}
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getRelation()) {
			return true;
		}
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getRelationFG()) {
			return true;
		}
		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
				.getRelationFeature()) {
			return true;
		}
//		if (eClass == specializationModel.SpecializationModelPackage.eINSTANCE
//				.getRelationSelected()) {
//			return true;
//		}
		return false;
	}

}
