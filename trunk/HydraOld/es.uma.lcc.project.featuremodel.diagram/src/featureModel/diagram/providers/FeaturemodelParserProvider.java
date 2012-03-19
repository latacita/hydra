package featureModel.diagram.providers;

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
public class FeaturemodelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser featureName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getFeatureName_5004Parser() {
		if (featureName_5004Parser == null) {
			featureName_5004Parser = createFeatureName_5004Parser();
		}
		return featureName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFeatureName_5004Parser() {
		EAttribute[] features = new EAttribute[] { featureModel.FeatureModelPackage.eINSTANCE
				.getFeature_Name(), };
		featureModel.diagram.parsers.MessageFormatParser parser = new featureModel.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser featureGroupLowerBoundUpperBound_5005Parser;

	/**
	 * @generated
	 */
	private IParser getFeatureGroupLowerBoundUpperBound_5005Parser() {
		if (featureGroupLowerBoundUpperBound_5005Parser == null) {
			featureGroupLowerBoundUpperBound_5005Parser = createFeatureGroupLowerBoundUpperBound_5005Parser();
		}
		return featureGroupLowerBoundUpperBound_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFeatureGroupLowerBoundUpperBound_5005Parser() {
		EAttribute[] features = new EAttribute[] {
				featureModel.FeatureModelPackage.eINSTANCE
						.getFeatureGroup_LowerBound(),
				featureModel.FeatureModelPackage.eINSTANCE
						.getFeatureGroup_UpperBound(), };
		featureModel.diagram.parsers.MessageFormatParser parser = new featureModel.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("<{0}..{1}>");
		parser.setEditorPattern("{0}..{1}");
		parser.setEditPattern("{0}..{1}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationFeatureLowerBoundUpperBound_6003Parser;

	/**
	 * @generated
	 */
	private IParser getRelationFeatureLowerBoundUpperBound_6003Parser() {
		if (relationFeatureLowerBoundUpperBound_6003Parser == null) {
			relationFeatureLowerBoundUpperBound_6003Parser = createRelationFeatureLowerBoundUpperBound_6003Parser();
		}
		return relationFeatureLowerBoundUpperBound_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationFeatureLowerBoundUpperBound_6003Parser() {
		EAttribute[] features = new EAttribute[] {
				featureModel.FeatureModelPackage.eINSTANCE
						.getRelationFeature_LowerBound(),
				featureModel.FeatureModelPackage.eINSTANCE
						.getRelationFeature_UpperBound(), };
		featureModel.diagram.parsers.MessageFormatParser parser = new featureModel.diagram.parsers.MessageFormatParser(
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
		case featureModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID:
			return getFeatureName_5004Parser();
		case featureModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getFeatureGroupLowerBoundUpperBound_5005Parser();
		case featureModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getRelationFeatureLowerBoundUpperBound_6003Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(featureModel.diagram.part.FeaturemodelVisualIDRegistry
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
			if (featureModel.diagram.providers.FeaturemodelElementTypes
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
