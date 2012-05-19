package specializationModel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SpecializationmodelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.uma.lcc.project.specializationmodel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
					.equals(view.getType())) {
				return specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (specializationModel.SpecializationModelPackage.eINSTANCE
				.getProject().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((specializationModel.Project) domainElement)) {
			return specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getModelID(containerView);
		if (!specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			if (specializationModel.SpecializationModelPackage.eINSTANCE
					.getFeature().isSuperTypeOf(domainElement.eClass())) {
				return specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID;
			}
			if (specializationModel.SpecializationModelPackage.eINSTANCE
					.getFeatureGroup().isSuperTypeOf(domainElement.eClass())) {
				return specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getModelID(containerView);
		if (!specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			if (specializationModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			if (specializationModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			if (specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			if (specializationModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (specializationModel.SpecializationModelPackage.eINSTANCE
				.getRelationFG().isSuperTypeOf(domainElement.eClass())) {
			return specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID;
		}
		if (specializationModel.SpecializationModelPackage.eINSTANCE
				.getRelationFeature().isSuperTypeOf(domainElement.eClass())) {
			return specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID;
		}
//		if (specializationModel.SpecializationModelPackage.eINSTANCE
//				.getRelationSelected().isSuperTypeOf(domainElement.eClass())) {
//			return specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID;
//		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(specializationModel.Project element) {
		return true;
	}

}
