/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HydraConstraints.Model#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link HydraConstraints.Model#getFeatureList <em>Feature List</em>}</li>
 * </ul>
 * </p>
 *
 * @see HydraConstraints.HydraConstraintsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link HydraConstraints.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see HydraConstraints.HydraConstraintsPackage#getModel_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Feature List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature List</em>' attribute.
	 * @see #setFeatureList(String)
	 * @see HydraConstraints.HydraConstraintsPackage#getModel_FeatureList()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureList();

	/**
	 * Sets the value of the '{@link HydraConstraints.Model#getFeatureList <em>Feature List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature List</em>' attribute.
	 * @see #getFeatureList()
	 * @generated
	 */
	void setFeatureList(String value);

} // Model
