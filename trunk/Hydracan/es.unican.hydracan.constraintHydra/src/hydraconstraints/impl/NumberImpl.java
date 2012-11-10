/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.HydraconstraintsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hydraconstraints.impl.NumberImpl#getNumValue <em>Num Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberImpl extends NumOperandChoicesImpl implements hydraconstraints.Number {
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
		return HydraconstraintsPackage.Literals.NUMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.NUMBER__NUM_VALUE, oldNumValue, numValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HydraconstraintsPackage.NUMBER__NUM_VALUE:
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
			case HydraconstraintsPackage.NUMBER__NUM_VALUE:
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
			case HydraconstraintsPackage.NUMBER__NUM_VALUE:
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
			case HydraconstraintsPackage.NUMBER__NUM_VALUE:
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
	
	/**
	 * Evaluates the value of the number (just return it)
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return numValue;
	}

} //NumberImpl
