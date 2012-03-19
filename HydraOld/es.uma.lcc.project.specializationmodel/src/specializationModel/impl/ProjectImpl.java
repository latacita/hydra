/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specializationModel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import specializationModel.Feature;
import specializationModel.Node;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.SpecializationModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link specializationModel.impl.ProjectImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link specializationModel.impl.ProjectImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link specializationModel.impl.ProjectImpl#getFeatureModelURI <em>Feature Model URI</em>}</li>
 *   <li>{@link specializationModel.impl.ProjectImpl#getNameConstraintsFile <em>Name Constraints File</em>}</li>
 *   <li>{@link specializationModel.impl.ProjectImpl#getNameConfigFile <em>Name Config File</em>}</li>
 *   <li>{@link specializationModel.impl.ProjectImpl#getNumberOfProducts <em>Number Of Products</em>}</li>
 *   <li>{@link specializationModel.impl.ProjectImpl#isInfiniteDomain <em>Infinite Domain</em>}</li>
 *   <li>{@link specializationModel.impl.ProjectImpl#isUserConstraintsState <em>User Constraints State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> features;
	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;
	/**
	 * The default value of the '{@link #getFeatureModelURI() <em>Feature Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_MODEL_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFeatureModelURI() <em>Feature Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureModelURI()
	 * @generated
	 * @ordered
	 */
	protected String featureModelURI = FEATURE_MODEL_URI_EDEFAULT;
	/**
	 * The default value of the '{@link #getNameConstraintsFile() <em>Name Constraints File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConstraintsFile()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CONSTRAINTS_FILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNameConstraintsFile() <em>Name Constraints File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConstraintsFile()
	 * @generated
	 * @ordered
	 */
	protected String nameConstraintsFile = NAME_CONSTRAINTS_FILE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNameConfigFile() <em>Name Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConfigFile()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CONFIG_FILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNameConfigFile() <em>Name Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConfigFile()
	 * @generated
	 * @ordered
	 */
	protected String nameConfigFile = NAME_CONFIG_FILE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfProducts() <em>Number Of Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProducts()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_PRODUCTS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumberOfProducts() <em>Number Of Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProducts()
	 * @generated
	 * @ordered
	 */
	protected int numberOfProducts = NUMBER_OF_PRODUCTS_EDEFAULT;
	/**
	 * The default value of the '{@link #isInfiniteDomain() <em>Infinite Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfiniteDomain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFINITE_DOMAIN_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInfiniteDomain() <em>Infinite Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfiniteDomain()
	 * @generated
	 * @ordered
	 */
	protected boolean infiniteDomain = INFINITE_DOMAIN_EDEFAULT;
	/**
	 * The default value of the '{@link #isUserConstraintsState() <em>User Constraints State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserConstraintsState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_CONSTRAINTS_STATE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUserConstraintsState() <em>User Constraints State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserConstraintsState()
	 * @generated
	 * @ordered
	 */
	protected boolean userConstraintsState = USER_CONSTRAINTS_STATE_EDEFAULT;
	private boolean isValidatedOK = true;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecializationModelPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Node>(Node.class, this, SpecializationModelPackage.PROJECT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, SpecializationModelPackage.PROJECT__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureModelURI() {
		return featureModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModelURI(String newFeatureModelURI) {
		String oldFeatureModelURI = featureModelURI;
		featureModelURI = newFeatureModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecializationModelPackage.PROJECT__FEATURE_MODEL_URI, oldFeatureModelURI, featureModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameConstraintsFile() {
		return nameConstraintsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameConstraintsFile(String newNameConstraintsFile) {
		String oldNameConstraintsFile = nameConstraintsFile;
		nameConstraintsFile = newNameConstraintsFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecializationModelPackage.PROJECT__NAME_CONSTRAINTS_FILE, oldNameConstraintsFile, nameConstraintsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameConfigFile() {
		return nameConfigFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameConfigFile(String newNameConfigFile) {
		String oldNameConfigFile = nameConfigFile;
		nameConfigFile = newNameConfigFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecializationModelPackage.PROJECT__NAME_CONFIG_FILE, oldNameConfigFile, nameConfigFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfProducts() {
		return numberOfProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfProducts(int newNumberOfProducts) {
		int oldNumberOfProducts = numberOfProducts;
		numberOfProducts = newNumberOfProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecializationModelPackage.PROJECT__NUMBER_OF_PRODUCTS, oldNumberOfProducts, numberOfProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfiniteDomain() {
		return infiniteDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfiniteDomain(boolean newInfiniteDomain) {
		boolean oldInfiniteDomain = infiniteDomain;
		infiniteDomain = newInfiniteDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecializationModelPackage.PROJECT__INFINITE_DOMAIN, oldInfiniteDomain, infiniteDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserConstraintsState() {
		return userConstraintsState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserConstraintsState(boolean newUserConstraintsState) {
		boolean oldUserConstraintsState = userConstraintsState;
		userConstraintsState = newUserConstraintsState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecializationModelPackage.PROJECT__USER_CONSTRAINTS_STATE, oldUserConstraintsState, userConstraintsState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecializationModelPackage.PROJECT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case SpecializationModelPackage.PROJECT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecializationModelPackage.PROJECT__FEATURES:
				return getFeatures();
			case SpecializationModelPackage.PROJECT__RELATIONS:
				return getRelations();
			case SpecializationModelPackage.PROJECT__FEATURE_MODEL_URI:
				return getFeatureModelURI();
			case SpecializationModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				return getNameConstraintsFile();
			case SpecializationModelPackage.PROJECT__NAME_CONFIG_FILE:
				return getNameConfigFile();
			case SpecializationModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				return getNumberOfProducts();
			case SpecializationModelPackage.PROJECT__INFINITE_DOMAIN:
				return isInfiniteDomain();
			case SpecializationModelPackage.PROJECT__USER_CONSTRAINTS_STATE:
				return isUserConstraintsState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecializationModelPackage.PROJECT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Node>)newValue);
				return;
			case SpecializationModelPackage.PROJECT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case SpecializationModelPackage.PROJECT__FEATURE_MODEL_URI:
				setFeatureModelURI((String)newValue);
				return;
			case SpecializationModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				setNameConstraintsFile((String)newValue);
				return;
			case SpecializationModelPackage.PROJECT__NAME_CONFIG_FILE:
				setNameConfigFile((String)newValue);
				return;
			case SpecializationModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				setNumberOfProducts((Integer)newValue);
				return;
			case SpecializationModelPackage.PROJECT__INFINITE_DOMAIN:
				setInfiniteDomain((Boolean)newValue);
				return;
			case SpecializationModelPackage.PROJECT__USER_CONSTRAINTS_STATE:
				setUserConstraintsState((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpecializationModelPackage.PROJECT__FEATURES:
				getFeatures().clear();
				return;
			case SpecializationModelPackage.PROJECT__RELATIONS:
				getRelations().clear();
				return;
			case SpecializationModelPackage.PROJECT__FEATURE_MODEL_URI:
				setFeatureModelURI(FEATURE_MODEL_URI_EDEFAULT);
				return;
			case SpecializationModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				setNameConstraintsFile(NAME_CONSTRAINTS_FILE_EDEFAULT);
				return;
			case SpecializationModelPackage.PROJECT__NAME_CONFIG_FILE:
				setNameConfigFile(NAME_CONFIG_FILE_EDEFAULT);
				return;
			case SpecializationModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				setNumberOfProducts(NUMBER_OF_PRODUCTS_EDEFAULT);
				return;
			case SpecializationModelPackage.PROJECT__INFINITE_DOMAIN:
				setInfiniteDomain(INFINITE_DOMAIN_EDEFAULT);
				return;
			case SpecializationModelPackage.PROJECT__USER_CONSTRAINTS_STATE:
				setUserConstraintsState(USER_CONSTRAINTS_STATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpecializationModelPackage.PROJECT__FEATURES:
				return features != null && !features.isEmpty();
			case SpecializationModelPackage.PROJECT__RELATIONS:
				return relations != null && !relations.isEmpty();
			case SpecializationModelPackage.PROJECT__FEATURE_MODEL_URI:
				return FEATURE_MODEL_URI_EDEFAULT == null ? featureModelURI != null : !FEATURE_MODEL_URI_EDEFAULT.equals(featureModelURI);
			case SpecializationModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				return NAME_CONSTRAINTS_FILE_EDEFAULT == null ? nameConstraintsFile != null : !NAME_CONSTRAINTS_FILE_EDEFAULT.equals(nameConstraintsFile);
			case SpecializationModelPackage.PROJECT__NAME_CONFIG_FILE:
				return NAME_CONFIG_FILE_EDEFAULT == null ? nameConfigFile != null : !NAME_CONFIG_FILE_EDEFAULT.equals(nameConfigFile);
			case SpecializationModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				return numberOfProducts != NUMBER_OF_PRODUCTS_EDEFAULT;
			case SpecializationModelPackage.PROJECT__INFINITE_DOMAIN:
				return infiniteDomain != INFINITE_DOMAIN_EDEFAULT;
			case SpecializationModelPackage.PROJECT__USER_CONSTRAINTS_STATE:
				return userConstraintsState != USER_CONSTRAINTS_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (featureModelURI: ");
		result.append(featureModelURI);
		result.append(", nameConstraintsFile: ");
		result.append(nameConstraintsFile);
		result.append(", nameConfigFile: ");
		result.append(nameConfigFile);
		result.append(", numberOfProducts: ");
		result.append(numberOfProducts);
		result.append(", infiniteDomain: ");
		result.append(infiniteDomain);
		result.append(", userConstraintsState: ");
		result.append(userConstraintsState);
		result.append(')');
		return result.toString();
	}

	public void prepareToValidation() {
		// TODO Auto-generated method stub
		for (Node node : getFeatures()){
			node.setRelation(getRelation(node));
		}
	}
	
	private Relation getRelation(Node source){
		Relation result = null;
		
		Iterator<?> iterator = getRelations().iterator();
		while (result == null && iterator.hasNext()){
			Relation aux = (Relation) iterator.next();
			if (aux.getSource().equals(source)) result = aux;
		}		
		return result;	
	}

	@Override
	public List<Feature> getRoots() {
		// TODO Auto-generated method stub
		List<Feature> result = new ArrayList<Feature>();
		
		for (Node node : getFeatures()){
			if (node instanceof Feature && node.getFather() == null) result.add((Feature) node);
		}
		
		return result;
	}

	@Override
	public boolean isValidatedOK() {
		// TODO Auto-generated method stub
		return isValidatedOK;
	}

	@Override
	public void setValidatedOK(boolean isValidatedOK) {
		// TODO Auto-generated method stub
		this.isValidatedOK = isValidatedOK;
	}

} //ProjectImpl
