package specializationModel.diagram.edit.parts;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

import specializationModel.FeatureGroup;
import specializationModel.FeatureGroupType;
import specializationModel.diagram.edit.policies.FeatureGroupATC;
import specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin;

/**
 * @generated
 */
public class FeatureGroupEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	protected IFigure myShape;
	protected RenderedImage emptyFigure, fullFigure;

	/**
	 * @generated NOT
	 */
	public FeatureGroupEditPart(View view) {
		super(view);
		URL url = FileLocator.find(SpecializationmodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/empty_FG.svg"), null); //$NON-NLS-1$
		emptyFigure = RenderedImageFactory.getInstance(url);
		url = FileLocator.find(SpecializationmodelDiagramEditorPlugin
				.getInstance().getBundle(),
				new Path("icons/wizban/full_FG.svg"), null); //$NON-NLS-1$
		fullFigure = RenderedImageFactory.getInstance(url);
		updateFace();
	}

	public void updateFace() {
		FeatureGroup featureGroup = (FeatureGroup) ((View) this.getModel())
				.getElement();
		boolean labelVisibility = false;
		if (featureGroup.getType() == FeatureGroupType.ORGROUP) {
			setFullFGFigure();
		} else if (featureGroup.getType() == FeatureGroupType.XORGROUP) {
			setEmptyFGFigure();
		} else {
			labelVisibility = true;
			setEmptyFGFigure();
		}

		if (!this.getChildren().isEmpty()) {
			FeatureGroupLowerBoundUpperBoundEditPart myLabel = (FeatureGroupLowerBoundUpperBoundEditPart) this
					.getChildren().get(0);
			myLabel.setVisible(labelVisibility);
		}
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new specializationModel.diagram.edit.policies.FeatureGroupItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new PreventDeleteComponentEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child instanceof IBorderItemEditPart) {
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * Override to prevent change of bounds
	 */
	protected void refreshBounds() {
		Dimension size = getFigure().getSize();
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getFigure(), new Rectangle(loc, size));
	}

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		//		return primaryShape = new ScalableImageFigure();
		URL url = FileLocator.find(SpecializationmodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/empty_FG.svg"), null); //$NON-NLS-1$
		if (primaryShape == null)
			primaryShape = new ScalableImageFigure(RenderedImageFactory
					.getInstance(url), true, true, true);
		return primaryShape;
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart arg0) {
		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure());
		fixedAnchor.offsetH = 20;
		fixedAnchor.offsetV = 7;
		//it creates an anchor for source on point 120,40
		return fixedAnchor;
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure());
		fixedAnchor.offsetH = 20;
		fixedAnchor.offsetV = 7;
		return fixedAnchor;
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart arg0) {
		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure());
		fixedAnchor.offsetH = 20;
		fixedAnchor.offsetV = 7;
		return fixedAnchor;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure());
		fixedAnchor.offsetH = 20;
		fixedAnchor.offsetV = 7;
		return fixedAnchor;
	}

	/**
	 * @generated
	 */
	public ScalableImageFigure getPrimaryShape() {
		return (ScalableImageFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof specializationModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-10, -10));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		myShape = shape;
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	public void setEmptyFGFigure() {
		//		IFigure myFigure = this.getFigure();
		ScalableImageFigure myScalabe = getPrimaryShape();
		if (myScalabe != null) {

			getPrimaryShape().setRenderedImage(emptyFigure);
		} else {
			primaryShape = new ScalableImageFigure(emptyFigure, true, true,
					true);
		}
	}

	public void setFullFGFigure() {
		ScalableImageFigure myScalabe = getPrimaryShape();
		if (myScalabe != null) {

			getPrimaryShape().setRenderedImage(fullFigure);
		} else {
			primaryShape = new ScalableImageFigure(fullFigure, true, true, true);
		}

	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(specializationModel.diagram.part.SpecializationmodelVisualIDRegistry
				.getType(specializationModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() instanceof FeatureGroup) {
			this.updateFace();
		}
		super.handleNotificationEvent(event);

	}
}
