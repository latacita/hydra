package specializationModel.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class SpecializationmodelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof specializationModel.diagram.edit.parts.ProjectEditPart) {
			List<IElementType> types = new ArrayList();
			types
					.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.Feature_2001);
			types
					.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.FeatureGroup_2002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof specializationModel.diagram.edit.parts.FeatureEditPart) {
			List<IElementType> types = new ArrayList();
			types
					.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002);
//			types
//					.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof specializationModel.diagram.edit.parts.FeatureEditPart) {
			List<IElementType> types = new ArrayList();
			types
					.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002);
//			types
//					.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof specializationModel.diagram.edit.parts.FeatureEditPart) {
			List<IElementType> types = new ArrayList();
			if (targetEditPart instanceof specializationModel.diagram.edit.parts.FeatureEditPart) {
				types
						.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002);
			}
//			if (targetEditPart instanceof specializationModel.diagram.edit.parts.FeatureEditPart) {
//				types
//						.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003);
//			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof specializationModel.diagram.edit.parts.FeatureEditPart) {
			List<IElementType> types = new ArrayList();
			if (relationshipType == specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002) {
				types
						.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.Feature_2001);
			}
//			if (relationshipType == specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003) {
//				types
//						.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.Feature_2001);
//			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof specializationModel.diagram.edit.parts.FeatureEditPart) {
			List<IElementType> types = new ArrayList();
			if (relationshipType == specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002) {
				types
						.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.Feature_2001);
			}
//			if (relationshipType == specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003) {
//				types
//						.add(specializationModel.diagram.providers.SpecializationmodelElementTypes.Feature_2001);
//			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection<IElementType> types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection<EObject> elements = new HashSet<EObject>();
		for (Iterator<?> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection<IElementType> types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog
				.setMessage(specializationModel.diagram.part.Messages.SpecializationmodelModelingAssistantProviderMessage);
		dialog
				.setTitle(specializationModel.diagram.part.Messages.SpecializationmodelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
