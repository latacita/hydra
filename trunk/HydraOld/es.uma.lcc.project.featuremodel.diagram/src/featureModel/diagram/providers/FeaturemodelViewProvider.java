package featureModel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FeaturemodelViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (featureModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(diagramKind)
				&& featureModel.diagram.part.FeaturemodelVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return featureModel.diagram.view.factories.ProjectViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!featureModel.diagram.providers.FeaturemodelElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!featureModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
						.equals(featureModel.diagram.part.FeaturemodelVisualIDRegistry
								.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
				case featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case featureModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID:
					if (featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case featureModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID:
					if (featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case featureModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
					if (featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !featureModel.diagram.part.FeaturemodelVisualIDRegistry
						.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return featureModel.diagram.view.factories.FeatureViewFactory.class;
		case featureModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID:
			return featureModel.diagram.view.factories.FeatureNameViewFactory.class;
		case featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return featureModel.diagram.view.factories.FeatureGroupViewFactory.class;
		case featureModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID:
			return featureModel.diagram.view.factories.FeatureGroupLowerBoundUpperBoundViewFactory.class;
		case featureModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
			return featureModel.diagram.view.factories.RelationFeatureLowerBoundUpperBoundViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!featureModel.diagram.providers.FeaturemodelElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = featureModel.diagram.part.FeaturemodelVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return featureModel.diagram.view.factories.RelationFGViewFactory.class;
		case featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return featureModel.diagram.view.factories.RelationFeatureViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
