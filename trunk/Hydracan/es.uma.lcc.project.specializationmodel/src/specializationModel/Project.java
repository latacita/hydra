/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel;

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
 *   <li>{@link specializationModel.Project#getFeatures <em>Features</em>}</li>
 *   <li>{@link specializationModel.Project#getRelations <em>Relations</em>}</li>
 *   <li>{@link specializationModel.Project#getFeatureModelURI <em>Feature Model URI</em>}</li>
 *   <li>{@link specializationModel.Project#getNameConstraintsFile <em>Name Constraints File</em>}</li>
 *   <li>{@link specializationModel.Project#getNameConfigFile <em>Name Config File</em>}</li>
 *   <li>{@link specializationModel.Project#getNumberOfProducts <em>Number Of Products</em>}</li>
 *   <li>{@link specializationModel.Project#isInfiniteDomain <em>Infinite Domain</em>}</li>
 *   <li>{@link specializationModel.Project#isUserConstraintsState <em>User Constraints State</em>}</li>
 * </ul>
 * </p>
 *
 * @see specializationModel.SpecializationModelPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link specializationModel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see specializationModel.SpecializationModelPackage#getProject_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getFeatures();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link specializationModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see specializationModel.SpecializationModelPackage#getProject_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Feature Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model URI</em>' attribute.
	 * @see #setFeatureModelURI(String)
	 * @see specializationModel.SpecializationModelPackage#getProject_FeatureModelURI()
	 * @model
	 * @generated
	 */
	String getFeatureModelURI();

	/**
	 * Sets the value of the '{@link specializationModel.Project#getFeatureModelURI <em>Feature Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model URI</em>' attribute.
	 * @see #getFeatureModelURI()
	 * @generated
	 */
	void setFeatureModelURI(String value);

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
	 * @see specializationModel.SpecializationModelPackage#getProject_NameConstraintsFile()
	 * @model
	 * @generated
	 */
	String getNameConstraintsFile();

	/**
	 * Sets the value of the '{@link specializationModel.Project#getNameConstraintsFile <em>Name Constraints File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Constraints File</em>' attribute.
	 * @see #getNameConstraintsFile()
	 * @generated
	 */
	void setNameConstraintsFile(String value);

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
	 * @see specializationModel.SpecializationModelPackage#getProject_NameConfigFile()
	 * @model
	 * @generated
	 */
	String getNameConfigFile();

	/**
	 * Sets the value of the '{@link specializationModel.Project#getNameConfigFile <em>Name Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Config File</em>' attribute.
	 * @see #getNameConfigFile()
	 * @generated
	 */
	void setNameConfigFile(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Products</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Products</em>' attribute.
	 * @see #setNumberOfProducts(int)
	 * @see specializationModel.SpecializationModelPackage#getProject_NumberOfProducts()
	 * @model transient="true"
	 * @generated
	 */
	int getNumberOfProducts();

	/**
	 * Sets the value of the '{@link specializationModel.Project#getNumberOfProducts <em>Number Of Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Products</em>' attribute.
	 * @see #getNumberOfProducts()
	 * @generated
	 */
	void setNumberOfProducts(int value);

	/**
	 * Returns the value of the '<em><b>Infinite Domain</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infinite Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infinite Domain</em>' attribute.
	 * @see #setInfiniteDomain(boolean)
	 * @see specializationModel.SpecializationModelPackage#getProject_InfiniteDomain()
	 * @model default="false"
	 * @generated
	 */
	boolean isInfiniteDomain();

	/**
	 * Sets the value of the '{@link specializationModel.Project#isInfiniteDomain <em>Infinite Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infinite Domain</em>' attribute.
	 * @see #isInfiniteDomain()
	 * @generated
	 */
	void setInfiniteDomain(boolean value);

	/**
	 * Returns the value of the '<em><b>User Constraints State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Constraints State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Constraints State</em>' attribute.
	 * @see #setUserConstraintsState(boolean)
	 * @see specializationModel.SpecializationModelPackage#getProject_UserConstraintsState()
	 * @model
	 * @generated
	 */
	boolean isUserConstraintsState();

	/**
	 * Sets the value of the '{@link specializationModel.Project#isUserConstraintsState <em>User Constraints State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Constraints State</em>' attribute.
	 * @see #isUserConstraintsState()
	 * @generated
	 */
	void setUserConstraintsState(boolean value);

	void prepareToValidation();
	List<Feature> getRoots();
	boolean isValidatedOK();
	void setValidatedOK(boolean isValidatedOK);
} // Project
