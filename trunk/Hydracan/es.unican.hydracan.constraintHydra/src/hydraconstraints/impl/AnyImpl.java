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
		int aux=0;
		String featureName=this.getSelectionOp().getContextOp1().getFeatureName();
		Constraint op2=this.getSelectionOp().getContextOp2();
		if (featureContext==null) {
			for (Iterator<Node> iterator=modelSpecialization.getFeatures().iterator(); 
					iterator.hasNext() && aux==0; )
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
					iterator.hasNext() && aux==0; ) {
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

} //AnyImpl
