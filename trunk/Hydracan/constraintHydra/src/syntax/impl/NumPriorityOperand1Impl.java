/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import syntax.NumOperand;
import syntax.NumPriorityOperand1;
import syntax.SyntaxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Priority Operand1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link syntax.impl.NumPriorityOperand1Impl#getNumPriorityOp1 <em>Num Priority Op1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPriorityOperand1Impl extends EObjectImpl implements NumPriorityOperand1 {
	/**
	 * The cached value of the '{@link #getNumPriorityOp1() <em>Num Priority Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPriorityOp1()
	 * @generated
	 * @ordered
	 */
	protected NumOperand numPriorityOp1;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumPriorityOperand1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.NUM_PRIORITY_OPERAND1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumOperand getNumPriorityOp1() {
		return numPriorityOp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPriorityOp1(NumOperand newNumPriorityOp1, NotificationChain msgs) {
		NumOperand oldNumPriorityOp1 = numPriorityOp1;
		numPriorityOp1 = newNumPriorityOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1, oldNumPriorityOp1, newNumPriorityOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPriorityOp1(NumOperand newNumPriorityOp1) {
		if (newNumPriorityOp1 != numPriorityOp1) {
			NotificationChain msgs = null;
			if (numPriorityOp1 != null)
				msgs = ((InternalEObject)numPriorityOp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1, null, msgs);
			if (newNumPriorityOp1 != null)
				msgs = ((InternalEObject)newNumPriorityOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1, null, msgs);
			msgs = basicSetNumPriorityOp1(newNumPriorityOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1, newNumPriorityOp1, newNumPriorityOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1:
				return basicSetNumPriorityOp1(null, msgs);
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1:
				return getNumPriorityOp1();
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1:
				setNumPriorityOp1((NumOperand)newValue);
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1:
				setNumPriorityOp1((NumOperand)null);
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1:
				return numPriorityOp1 != null;
		}
		return super.eIsSet(featureID);
	}

} //NumPriorityOperand1Impl
