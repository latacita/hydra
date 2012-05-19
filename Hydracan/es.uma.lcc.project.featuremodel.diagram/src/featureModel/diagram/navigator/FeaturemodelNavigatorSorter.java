package featureModel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class FeaturemodelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4015;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4014;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof featureModel.diagram.navigator.FeaturemodelNavigatorItem) {
			featureModel.diagram.navigator.FeaturemodelNavigatorItem item = (featureModel.diagram.navigator.FeaturemodelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
