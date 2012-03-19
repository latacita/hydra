package specializationModel.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import specializationModel.Feature;
import specializationModel.Project;
import specializationModel.diagram.edit.statics.CommonCommands;
import specializationModel.diagram.providers.SpecializationmodelElementTypes;

/**
 * @generated
 */
public class FeatureEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public FeatureEditPart(View view) {
		super(view);
	}
	
	public void refresh() {
		super.refresh();
		final FeatureEditPart fep = this;
		final Feature feature = (Feature)((View)fep.getModel()).getElement();
		if (feature.getFather() != null && CommonCommands.getRelationTo((Project) feature.eContainer(), feature) == null){
			this.getEditingDomain().getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) this.getEditingDomain()){
				protected void doExecute(){

					FeatureEditPart fatherEditPart = (FeatureEditPart) fep.findEditPart(fep.getParent(), feature.getFather());
					IElementType relationElementType = SpecializationmodelElementTypes.RelationFeature_4002;
					CreateConnectionViewAndElementRequest ccvaeq =new CreateConnectionViewAndElementRequest(relationElementType,
							((IHintedType) relationElementType).getSemanticHint(), fatherEditPart.getDiagramPreferencesHint());
					ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(ccvaeq, new EObjectAdapter((EObject)fatherEditPart.getModel()),
							new EObjectAdapter((EObject)fep.getModel()), fatherEditPart.getViewer());

					CompoundCommand cc = new CompoundCommand("Clone Feature and Lpink");
					cc.add(new ICommandProxy(createSubTopicsCmd));
					fatherEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
				}


			});
		}
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new specializationModel.diagram.edit.policies.FeatureItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, createOpenEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new PreventDeleteComponentEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	private OpenEditPolicy createOpenEditPolicy() {
		OpenEditPolicy policy = new OpenEditPolicy() {
			protected Command getOpenCommand(Request request) {
				return new ICommandProxy(new FeatureATC(getEditingDomain(),
						getTargetEditPart(request)));
			}
		};
		return policy;
	}

	/**
	 * @generated NOT
	 */
	public void arrangeAll() {
		ArrangeRequest arrangeRequest = new ArrangeRequest(
				ActionIds.ACTION_ARRANGE_ALL);
		Command arrangeCmd = this.getCommand(arrangeRequest);

		try {
			arrangeCmd.execute();
		} catch (Exception ex) {
			System.out.println("LAYOUT" + ex.getMessage());
		}
		this.refresh();
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		FeatureFigure figure = new FeatureFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public FeatureFigure getPrimaryShape() {
		return (FeatureFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof specializationModel.diagram.edit.parts.FeatureNameEditPart) {
			((specializationModel.diagram.edit.parts.FeatureNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureFeatureNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

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
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return super.getContentPaneFor(editPart);
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
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
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
				.getType(specializationModel.diagram.edit.parts.FeatureNameEditPart.VISUAL_ID));
	}
	
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof Feature) {
			EditPart editPart = getPrimaryChildEditPart();
			if (editPart instanceof FeatureNameEditPart){
				((FeatureNameEditPart)editPart).refreshLabel();
			}
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	public class FeatureFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureNameFigure;

		/**
		 * @generated
		 */
		public FeatureFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setForegroundColor(ColorConstants.black);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureFeatureNameFigure = new WrappingLabel();
			fFigureFeatureNameFigure.setText("<...>");
			fFigureFeatureNameFigure.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(10000), getMapMode().DPtoLP(50)));

			fFigureFeatureNameFigure.setAlignment(PositionConstants.CENTER);
			this.add(fFigureFeatureNameFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureNameFigure() {
			return fFigureFeatureNameFigure;
		}

	}

}
