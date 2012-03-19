/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.provider;


import expressions.provider.ExpressionsEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tef.project.expressions.ExpressionsFactory;
import tef.project.expressions.ExpressionsPackage;
import tef.project.expressions.Model;

/**
 * This is the item provider adapter for a {@link tef.project.expressions.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExpressionsPackage.Literals.MODEL__CONSTRAINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_Model_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Model.class)) {
			case ExpressionsPackage.MODEL__CONSTRAINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createQuantifyOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createAny()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createGE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createG()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createLE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createL()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createD()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createComparisonOperand()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createQuantity()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.MODEL__CONSTRAINTS,
				 ExpressionsFactory.eINSTANCE.createCount()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return ExpressionsEditPlugin.INSTANCE;
	}

}
