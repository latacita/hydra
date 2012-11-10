/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import java.util.Iterator;

import hydraconstraints.All;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.Constraint;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import specializationModel.ConfigState;
import specializationModel.Feature;
import specializationModel.Node;
import specializationModel.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllImpl extends SelectionImpl implements All {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.ALL;
	}
	
	/**
	 * Evaluate the all operation
	 * The all operation is true if the constraints evaluates to true in every context
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		// Open the specialization model in order to evaluate all the features in the context
		URI uri = URI.createFileURI(modelDirection);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		Project modelSpecialization = (Project) resource.getContents().get(0);
		
		
		Feature feature;
		int result=1;
		int aux=0;
		String featureName=this.getSelectionOp().getContextOp1().getFeatureName();
		Constraint op2=this.getSelectionOp().getContextOp2();
		
		// If there was not a previous context, the new context must be created in a different way
		if (featureContext==null) {
			
			// this loop evaluates the constraints with all the possible contexts
			for (Iterator<Node> iterator=modelSpecialization.getFeatures().iterator(); 
					iterator.hasNext() && result==1; )
			{
				Node node=iterator.next();
				if (node instanceof Feature) {
					feature=(Feature) node;
					if (feature.getRealName().equals(featureName) && feature.getState()==ConfigState.USER_SELECTED) {
						featureContext=feature;
						aux++;
						result=op2.getOperators().evaluate(modelDirection, featureContext);
					}
				}
			}
		} else {
			specializationModel.Feature context=(specializationModel.Feature) featureContext;
			
			// this loop evaluates the constraints with all the possible contexts
			for (Iterator<specializationModel.Node> iterator=context.getChildren().iterator(); 
					iterator.hasNext() && result==1; ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof specializationModel.Feature) {
					feature=(specializationModel.Feature) node;
					if (feature.getRealName().equals(featureName) && feature.getState()==ConfigState.USER_SELECTED) {
						featureContext=feature;
						aux++;
						result=op2.getOperators().evaluate(modelDirection, featureContext);
					}
				}
			}
		}
		
		// Aux will only be 0 in the case of an all operation that uses no features
		if (aux==0) {
			return 0;
		} else {
			return result;
		}
	}

} //AllImpl
