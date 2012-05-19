/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link syntax.Selection#getSelectionOp <em>Selection Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see syntax.SyntaxPackage#getSelection()
 * @model abstract="true"
 * @generated
 */
public interface Selection extends BoolOperandChoices {
	/**
	 * Returns the value of the '<em><b>Selection Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Op</em>' containment reference.
	 * @see #setSelectionOp(BoolPriorityOperand2)
	 * @see syntax.SyntaxPackage#getSelection_SelectionOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolPriorityOperand2 getSelectionOp();

	/**
	 * Sets the value of the '{@link syntax.Selection#getSelectionOp <em>Selection Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Op</em>' containment reference.
	 * @see #getSelectionOp()
	 * @generated
	 */
	void setSelectionOp(BoolPriorityOperand2 value);

} // Selection
