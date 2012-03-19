/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.FeatureGroup#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link featureModel.FeatureGroup#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link featureModel.FeatureGroup#getType <em>Type</em>}</li>
 *   <li>{@link featureModel.FeatureGroup#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getFeatureGroup()
 * @model
 * @generated
 */
public interface FeatureGroup extends Node {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see featureModel.FeatureModelPackage#getFeatureGroup_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link featureModel.FeatureGroup#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see featureModel.FeatureModelPackage#getFeatureGroup_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link featureModel.FeatureGroup#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link featureModel.FeatureGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see featureModel.FeatureGroupType
	 * @see #setType(FeatureGroupType)
	 * @see featureModel.FeatureModelPackage#getFeatureGroup_Type()
	 * @model default=""
	 * @generated
	 */
	FeatureGroupType getType();

	/**
	 * Sets the value of the '{@link featureModel.FeatureGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see featureModel.FeatureGroupType
	 * @see #getType()
	 * @generated
	 */
	void setType(FeatureGroupType value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link featureModel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see featureModel.FeatureModelPackage#getFeatureGroup_Children()
	 * @model
	 * @generated
	 */
	EList<Feature> getChildren();

} // FeatureGroup
