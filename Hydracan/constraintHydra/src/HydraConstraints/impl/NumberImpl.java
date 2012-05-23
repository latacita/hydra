/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.impl;

import HydraConstraints.HydraConstraintsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HydraConstraints.impl.NumberImpl#getNumValue <em>Num Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberImpl extends NumOperandChoicesImpl implements HydraConstraints.Number {
	/**
	 * The default value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumValue()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumValue()
	 * @generated
	 * @ordered
	 */
	protected int numValue = NUM_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraConstraintsPackage.Literals.NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumValue() {
		return numValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumValue(int newNumValue) {
		int oldNumValue = numValue;
		numValue = newNumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraConstraintsPackage.NUMBER__NUM_VALUE, oldNumValue, numValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HydraConstraintsPackage.NUMBER__NUM_VALUE:
				return getNumValue();
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
			case HydraConstraintsPackage.NUMBER__NUM_VALUE:
				setNumValue((Integer)newValue);
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
			case HydraConstraintsPackage.NUMBER__NUM_VALUE:
				setNumValue(NUM_VALUE_EDEFAULT);
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
			case HydraConstraintsPackage.NUMBER__NUM_VALUE:
				return numValue != NUM_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numValue: ");
		result.append(numValue);
		result.append(')');
		return result.toString();
	}

} //NumberImpl
