/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.NumOperator;
import hydraconstraints.NumPriorityOperand1;
import hydraconstraints.NumPriorityOperand2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hydraconstraints.impl.NumOperatorImpl#getNumOp1 <em>Num Op1</em>}</li>
 *   <li>{@link hydraconstraints.impl.NumOperatorImpl#getNumOp2 <em>Num Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NumOperatorImpl extends NumOperandImpl implements NumOperator {
	/**
	 * The cached value of the '{@link #getNumOp1() <em>Num Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOp1()
	 * @generated
	 * @ordered
	 */
	protected NumPriorityOperand1 numOp1;

	/**
	 * The cached value of the '{@link #getNumOp2() <em>Num Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOp2()
	 * @generated
	 * @ordered
	 */
	protected NumPriorityOperand2 numOp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.NUM_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPriorityOperand1 getNumOp1() {
		return numOp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumOp1(NumPriorityOperand1 newNumOp1, NotificationChain msgs) {
		NumPriorityOperand1 oldNumOp1 = numOp1;
		numOp1 = newNumOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1, oldNumOp1, newNumOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOp1(NumPriorityOperand1 newNumOp1) {
		if (newNumOp1 != numOp1) {
			NotificationChain msgs = null;
			if (numOp1 != null)
				msgs = ((InternalEObject)numOp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1, null, msgs);
			if (newNumOp1 != null)
				msgs = ((InternalEObject)newNumOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1, null, msgs);
			msgs = basicSetNumOp1(newNumOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1, newNumOp1, newNumOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPriorityOperand2 getNumOp2() {
		return numOp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumOp2(NumPriorityOperand2 newNumOp2, NotificationChain msgs) {
		NumPriorityOperand2 oldNumOp2 = numOp2;
		numOp2 = newNumOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2, oldNumOp2, newNumOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOp2(NumPriorityOperand2 newNumOp2) {
		if (newNumOp2 != numOp2) {
			NotificationChain msgs = null;
			if (numOp2 != null)
				msgs = ((InternalEObject)numOp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2, null, msgs);
			if (newNumOp2 != null)
				msgs = ((InternalEObject)newNumOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2, null, msgs);
			msgs = basicSetNumOp2(newNumOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2, newNumOp2, newNumOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1:
				return basicSetNumOp1(null, msgs);
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2:
				return basicSetNumOp2(null, msgs);
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
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1:
				return getNumOp1();
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2:
				return getNumOp2();
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
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1:
				setNumOp1((NumPriorityOperand1)newValue);
				return;
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2:
				setNumOp2((NumPriorityOperand2)newValue);
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
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1:
				setNumOp1((NumPriorityOperand1)null);
				return;
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2:
				setNumOp2((NumPriorityOperand2)null);
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
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP1:
				return numOp1 != null;
			case HydraconstraintsPackage.NUM_OPERATOR__NUM_OP2:
				return numOp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //NumOperatorImpl
