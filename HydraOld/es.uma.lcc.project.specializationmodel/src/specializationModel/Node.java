/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specializationModel.Node#getFather <em>Father</em>}</li>
 * </ul>
 * </p>
 *
 * @see specializationModel.SpecializationModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Node)
	 * @see specializationModel.SpecializationModelPackage#getNode_Father()
	 * @model
	 * @generated
	 */
	Node getFather();

	/**
	 * Sets the value of the '{@link specializationModel.Node#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Node value);
	
	Node getSpecializationNode();
	void setSpecializationNode(Node node);
	
	Relation getRelation();
	void setRelation(Relation relation);
	
	EList getChildren();

} // Node
