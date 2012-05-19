package specializationModel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SpecializationmodelViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(diagramKind)
				&& specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return specializationModel.diagram.view.factories.ProjectViewFactory.class;
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
			visualID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!specializationModel.diagram.providers.SpecializationmodelElementTypes
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
						&& visualID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
						.equals(specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
								.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
				case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case specializationModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID:
					if (specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case specializationModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID:
					if (specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case specializationModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
					if (specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
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
				|| !specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
						.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return specializationModel.diagram.view.factories.FeatureViewFactory.class;
		case specializationModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID:
			return specializationModel.diagram.view.factories.FeatureNameViewFactory.class;
		case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return specializationModel.diagram.view.factories.FeatureGroupViewFactory.class;
		case specializationModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID:
			return specializationModel.diagram.view.factories.FeatureGroupLowerBoundUpperBoundViewFactory.class;
		case specializationModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
			return specializationModel.diagram.view.factories.RelationFeatureLowerBoundUpperBoundViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!specializationModel.diagram.providers.SpecializationmodelElementTypes
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
		int visualID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
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
		case specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return specializationModel.diagram.view.factories.RelationFGViewFactory.class;
		case specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return specializationModel.diagram.view.factories.RelationFeatureViewFactory.class;
//		case specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID:
//			return specializationModel.diagram.view.factories.RelationSelectedViewFactory.class;
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
