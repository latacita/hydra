/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel.impl;

import featureModel.Feature;
import featureModel.FeatureModelPackage;
import featureModel.Node;
import featureModel.TypedValue;
import featureModel.ValueType;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import choco.kernel.model.variables.integer.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getTypedValue <em>Typed Value</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getReferences <em>References</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getReferenciated <em>Referenciated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends NodeImpl implements Feature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueType VALUE_TYPE_EDEFAULT = ValueType.FEATURE;
	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ValueType valueType = VALUE_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTypedValue() <em>Typed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected TypedValue typedValue;
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> children;
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected Feature references;
	/**
	 * The cached value of the '{@link #getReferenciated() <em>Referenciated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenciated()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> referenciated;
	private IntegerVariable myVariable = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ValueType newValueType) {
		ValueType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedValue getTypedValue() {
		return typedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedValue(TypedValue newTypedValue, NotificationChain msgs) {
		TypedValue oldTypedValue = typedValue;
		typedValue = newTypedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__TYPED_VALUE, oldTypedValue, newTypedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(TypedValue newTypedValue) {
		if (newTypedValue != typedValue) {
			NotificationChain msgs = null;
			if (typedValue != null)
				msgs = ((InternalEObject)typedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.FEATURE__TYPED_VALUE, null, msgs);
			if (newTypedValue != null)
				msgs = ((InternalEObject)newTypedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.FEATURE__TYPED_VALUE, null, msgs);
			msgs = basicSetTypedValue(newTypedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__TYPED_VALUE, newTypedValue, newTypedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Feature getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (Feature)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureModelPackage.FEATURE__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(Feature newReferences) {
		Feature oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getReferenciated() {
		if (referenciated == null) {
			referenciated = new EObjectResolvingEList<Feature>(Feature.class, this, FeatureModelPackage.FEATURE__REFERENCIATED);
		}
		return referenciated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.FEATURE__TYPED_VALUE:
				return basicSetTypedValue(null, msgs);
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
			case FeatureModelPackage.FEATURE__NAME:
				return getName();
			case FeatureModelPackage.FEATURE__VALUE_TYPE:
				return getValueType();
			case FeatureModelPackage.FEATURE__TYPED_VALUE:
				return getTypedValue();
			case FeatureModelPackage.FEATURE__CHILDREN:
				return getChildren();
			case FeatureModelPackage.FEATURE__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
			case FeatureModelPackage.FEATURE__REFERENCIATED:
				return getReferenciated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureModelPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case FeatureModelPackage.FEATURE__VALUE_TYPE:
				setValueType((ValueType)newValue);
				return;
			case FeatureModelPackage.FEATURE__TYPED_VALUE:
				setTypedValue((TypedValue)newValue);
				return;
			case FeatureModelPackage.FEATURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case FeatureModelPackage.FEATURE__REFERENCES:
				setReferences((Feature)newValue);
				return;
			case FeatureModelPackage.FEATURE__REFERENCIATED:
				getReferenciated().clear();
				getReferenciated().addAll((Collection<? extends Feature>)newValue);
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
			case FeatureModelPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeatureModelPackage.FEATURE__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case FeatureModelPackage.FEATURE__TYPED_VALUE:
				setTypedValue((TypedValue)null);
				return;
			case FeatureModelPackage.FEATURE__CHILDREN:
				getChildren().clear();
				return;
			case FeatureModelPackage.FEATURE__REFERENCES:
				setReferences((Feature)null);
				return;
			case FeatureModelPackage.FEATURE__REFERENCIATED:
				getReferenciated().clear();
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
			case FeatureModelPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeatureModelPackage.FEATURE__VALUE_TYPE:
				return valueType != VALUE_TYPE_EDEFAULT;
			case FeatureModelPackage.FEATURE__TYPED_VALUE:
				return typedValue != null;
			case FeatureModelPackage.FEATURE__CHILDREN:
				return children != null && !children.isEmpty();
			case FeatureModelPackage.FEATURE__REFERENCES:
				return references != null;
			case FeatureModelPackage.FEATURE__REFERENCIATED:
				return referenciated != null && !referenciated.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Node>(Node.class, this, FeatureModelPackage.FEATURE__CHILDREN);
		}
		return children;
	}

} //FeatureImpl
