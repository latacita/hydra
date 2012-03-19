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
 * A representation of the model object '<em><b>Typed Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.TypedValue#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link featureModel.TypedValue#getStringValue <em>String Value</em>}</li>
 *   <li>{@link featureModel.TypedValue#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link featureModel.TypedValue#getFeatureValue <em>Feature Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getTypedValue()
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
	 * @see featureModel.FeatureModelPackage#getTypedValue_IntegerValue()
	 * @model
	 * @generated
	 */
	Integer getIntegerValue();

	/**
	 * Sets the value of the '{@link featureModel.TypedValue#getIntegerValue <em>Integer Value</em>}' attribute.
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
	 * @see featureModel.FeatureModelPackage#getTypedValue_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link featureModel.TypedValue#getStringValue <em>String Value</em>}' attribute.
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
	 * @see featureModel.FeatureModelPackage#getTypedValue_FloatValue()
	 * @model
	 * @generated
	 */
	Float getFloatValue();

	/**
	 * Sets the value of the '{@link featureModel.TypedValue#getFloatValue <em>Float Value</em>}' attribute.
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
	 * @see featureModel.FeatureModelPackage#getTypedValue_FeatureValue()
	 * @model
	 * @generated
	 */
	Feature getFeatureValue();

	/**
	 * Sets the value of the '{@link featureModel.TypedValue#getFeatureValue <em>Feature Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Value</em>' reference.
	 * @see #getFeatureValue()
	 * @generated
	 */
	void setFeatureValue(Feature value);

} // TypedValue
