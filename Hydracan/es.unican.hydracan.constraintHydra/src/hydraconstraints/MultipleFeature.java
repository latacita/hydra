/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hydraconstraints.MultipleFeature#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hydraconstraints.HydraconstraintsPackage#getMultipleFeature()
 * @model
 * @generated
 */
public interface MultipleFeature extends NumOperandChoices {
	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see hydraconstraints.HydraconstraintsPackage#getMultipleFeature_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hydraconstraints.MultipleFeature#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean existeFeature(DiagnosticChain diagnostnics, Map context);

} // MultipleFeature
