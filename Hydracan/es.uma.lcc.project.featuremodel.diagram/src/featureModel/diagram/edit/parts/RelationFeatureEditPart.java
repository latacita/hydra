package featureModel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import featureModel.FeatureType;
import featureModel.RelationFeature;
import featureModel.diagram.edit.policies.RelationFeatureATC;

/**
 * @generated NOT
 */
public class RelationFeatureEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart, TargetDecorable {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4013;

	/**
	 * @generated NOT
	 */
	public RelationFeatureEditPart(View view) {
		super(view);
		updateFace();
	}

	public void updateFace() {

		RelationFeature relationFeature = (RelationFeature) ((View) this
				.getModel()).getElement();
		boolean labelVisibility = false;

		if (relationFeature.getType() == FeatureType.MANDATORY) {
			setTargetDecoration(new MandatoryLineDescriptor()
					.createTargetDecoration());
		} else if (relationFeature.getType() == FeatureType.OPTIONAL) {
			setTargetDecoration(new OptionalLineDescriptor()
					.createTargetDecoration());
		} else {
			setTargetDecoration(null);
			labelVisibility = true;
		}

		if (!this.getChildren().isEmpty()) {
			RelationFeatureLowerBoundUpperBoundEditPart myLabel = (RelationFeatureLowerBoundUpperBoundEditPart) this
					.getChildren().get(0);
			myLabel.setVisible(labelVisibility);
		}
	}

	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof RelationFeature) {
			this.updateFace();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new featureModel.diagram.edit.policies.RelationFeatureItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, createOpenEditPolicy());
	}

	private OpenEditPolicy createOpenEditPolicy() {
		OpenEditPolicy policy = new OpenEditPolicy() {
			protected Command getOpenCommand(Request request) {
				return new ICommandProxy(new RelationFeatureATC(
						getEditingDomain(), getTargetEditPart(request)));
			}
		};
		return policy;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		return new SimpleLineDescriptor();
	}

	/**
	 * @generated NOT
	 */
	public SimpleLineDescriptor getPrimaryShape() {
		return (SimpleLineDescriptor) getFigure();
	}

	/**
	 * @generated
	 */
	public class SimpleLineDescriptor extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSimpleLabelFigure;

		/**
		 * @generated
		 */
		public SimpleLineDescriptor() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSimpleLabelFigure = new WrappingLabel();
			fFigureSimpleLabelFigure.setText("");

			this.add(fFigureSimpleLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSimpleLabelFigure() {
			return fFigureSimpleLabelFigure;
		}

	}

	public ILineDescriptor getLineDescriptor() {
		return (ILineDescriptor) getFigure();
	}

	public void setTargetDecoration(RotatableDecoration decoration) {
		// TODO Auto-generated method stub
		((PolylineConnectionEx) getFigure()).setTargetDecoration(decoration);
	}

}
