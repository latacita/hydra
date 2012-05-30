/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Priority Operand2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HydraConstraints.BoolPriorityOperand2#getBoolPriorityOp2 <em>Bool Priority Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see HydraConstraints.HydraConstraintsPackage#getBoolPriorityOperand2()
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
	 * @see HydraConstraints.HydraConstraintsPackage#getBoolPriorityOperand2_BoolPriorityOp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolOperand getBoolPriorityOp2();

	/**
	 * Sets the value of the '{@link HydraConstraints.BoolPriorityOperand2#getBoolPriorityOp2 <em>Bool Priority Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Priority Op2</em>' containment reference.
	 * @see #getBoolPriorityOp2()
	 * @generated
	 */
	void setBoolPriorityOp2(BoolOperand value);

} // BoolPriorityOperand2
