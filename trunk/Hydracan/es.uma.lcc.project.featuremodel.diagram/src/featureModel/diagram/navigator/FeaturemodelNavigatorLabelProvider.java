package featureModel.diagram.navigator;

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
public class FeaturemodelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
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
		if (element instanceof featureModel.diagram.navigator.FeaturemodelNavigatorItem
				&& !isOwnView(((featureModel.diagram.navigator.FeaturemodelNavigatorItem) element)
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
		if (element instanceof featureModel.diagram.navigator.FeaturemodelNavigatorGroup) {
			featureModel.diagram.navigator.FeaturemodelNavigatorGroup group = (featureModel.diagram.navigator.FeaturemodelNavigatorGroup) element;
			return featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof featureModel.diagram.navigator.FeaturemodelNavigatorItem) {
			featureModel.diagram.navigator.FeaturemodelNavigatorItem navigatorItem = (featureModel.diagram.navigator.FeaturemodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (featureModel.diagram.part.FeaturemodelVisualIDRegistry
				.getVisualID(view)) {
		case featureModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://featuremodel?Project", featureModel.diagram.providers.FeaturemodelElementTypes.Project_1000); //$NON-NLS-1$
		case featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://featuremodel?Feature", featureModel.diagram.providers.FeaturemodelElementTypes.Feature_2008); //$NON-NLS-1$
		case featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://featuremodel?FeatureGroup", featureModel.diagram.providers.FeaturemodelElementTypes.FeatureGroup_2009); //$NON-NLS-1$
		case featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://featuremodel?RelationFG", featureModel.diagram.providers.FeaturemodelElementTypes.RelationFG_4012); //$NON-NLS-1$
		case featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://featuremodel?RelationFeature", featureModel.diagram.providers.FeaturemodelElementTypes.RelationFeature_4013); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& featureModel.diagram.providers.FeaturemodelElementTypes
						.isKnownElementType(elementType)) {
			image = featureModel.diagram.providers.FeaturemodelElementTypes
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
		if (element instanceof featureModel.diagram.navigator.FeaturemodelNavigatorGroup) {
			featureModel.diagram.navigator.FeaturemodelNavigatorGroup group = (featureModel.diagram.navigator.FeaturemodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof featureModel.diagram.navigator.FeaturemodelNavigatorItem) {
			featureModel.diagram.navigator.FeaturemodelNavigatorItem navigatorItem = (featureModel.diagram.navigator.FeaturemodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
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
		switch (featureModel.diagram.part.FeaturemodelVisualIDRegistry
				.getVisualID(view)) {
		case featureModel.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000Text(view);
		case featureModel.diagram.edit.parts.FeatureEditPart.VISUAL_ID:
			return getFeature_2008Text(view);
		case featureModel.diagram.edit.parts.FeatureGroupEditPart.VISUAL_ID:
			return getFeatureGroup_2009Text(view);
		case featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID:
			return getRelationFG_4012Text(view);
		case featureModel.diagram.edit.parts.RelationFeatureEditPart.VISUAL_ID:
			return getRelationFeature_4013Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProject_1000Text(View view) {
		featureModel.Project domainModelElement = (featureModel.Project) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNameConfigFile();
		} else {
			featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFeature_2008Text(View view) {
		IAdaptable hintAdapter = new featureModel.diagram.providers.FeaturemodelParserProvider.HintAdapter(
				featureModel.diagram.providers.FeaturemodelElementTypes.Feature_2008,
				(view.getElement() != null ? view.getElement() : view),
				featureModel.diagram.part.FeaturemodelVisualIDRegistry
						.getType(featureModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFeatureGroup_2009Text(View view) {
		IAdaptable hintAdapter = new featureModel.diagram.providers.FeaturemodelParserProvider.HintAdapter(
				featureModel.diagram.providers.FeaturemodelElementTypes.FeatureGroup_2009,
				(view.getElement() != null ? view.getElement() : view),
				featureModel.diagram.part.FeaturemodelVisualIDRegistry
						.getType(featureModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRelationFG_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationFeature_4013Text(View view) {
		IAdaptable hintAdapter = new featureModel.diagram.providers.FeaturemodelParserProvider.HintAdapter(
				featureModel.diagram.providers.FeaturemodelElementTypes.RelationFeature_4013,
				(view.getElement() != null ? view.getElement() : view),
				featureModel.diagram.part.FeaturemodelVisualIDRegistry
						.getType(featureModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

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
		return featureModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(featureModel.diagram.part.FeaturemodelVisualIDRegistry
						.getModelID(view));
	}

}
