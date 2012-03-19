package featureModel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelationFGEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4012;

	/**
	 * @generated
	 */
	public RelationFGEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new featureModel.diagram.edit.policies.RelationFGItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new SimpleLineDescriptor();
	}

	/**
	 * @generated
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

}
