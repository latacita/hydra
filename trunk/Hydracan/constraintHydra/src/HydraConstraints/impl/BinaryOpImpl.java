/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.impl;

import HydraConstraints.BinaryOp;
import HydraConstraints.BoolPriorityOperand1;
import HydraConstraints.BoolPriorityOperand2;
import HydraConstraints.HydraConstraintsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HydraConstraints.impl.BinaryOpImpl#getBinaryOp1 <em>Binary Op1</em>}</li>
 *   <li>{@link HydraConstraints.impl.BinaryOpImpl#getBinaryOp2 <em>Binary Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryOpImpl extends LogicalOperatorImpl implements BinaryOp {
	/**
	 * The cached value of the '{@link #getBinaryOp1() <em>Binary Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryOp1()
	 * @generated
	 * @ordered
	 */
	protected BoolPriorityOperand1 binaryOp1;

	/**
	 * The cached value of the '{@link #getBinaryOp2() <em>Binary Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryOp2()
	 * @generated
	 * @ordered
	 */
	protected BoolPriorityOperand2 binaryOp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraConstraintsPackage.Literals.BINARY_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolPriorityOperand1 getBinaryOp1() {
		return binaryOp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryOp1(BoolPriorityOperand1 newBinaryOp1, NotificationChain msgs) {
		BoolPriorityOperand1 oldBinaryOp1 = binaryOp1;
		binaryOp1 = newBinaryOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BINARY_OP__BINARY_OP1, oldBinaryOp1, newBinaryOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryOp1(BoolPriorityOperand1 newBinaryOp1) {
		if (newBinaryOp1 != binaryOp1) {
			NotificationChain msgs = null;
			if (binaryOp1 != null)
				msgs = ((InternalEObject)binaryOp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BINARY_OP__BINARY_OP1, null, msgs);
			if (newBinaryOp1 != null)
				msgs = ((InternalEObject)newBinaryOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BINARY_OP__BINARY_OP1, null, msgs);
			msgs = basicSetBinaryOp1(newBinaryOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BINARY_OP__BINARY_OP1, newBinaryOp1, newBinaryOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolPriorityOperand2 getBinaryOp2() {
		return binaryOp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryOp2(BoolPriorityOperand2 newBinaryOp2, NotificationChain msgs) {
		BoolPriorityOperand2 oldBinaryOp2 = binaryOp2;
		binaryOp2 = newBinaryOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BINARY_OP__BINARY_OP2, oldBinaryOp2, newBinaryOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryOp2(BoolPriorityOperand2 newBinaryOp2) {
		if (newBinaryOp2 != binaryOp2) {
			NotificationChain msgs = null;
			if (binaryOp2 != null)
				msgs = ((InternalEObject)binaryOp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BINARY_OP__BINARY_OP2, null, msgs);
			if (newBinaryOp2 != null)
				msgs = ((InternalEObject)newBinaryOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.BINARY_OP__BINARY_OP2, null, msgs);
			msgs = basicSetBinaryOp2(newBinaryOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.BINARY_OP__BINARY_OP2, newBinaryOp2, newBinaryOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP1:
				return basicSetBinaryOp1(null, msgs);
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP2:
				return basicSetBinaryOp2(null, msgs);
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
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP1:
				return getBinaryOp1();
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP2:
				return getBinaryOp2();
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
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP1:
				setBinaryOp1((BoolPriorityOperand1)newValue);
				return;
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP2:
				setBinaryOp2((BoolPriorityOperand2)newValue);
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
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP1:
				setBinaryOp1((BoolPriorityOperand1)null);
				return;
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP2:
				setBinaryOp2((BoolPriorityOperand2)null);
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
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP1:
				return binaryOp1 != null;
			case HydraConstraintsPackage.BINARY_OP__BINARY_OP2:
				return binaryOp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryOpImpl
