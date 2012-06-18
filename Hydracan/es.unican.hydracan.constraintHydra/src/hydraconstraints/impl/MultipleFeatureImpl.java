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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean existeFeature(DiagnosticChain diagnostnics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		// El primer paso es cargar el modelo de la URI determinada por el workspace
		// Fue escrito ahi en la validacion de Model
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		// Escribimos en una URI privada el modelo para que sea accesible por todos
		URI uri = URI.createFileURI(workspaceDirectory.toString()+"/modelo.xmi");
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		Project featureModel = (Project) resource.getContents().get(0);
		
		String resultado="El feature "+this.featureName+" no existe en el fichero proporcionado";
		/*for (Iterator<Feature> iterator2=featureModel.getRoots().iterator();
				iterator2.hasNext(); )
		{
			Feature feature=iterator2.next();
			resultado+=feature.getName();	
		}*/
		
		for (Iterator<Node> iterator=featureModel.getFeatures().iterator(); 
				iterator.hasNext(); )
		{
			Node node=iterator.next();
			if (node instanceof Feature) {
				Feature feature = (Feature) node;
				if (feature.getName().equals(this.featureName)) {
					resultado="bien";
				}
			}
		}

		
		
		if (!resultado.equals("bien")) {
			if (diagnostnics != null) {
				diagnostnics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HydraconstraintsValidator.DIAGNOSTIC_SOURCE,
						 HydraconstraintsValidator.MULTIPLE_FEATURE__EXISTE_FEATURE,
						 //EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "existeFeature", EObjectValidator.getObjectLabel(this, context) }),
						 resultado,
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

} //MultipleFeatureImpl
