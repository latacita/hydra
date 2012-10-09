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
import featureModel.Relation;
import featureModel.RelationFeature;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.SimpleFeature;

import hydraconstraints.util.HydraconstraintsValidator;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;

import specializationModel.ConfigState;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hydraconstraints.impl.SimpleFeatureImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleFeatureImpl extends BoolOperandChoicesImpl implements SimpleFeature {
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
	protected SimpleFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.SIMPLE_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSimpleFeature(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		// Buscamos el fichero en el workspace
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		// Escribimos en una URI privada el modelo para que sea accesible por todos
		URI uri = URI.createFileURI(workspaceDirectory.toString()+"/modelo.xmi");
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		Project featureModel = (Project) resource.getContents().get(0);
		
		String resultado="Feature "+this.featureName+" does not exist in the given model";
		
		// Recorremos todas las features del modelo hasta llegar al final o encontrar la correcta
		for (Iterator<Node> iterator=featureModel.getFeatures().iterator(); 
				iterator.hasNext() && !resultado.equals("bien"); )
		{
			Node node=iterator.next();
			if (node instanceof Feature) {
				Feature feature = (Feature) node; // Si el nodo es un Feature, lo parseamos 
				// Si el feature parseado se llama igual que esta multiple feature, trabajamos:
				if (feature.getName().equals(this.featureName)) { 
					resultado="Feature "+this.featureName+" exists but it is not a simple feature";
					
					// Este bucle va mirando los padres del feature para ver si son multiple features
					while (!resultado.equals("esMultiple") && feature!=null)
					{
						// Este bucle recorre todas las relaciones para cada padre
						for (Iterator<Relation> iterator2=featureModel.getRelations().iterator();
								iterator2.hasNext() && !resultado.equals("esMultiple"); ) {
							Relation relation = iterator2.next();
							if (relation instanceof RelationFeature) {
								RelationFeature relationF = (RelationFeature) relation;
								Feature destino=(Feature) relationF.getTarget();
								if (destino.equals(feature) && relationF.getUpperBound()>1) {
									resultado="esMultiple";
								} // if
							} // if
							
						} // for each relation
						feature = (Feature) feature.getFather();
					} // while father is not null
					if (!resultado.equals("esMultiple")) {
						resultado="bien";
					} else {
						resultado="Feature "+this.featureName+" is a multiple feature";
					}
				//} else {
					//resultado="existe";
				}
			} // if node is a feature
		} // for each node
		if (resultado.equals("Feature "+this.featureName+" does not exist in the given model")) {
			resultado="bien";
		}
		if (!resultado.equals("bien")) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HydraconstraintsValidator.DIAGNOSTIC_SOURCE,
						 HydraconstraintsValidator.MULTIPLE_FEATURE__IS_MULTIPLE_FEATURE,
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
			case HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME:
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
			case HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME:
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
			case HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME:
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
			case HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME:
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		int resultado=0;
		int aux=0;
		URI uri = URI.createFileURI(modelDirection);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		specializationModel.Project modelSpecialization = (specializationModel.Project) resource.getContents().get(0);
		if (featureContext == null) {
			for (Iterator<specializationModel.Node> iterator=modelSpecialization.getFeatures().iterator(); 
					iterator.hasNext() && resultado==0; ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof specializationModel.Feature) {
					specializationModel.Feature f=(specializationModel.Feature) node;
					if (f.getRealName().equals(this.getFeatureName()) && f.getState()==ConfigState.USER_SELECTED) {
						resultado=1;
					}
				}
			}
		} else {
			specializationModel.Feature context=(specializationModel.Feature) featureContext;
			for (Iterator<specializationModel.Node> iterator=context.getChildren().iterator(); 
					iterator.hasNext() && aux==0; ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof specializationModel.Feature) {
					specializationModel.Feature f=(specializationModel.Feature) node;
					if (f.getRealName().equals(this.getFeatureName()) && f.getState()==ConfigState.USER_SELECTED) {
						resultado=1;
					}
				}
			}
		}
		return resultado;
	}

} //SimpleFeatureImpl
