/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.Implies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImpliesImpl extends BinaryOpImpl implements Implies {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpliesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.IMPLIES;
	}
	
	/**
	 * Evaluates the logical implies operation
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		int op1=this.getBinaryOp1().getBoolPriorityOp1().evaluate(modelDirection, featureContext);
		int op2=this.getBinaryOp2().getBoolPriorityOp2().evaluate(modelDirection, featureContext);
		if (op1 == 1 && op2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}

} //ImpliesImpl
