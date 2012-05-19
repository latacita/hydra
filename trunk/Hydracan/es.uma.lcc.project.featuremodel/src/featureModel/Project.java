/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.Project#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureModel.Project#getRelations <em>Relations</em>}</li>
 *   <li>{@link featureModel.Project#getNameConfigFile <em>Name Config File</em>}</li>
 *   <li>{@link featureModel.Project#getNameConstraintsFile <em>Name Constraints File</em>}</li>
 *   <li>{@link featureModel.Project#getNumberOfProducts <em>Number Of Products</em>}</li>
 *   <li>{@link featureModel.Project#isValidatedOCL <em>Validated OCL</em>}</li>
 *   <li>{@link featureModel.Project#isValidatedTEF <em>Validated TEF</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getProject_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getFeatures();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getProject_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();
	/**
	 * Returns the value of the '<em><b>Name Config File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Config File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Config File</em>' attribute.
	 * @see #setNameConfigFile(String)
	 * @see featureModel.FeatureModelPackage#getProject_NameConfigFile()
	 * @model
	 * @generated
	 */
	String getNameConfigFile();

	/**
	 * Sets the value of the '{@link featureModel.Project#getNameConfigFile <em>Name Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Config File</em>' attribute.
	 * @see #getNameConfigFile()
	 * @generated
	 */
	void setNameConfigFile(String value);

	/**
	 * Returns the value of the '<em><b>Name Constraints File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Constraints File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Constraints File</em>' attribute.
	 * @see #setNameConstraintsFile(String)
	 * @see featureModel.FeatureModelPackage#getProject_NameConstraintsFile()
	 * @model
	 * @generated
	 */
	String getNameConstraintsFile();

	/**
	 * Sets the value of the '{@link featureModel.Project#getNameConstraintsFile <em>Name Constraints File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Constraints File</em>' attribute.
	 * @see #getNameConstraintsFile()
	 * @generated
	 */
	void setNameConstraintsFile(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Products</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Products</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Products</em>' attribute.
	 * @see #setNumberOfProducts(int)
	 * @see featureModel.FeatureModelPackage#getProject_NumberOfProducts()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfProducts();

	/**
	 * Sets the value of the '{@link featureModel.Project#getNumberOfProducts <em>Number Of Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Products</em>' attribute.
	 * @see #getNumberOfProducts()
	 * @generated
	 */
	void setNumberOfProducts(int value);

	/**
	 * Returns the value of the '<em><b>Validated OCL</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validated OCL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validated OCL</em>' attribute.
	 * @see #setValidatedOCL(boolean)
	 * @see featureModel.FeatureModelPackage#getProject_ValidatedOCL()
	 * @model default="false"
	 * @generated
	 */
	boolean isValidatedOCL();

	/**
	 * Sets the value of the '{@link featureModel.Project#isValidatedOCL <em>Validated OCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated OCL</em>' attribute.
	 * @see #isValidatedOCL()
	 * @generated
	 */
	void setValidatedOCL(boolean value);

	/**
	 * Returns the value of the '<em><b>Validated TEF</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validated TEF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validated TEF</em>' attribute.
	 * @see #setValidatedTEF(boolean)
	 * @see featureModel.FeatureModelPackage#getProject_ValidatedTEF()
	 * @model default="false"
	 * @generated
	 */
	boolean isValidatedTEF();

	/**
	 * Sets the value of the '{@link featureModel.Project#isValidatedTEF <em>Validated TEF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated TEF</em>' attribute.
	 * @see #isValidatedTEF()
	 * @generated
	 */
	void setValidatedTEF(boolean value);

	void prepareToValidation();
	List<Feature> getRoots();
	boolean isValidatedOK();
	void setValidatedOK(boolean isValidatedOK);

} // Project
