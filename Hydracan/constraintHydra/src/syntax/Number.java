/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link syntax.Number#getNumValue <em>Num Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see syntax.SyntaxPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends NumOperandChoices {
	/**
	 * Returns the value of the '<em><b>Num Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Value</em>' attribute.
	 * @see #setNumValue(int)
	 * @see syntax.SyntaxPackage#getNumber_NumValue()
	 * @model required="true"
	 * @generated
	 */
	int getNumValue();

	/**
	 * Sets the value of the '{@link syntax.Number#getNumValue <em>Num Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Value</em>' attribute.
	 * @see #getNumValue()
	 * @generated
	 */
	void setNumValue(int value);

} // Number
