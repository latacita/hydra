/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HydraConstraints.UnaryOp#getUnaryOp <em>Unary Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see HydraConstraints.HydraConstraintsPackage#getUnaryOp()
 * @model abstract="true"
 * @generated
 */
public interface UnaryOp extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Unary Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Op</em>' containment reference.
	 * @see #setUnaryOp(BoolPriorityOperand2)
	 * @see HydraConstraints.HydraConstraintsPackage#getUnaryOp_UnaryOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolPriorityOperand2 getUnaryOp();

	/**
	 * Sets the value of the '{@link HydraConstraints.UnaryOp#getUnaryOp <em>Unary Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Op</em>' containment reference.
	 * @see #getUnaryOp()
	 * @generated
	 */
	void setUnaryOp(BoolPriorityOperand2 value);

} // UnaryOp
