/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HydraConstraints.BinaryOp#getBinaryOp1 <em>Binary Op1</em>}</li>
 *   <li>{@link HydraConstraints.BinaryOp#getBinaryOp2 <em>Binary Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see HydraConstraints.HydraConstraintsPackage#getBinaryOp()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOp extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Binary Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Op1</em>' containment reference.
	 * @see #setBinaryOp1(BoolPriorityOperand1)
	 * @see HydraConstraints.HydraConstraintsPackage#getBinaryOp_BinaryOp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolPriorityOperand1 getBinaryOp1();

	/**
	 * Sets the value of the '{@link HydraConstraints.BinaryOp#getBinaryOp1 <em>Binary Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Op1</em>' containment reference.
	 * @see #getBinaryOp1()
	 * @generated
	 */
	void setBinaryOp1(BoolPriorityOperand1 value);

	/**
	 * Returns the value of the '<em><b>Binary Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Op2</em>' containment reference.
	 * @see #setBinaryOp2(BoolPriorityOperand2)
	 * @see HydraConstraints.HydraConstraintsPackage#getBinaryOp_BinaryOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolPriorityOperand2 getBinaryOp2();

	/**
	 * Sets the value of the '{@link HydraConstraints.BinaryOp#getBinaryOp2 <em>Binary Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Op2</em>' containment reference.
	 * @see #getBinaryOp2()
	 * @generated
	 */
	void setBinaryOp2(BoolPriorityOperand2 value);

} // BinaryOp
