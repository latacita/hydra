/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.Constraint;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.Model;

import hydraconstraints.util.HydraconstraintsValidator;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;

import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hydraconstraints.impl.ModelImpl#getFeatureList <em>Feature List</em>}</li>
 *   <li>{@link hydraconstraints.impl.ModelImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The default value of the '{@link #getFeatureList() <em>Feature List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureList()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureList() <em>Feature List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureList()
	 * @generated
	 * @ordered
	 */
	protected String featureList = FEATURE_LIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureList() {
		return featureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureList(String newFeatureList) {
		String oldFeatureList = featureList;
		featureList = newFeatureList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.MODEL__FEATURE_LIST, oldFeatureList, featureList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, HydraconstraintsPackage.MODEL__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nombreCorrecto(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		String str="fallo";
		Bundle bundle;
		bundle = Platform.getBundle("es.unican.hydracan.constraintHydra");
		Path path = new Path("carpeta/"+this.featureList+".xmi");
		URL launcherURL = FileLocator.find(bundle, path, null);
		URL launcherFileURL = null;
		
		try {
			launcherFileURL = FileLocator.toFileURL(launcherURL);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			System.out.println("hola1");
		} 
		
		File buildFile = null;
		try {
			buildFile = new File(launcherFileURL.toURI());
		} catch (Exception e1) {
			System.out.println("hola2");
		} 
		
		BufferedReader ent=null;
		
	    try {
			ent = new BufferedReader(new FileReader(buildFile));
			str="bien";
		} catch (Exception e) {
			str="FilenotFound";
		} finally {
			try {
				ent.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Hola3");
			}
		}
		
		if (!str.equals("bien")) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HydraconstraintsValidator.DIAGNOSTIC_SOURCE,
						 HydraconstraintsValidator.MODEL__NOMBRE_CORRECTO,
						 //EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nombreCorrecto", EObjectValidator.getObjectLabel(this, context) }),
						 str,
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HydraconstraintsPackage.MODEL__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case HydraconstraintsPackage.MODEL__FEATURE_LIST:
				return getFeatureList();
			case HydraconstraintsPackage.MODEL__CONSTRAINTS:
				return getConstraints();
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
			case HydraconstraintsPackage.MODEL__FEATURE_LIST:
				setFeatureList((String)newValue);
				return;
			case HydraconstraintsPackage.MODEL__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case HydraconstraintsPackage.MODEL__FEATURE_LIST:
				setFeatureList(FEATURE_LIST_EDEFAULT);
				return;
			case HydraconstraintsPackage.MODEL__CONSTRAINTS:
				getConstraints().clear();
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
			case HydraconstraintsPackage.MODEL__FEATURE_LIST:
				return FEATURE_LIST_EDEFAULT == null ? featureList != null : !FEATURE_LIST_EDEFAULT.equals(featureList);
			case HydraconstraintsPackage.MODEL__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
		result.append(" (featureList: ");
		result.append(featureList);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
