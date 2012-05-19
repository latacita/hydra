/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel.impl;

import featureModel.FeatureModelPackage;
import featureModel.Node;
import featureModel.Relation;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends EObjectImpl implements Relation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.RELATION;
	}

	@Override
	public Node getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSource(Node source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTarget(Node target) {
		// TODO Auto-generated method stub
		
	}

} //RelationImpl
