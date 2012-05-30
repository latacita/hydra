/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.impl;

import HydraConstraints.BoolOperand;
import HydraConstraints.BoolPriorityOperand2;
import HydraConstraints.HydraConstraintsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Priority Operand2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HydraConstraints.impl.BoolPriorityOperand2Impl#getBoolPriorityOp2 <em>Bool Priority Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoolPriorityOperand2Impl extends EObjectImpl implements BoolPriorityOperand2 {
	/**
	 * The cached value of the '{@link #getBoolPriorityOp2() <em>Bool Priority Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolPriorityOp2()
	 * @generated
	 * @ordered
	 */
	protected BoolOperand boolPriorityOp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolPriorityOperand2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraConstraintsPackage.Literals.BOOL_PRIORITY_OPERAND2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolOperand getBoolPriorityOp2() {
		return boolPriorityOp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolPriorityOp2(BoolOperand newBoolPriorityOp2, NotificationChain msgs) {
		BoolOperand oldBoolPriorityOp2 = boolPriorityOp2;
		boolPriorityOp2 = newBoolPriorityOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2, oldBoolPriorityOp2, newBoolPriorityOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolPriorityOp2(BoolOperand newBoolPriorityOp2) {
		if (newBoolPriorityOp2 != boolPriorityOp2) {
			NotificationChain msgs = null;
			if (boolPriorityOp2 != null)
				msgs = ((InternalEObject)boolPriorityOp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2, null, msgs);
			if (newBoolPriorityOp2 != null)
				msgs = ((InternalEObject)newBoolPriorityOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2, null, msgs);
			msgs = basicSetBoolPriorityOp2(newBoolPriorityOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2, newBoolPriorityOp2, newBoolPriorityOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2:
				return basicSetBoolPriorityOp2(null, msgs);
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
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2:
				return getBoolPriorityOp2();
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
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2:
				setBoolPriorityOp2((BoolOperand)newValue);
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
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2:
				setBoolPriorityOp2((BoolOperand)null);
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
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2:
				return boolPriorityOp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BoolPriorityOperand2Impl
