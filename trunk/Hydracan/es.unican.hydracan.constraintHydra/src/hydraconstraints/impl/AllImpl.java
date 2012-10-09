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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int evaluate(String modelDirection, EObject featureContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		URI uri = URI.createFileURI(modelDirection);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		Project modelSpecialization = (Project) resource.getContents().get(0);
		Feature f;
		int aux=1;
		String featureName=this.getSelectionOp().getContextOp1().getFeatureName();
		Constraint op2=this.getSelectionOp().getContextOp2();
		if (featureContext==null) {
			for (Iterator<Node> iterator=modelSpecialization.getFeatures().iterator(); 
					iterator.hasNext() && aux==1; )
			{
				Node node=iterator.next();
				if (node instanceof Feature) {
					f=(Feature) node;
					if (f.getRealName().equals(featureName) && f.getState()==ConfigState.USER_SELECTED) {
						featureContext=f;
						aux=op2.getOperators().evaluate(modelDirection, featureContext);
					}
				}
			}
		} else {
			specializationModel.Feature context=(specializationModel.Feature) featureContext;
			for (Iterator<specializationModel.Node> iterator=context.getChildren().iterator(); 
					iterator.hasNext() && aux==1; ) {
				specializationModel.Node node=iterator.next();
				if (node instanceof specializationModel.Feature) {
					f=(specializationModel.Feature) node;
					if (f.getRealName().equals(featureName) && f.getState()==ConfigState.USER_SELECTED) {
						featureContext=f;
						aux=op2.getOperators().evaluate(modelDirection, featureContext);
					}
				}
			}
		}
		return aux;
	}

} //AllImpl
