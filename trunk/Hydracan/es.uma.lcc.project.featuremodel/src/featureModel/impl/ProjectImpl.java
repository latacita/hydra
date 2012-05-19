/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import featureModel.Feature;
import featureModel.FeatureModelPackage;
import featureModel.Node;
import featureModel.Project;
import featureModel.Relation;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.ProjectImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureModel.impl.ProjectImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link featureModel.impl.ProjectImpl#getNameConfigFile <em>Name Config File</em>}</li>
 *   <li>{@link featureModel.impl.ProjectImpl#getNameConstraintsFile <em>Name Constraints File</em>}</li>
 *   <li>{@link featureModel.impl.ProjectImpl#getNumberOfProducts <em>Number Of Products</em>}</li>
 *   <li>{@link featureModel.impl.ProjectImpl#isValidatedOCL <em>Validated OCL</em>}</li>
 *   <li>{@link featureModel.impl.ProjectImpl#isValidatedTEF <em>Validated TEF</em>}</li>
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
	 * The default value of the '{@link #isValidatedOCL() <em>Validated OCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedOCL()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATED_OCL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isValidatedOCL() <em>Validated OCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedOCL()
	 * @generated
	 * @ordered
	 */
	protected boolean validatedOCL = VALIDATED_OCL_EDEFAULT;
	/**
	 * The default value of the '{@link #isValidatedTEF() <em>Validated TEF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedTEF()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATED_TEF_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isValidatedTEF() <em>Validated TEF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedTEF()
	 * @generated
	 * @ordered
	 */
	protected boolean validatedTEF = VALIDATED_TEF_EDEFAULT;
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
		return FeatureModelPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Node>(Node.class, this, FeatureModelPackage.PROJECT__FEATURES);
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
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, FeatureModelPackage.PROJECT__RELATIONS);
		}
		return relations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROJECT__NAME_CONFIG_FILE, oldNameConfigFile, nameConfigFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROJECT__NAME_CONSTRAINTS_FILE, oldNameConstraintsFile, nameConstraintsFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROJECT__NUMBER_OF_PRODUCTS, oldNumberOfProducts, numberOfProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidatedOCL() {
		return validatedOCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatedOCL(boolean newValidatedOCL) {
		boolean oldValidatedOCL = validatedOCL;
		validatedOCL = newValidatedOCL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROJECT__VALIDATED_OCL, oldValidatedOCL, validatedOCL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidatedTEF() {
		return validatedTEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatedTEF(boolean newValidatedTEF) {
		boolean oldValidatedTEF = validatedTEF;
		validatedTEF = newValidatedTEF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROJECT__VALIDATED_TEF, oldValidatedTEF, validatedTEF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.PROJECT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case FeatureModelPackage.PROJECT__RELATIONS:
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
			case FeatureModelPackage.PROJECT__FEATURES:
				return getFeatures();
			case FeatureModelPackage.PROJECT__RELATIONS:
				return getRelations();
			case FeatureModelPackage.PROJECT__NAME_CONFIG_FILE:
				return getNameConfigFile();
			case FeatureModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				return getNameConstraintsFile();
			case FeatureModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				return getNumberOfProducts();
			case FeatureModelPackage.PROJECT__VALIDATED_OCL:
				return isValidatedOCL();
			case FeatureModelPackage.PROJECT__VALIDATED_TEF:
				return isValidatedTEF();
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
			case FeatureModelPackage.PROJECT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Node>)newValue);
				return;
			case FeatureModelPackage.PROJECT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case FeatureModelPackage.PROJECT__NAME_CONFIG_FILE:
				setNameConfigFile((String)newValue);
				return;
			case FeatureModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				setNameConstraintsFile((String)newValue);
				return;
			case FeatureModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				setNumberOfProducts((Integer)newValue);
				return;
			case FeatureModelPackage.PROJECT__VALIDATED_OCL:
				setValidatedOCL((Boolean)newValue);
				return;
			case FeatureModelPackage.PROJECT__VALIDATED_TEF:
				setValidatedTEF((Boolean)newValue);
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
			case FeatureModelPackage.PROJECT__FEATURES:
				getFeatures().clear();
				return;
			case FeatureModelPackage.PROJECT__RELATIONS:
				getRelations().clear();
				return;
			case FeatureModelPackage.PROJECT__NAME_CONFIG_FILE:
				setNameConfigFile(NAME_CONFIG_FILE_EDEFAULT);
				return;
			case FeatureModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				setNameConstraintsFile(NAME_CONSTRAINTS_FILE_EDEFAULT);
				return;
			case FeatureModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				setNumberOfProducts(NUMBER_OF_PRODUCTS_EDEFAULT);
				return;
			case FeatureModelPackage.PROJECT__VALIDATED_OCL:
				setValidatedOCL(VALIDATED_OCL_EDEFAULT);
				return;
			case FeatureModelPackage.PROJECT__VALIDATED_TEF:
				setValidatedTEF(VALIDATED_TEF_EDEFAULT);
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
			case FeatureModelPackage.PROJECT__FEATURES:
				return features != null && !features.isEmpty();
			case FeatureModelPackage.PROJECT__RELATIONS:
				return relations != null && !relations.isEmpty();
			case FeatureModelPackage.PROJECT__NAME_CONFIG_FILE:
				return NAME_CONFIG_FILE_EDEFAULT == null ? nameConfigFile != null : !NAME_CONFIG_FILE_EDEFAULT.equals(nameConfigFile);
			case FeatureModelPackage.PROJECT__NAME_CONSTRAINTS_FILE:
				return NAME_CONSTRAINTS_FILE_EDEFAULT == null ? nameConstraintsFile != null : !NAME_CONSTRAINTS_FILE_EDEFAULT.equals(nameConstraintsFile);
			case FeatureModelPackage.PROJECT__NUMBER_OF_PRODUCTS:
				return numberOfProducts != NUMBER_OF_PRODUCTS_EDEFAULT;
			case FeatureModelPackage.PROJECT__VALIDATED_OCL:
				return validatedOCL != VALIDATED_OCL_EDEFAULT;
			case FeatureModelPackage.PROJECT__VALIDATED_TEF:
				return validatedTEF != VALIDATED_TEF_EDEFAULT;
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
		result.append(" (nameConfigFile: ");
		result.append(nameConfigFile);
		result.append(", nameConstraintsFile: ");
		result.append(nameConstraintsFile);
		result.append(", numberOfProducts: ");
		result.append(numberOfProducts);
		result.append(", validatedOCL: ");
		result.append(validatedOCL);
		result.append(", validatedTEF: ");
		result.append(validatedTEF);
		result.append(')');
		return result.toString();
	}

	@Override
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
