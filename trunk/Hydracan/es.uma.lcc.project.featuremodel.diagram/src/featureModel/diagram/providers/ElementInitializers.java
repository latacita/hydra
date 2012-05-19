package featureModel.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated NOT
	 */
	public static void init_FeatureGroup_2009(featureModel.FeatureGroup instance) {
		try {
			Object value_0 = featureModel.diagram.expressions.FeaturemodelOCLFactory
					.getExpression(
							"FeatureGroupType::XORGROUP",
							featureModel.FeatureModelPackage.eINSTANCE
									.getFeatureGroup()).evaluate(instance);

			value_0 = featureModel.diagram.expressions.FeaturemodelAbstractExpression
					.performCast(value_0,
							featureModel.FeatureModelPackage.eINSTANCE
									.getFeatureGroupType());
			instance.setType((featureModel.FeatureGroupType) value_0);
			Object value_1 = featureModel.diagram.expressions.FeaturemodelOCLFactory
					.getExpression(
							"1",
							featureModel.FeatureModelPackage.eINSTANCE
									.getFeatureGroup()).evaluate(instance);

			value_1 = featureModel.diagram.expressions.FeaturemodelAbstractExpression
					.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_1).intValue());
			Object value_2 = featureModel.diagram.expressions.FeaturemodelOCLFactory
					.getExpression(
							"1",
							featureModel.FeatureModelPackage.eINSTANCE
									.getFeatureGroup()).evaluate(instance);

			value_2 = featureModel.diagram.expressions.FeaturemodelAbstractExpression
					.performCast(value_2, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_2).intValue());
		} catch (RuntimeException e) {
			featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated NOT
	 */
	public static void init_RelationFeature_4013(
			featureModel.RelationFeature instance) {
		try {
			Object value_0 = featureModel.diagram.expressions.FeaturemodelOCLFactory
					.getExpression(
							"FeatureType::OPTIONAL",
							featureModel.FeatureModelPackage.eINSTANCE
									.getRelationFeature()).evaluate(instance);

			value_0 = featureModel.diagram.expressions.FeaturemodelAbstractExpression
					.performCast(value_0,
							featureModel.FeatureModelPackage.eINSTANCE
									.getFeatureType());
			instance.setType((featureModel.FeatureType) value_0);
			Object value_1 = featureModel.diagram.expressions.FeaturemodelOCLFactory
					.getExpression(
							"0",
							featureModel.FeatureModelPackage.eINSTANCE
									.getRelationFeature()).evaluate(instance);

			value_1 = featureModel.diagram.expressions.FeaturemodelAbstractExpression
					.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_1).intValue());
			Object value_2 = featureModel.diagram.expressions.FeaturemodelOCLFactory
					.getExpression(
							"1",
							featureModel.FeatureModelPackage.eINSTANCE
									.getRelationFeature()).evaluate(instance);

			value_2 = featureModel.diagram.expressions.FeaturemodelAbstractExpression
					.performCast(value_2, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_2).intValue());
		} catch (RuntimeException e) {
			featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
