package featureModel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FeaturemodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getSemanticChildren(View view) {
		switch (featureModel.diagram.part.FeaturemodelVisualIDRegistry
				.getVisualID(view)) {
		case featureModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getProject_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		featureModel.Project modelElement = (featureModel.Project) view
				.getElement();
		List<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFeatures().iterator(); it.hasNext();) {
			featureModel.Node childElement = (featureModel.Node) it.next();
			int visualID = featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID) {
				result
						.add(new featureModel.diagram.part.FeaturemodelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID) {
				result
						.add(new featureModel.diagram.part.FeaturemodelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getContainedLinks(View view) {
		switch (featureModel.diagram.part.FeaturemodelVisualIDRegistry
				.getVisualID(view)) {
		case featureModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000ContainedLinks(view);
		case featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2008ContainedLinks(view);
		case featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2009ContainedLinks(view);
		case featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4012ContainedLinks(view);
		case featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4013ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getIncomingLinks(View view) {
		switch (featureModel.diagram.part.FeaturemodelVisualIDRegistry
				.getVisualID(view)) {
		case featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2008IncomingLinks(view);
		case featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2009IncomingLinks(view);
		case featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4012IncomingLinks(view);
		case featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4013IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getOutgoingLinks(View view) {
		switch (featureModel.diagram.part.FeaturemodelVisualIDRegistry
				.getVisualID(view)) {
		case featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2008OutgoingLinks(view);
		case featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2009OutgoingLinks(view);
		case featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4012OutgoingLinks(view);
		case featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4013OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getProject_1000ContainedLinks(View view) {
		featureModel.Project modelElement = (featureModel.Project) view
				.getElement();
		List<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		result
				.addAll(getContainedTypeModelFacetLinks_RelationFG_4012(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_RelationFeature_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getFeature_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getFeatureGroup_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getRelationFG_4012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getRelationFeature_4013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getFeature_2008IncomingLinks(View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		Map<?, ?> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationFG_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RelationFeature_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getFeatureGroup_2009IncomingLinks(View view) {
		featureModel.FeatureGroup modelElement = (featureModel.FeatureGroup) view
				.getElement();
		Map<?, ?> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationFG_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getRelationFG_4012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getRelationFeature_4013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getFeature_2008OutgoingLinks(View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		List<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RelationFG_4012(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_RelationFeature_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getFeatureGroup_2009OutgoingLinks(View view) {
		featureModel.FeatureGroup modelElement = (featureModel.FeatureGroup) view
				.getElement();
		List<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RelationFG_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getRelationFG_4012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<FeaturemodelNodeDescriptor> getRelationFeature_4013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_RelationFG_4012(
			featureModel.Project container) {
		Collection<FeaturemodelLinkDescriptor> result = new LinkedList<FeaturemodelLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof featureModel.RelationFG) {
				continue;
			}
			featureModel.RelationFG link = (featureModel.RelationFG) linkObject;
			if (featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			featureModel.Node dst = link.getTarget();
			featureModel.Node src = link.getSource();
			result
					.add(new featureModel.diagram.part.FeaturemodelLinkDescriptor(
							src,
							dst,
							link,
							featureModel.diagram.providers.FeaturemodelElementTypes.RelationFG_4012,
							featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_RelationFeature_4013(
			featureModel.Project container) {
		Collection<FeaturemodelLinkDescriptor> result = new LinkedList<FeaturemodelLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof featureModel.RelationFeature) {
				continue;
			}
			featureModel.RelationFeature link = (featureModel.RelationFeature) linkObject;
			if (featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			featureModel.Feature dst = link.getTarget();
			featureModel.Feature src = link.getSource();
			result
					.add(new featureModel.diagram.part.FeaturemodelLinkDescriptor(
							src,
							dst,
							link,
							featureModel.diagram.providers.FeaturemodelElementTypes.RelationFeature_4013,
							featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_RelationFG_4012(
			featureModel.Node target, Map<?, ?> crossReferences) {
		Collection<FeaturemodelLinkDescriptor> result = new LinkedList<FeaturemodelLinkDescriptor>();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator<?> it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != featureModel.FeatureModelPackage.eINSTANCE
					.getRelationFG_Target()
					|| false == setting.getEObject() instanceof featureModel.RelationFG) {
				continue;
			}
			featureModel.RelationFG link = (featureModel.RelationFG) setting
					.getEObject();
			if (featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			featureModel.Node src = link.getSource();
			result
					.add(new featureModel.diagram.part.FeaturemodelLinkDescriptor(
							src,
							target,
							link,
							featureModel.diagram.providers.FeaturemodelElementTypes.RelationFG_4012,
							featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_RelationFeature_4013(
			featureModel.Feature target, Map<?, ?> crossReferences) {
		Collection<FeaturemodelLinkDescriptor> result = new LinkedList<FeaturemodelLinkDescriptor>();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator<?> it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != featureModel.FeatureModelPackage.eINSTANCE
					.getRelationFeature_Target()
					|| false == setting.getEObject() instanceof featureModel.RelationFeature) {
				continue;
			}
			featureModel.RelationFeature link = (featureModel.RelationFeature) setting
					.getEObject();
			if (featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			featureModel.Feature src = link.getSource();
			result
					.add(new featureModel.diagram.part.FeaturemodelLinkDescriptor(
							src,
							target,
							link,
							featureModel.diagram.providers.FeaturemodelElementTypes.RelationFeature_4013,
							featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_RelationFG_4012(
			featureModel.Node source) {
		featureModel.Project container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof featureModel.Project) {
				container = (featureModel.Project) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof featureModel.RelationFG) {
				continue;
			}
			featureModel.RelationFG link = (featureModel.RelationFG) linkObject;
			if (featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			featureModel.Node dst = link.getTarget();
			featureModel.Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new featureModel.diagram.part.FeaturemodelLinkDescriptor(
							src,
							dst,
							link,
							featureModel.diagram.providers.FeaturemodelElementTypes.RelationFG_4012,
							featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_RelationFeature_4013(
			featureModel.Feature source) {
		featureModel.Project container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof featureModel.Project) {
				container = (featureModel.Project) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection<FeaturemodelNodeDescriptor> result = new LinkedList<FeaturemodelNodeDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof featureModel.RelationFeature) {
				continue;
			}
			featureModel.RelationFeature link = (featureModel.RelationFeature) linkObject;
			if (featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			featureModel.Feature dst = link.getTarget();
			featureModel.Feature src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new featureModel.diagram.part.FeaturemodelLinkDescriptor(
							src,
							dst,
							link,
							featureModel.diagram.providers.FeaturemodelElementTypes.RelationFeature_4013,
							featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID));
		}
		return result;
	}

}
