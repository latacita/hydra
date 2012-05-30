/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.impl;

import HydraConstraints.Comparison;
import HydraConstraints.HydraConstraintsPackage;
import HydraConstraints.NumPriorityOperand2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HydraConstraints.impl.ComparisonImpl#getCompOp1 <em>Comp Op1</em>}</li>
 *   <li>{@link HydraConstraints.impl.ComparisonImpl#getCompOp2 <em>Comp Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComparisonImpl extends LogicalOperatorImpl implements Comparison {
	/**
	 * The cached value of the '{@link #getCompOp1() <em>Comp Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompOp1()
	 * @generated
	 * @ordered
	 */
	protected NumPriorityOperand2 compOp1;

	/**
	 * The cached value of the '{@link #getCompOp2() <em>Comp Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompOp2()
	 * @generated
	 * @ordered
	 */
	protected NumPriorityOperand2 compOp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraConstraintsPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPriorityOperand2 getCompOp1() {
		return compOp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompOp1(NumPriorityOperand2 newCompOp1, NotificationChain msgs) {
		NumPriorityOperand2 oldCompOp1 = compOp1;
		compOp1 = newCompOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.COMPARISON__COMP_OP1, oldCompOp1, newCompOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompOp1(NumPriorityOperand2 newCompOp1) {
		if (newCompOp1 != compOp1) {
			NotificationChain msgs = null;
			if (compOp1 != null)
				msgs = ((InternalEObject)compOp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.COMPARISON__COMP_OP1, null, msgs);
			if (newCompOp1 != null)
				msgs = ((InternalEObject)newCompOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.COMPARISON__COMP_OP1, null, msgs);
			msgs = basicSetCompOp1(newCompOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.COMPARISON__COMP_OP1, newCompOp1, newCompOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPriorityOperand2 getCompOp2() {
		return compOp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompOp2(NumPriorityOperand2 newCompOp2, NotificationChain msgs) {
		NumPriorityOperand2 oldCompOp2 = compOp2;
		compOp2 = newCompOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.COMPARISON__COMP_OP2, oldCompOp2, newCompOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompOp2(NumPriorityOperand2 newCompOp2) {
		if (newCompOp2 != compOp2) {
			NotificationChain msgs = null;
			if (compOp2 != null)
				msgs = ((InternalEObject)compOp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.COMPARISON__COMP_OP2, null, msgs);
			if (newCompOp2 != null)
				msgs = ((InternalEObject)newCompOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.COMPARISON__COMP_OP2, null, msgs);
			msgs = basicSetCompOp2(newCompOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.COMPARISON__COMP_OP2, newCompOp2, newCompOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraConstraintsPackage.COMPARISON__COMP_OP1:
				return basicSetCompOp1(null, msgs);
			case HydraConstraintsPackage.COMPARISON__COMP_OP2:
				return basicSetCompOp2(null, msgs);
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
			case HydraConstraintsPackage.COMPARISON__COMP_OP1:
				return getCompOp1();
			case HydraConstraintsPackage.COMPARISON__COMP_OP2:
				return getCompOp2();
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
			case HydraConstraintsPackage.COMPARISON__COMP_OP1:
				setCompOp1((NumPriorityOperand2)newValue);
				return;
			case HydraConstraintsPackage.COMPARISON__COMP_OP2:
				setCompOp2((NumPriorityOperand2)newValue);
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
			case HydraConstraintsPackage.COMPARISON__COMP_OP1:
				setCompOp1((NumPriorityOperand2)null);
				return;
			case HydraConstraintsPackage.COMPARISON__COMP_OP2:
				setCompOp2((NumPriorityOperand2)null);
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
			case HydraConstraintsPackage.COMPARISON__COMP_OP1:
				return compOp1 != null;
			case HydraConstraintsPackage.COMPARISON__COMP_OP2:
				return compOp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ComparisonImpl
