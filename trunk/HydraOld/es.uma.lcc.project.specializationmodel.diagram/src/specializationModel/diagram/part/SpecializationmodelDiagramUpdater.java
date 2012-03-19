package specializationModel.diagram.part;

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
public class SpecializationmodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getSemanticChildren(View view) {
		switch (specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(view)) {
		case specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getProject_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		specializationModel.Project modelElement = (specializationModel.Project) view
				.getElement();
		List<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFeatures().iterator(); it.hasNext();) {
			specializationModel.Node childElement = (specializationModel.Node) it
					.next();
			int visualID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID) {
				result
						.add(new specializationModel.diagram.part.SpecializationmodelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID) {
				result
						.add(new specializationModel.diagram.part.SpecializationmodelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getContainedLinks(View view) {
		switch (specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(view)) {
		case specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000ContainedLinks(view);
		case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2001ContainedLinks(view);
		case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2002ContainedLinks(view);
		case specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4001ContainedLinks(view);
		case specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4002ContainedLinks(view);
//		case specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID:
//			return getRelationSelected_4003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getIncomingLinks(View view) {
		switch (specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(view)) {
		case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2001IncomingLinks(view);
		case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2002IncomingLinks(view);
		case specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4001IncomingLinks(view);
		case specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4002IncomingLinks(view);
//		case specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID:
//			return getRelationSelected_4003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getOutgoingLinks(View view) {
		switch (specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(view)) {
		case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2001OutgoingLinks(view);
		case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2002OutgoingLinks(view);
		case specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4001OutgoingLinks(view);
		case specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4002OutgoingLinks(view);
//		case specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID:
//			return getRelationSelected_4003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getProject_1000ContainedLinks(View view) {
		specializationModel.Project modelElement = (specializationModel.Project) view
				.getElement();
		List<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		result
				.addAll(getContainedTypeModelFacetLinks_RelationFG_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_RelationFeature_4002(modelElement));
//		result
//				.addAll(getContainedTypeModelFacetLinks_RelationSelected_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getFeature_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getFeatureGroup_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationFG_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationFeature_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationSelected_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getFeature_2001IncomingLinks(View view) {
		specializationModel.Feature modelElement = (specializationModel.Feature) view
				.getElement();
		Map<?, ?> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationFG_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RelationFeature_4002(
				modelElement, crossReferences));
//		result.addAll(getIncomingTypeModelFacetLinks_RelationSelected_4003(
//				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getFeatureGroup_2002IncomingLinks(View view) {
		specializationModel.FeatureGroup modelElement = (specializationModel.FeatureGroup) view
				.getElement();
		Map<?, ?> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationFG_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationFG_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationFeature_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationSelected_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getFeature_2001OutgoingLinks(View view) {
		specializationModel.Feature modelElement = (specializationModel.Feature) view
				.getElement();
		List<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RelationFG_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_RelationFeature_4002(modelElement));
//		result
//				.addAll(getOutgoingTypeModelFacetLinks_RelationSelected_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getFeatureGroup_2002OutgoingLinks(View view) {
		specializationModel.FeatureGroup modelElement = (specializationModel.FeatureGroup) view
				.getElement();
		List<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RelationFG_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationFG_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationFeature_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List<SpecializationmodelNodeDescriptor> getRelationSelected_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection<SpecializationmodelLinkDescriptor> getContainedTypeModelFacetLinks_RelationFG_4001(
			specializationModel.Project container) {
		Collection<SpecializationmodelLinkDescriptor> result = new LinkedList<SpecializationmodelLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specializationModel.RelationFG) {
				continue;
			}
			specializationModel.RelationFG link = (specializationModel.RelationFG) linkObject;
			if (specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specializationModel.Node dst = link.getTarget();
			specializationModel.Node src = link.getSource();
			result
					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
							src,
							dst,
							link,
							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFG_4001,
							specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpecializationmodelLinkDescriptor> getContainedTypeModelFacetLinks_RelationFeature_4002(
			specializationModel.Project container) {
		Collection<SpecializationmodelLinkDescriptor> result = new LinkedList<SpecializationmodelLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specializationModel.RelationFeature) {
				continue;
			}
			specializationModel.RelationFeature link = (specializationModel.RelationFeature) linkObject;
			if (specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specializationModel.Feature dst = link.getTarget();
			specializationModel.Feature src = link.getSource();
			result
					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
							src,
							dst,
							link,
							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002,
							specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
//	private static Collection getContainedTypeModelFacetLinks_RelationSelected_4003(
//			specializationModel.Project container) {
//		Collection result = new LinkedList();
//		for (Iterator links = container.getRelations().iterator(); links
//				.hasNext();) {
//			EObject linkObject = (EObject) links.next();
//			if (false == linkObject instanceof specializationModel.RelationSelected) {
//				continue;
//			}
//			specializationModel.RelationSelected link = (specializationModel.RelationSelected) linkObject;
////			if (specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
////					.getLinkWithClassVisualID(link)) {
////				continue;
////			}
//			specializationModel.Feature dst = link.getTarget();
//			specializationModel.Feature src = link.getSource();
//			result
//					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
//							src,
//							dst,
//							link,
//							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003,
//							specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID));
//		}
//		return result;
//	}

	/**
	 * @generated
	 */
	private static Collection<SpecializationmodelLinkDescriptor> getIncomingTypeModelFacetLinks_RelationFG_4001(
			specializationModel.Node target, Map<?, ?> crossReferences) {
		Collection<SpecializationmodelLinkDescriptor> result = new LinkedList<SpecializationmodelLinkDescriptor>();
		Collection<?> settings = (Collection<?>) crossReferences.get(target);
		for (Iterator<?> it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != specializationModel.SpecializationModelPackage.eINSTANCE
					.getRelationFG_Target()
					|| false == setting.getEObject() instanceof specializationModel.RelationFG) {
				continue;
			}
			specializationModel.RelationFG link = (specializationModel.RelationFG) setting
					.getEObject();
			if (specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specializationModel.Node src = link.getSource();
			result
					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
							src,
							target,
							link,
							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFG_4001,
							specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpecializationmodelLinkDescriptor> getIncomingTypeModelFacetLinks_RelationFeature_4002(
			specializationModel.Feature target, Map<?, ?> crossReferences) {
		Collection<SpecializationmodelLinkDescriptor> result = new LinkedList<SpecializationmodelLinkDescriptor>();
		Collection<?> settings = (Collection<?>) crossReferences.get(target);
		for (Iterator<?> it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != specializationModel.SpecializationModelPackage.eINSTANCE
					.getRelationFeature_Target()
					|| false == setting.getEObject() instanceof specializationModel.RelationFeature) {
				continue;
			}
			specializationModel.RelationFeature link = (specializationModel.RelationFeature) setting
					.getEObject();
			if (specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specializationModel.Feature src = link.getSource();
			result
					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
							src,
							target,
							link,
							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002,
							specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID));
		}
		return result;
	}

//	/**
//	 * @generated
//	 */
//	private static Collection getIncomingTypeModelFacetLinks_RelationSelected_4003(
//			specializationModel.Feature target, Map crossReferences) {
//		Collection result = new LinkedList();
//		Collection settings = (Collection) crossReferences.get(target);
//		for (Iterator it = settings.iterator(); it.hasNext();) {
//			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
//					.next();
//			if (setting.getEStructuralFeature() != specializationModel.SpecializationModelPackage.eINSTANCE
//					.getRelationSelected_Target()
//					|| false == setting.getEObject() instanceof specializationModel.RelationSelected) {
//				continue;
//			}
//			specializationModel.RelationSelected link = (specializationModel.RelationSelected) setting
//					.getEObject();
//			if (specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
//					.getLinkWithClassVisualID(link)) {
//				continue;
//			}
//			specializationModel.Feature src = link.getSource();
//			result
//					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
//							src,
//							target,
//							link,
//							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003,
//							specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID));
//		}
//		return result;
//	}

	/**
	 * @generated
	 */
	private static Collection<SpecializationmodelNodeDescriptor> getOutgoingTypeModelFacetLinks_RelationFG_4001(
			specializationModel.Node source) {
		specializationModel.Project container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof specializationModel.Project) {
				container = (specializationModel.Project) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specializationModel.RelationFG) {
				continue;
			}
			specializationModel.RelationFG link = (specializationModel.RelationFG) linkObject;
			if (specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specializationModel.Node dst = link.getTarget();
			specializationModel.Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
							src,
							dst,
							link,
							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFG_4001,
							specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpecializationmodelNodeDescriptor> getOutgoingTypeModelFacetLinks_RelationFeature_4002(
			specializationModel.Feature source) {
		specializationModel.Project container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof specializationModel.Project) {
				container = (specializationModel.Project) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection<SpecializationmodelNodeDescriptor> result = new LinkedList<SpecializationmodelNodeDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specializationModel.RelationFeature) {
				continue;
			}
			specializationModel.RelationFeature link = (specializationModel.RelationFeature) linkObject;
			if (specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specializationModel.Feature dst = link.getTarget();
			specializationModel.Feature src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
							src,
							dst,
							link,
							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002,
							specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
//	private static Collection getOutgoingTypeModelFacetLinks_RelationSelected_4003(
//			specializationModel.Feature source) {
//		specializationModel.Project container = null;
//		// Find container element for the link.
//		// Climb up by containment hierarchy starting from the source
//		// and return the first element that is instance of the container class.
//		for (EObject element = source; element != null && container == null; element = element
//				.eContainer()) {
//			if (element instanceof specializationModel.Project) {
//				container = (specializationModel.Project) element;
//			}
//		}
//		if (container == null) {
//			return Collections.EMPTY_LIST;
//		}
//		Collection result = new LinkedList();
//		for (Iterator links = container.getRelations().iterator(); links
//				.hasNext();) {
//			EObject linkObject = (EObject) links.next();
//			if (false == linkObject instanceof specializationModel.RelationSelected) {
//				continue;
//			}
//			specializationModel.RelationSelected link = (specializationModel.RelationSelected) linkObject;
//			if (specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID != specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
//					.getLinkWithClassVisualID(link)) {
//				continue;
//			}
//			specializationModel.Feature dst = link.getTarget();
//			specializationModel.Feature src = link.getSource();
//			if (src != source) {
//				continue;
//			}
//			result
//					.add(new specializationModel.diagram.part.SpecializationmodelLinkDescriptor(
//							src,
//							dst,
//							link,
//							specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003,
//							specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID));
//		}
//		return result;
//	}

}
