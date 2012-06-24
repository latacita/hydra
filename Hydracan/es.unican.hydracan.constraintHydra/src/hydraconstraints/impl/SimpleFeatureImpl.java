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

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SimpleFeatureImpl extends MultipleFeatureImpl implements SimpleFeature {
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
				} // if feature == this
			} // if node is a feature
		} // for each node
		
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

} //SimpleFeatureImpl
