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
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hydraconstraints.HydraconstraintsPackage#getOperand()
 * @model abstract="true"
 * @generated
 */
public interface Operand extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int evaluate(String modelDirection, EObject featureContext);
} // Operand
