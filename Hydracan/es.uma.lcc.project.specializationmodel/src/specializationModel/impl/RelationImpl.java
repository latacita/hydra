/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import specializationModel.Node;
import specializationModel.Relation;
import specializationModel.SpecializationModelPackage;

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
		return SpecializationModelPackage.Literals.RELATION;
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
