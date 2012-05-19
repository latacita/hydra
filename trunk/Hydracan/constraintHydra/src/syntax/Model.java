/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax;

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
 *   <li>{@link syntax.Model#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link syntax.Model#getFeatureList <em>Feature List</em>}</li>
 * </ul>
 * </p>
 *
 * @see syntax.SyntaxPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link syntax.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see syntax.SyntaxPackage#getModel_Constraints()
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
	 * @see syntax.SyntaxPackage#getModel_FeatureList()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureList();

	/**
	 * Sets the value of the '{@link syntax.Model#getFeatureList <em>Feature List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature List</em>' attribute.
	 * @see #getFeatureList()
	 * @generated
	 */
	void setFeatureList(String value);

} // Model
