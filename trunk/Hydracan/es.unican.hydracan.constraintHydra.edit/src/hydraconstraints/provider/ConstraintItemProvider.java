/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.provider;


import hydraconstraints.Constraint;
import hydraconstraints.HydraconstraintsFactory;
import hydraconstraints.HydraconstraintsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hydraconstraints.Constraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintItemProvider
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
	public ConstraintItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Constraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Constraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Constraint_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Constraint.class)) {
			case HydraconstraintsPackage.CONSTRAINT__OPERATORS:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createMore()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createMoreOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createLessOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createSimpleFeature()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createAny()));

		newChildDescriptors.add
			(createChildParameter
				(HydraconstraintsPackage.Literals.CONSTRAINT__OPERATORS,
				 HydraconstraintsFactory.eINSTANCE.createAll()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HydraConstraintsEditPlugin.INSTANCE;
	}

}
