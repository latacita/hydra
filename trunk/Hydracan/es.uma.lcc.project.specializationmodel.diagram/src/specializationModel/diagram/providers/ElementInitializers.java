package specializationModel.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_FeatureGroup_2002(
			specializationModel.FeatureGroup instance) {
		try {
			Object value_0 = specializationModel.diagram.expressions.SpecializationmodelOCLFactory
					.getExpression(
							"FeatureGroupType::XORGROUP",
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getFeatureGroup()).evaluate(instance);

			value_0 = specializationModel.diagram.expressions.SpecializationmodelAbstractExpression
					.performCast(
							value_0,
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getFeatureGroupType());
			instance.setType((specializationModel.FeatureGroupType) value_0);
			Object value_1 = specializationModel.diagram.expressions.SpecializationmodelOCLFactory
					.getExpression(
							"1",
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getFeatureGroup()).evaluate(instance);

			value_1 = specializationModel.diagram.expressions.SpecializationmodelAbstractExpression
					.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_1).intValue());
			Object value_2 = specializationModel.diagram.expressions.SpecializationmodelOCLFactory
					.getExpression(
							"1",
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getFeatureGroup()).evaluate(instance);

			value_2 = specializationModel.diagram.expressions.SpecializationmodelAbstractExpression
					.performCast(value_2, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_2).intValue());
		} catch (RuntimeException e) {
			specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_RelationFeature_4002(
			specializationModel.RelationFeature instance) {
		try {
			Object value_0 = specializationModel.diagram.expressions.SpecializationmodelOCLFactory
					.getExpression(
							"FeatureType::MANDATORY",
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getRelationFeature()).evaluate(instance);

			value_0 = specializationModel.diagram.expressions.SpecializationmodelAbstractExpression
					.performCast(
							value_0,
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getFeatureType());
			instance.setType((specializationModel.FeatureType) value_0);
			Object value_1 = specializationModel.diagram.expressions.SpecializationmodelOCLFactory
					.getExpression(
							"1",
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getRelationFeature()).evaluate(instance);

			value_1 = specializationModel.diagram.expressions.SpecializationmodelAbstractExpression
					.performCast(value_1, EcorePackage.eINSTANCE.getEInt());
			instance.setLowerBound(((Integer) value_1).intValue());
			Object value_2 = specializationModel.diagram.expressions.SpecializationmodelOCLFactory
					.getExpression(
							"1",
							specializationModel.SpecializationModelPackage.eINSTANCE
									.getRelationFeature()).evaluate(instance);

			value_2 = specializationModel.diagram.expressions.SpecializationmodelAbstractExpression
					.performCast(value_2, EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_2).intValue());
		} catch (RuntimeException e) {
			specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
