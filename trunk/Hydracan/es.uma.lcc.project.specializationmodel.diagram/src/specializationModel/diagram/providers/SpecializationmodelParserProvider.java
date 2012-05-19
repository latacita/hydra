package specializationModel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SpecializationmodelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser featureName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getFeatureName_5001Parser() {
		if (featureName_5001Parser == null) {
			featureName_5001Parser = createFeatureName_5001Parser();
		}
		return featureName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFeatureName_5001Parser() {
		EAttribute[] features = new EAttribute[] { specializationModel.SpecializationModelPackage.eINSTANCE
				.getFeature_Name(), };
		specializationModel.diagram.parsers.MessageFormatParser parser = new specializationModel.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser featureGroupLowerBoundUpperBound_5002Parser;

	/**
	 * @generated
	 */
	private IParser getFeatureGroupLowerBoundUpperBound_5002Parser() {
		if (featureGroupLowerBoundUpperBound_5002Parser == null) {
			featureGroupLowerBoundUpperBound_5002Parser = createFeatureGroupLowerBoundUpperBound_5002Parser();
		}
		return featureGroupLowerBoundUpperBound_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFeatureGroupLowerBoundUpperBound_5002Parser() {
		EAttribute[] features = new EAttribute[] {
				specializationModel.SpecializationModelPackage.eINSTANCE
						.getFeatureGroup_LowerBound(),
				specializationModel.SpecializationModelPackage.eINSTANCE
						.getFeatureGroup_UpperBound(), };
		specializationModel.diagram.parsers.MessageFormatParser parser = new specializationModel.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("<{0}..{1}>");
		parser.setEditorPattern("{0}..{1}");
		parser.setEditPattern("{0}..{1}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationFeatureLowerBoundUpperBound_6001Parser;

	/**
	 * @generated
	 */
	private IParser getRelationFeatureLowerBoundUpperBound_6001Parser() {
		if (relationFeatureLowerBoundUpperBound_6001Parser == null) {
			relationFeatureLowerBoundUpperBound_6001Parser = createRelationFeatureLowerBoundUpperBound_6001Parser();
		}
		return relationFeatureLowerBoundUpperBound_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationFeatureLowerBoundUpperBound_6001Parser() {
		EAttribute[] features = new EAttribute[] {
				specializationModel.SpecializationModelPackage.eINSTANCE
						.getRelationFeature_LowerBound(),
				specializationModel.SpecializationModelPackage.eINSTANCE
						.getRelationFeature_UpperBound(), };
		specializationModel.diagram.parsers.MessageFormatParser parser = new specializationModel.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0,choice,-1#*| 0#{0}}..{1,choice,-1#*| 0#{1}}");
		parser.setEditorPattern("{0}..{1}");
		parser.setEditPattern("{0}..{1}");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case specializationModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID:
			return getFeatureName_5001Parser();
		case specializationModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getFeatureGroupLowerBoundUpperBound_5002Parser();
		case specializationModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getRelationFeatureLowerBoundUpperBound_6001Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (specializationModel.diagram.providers.SpecializationmodelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
