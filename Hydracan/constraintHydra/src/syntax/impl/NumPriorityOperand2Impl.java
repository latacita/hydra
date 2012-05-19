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
import syntax.NumPriorityOperand2;
import syntax.SyntaxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Priority Operand2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link syntax.impl.NumPriorityOperand2Impl#getNumPriorityOp2 <em>Num Priority Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPriorityOperand2Impl extends EObjectImpl implements NumPriorityOperand2 {
	/**
	 * The cached value of the '{@link #getNumPriorityOp2() <em>Num Priority Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPriorityOp2()
	 * @generated
	 * @ordered
	 */
	protected NumOperand numPriorityOp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumPriorityOperand2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.NUM_PRIORITY_OPERAND2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumOperand getNumPriorityOp2() {
		return numPriorityOp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumPriorityOp2(NumOperand newNumPriorityOp2, NotificationChain msgs) {
		NumOperand oldNumPriorityOp2 = numPriorityOp2;
		numPriorityOp2 = newNumPriorityOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2, oldNumPriorityOp2, newNumPriorityOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPriorityOp2(NumOperand newNumPriorityOp2) {
		if (newNumPriorityOp2 != numPriorityOp2) {
			NotificationChain msgs = null;
			if (numPriorityOp2 != null)
				msgs = ((InternalEObject)numPriorityOp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2, null, msgs);
			if (newNumPriorityOp2 != null)
				msgs = ((InternalEObject)newNumPriorityOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2, null, msgs);
			msgs = basicSetNumPriorityOp2(newNumPriorityOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2, newNumPriorityOp2, newNumPriorityOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2:
				return basicSetNumPriorityOp2(null, msgs);
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2:
				return getNumPriorityOp2();
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2:
				setNumPriorityOp2((NumOperand)newValue);
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2:
				setNumPriorityOp2((NumOperand)null);
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
			case SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2:
				return numPriorityOp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //NumPriorityOperand2Impl
