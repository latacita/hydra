/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see specializationModel.SpecializationModelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	
	Node getTarget();
	Node getSource();
	void setTarget(Node target);
	void setSource(Node source);
	
} // Relation
