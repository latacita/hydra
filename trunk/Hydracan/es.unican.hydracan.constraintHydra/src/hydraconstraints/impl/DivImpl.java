/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.Div;
import hydraconstraints.HydraconstraintsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DivImpl extends NumOperatorImpl implements Div {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.DIV;
	}
	
	/**
	 * Evaluates the arithmetic division ( / )
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int op1=this.getNumOp1().getNumPriorityOp1().evaluate(modelDirection, featureContext);
		int op2=this.getNumOp2().getNumPriorityOp2().evaluate(modelDirection, featureContext);
		return op1/op2;
	}

} //DivImpl
