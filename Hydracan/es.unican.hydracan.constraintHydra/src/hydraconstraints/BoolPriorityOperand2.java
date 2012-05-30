/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Priority Operand2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hydraconstraints.BoolPriorityOperand2#getBoolPriorityOp2 <em>Bool Priority Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see hydraconstraints.HydraconstraintsPackage#getBoolPriorityOperand2()
 * @model
 * @generated
 */
public interface BoolPriorityOperand2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Bool Priority Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Priority Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Priority Op2</em>' containment reference.
	 * @see #setBoolPriorityOp2(BoolOperand)
	 * @see hydraconstraints.HydraconstraintsPackage#getBoolPriorityOperand2_BoolPriorityOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolOperand getBoolPriorityOp2();

	/**
	 * Sets the value of the '{@link hydraconstraints.BoolPriorityOperand2#getBoolPriorityOp2 <em>Bool Priority Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Priority Op2</em>' containment reference.
	 * @see #getBoolPriorityOp2()
	 * @generated
	 */
	void setBoolPriorityOp2(BoolOperand value);

} // BoolPriorityOperand2
