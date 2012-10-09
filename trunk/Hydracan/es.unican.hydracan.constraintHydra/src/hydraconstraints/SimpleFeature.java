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
 * A representation of the model object '<em><b>Simple Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hydraconstraints.SimpleFeature#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hydraconstraints.HydraconstraintsPackage#getSimpleFeature()
 * @model
 * @generated
 */
public interface SimpleFeature extends BoolOperandChoices {

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
	 * @see hydraconstraints.HydraconstraintsPackage#getSimpleFeature_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hydraconstraints.SimpleFeature#getFeatureName <em>Feature Name</em>}' attribute.
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
	boolean isSimpleFeature(DiagnosticChain diagnostics, Map context);
} // SimpleFeature
