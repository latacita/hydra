/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.impl;

import HydraConstraints.Constraint;
import HydraConstraints.Context;
import HydraConstraints.HydraConstraintsPackage;
import HydraConstraints.MultipleFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HydraConstraints.impl.ContextImpl#getContextOp1 <em>Context Op1</em>}</li>
 *   <li>{@link HydraConstraints.impl.ContextImpl#getContextOp2 <em>Context Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends BoolOperandChoicesImpl implements Context {
	/**
	 * The cached value of the '{@link #getContextOp1() <em>Context Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextOp1()
	 * @generated
	 * @ordered
	 */
	protected MultipleFeature contextOp1;

	/**
	 * The cached value of the '{@link #getContextOp2() <em>Context Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextOp2()
	 * @generated
	 * @ordered
	 */
	protected Constraint contextOp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraConstraintsPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleFeature getContextOp1() {
		return contextOp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextOp1(MultipleFeature newContextOp1, NotificationChain msgs) {
		MultipleFeature oldContextOp1 = contextOp1;
		contextOp1 = newContextOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.CONTEXT__CONTEXT_OP1, oldContextOp1, newContextOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextOp1(MultipleFeature newContextOp1) {
		if (newContextOp1 != contextOp1) {
			NotificationChain msgs = null;
			if (contextOp1 != null)
				msgs = ((InternalEObject)contextOp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.CONTEXT__CONTEXT_OP1, null, msgs);
			if (newContextOp1 != null)
				msgs = ((InternalEObject)newContextOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.CONTEXT__CONTEXT_OP1, null, msgs);
			msgs = basicSetContextOp1(newContextOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.CONTEXT__CONTEXT_OP1, newContextOp1, newContextOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getContextOp2() {
		return contextOp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextOp2(Constraint newContextOp2, NotificationChain msgs) {
		Constraint oldContextOp2 = contextOp2;
		contextOp2 = newContextOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.CONTEXT__CONTEXT_OP2, oldContextOp2, newContextOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextOp2(Constraint newContextOp2) {
		if (newContextOp2 != contextOp2) {
			NotificationChain msgs = null;
			if (contextOp2 != null)
				msgs = ((InternalEObject)contextOp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.CONTEXT__CONTEXT_OP2, null, msgs);
			if (newContextOp2 != null)
				msgs = ((InternalEObject)newContextOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraConstraintsPackage.CONTEXT__CONTEXT_OP2, null, msgs);
			msgs = basicSetContextOp2(newContextOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.CONTEXT__CONTEXT_OP2, newContextOp2, newContextOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP1:
				return basicSetContextOp1(null, msgs);
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP2:
				return basicSetContextOp2(null, msgs);
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
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP1:
				return getContextOp1();
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP2:
				return getContextOp2();
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
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP1:
				setContextOp1((MultipleFeature)newValue);
				return;
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP2:
				setContextOp2((Constraint)newValue);
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
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP1:
				setContextOp1((MultipleFeature)null);
				return;
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP2:
				setContextOp2((Constraint)null);
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
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP1:
				return contextOp1 != null;
			case HydraConstraintsPackage.CONTEXT__CONTEXT_OP2:
				return contextOp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
