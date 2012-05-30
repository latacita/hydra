/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.impl;

import HydraConstraints.BoolOperand;
import HydraConstraints.BoolPriorityOperand1;
import HydraConstraints.HydraConstraintsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Priority Operand1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HydraConstraints.impl.BoolPriorityOperand1Impl#getBoolPriorityOp1 <em>Bool Priority Op1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoolPriorityOperand1Impl extends EObjectImpl implements BoolPriorityOperand1 {
	/**
	 * The cached value of the '{@link #getBoolPriorityOp1() <em>Bool Priority Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolPriorityOp1()
	 * @generated
	 * @ordered
	 */
	protected BoolOperand boolPriorityOp1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolPriorityOperand1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolOperand getBoolPriorityOp1() {
		return boolPriorityOp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolPriorityOp1(BoolOperand newBoolPriorityOp1, NotificationChain msgs) {
		BoolOperand oldBoolPriorityOp1 = boolPriorityOp1;
		boolPriorityOp1 = newBoolPriorityOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1, oldBoolPriorityOp1, newBoolPriorityOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolPriorityOp1(BoolOperand newBoolPriorityOp1) {
		if (newBoolPriorityOp1 != boolPriorityOp1) {
			NotificationChain msgs = null;
			if (boolPriorityOp1 != null)
				msgs = ((InternalEObject)boolPriorityOp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1, null, msgs);
			if (newBoolPriorityOp1 != null)
				msgs = ((InternalEObject)newBoolPriorityOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1, null, msgs);
			msgs = basicSetBoolPriorityOp1(newBoolPriorityOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1, newBoolPriorityOp1, newBoolPriorityOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1:
				return basicSetBoolPriorityOp1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1:
				return getBoolPriorityOp1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1:
				setBoolPriorityOp1((BoolOperand)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1:
				setBoolPriorityOp1((BoolOperand)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1:
				return boolPriorityOp1 != null;
		}
		return super.eIsSet(featureID);
	}

} //BoolPriorityOperand1Impl
