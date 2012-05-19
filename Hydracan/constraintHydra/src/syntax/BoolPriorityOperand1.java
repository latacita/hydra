/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Priority Operand1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link syntax.BoolPriorityOperand1#getBoolPriorityOp1 <em>Bool Priority Op1</em>}</li>
 * </ul>
 * </p>
 *
 * @see syntax.SyntaxPackage#getBoolPriorityOperand1()
 * @model
 * @generated
 */
public interface BoolPriorityOperand1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Bool Priority Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Priority Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Priority Op1</em>' containment reference.
	 * @see #setBoolPriorityOp1(BoolOperand)
	 * @see syntax.SyntaxPackage#getBoolPriorityOperand1_BoolPriorityOp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolOperand getBoolPriorityOp1();

	/**
	 * Sets the value of the '{@link syntax.BoolPriorityOperand1#getBoolPriorityOp1 <em>Bool Priority Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Priority Op1</em>' containment reference.
	 * @see #getBoolPriorityOp1()
	 * @generated
	 */
	void setBoolPriorityOp1(BoolOperand value);

} // BoolPriorityOperand1
