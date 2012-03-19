/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tef.project.expressions.Function#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see tef.project.expressions.ExpressionsPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends ComparisonOperand {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(Feature)
	 * @see tef.project.expressions.ExpressionsPackage#getFunction_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Feature getOp();

	/**
	 * Sets the value of the '{@link tef.project.expressions.Function#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Feature value);

} // Function
