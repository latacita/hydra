/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.LessOrEqual;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Less Or Equal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LessOrEqualImpl extends ComparisonImpl implements LessOrEqual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessOrEqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.LESS_OR_EQUAL;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		int op1=this.getCompOp1().getNumPriorityOp2().evaluate(modelDirection, featureContext);
		int op2=this.getCompOp2().getNumPriorityOp2().evaluate(modelDirection, featureContext);
		if (op1<=op2) {
			return 1;
		} else {
			return 0;
		}
	}

} //LessOrEqualImpl
