/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hydraconstraints.NumOperator#getNumOp1 <em>Num Op1</em>}</li>
 *   <li>{@link hydraconstraints.NumOperator#getNumOp2 <em>Num Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see hydraconstraints.HydraconstraintsPackage#getNumOperator()
 * @model abstract="true"
 * @generated
 */
public interface NumOperator extends NumOperand {
	/**
	 * Returns the value of the '<em><b>Num Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Op1</em>' containment reference.
	 * @see #setNumOp1(NumPriorityOperand1)
	 * @see hydraconstraints.HydraconstraintsPackage#getNumOperator_NumOp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumPriorityOperand1 getNumOp1();

	/**
	 * Sets the value of the '{@link hydraconstraints.NumOperator#getNumOp1 <em>Num Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Op1</em>' containment reference.
	 * @see #getNumOp1()
	 * @generated
	 */
	void setNumOp1(NumPriorityOperand1 value);

	/**
	 * Returns the value of the '<em><b>Num Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Op2</em>' containment reference.
	 * @see #setNumOp2(NumPriorityOperand2)
	 * @see hydraconstraints.HydraconstraintsPackage#getNumOperator_NumOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumPriorityOperand2 getNumOp2();

	/**
	 * Sets the value of the '{@link hydraconstraints.NumOperator#getNumOp2 <em>Num Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Op2</em>' containment reference.
	 * @see #getNumOp2()
	 * @generated
	 */
	void setNumOp2(NumPriorityOperand2 value);

} // NumOperator
