/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import java.util.Iterator;

import hydraconstraints.Constraint;
import hydraconstraints.Context;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.MultipleFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import specializationModel.ConfigState;
import specializationModel.Feature;
import specializationModel.Node;
import specializationModel.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hydraconstraints.impl.ContextImpl#getContextOp2 <em>Context Op2</em>}</li>
 *   <li>{@link hydraconstraints.impl.ContextImpl#getContextOp1 <em>Context Op1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends BoolOperandChoicesImpl implements Context {
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
	 * The cached value of the '{@link #getContextOp1() <em>Context Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextOp1()
	 * @generated
	 * @ordered
	 */
	protected MultipleFeature contextOp1;

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
		return HydraconstraintsPackage.Literals.CONTEXT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.CONTEXT__CONTEXT_OP2, oldContextOp2, newContextOp2);
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
				msgs = ((InternalEObject)contextOp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.CONTEXT__CONTEXT_OP2, null, msgs);
			if (newContextOp2 != null)
				msgs = ((InternalEObject)newContextOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.CONTEXT__CONTEXT_OP2, null, msgs);
			msgs = basicSetContextOp2(newContextOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.CONTEXT__CONTEXT_OP2, newContextOp2, newContextOp2));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.CONTEXT__CONTEXT_OP1, oldContextOp1, newContextOp1);
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
				msgs = ((InternalEObject)contextOp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.CONTEXT__CONTEXT_OP1, null, msgs);
			if (newContextOp1 != null)
				msgs = ((InternalEObject)newContextOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HydraconstraintsPackage.CONTEXT__CONTEXT_OP1, null, msgs);
			msgs = basicSetContextOp1(newContextOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.CONTEXT__CONTEXT_OP1, newContextOp1, newContextOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP2:
				return basicSetContextOp2(null, msgs);
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP1:
				return basicSetContextOp1(null, msgs);
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
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP2:
				return getContextOp2();
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP1:
				return getContextOp1();
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
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP2:
				setContextOp2((Constraint)newValue);
				return;
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP1:
				setContextOp1((MultipleFeature)newValue);
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
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP2:
				setContextOp2((Constraint)null);
				return;
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP1:
				setContextOp1((MultipleFeature)null);
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
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP2:
				return contextOp2 != null;
			case HydraconstraintsPackage.CONTEXT__CONTEXT_OP1:
				return contextOp1 != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Evaluates the context operation
	 * This operation evaluates one constraint that only affect a certain number of features
	 * This concrete number of features is determined by the featureContext
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		// Open the specialization model in order to find the proper context
		URI uri = URI.createFileURI(modelDirection);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		Project modelSpecialization = (Project) resource.getContents().get(0);
		Feature feature;
		int result=0;
		
		// If there is a previous context 
		if (featureContext==null) {
			
			// this loop search into the specialization model features for the proper context
			for (Iterator<Node> iterator=modelSpecialization.getFeatures().iterator(); 
					iterator.hasNext() && featureContext==null; )
			{
				Node node=iterator.next();
				if (node instanceof Feature) {
					feature=(Feature) node;
					if (feature.getRealName().equals(this.getContextOp1().getFeatureName())) {
						featureContext=feature;
					}
				}
			}
		} else {
			Feature context=(Feature) featureContext;
			
			// This loop looks into the children of the previous context to find the new context
			for (Iterator<Node> iterator=context.getChildren().iterator(); 
					iterator.hasNext() && result==0; ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof Feature) {
					feature=(Feature) node;
					if (feature.getRealName().equals(this.getContextOp1().getFeatureName()) && feature.getState()==ConfigState.USER_SELECTED) {
						featureContext=feature;
						result=1;
					}
				}
			}
		}
		
		// Once we have a right context, the next step is evaluate the constraint
		Constraint op2=this.getContextOp2();
		return op2.getOperators().evaluate(modelDirection, featureContext);	
	}

} //ContextImpl
