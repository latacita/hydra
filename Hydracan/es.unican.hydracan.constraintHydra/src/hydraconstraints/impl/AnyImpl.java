/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import java.util.Iterator;

import hydraconstraints.Any;
import hydraconstraints.Constraint;
import hydraconstraints.HydraconstraintsPackage;

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
 * An implementation of the model object '<em><b>Any</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnyImpl extends SelectionImpl implements Any {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HydraconstraintsPackage.Literals.ANY;
	}
	
	/**
	 * Evaluates the any operation
	 * The any operation is true if the constraints evaluates to true in at least one context
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
		int result=0;
		String featureName=this.getSelectionOp().getContextOp1().getFeatureName();
		Constraint op2=this.getSelectionOp().getContextOp2();
		
		// If there was not a previous context, the new context must be created in a different way
		if (featureContext==null) {
			
			// this loop evaluates the constraints with all the possible contexts
			for (Iterator<Node> iterator=modelSpecialization.getFeatures().iterator(); 
					iterator.hasNext() && result==0; )
			{
				Node node=iterator.next();
				if (node instanceof Feature) {
					feature=(Feature) node;
					if (feature.getRealName().equals(featureName) && feature.getState()==ConfigState.USER_SELECTED) {
						featureContext=feature;
						result=op2.getOperators().evaluate(modelDirection, featureContext);
					}
				}
			}
		} else {
			specializationModel.Feature context=(specializationModel.Feature) featureContext;
			
			// this loop evaluates the constraints with all the possible contexts
			for (Iterator<specializationModel.Node> iterator=context.getChildren().iterator(); 
					iterator.hasNext() && result==0; ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof specializationModel.Feature) {
					feature=(specializationModel.Feature) node;
					if (feature.getRealName().equals(featureName) && feature.getState()==ConfigState.USER_SELECTED) {
						featureContext=feature;
						result=op2.getOperators().evaluate(modelDirection, featureContext);
					}
				}
			}
		}
		return result;
	}

} //AnyImpl
