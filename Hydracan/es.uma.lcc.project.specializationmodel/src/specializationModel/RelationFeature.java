/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specializationModel.RelationFeature#getSource <em>Source</em>}</li>
 *   <li>{@link specializationModel.RelationFeature#getTarget <em>Target</em>}</li>
 *   <li>{@link specializationModel.RelationFeature#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link specializationModel.RelationFeature#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link specializationModel.RelationFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see specializationModel.SpecializationModelPackage#getRelationFeature()
 * @model
 * @generated
 */
public interface RelationFeature extends Relation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Feature)
	 * @see specializationModel.SpecializationModelPackage#getRelationFeature_Source()
	 * @model required="true"
	 * @generated
	 */
	Feature getSource();

	/**
	 * Sets the value of the '{@link specializationModel.RelationFeature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Feature value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Feature)
	 * @see specializationModel.SpecializationModelPackage#getRelationFeature_Target()
	 * @model required="true"
	 * @generated
	 */
	Feature getTarget();

	/**
	 * Sets the value of the '{@link specializationModel.RelationFeature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Feature value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see specializationModel.SpecializationModelPackage#getRelationFeature_LowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link specializationModel.RelationFeature#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see specializationModel.SpecializationModelPackage#getRelationFeature_UpperBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link specializationModel.RelationFeature#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link specializationModel.FeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see specializationModel.FeatureType
	 * @see #setType(FeatureType)
	 * @see specializationModel.SpecializationModelPackage#getRelationFeature_Type()
	 * @model
	 * @generated
	 */
	FeatureType getType();

	/**
	 * Sets the value of the '{@link specializationModel.RelationFeature#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see specializationModel.FeatureType
	 * @see #getType()
	 * @generated
	 */
	void setType(FeatureType value);

} // RelationFeature
