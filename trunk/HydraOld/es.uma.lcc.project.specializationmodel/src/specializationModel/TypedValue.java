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
 * A representation of the model object '<em><b>Typed Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specializationModel.TypedValue#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link specializationModel.TypedValue#getStringValue <em>String Value</em>}</li>
 *   <li>{@link specializationModel.TypedValue#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link specializationModel.TypedValue#getFeatureValue <em>Feature Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see specializationModel.SpecializationModelPackage#getTypedValue()
 * @model
 * @generated
 */
public interface TypedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(Integer)
	 * @see specializationModel.SpecializationModelPackage#getTypedValue_IntegerValue()
	 * @model
	 * @generated
	 */
	Integer getIntegerValue();

	/**
	 * Sets the value of the '{@link specializationModel.TypedValue#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(Integer value);

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see specializationModel.SpecializationModelPackage#getTypedValue_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link specializationModel.TypedValue#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

	/**
	 * Returns the value of the '<em><b>Float Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Value</em>' attribute.
	 * @see #setFloatValue(Float)
	 * @see specializationModel.SpecializationModelPackage#getTypedValue_FloatValue()
	 * @model
	 * @generated
	 */
	Float getFloatValue();

	/**
	 * Sets the value of the '{@link specializationModel.TypedValue#getFloatValue <em>Float Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Value</em>' attribute.
	 * @see #getFloatValue()
	 * @generated
	 */
	void setFloatValue(Float value);

	/**
	 * Returns the value of the '<em><b>Feature Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Value</em>' reference.
	 * @see #setFeatureValue(Feature)
	 * @see specializationModel.SpecializationModelPackage#getTypedValue_FeatureValue()
	 * @model
	 * @generated
	 */
	Feature getFeatureValue();

	/**
	 * Sets the value of the '{@link specializationModel.TypedValue#getFeatureValue <em>Feature Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Value</em>' reference.
	 * @see #getFeatureValue()
	 * @generated
	 */
	void setFeatureValue(Feature value);

} // TypedValue
