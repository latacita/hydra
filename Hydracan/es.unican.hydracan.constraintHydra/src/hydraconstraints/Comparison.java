/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hydraconstraints.Comparison#getCompOp1 <em>Comp Op1</em>}</li>
 *   <li>{@link hydraconstraints.Comparison#getCompOp2 <em>Comp Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see hydraconstraints.HydraconstraintsPackage#getComparison()
 * @model abstract="true"
 * @generated
 */
public interface Comparison extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Op1</em>' containment reference.
	 * @see #setCompOp1(NumPriorityOperand2)
	 * @see hydraconstraints.HydraconstraintsPackage#getComparison_CompOp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumPriorityOperand2 getCompOp1();

	/**
	 * Sets the value of the '{@link hydraconstraints.Comparison#getCompOp1 <em>Comp Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Op1</em>' containment reference.
	 * @see #getCompOp1()
	 * @generated
	 */
	void setCompOp1(NumPriorityOperand2 value);

	/**
	 * Returns the value of the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Op2</em>' containment reference.
	 * @see #setCompOp2(NumPriorityOperand2)
	 * @see hydraconstraints.HydraconstraintsPackage#getComparison_CompOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumPriorityOperand2 getCompOp2();

	/**
	 * Sets the value of the '{@link hydraconstraints.Comparison#getCompOp2 <em>Comp Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Op2</em>' containment reference.
	 * @see #getCompOp2()
	 * @generated
	 */
	void setCompOp2(NumPriorityOperand2 value);

} // Comparison
