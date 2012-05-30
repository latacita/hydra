/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hydraconstraints.Context#getContextOp2 <em>Context Op2</em>}</li>
 *   <li>{@link hydraconstraints.Context#getContextOp1 <em>Context Op1</em>}</li>
 * </ul>
 * </p>
 *
 * @see hydraconstraints.HydraconstraintsPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends BoolOperandChoices, NumOperandChoices {
	/**
	 * Returns the value of the '<em><b>Context Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Op2</em>' containment reference.
	 * @see #setContextOp2(Constraint)
	 * @see hydraconstraints.HydraconstraintsPackage#getContext_ContextOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getContextOp2();

	/**
	 * Sets the value of the '{@link hydraconstraints.Context#getContextOp2 <em>Context Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Op2</em>' containment reference.
	 * @see #getContextOp2()
	 * @generated
	 */
	void setContextOp2(Constraint value);

	/**
	 * Returns the value of the '<em><b>Context Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Op1</em>' containment reference.
	 * @see #setContextOp1(MultipleFeature)
	 * @see hydraconstraints.HydraconstraintsPackage#getContext_ContextOp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleFeature getContextOp1();

	/**
	 * Sets the value of the '{@link hydraconstraints.Context#getContextOp1 <em>Context Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Op1</em>' containment reference.
	 * @see #getContextOp1()
	 * @generated
	 */
	void setContextOp1(MultipleFeature value);

} // Context
