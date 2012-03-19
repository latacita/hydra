/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import specializationModel.Node;
import specializationModel.Relation;
import specializationModel.SpecializationModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link specializationModel.impl.NodeImpl#getFather <em>Father</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected Node father;
	Node tempNode = null;
	Relation myRelation = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecializationModelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFather() {
		if (father != null && father.eIsProxy()) {
			InternalEObject oldFather = (InternalEObject)father;
			father = (Node)eResolveProxy(oldFather);
			if (father != oldFather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecializationModelPackage.NODE__FATHER, oldFather, father));
			}
		}
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(Node newFather) {
		Node oldFather = father;
		father = newFather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecializationModelPackage.NODE__FATHER, oldFather, father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecializationModelPackage.NODE__FATHER:
				if (resolve) return getFather();
				return basicGetFather();
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
			case SpecializationModelPackage.NODE__FATHER:
				setFather((Node)newValue);
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
			case SpecializationModelPackage.NODE__FATHER:
				setFather((Node)null);
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
			case SpecializationModelPackage.NODE__FATHER:
				return father != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Node getSpecializationNode() {
		// TODO Auto-generated method stub
		return tempNode;
	}

	@Override
	public void setSpecializationNode(Node node) {
		// TODO Auto-generated method stub
		tempNode = node;
	}

	@Override
	public Relation getRelation() {
		// TODO Auto-generated method stub
		return myRelation;
	}

	@Override
	public void setRelation(Relation relation) {
		// TODO Auto-generated method stub
		this.myRelation = relation;
	}

	@Override
	public EList getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

} //NodeImpl
