package featureModel.diagram.menu;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import featureModel.Feature;
import featureModel.Project;
import featureModel.diagram.edit.parts.FeatureEditPart;
import featureModel.diagram.edit.parts.ProjectEditPart;
import featureModel.diagram.providers.FeaturemodelElementTypes;

public class CreateFeatureActionDelegate implements IObjectActionDelegate{

	public final static String ID = "featureModel.popup.CreateFeatureActionID";

	private FeatureEditPart selectedElement;

	public void run(IAction action) {

		if ( selectedElement != null){
			Feature feature = (Feature)((View)selectedElement.getModel()).getElement();

			if (feature.getReferences() == null){
				CompoundCommand cc = new CompoundCommand("Create Feature and Link");

				// Create the new topic for the other end.
				CreateViewRequest topicRequest = CreateViewRequestFactory.getCreateShapeRequest(FeaturemodelElementTypes.Feature_2008, selectedElement.getDiagramPreferencesHint());

				Point p = ((AbstractGraphicalEditPart) selectedElement).getFigure().getBounds().getTopRight().getCopy();
				((AbstractGraphicalEditPart) selectedElement).getFigure().translateToAbsolute(p);
				int edgeCount = ((GraphicalEditPart) selectedElement).getNotationView().getSourceEdges().size();
				// A quick hack to get subtopics to layout to the right, from top to bottom
				int offset = (edgeCount * 50) - 100;
				topicRequest.setLocation(p.translate(offset, 75));

				ProjectEditPart projectEditPart = (ProjectEditPart) selectedElement.getParent();
				Project project = (Project)((View)projectEditPart.getModel()).getElement();
				Command createTopicCmd = projectEditPart.getCommand(topicRequest);
				IAdaptable topicViewAdapter = (IAdaptable) ((List<?>) topicRequest.getNewObject()).get(0);

				cc.add(createTopicCmd);

				// create the relation link command
				IElementType relationElementType = FeaturemodelElementTypes.RelationFeature_4013;
				ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(relationElementType,
						((IHintedType) relationElementType).getSemanticHint(), selectedElement.getDiagramPreferencesHint()), new EObjectAdapter((EObject)selectedElement.getModel()),
						topicViewAdapter, selectedElement.getViewer());


				cc.add(new ICommandProxy(createSubTopicsCmd));

				selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cc);



				// put the new topic in edit mode
				final EditPartViewer viewer = selectedElement.getViewer();
				final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
				if (elementPart != null) {
					Display.getCurrent().asyncExec(new Runnable() {

						public void run() {
							viewer.setSelection(new StructuredSelection(elementPart));
							Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
							elementPart.performRequest(der);
						}
					});
				}

			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof FeatureEditPart) {
				selectedElement = (FeatureEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}


}