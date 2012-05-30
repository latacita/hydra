/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HydraConstraints.Constraint#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see HydraConstraints.HydraConstraintsPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference.
	 * @see #setOperators(Operand)
	 * @see HydraConstraints.HydraConstraintsPackage#getConstraint_Operators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getOperators();

	/**
	 * Sets the value of the '{@link HydraConstraints.Constraint#getOperators <em>Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operators</em>' containment reference.
	 * @see #getOperators()
	 * @generated
	 */
	void setOperators(Operand value);

} // Constraint
