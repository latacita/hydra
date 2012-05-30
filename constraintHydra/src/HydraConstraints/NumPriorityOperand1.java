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
 * A representation of the model object '<em><b>Num Priority Operand1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HydraConstraints.NumPriorityOperand1#getNumPriorityOp1 <em>Num Priority Op1</em>}</li>
 * </ul>
 * </p>
 *
 * @see HydraConstraints.HydraConstraintsPackage#getNumPriorityOperand1()
 * @model
 * @generated
 */
public interface NumPriorityOperand1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Priority Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Priority Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Priority Op1</em>' containment reference.
	 * @see #setNumPriorityOp1(NumOperand)
	 * @see HydraConstraints.HydraConstraintsPackage#getNumPriorityOperand1_NumPriorityOp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumOperand getNumPriorityOp1();

	/**
	 * Sets the value of the '{@link HydraConstraints.NumPriorityOperand1#getNumPriorityOp1 <em>Num Priority Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Priority Op1</em>' containment reference.
	 * @see #getNumPriorityOp1()
	 * @generated
	 */
	void setNumPriorityOp1(NumOperand value);

} // NumPriorityOperand1
