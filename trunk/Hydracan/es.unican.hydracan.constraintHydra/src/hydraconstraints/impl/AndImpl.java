/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.And;
import hydraconstraints.HydraconstraintsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AndImpl extends BinaryOpImpl implements And {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.AND;
	}
	
	/**
	 * Evaluates the logical and operation
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		int op1=this.getBinaryOp1().getBoolPriorityOp1().evaluate(modelDirection, featureContext);
		int op2=this.getBinaryOp2().getBoolPriorityOp2().evaluate(modelDirection, featureContext);
		if (op1+op2==2) {
			return 1;
		} else {
			return 0;
		}
	}

} //AndImpl
