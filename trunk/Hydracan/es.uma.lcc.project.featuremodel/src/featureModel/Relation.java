/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see featureModel.FeatureModelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	Node getTarget();
	Node getSource();
	void setTarget(Node target);
	void setSource(Node source);
} // Relation
