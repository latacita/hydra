/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tef.project.expressions.BinaryOperator;
import tef.project.expressions.ExpressionsFactory;
import tef.project.expressions.ExpressionsPackage;

/**
 * This is the item provider adapter for a {@link tef.project.expressions.BinaryOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryOperatorItemProvider
	extends ExpressionItemProvider
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
	public BinaryOperatorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1);
			childrenFeatures.add(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_BinaryOperator_type");
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

		switch (notification.getFeatureID(BinaryOperator.class)) {
			case ExpressionsPackage.BINARY_OPERATOR__OP1:
			case ExpressionsPackage.BINARY_OPERATOR__OP2:
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
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createQuantifyOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createAny()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createGE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createG()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createLE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createL()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createD()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createComparisonOperand()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createQuantity()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP1,
				 ExpressionsFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createQuantifyOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createAny()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createGE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createG()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createLE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createL()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createE()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createD()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createComparisonOperand()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createQuantity()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.BINARY_OPERATOR__OP2,
				 ExpressionsFactory.eINSTANCE.createCount()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ExpressionsPackage.Literals.BINARY_OPERATOR__OP1 ||
			childFeature == ExpressionsPackage.Literals.BINARY_OPERATOR__OP2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
