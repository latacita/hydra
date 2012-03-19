/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tef.project.expressions.ComparisonOperator#getOp1 <em>Op1</em>}</li>
 *   <li>{@link tef.project.expressions.ComparisonOperator#getOp2 <em>Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see tef.project.expressions.ExpressionsPackage#getComparisonOperator()
 * @model
 * @generated
 */
public interface ComparisonOperator extends Expression {
	/**
	 * Returns the value of the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op1</em>' containment reference.
	 * @see #setOp1(ComparisonOperand)
	 * @see tef.project.expressions.ExpressionsPackage#getComparisonOperator_Op1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComparisonOperand getOp1();

	/**
	 * Sets the value of the '{@link tef.project.expressions.ComparisonOperator#getOp1 <em>Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op1</em>' containment reference.
	 * @see #getOp1()
	 * @generated
	 */
	void setOp1(ComparisonOperand value);

	/**
	 * Returns the value of the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op2</em>' containment reference.
	 * @see #setOp2(ComparisonOperand)
	 * @see tef.project.expressions.ExpressionsPackage#getComparisonOperator_Op2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComparisonOperand getOp2();

	/**
	 * Sets the value of the '{@link tef.project.expressions.ComparisonOperator#getOp2 <em>Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op2</em>' containment reference.
	 * @see #getOp2()
	 * @generated
	 */
	void setOp2(ComparisonOperand value);

} // ComparisonOperator
