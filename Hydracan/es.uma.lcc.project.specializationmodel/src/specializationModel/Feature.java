/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specializationModel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link specializationModel.Feature#getValueType <em>Value Type</em>}</li>
 *   <li>{@link specializationModel.Feature#getTypedValue <em>Typed Value</em>}</li>
 *   <li>{@link specializationModel.Feature#getReferences <em>References</em>}</li>
 *   <li>{@link specializationModel.Feature#getChildren <em>Children</em>}</li>
 *   <li>{@link specializationModel.Feature#getState <em>State</em>}</li>
 *   <li>{@link specializationModel.Feature#getRealName <em>Real Name</em>}</li>
 *   <li>{@link specializationModel.Feature#getReferenciated <em>Referenciated</em>}</li>
 * </ul>
 * </p>
 *
 * @see specializationModel.SpecializationModelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see specializationModel.SpecializationModelPackage#getFeature_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link specializationModel.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link specializationModel.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see specializationModel.ValueType
	 * @see #setValueType(ValueType)
	 * @see specializationModel.SpecializationModelPackage#getFeature_ValueType()
	 * @model
	 * @generated
	 */
	ValueType getValueType();

	/**
	 * Sets the value of the '{@link specializationModel.Feature#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see specializationModel.ValueType
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueType value);

	/**
	 * Returns the value of the '<em><b>Typed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Value</em>' containment reference.
	 * @see #setTypedValue(TypedValue)
	 * @see specializationModel.SpecializationModelPackage#getFeature_TypedValue()
	 * @model containment="true"
	 * @generated
	 */
	TypedValue getTypedValue();

	/**
	 * Sets the value of the '{@link specializationModel.Feature#getTypedValue <em>Typed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Value</em>' containment reference.
	 * @see #getTypedValue()
	 * @generated
	 */
	void setTypedValue(TypedValue value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(Feature)
	 * @see specializationModel.SpecializationModelPackage#getFeature_References()
	 * @model
	 * @generated
	 */
	Feature getReferences();

	/**
	 * Sets the value of the '{@link specializationModel.Feature#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Feature value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link specializationModel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see specializationModel.SpecializationModelPackage#getFeature_Children()
	 * @model
	 * @generated
	 */
	EList<Node> getChildren();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link specializationModel.ConfigState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see specializationModel.ConfigState
	 * @see #setState(ConfigState)
	 * @see specializationModel.SpecializationModelPackage#getFeature_State()
	 * @model default=""
	 * @generated
	 */
	ConfigState getState();

	/**
	 * Sets the value of the '{@link specializationModel.Feature#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see specializationModel.ConfigState
	 * @see #getState()
	 * @generated
	 */
	void setState(ConfigState value);

	/**
	 * Returns the value of the '<em><b>Real Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Name</em>' attribute.
	 * @see #setRealName(String)
	 * @see specializationModel.SpecializationModelPackage#getFeature_RealName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getRealName();

	/**
	 * Sets the value of the '{@link specializationModel.Feature#getRealName <em>Real Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Name</em>' attribute.
	 * @see #getRealName()
	 * @generated
	 */
	void setRealName(String value);

	/**
	 * Returns the value of the '<em><b>Referenciated</b></em>' reference list.
	 * The list contents are of type {@link specializationModel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenciated</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenciated</em>' reference list.
	 * @see specializationModel.SpecializationModelPackage#getFeature_Referenciated()
	 * @model
	 * @generated
	 */
	EList<Feature> getReferenciated();
	
	
	Object getIntegerVariable();
	
	void setIntegerVariable(Object integerVariable);

} // Feature
