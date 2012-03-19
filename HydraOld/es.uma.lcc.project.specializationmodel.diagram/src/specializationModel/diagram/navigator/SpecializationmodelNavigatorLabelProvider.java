package specializationModel.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class SpecializationmodelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof specializationModel.diagram.navigator.SpecializationmodelNavigatorItem
				&& !isOwnView(((specializationModel.diagram.navigator.SpecializationmodelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof specializationModel.diagram.navigator.SpecializationmodelNavigatorGroup) {
			specializationModel.diagram.navigator.SpecializationmodelNavigatorGroup group = (specializationModel.diagram.navigator.SpecializationmodelNavigatorGroup) element;
			return specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof specializationModel.diagram.navigator.SpecializationmodelNavigatorItem) {
			specializationModel.diagram.navigator.SpecializationmodelNavigatorItem navigatorItem = (specializationModel.diagram.navigator.SpecializationmodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(view)) {
		case specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://specializationmodel?Project", specializationModel.diagram.providers.SpecializationmodelElementTypes.Project_1000); //$NON-NLS-1$
		case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://specializationmodel?Feature", specializationModel.diagram.providers.SpecializationmodelElementTypes.Feature_2001); //$NON-NLS-1$
		case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://specializationmodel?FeatureGroup", specializationModel.diagram.providers.SpecializationmodelElementTypes.FeatureGroup_2002); //$NON-NLS-1$
		case specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://specializationmodel?RelationFG", specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFG_4001); //$NON-NLS-1$
		case specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://specializationmodel?RelationFeature", specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002); //$NON-NLS-1$
//		case specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID:
//			return getImage(
//					"Navigator?Link?http://specializationmodel?RelationSelected", specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationSelected_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& specializationModel.diagram.providers.SpecializationmodelElementTypes
						.isKnownElementType(elementType)) {
			image = specializationModel.diagram.providers.SpecializationmodelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof specializationModel.diagram.navigator.SpecializationmodelNavigatorGroup) {
			specializationModel.diagram.navigator.SpecializationmodelNavigatorGroup group = (specializationModel.diagram.navigator.SpecializationmodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof specializationModel.diagram.navigator.SpecializationmodelNavigatorItem) {
			specializationModel.diagram.navigator.SpecializationmodelNavigatorItem navigatorItem = (specializationModel.diagram.navigator.SpecializationmodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getVisualID(view)) {
		case specializationModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000Text(view);
		case specializationModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2001Text(view);
		case specializationModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2002Text(view);
		case specializationModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4001Text(view);
		case specializationModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4002Text(view);
//		case specializationModel.diagram.edit.parts.RelationSelectedEditPart.VISUAL_ID:
//			return getRelationSelected_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProject_1000Text(View view) {
		specializationModel.Project domainModelElement = (specializationModel.Project) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNameConstraintsFile();
		} else {
			specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFeature_2001Text(View view) {
		IAdaptable hintAdapter = new specializationModel.diagram.providers.SpecializationmodelParserProvider.HintAdapter(
				specializationModel.diagram.providers.SpecializationmodelElementTypes.Feature_2001,
				(view.getElement() != null ? view.getElement() : view),
				specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
						.getType(specializationModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFeatureGroup_2002Text(View view) {
		IAdaptable hintAdapter = new specializationModel.diagram.providers.SpecializationmodelParserProvider.HintAdapter(
				specializationModel.diagram.providers.SpecializationmodelElementTypes.FeatureGroup_2002,
				(view.getElement() != null ? view.getElement() : view),
				specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
						.getType(specializationModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRelationFG_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationFeature_4002Text(View view) {
		IAdaptable hintAdapter = new specializationModel.diagram.providers.SpecializationmodelParserProvider.HintAdapter(
				specializationModel.diagram.providers.SpecializationmodelElementTypes.RelationFeature_4002,
				(view.getElement() != null ? view.getElement() : view),
				specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
						.getType(specializationModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRelationSelected_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return specializationModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
						.getModelID(view));
	}

}
