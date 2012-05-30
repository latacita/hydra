/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Priority Operand2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hydraconstraints.NumPriorityOperand2#getNumPriorityOp2 <em>Num Priority Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see hydraconstraints.HydraconstraintsPackage#getNumPriorityOperand2()
 * @model
 * @generated
 */
public interface NumPriorityOperand2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Priority Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Priority Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Priority Op2</em>' containment reference.
	 * @see #setNumPriorityOp2(NumOperand)
	 * @see hydraconstraints.HydraconstraintsPackage#getNumPriorityOperand2_NumPriorityOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumOperand getNumPriorityOp2();

	/**
	 * Sets the value of the '{@link hydraconstraints.NumPriorityOperand2#getNumPriorityOp2 <em>Num Priority Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Priority Op2</em>' containment reference.
	 * @see #getNumPriorityOp2()
	 * @generated
	 */
	void setNumPriorityOp2(NumOperand value);

} // NumPriorityOperand2
