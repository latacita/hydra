package specializationModel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SpecializationmodelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof specializationModel.diagram.navigator.SpecializationmodelNavigatorItem) {
			specializationModel.diagram.navigator.SpecializationmodelNavigatorItem item = (specializationModel.diagram.navigator.SpecializationmodelNavigatorItem) element;
			return specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
