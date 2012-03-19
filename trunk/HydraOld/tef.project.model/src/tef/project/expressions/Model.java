/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tef.project.expressions.Model#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see tef.project.expressions.ExpressionsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link tef.project.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see tef.project.expressions.ExpressionsPackage#getModel_Constraints()
	 * @model type="tef.project.expressions.Expression" containment="true" ordered="false"
	 * @generated
	 */
	EList getConstraints();

} // Model
