/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link syntax.Context#getContextOp1 <em>Context Op1</em>}</li>
 *   <li>{@link syntax.Context#getContextOp2 <em>Context Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see syntax.SyntaxPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends BoolOperandChoices, NumOperandChoices {
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
	 * @see syntax.SyntaxPackage#getContext_ContextOp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleFeature getContextOp1();

	/**
	 * Sets the value of the '{@link syntax.Context#getContextOp1 <em>Context Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Op1</em>' containment reference.
	 * @see #getContextOp1()
	 * @generated
	 */
	void setContextOp1(MultipleFeature value);

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
	 * @see syntax.SyntaxPackage#getContext_ContextOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getContextOp2();

	/**
	 * Sets the value of the '{@link syntax.Context#getContextOp2 <em>Context Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Op2</em>' containment reference.
	 * @see #getContextOp2()
	 * @generated
	 */
	void setContextOp2(Constraint value);

} // Context
