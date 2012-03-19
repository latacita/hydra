package specializationModel.diagram.part;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class SpecializationmodelNodeDescriptor {

	/**
	 * @generated
	 */
	private EObject myModelElement;

	/**
	 * @generated
	 */
	private int myVisualID;

	/**
	 * @generated
	 */
	private String myType;

	/**
	 * @generated
	 */
	public SpecializationmodelNodeDescriptor(EObject modelElement, int visualID) {
		myModelElement = modelElement;
		myVisualID = visualID;
	}

	/**
	 * @generated
	 */
	public EObject getModelElement() {
		return myModelElement;
	}

	/**
	 * @generated
	 */
	public int getVisualID() {
		return myVisualID;
	}

	/**
	 * @generated
	 */
	public String getType() {
		if (myType == null) {
			myType = specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
					.getType(getVisualID());
		}
		return myType;
	}

}
