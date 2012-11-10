/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import featureModel.Feature;
import featureModel.Node;
import featureModel.Project;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.MultipleFeature;

import hydraconstraints.util.HydraconstraintsValidator;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import specializationModel.ConfigState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hydraconstraints.impl.MultipleFeatureImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleFeatureImpl extends NumOperandChoicesImpl implements MultipleFeature {
	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.MULTIPLE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * This method is provided by EMF Validation Framework
	 * This method is executed when the xmi constraint model is validated
	 * It looks if the feature name exists in the feature model
	 * @generated NOT
	 */
	public boolean isMultipleFeature(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		// Look for the file in the workspace		
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		// We write the direction in a private uri, so we can use it later
		URI uri = URI.createFileURI(workspaceDirectory.toString()+"/modelo.xmi");
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		Project featureModel = (Project) resource.getContents().get(0);
				
		String result="Feature "+this.featureName+" does not exist in the given model";
				
		// This loop checks all the features until the correct one is found
		for (Iterator<Node> iterator=featureModel.getFeatures().iterator(); 
				iterator.hasNext() && !result.equals("good"); )
		{
			Node node=iterator.next();
			if (node instanceof Feature) {
				Feature feature = (Feature) node; // We only use the node if it is a feature
				if (feature.getName().equals(this.featureName)) { 
					result="good";
				} // if feature == this
			} // if node is a feature
		} // for each node
			
		// Validation Framework
		if (!result.equals("good")) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HydraconstraintsValidator.DIAGNOSTIC_SOURCE,
						 HydraconstraintsValidator.MULTIPLE_FEATURE__IS_MULTIPLE_FEATURE,
						 result,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME:
				return getFeatureName();
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
			case HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME:
				setFeatureName((String)newValue);
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
			case HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
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
			case HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Evaluates the multiple feature
	 * It returns the total amount of instances of the feature with this name in the specialization model
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		// Open the specialization model 
		URI uri = URI.createFileURI(modelDirection);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		int result=0;
		specializationModel.Project modelSpecialization = (specializationModel.Project) resource.getContents().get(0);
		
		// If there is no previous context, we have to count the number of instances of the feature
		if (featureContext==null) {
			for (Iterator<specializationModel.Node> iterator=modelSpecialization.getFeatures().iterator(); 
					iterator.hasNext(); ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof specializationModel.Feature) {
					specializationModel.Feature feature=(specializationModel.Feature) node;
					if (feature.getRealName().equals(this.getFeatureName()) && feature.getState()==ConfigState.USER_SELECTED) {
						result++;
					}
				}
			}
		// If there is  previous context, we have to count the number of instances on the appropiate context
		} else {
			specializationModel.Feature context=(specializationModel.Feature) featureContext;
			for (Iterator<specializationModel.Node> iterator=context.getChildren().iterator(); 
					iterator.hasNext(); ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof specializationModel.Feature) {
					specializationModel.Feature feature=(specializationModel.Feature) node;
					if (feature.getRealName().equals(this.getFeatureName()) && feature.getState()==ConfigState.USER_SELECTED) {
						result++;
					}
				}
			}
		}
		return result;
	}

} //MultipleFeatureImpl
