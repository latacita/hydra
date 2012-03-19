package featureModel.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class FeaturemodelDomainModelElementTester extends PropertyTester {

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
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE.getFeature()) {
			return true;
		}
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE
				.getTypedValue()) {
			return true;
		}
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE.getProject()) {
			return true;
		}
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE
				.getFeatureGroup()) {
			return true;
		}
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE.getNode()) {
			return true;
		}
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE.getRelation()) {
			return true;
		}
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE
				.getRelationFG()) {
			return true;
		}
		if (eClass == featureModel.FeatureModelPackage.eINSTANCE
				.getRelationFeature()) {
			return true;
		}
		return false;
	}

}
