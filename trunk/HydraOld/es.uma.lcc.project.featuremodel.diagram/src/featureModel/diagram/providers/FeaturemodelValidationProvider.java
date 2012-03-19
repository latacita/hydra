package featureModel.diagram.providers;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;

import featureModel.Feature;
import featureModel.diagram.edit.statics.CommonCommands;

/**
 * @generated
 */
public class FeaturemodelValidationProvider extends
		AbstractContributionItemProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
						.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	protected IAction createAction(String actionId,
			IWorkbenchPartDescriptor partDescriptor) {
		if (featureModel.diagram.part.ValidateAction.VALIDATE_ACTION_KEY
				.equals(actionId)) {
			return new featureModel.diagram.part.ValidateAction(partDescriptor);
		}
		return super.createAction(actionId, partDescriptor);
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& featureModel.diagram.edit.parts.ProjectEditPart.MODEL_ID
							.equals(featureModel.diagram.part.FeaturemodelVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class DefaultCtx implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter5 extends AbstractModelConstraint {

		/**
		 * @generated NOT
		 */
		public IStatus validate(IValidationContext ctx) {
			Feature feature = (Feature) ctx.getTarget();
			String newName = feature.getName();
			boolean exit = false;
			Iterator<String> it = CommonCommands.getCharRestricted().iterator();

			while (!exit && it.hasNext()) {
				if (newName.contains(it.next()))
					exit = true;
			}

			it = CommonCommands.getRestricted().iterator();
			while (!exit && it.hasNext()) {
				if (newName.equals(it.next()))
					exit = true;
			}

			if (Integer.getInteger(newName) != null)
				exit = true;

			if (exit) {
				return ctx
						.createFailureStatus("Forbidden characters used or reserved words ("
								+ feature.getName() + ")");
			} else {
				return ctx.createSuccessStatus();
			}

		}
	}

	/**
	 * @generated
	 */
	static String formatElement(EObject object) {
		return EMFCoreUtil.getQualifiedName(object, true);
	}

}
