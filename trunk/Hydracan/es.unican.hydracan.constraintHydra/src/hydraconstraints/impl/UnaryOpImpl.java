/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.BoolPriorityOperand2;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.UnaryOp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hydraconstraints.impl.UnaryOpImpl#getUnaryOp <em>Unary Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnaryOpImpl extends LogicalOperatorImpl implements UnaryOp {
	/**
	 * The cached value of the '{@link #getUnaryOp() <em>Unary Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOp()
	 * @generated
	 * @ordered
	 */
	protected BoolPriorityOperand2 unaryOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.UNARY_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolPriorityOperand2 getUnaryOp() {
		return unaryOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryOp(BoolPriorityOperand2 newUnaryOp, NotificationChain msgs) {
		BoolPriorityOperand2 oldUnaryOp = unaryOp;
		unaryOp = newUnaryOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.UNARY_OP__UNARY_OP, oldUnaryOp, newUnaryOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOp(BoolPriorityOperand2 newUnaryOp) {
		if (newUnaryOp != unaryOp) {
			NotificationChain msgs = null;
			if (unaryOp != null)
				msgs = ((InternalEObject)unaryOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.UNARY_OP__UNARY_OP, null, msgs);
			if (newUnaryOp != null)
				msgs = ((InternalEObject)newUnaryOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.UNARY_OP__UNARY_OP, null, msgs);
			msgs = basicSetUnaryOp(newUnaryOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.UNARY_OP__UNARY_OP, newUnaryOp, newUnaryOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraconstraintsPackage.UNARY_OP__UNARY_OP:
				return basicSetUnaryOp(null, msgs);
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
			case HydraconstraintsPackage.UNARY_OP__UNARY_OP:
				return getUnaryOp();
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
			case HydraconstraintsPackage.UNARY_OP__UNARY_OP:
				setUnaryOp((BoolPriorityOperand2)newValue);
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
			case HydraconstraintsPackage.UNARY_OP__UNARY_OP:
				setUnaryOp((BoolPriorityOperand2)null);
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
			case HydraconstraintsPackage.UNARY_OP__UNARY_OP:
				return unaryOp != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryOpImpl
