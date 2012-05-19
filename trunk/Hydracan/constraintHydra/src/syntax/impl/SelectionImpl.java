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

import syntax.BoolPriorityOperand2;
import syntax.Selection;
import syntax.SyntaxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link syntax.impl.SelectionImpl#getSelectionOp <em>Selection Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SelectionImpl extends BoolOperandChoicesImpl implements Selection {
	/**
	 * The cached value of the '{@link #getSelectionOp() <em>Selection Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionOp()
	 * @generated
	 * @ordered
	 */
	protected BoolPriorityOperand2 selectionOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolPriorityOperand2 getSelectionOp() {
		return selectionOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionOp(BoolPriorityOperand2 newSelectionOp, NotificationChain msgs) {
		BoolPriorityOperand2 oldSelectionOp = selectionOp;
		selectionOp = newSelectionOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyntaxPackage.SELECTION__SELECTION_OP, oldSelectionOp, newSelectionOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionOp(BoolPriorityOperand2 newSelectionOp) {
		if (newSelectionOp != selectionOp) {
			NotificationChain msgs = null;
			if (selectionOp != null)
				msgs = ((InternalEObject)selectionOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.SELECTION__SELECTION_OP, null, msgs);
			if (newSelectionOp != null)
				msgs = ((InternalEObject)newSelectionOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.SELECTION__SELECTION_OP, null, msgs);
			msgs = basicSetSelectionOp(newSelectionOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.SELECTION__SELECTION_OP, newSelectionOp, newSelectionOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyntaxPackage.SELECTION__SELECTION_OP:
				return basicSetSelectionOp(null, msgs);
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
			case SyntaxPackage.SELECTION__SELECTION_OP:
				return getSelectionOp();
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
			case SyntaxPackage.SELECTION__SELECTION_OP:
				setSelectionOp((BoolPriorityOperand2)newValue);
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
			case SyntaxPackage.SELECTION__SELECTION_OP:
				setSelectionOp((BoolPriorityOperand2)null);
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
			case SyntaxPackage.SELECTION__SELECTION_OP:
				return selectionOp != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectionImpl
