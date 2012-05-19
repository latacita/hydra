package specializationModel.diagram.part;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
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
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.FeatureType;
import specializationModel.Node;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.RelationFG;
import specializationModel.SpecializationModelPackage;
import specializationModel.diagram.edit.parts.FeatureEditPart;
import specializationModel.diagram.edit.parts.FeatureGroupEditPart;
import specializationModel.diagram.edit.parts.ProjectEditPart;
import specializationModel.diagram.providers.SpecializationmodelElementTypes;

public class SpecializationDoCloningAction implements IObjectActionDelegate{

	public final static String ID = "specializationModel.popup.FeatureDoCloningActionID";

	private FeatureEditPart selectedElement;

	public void run(IAction action) {
		Feature myFeature = (Feature) ((View)selectedElement.getModel()).getElement();
		EditPart fatherEditPart = selectedElement.findEditPart(selectedElement.getParent(), myFeature.getFather());
		boolean delete = false;
		
		CompoundCommand cc = new CompoundCommand("Clone Feature and Link");

		// Create the new topic for the other end.
		CreateViewRequest topicRequest = CreateViewRequestFactory.getCreateShapeRequest(SpecializationmodelElementTypes.Feature_2001, selectedElement.getDiagramPreferencesHint());

		Point p = ((AbstractGraphicalEditPart) fatherEditPart).getFigure().getBounds().getTopRight().getCopy();
		((AbstractGraphicalEditPart) fatherEditPart).getFigure().translateToAbsolute(p);
		int edgeCount = ((GraphicalEditPart) fatherEditPart).getNotationView().getSourceEdges().size();
		// A quick hack to get subtopics to layout to the right, from top to bottom
		int offset = (edgeCount * 50) - 100;
		topicRequest.setLocation(p.translate(offset, 100));

		ProjectEditPart projectEditPart = (ProjectEditPart) selectedElement.getParent();
		Project project = (Project)((View)projectEditPart.getModel()).getElement();
		Command createTopicCmd = projectEditPart.getCommand(topicRequest);
		IAdaptable topicViewAdapter = (IAdaptable) ((List<?>) topicRequest.getNewObject()).get(0);

		cc.add(createTopicCmd);
		
		// create the relation link command�
		// Atenci�n!! en realidad la acci�n s�lo deber�a de producirse cuando relation instanceof relationFeature !!
//		Relation relationToCopy = getRelation(project, (Node) ((View)fatherEditPart.getModel()).getElement(), myFeature);
		IElementType relationElementType = SpecializationmodelElementTypes.RelationFeature_4002;
//		if (relationToCopy instanceof RelationFG){
//			relationElementType = SpecializationmodelElementTypes.RelationFG_4001;
//		}else if (relationToCopy instanceof RelationFeature){
//			relationElementType = SpecializationmodelElementTypes.RelationFeature_4002;
//		}else {
//			relationElementType = SpecializationmodelElementTypes.RelationSelected_4003;
//		}
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(relationElementType,
				((IHintedType) relationElementType).getSemanticHint(), selectedElement.getDiagramPreferencesHint()), new EObjectAdapter((EObject)fatherEditPart.getModel()),
				topicViewAdapter, selectedElement.getViewer());
		
		
		cc.add(new ICommandProxy(createSubTopicsCmd));

		selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		// put the new topic in edit mode
		final EditPartViewer viewer = selectedElement.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
				
		// Set los valores del Feature creado
//		selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		specializationModel.Feature newFeature = (Feature) ((View)((FeatureEditPart)elementPart).getModel()).getElement();
		IEditCommandRequest myRequestName = new SetRequest(selectedElement.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Name(), getNewName(myFeature));
		SetValueCommand mySVCName = new SetValueCommand((SetRequest) myRequestName);
		IEditCommandRequest myRequestRealName = new SetRequest(selectedElement.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_RealName(), ((Feature)myFeature).getName());
		SetValueCommand mySVCRealName = new SetValueCommand((SetRequest) myRequestRealName);
//		IEditCommandRequest myRequestClonated = new SetRequest(selectedElement.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Clonated(), true);
//		SetValueCommand mySVCClonated = new SetValueCommand((SetRequest) myRequestClonated);
		try {
			mySVCName.execute(new NullProgressMonitor(), null);
			mySVCRealName.execute(new NullProgressMonitor(), null);
//			mySVCClonated.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Disminuye los bounds de la relaci�n seleccionada
		Relation relationToCopy = getRelation(project, (Node)((View)fatherEditPart.getModel()).getElement(), (Node)((View)selectedElement.getModel()).getElement());
		if (relationToCopy instanceof specializationModel.RelationFeature){
			int lowerBound = ((specializationModel.RelationFeature) relationToCopy).getLowerBound();
			int upperBound = ((specializationModel.RelationFeature) relationToCopy).getUpperBound();
			if ( lowerBound > 0){
				lowerBound = Math.max(lowerBound -1, 0);
			}
			if (upperBound > 0){
				upperBound = Math.max(upperBound -1 , 0);
			}
//			SetCommand.create(selectedElement.getEditingDomain(), relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), lowerBound).execute();
//			SetCommand.create(selectedElement.getEditingDomain(), relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), upperBound).execute();
			
//			if (upperBound == 0) delete = true;
//			IEditCommandRequest myRequestLB = new SetRequest(selectedElement.getEditingDomain(), relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), ((RelationFeature)relationToCopy).getLowerBound());
//			SetValueCommand mySVCLB = new SetValueCommand((SetRequest)myRequestLB);
//			IEditCommandRequest myRequestUB = new SetRequest(selectedElement.getEditingDomain(), relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), ((RelationFeature)relationToCopy).getUpperBound());
//			SetValueCommand mySVCUB = new SetValueCommand((SetRequest)myRequestUB);
			
			
			
//			Relation relationCreated = getRelation((Project)((View)projectEditPart.getModel()).getElement(), (Node)((View)fatherEditPart.getModel()).getElement(), (Node)((View)elementPart.getModel()).getElement());
			IEditCommandRequest myRequestLB = new SetRequest(selectedElement.getEditingDomain(), relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), lowerBound);
			SetValueCommand mySVCLB = new SetValueCommand((SetRequest)myRequestLB);
			IEditCommandRequest myRequestUB = new SetRequest(selectedElement.getEditingDomain(), relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), upperBound);
			SetValueCommand mySVCUB = new SetValueCommand((SetRequest)myRequestUB);
			try {
				mySVCLB.execute(new NullProgressMonitor(), null);
				mySVCUB.execute(new NullProgressMonitor(), null);
				if (lowerBound == 0 && upperBound == 1){
					IEditCommandRequest myRequestType = new SetRequest(selectedElement.getEditingDomain(), relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.OPTIONAL);
					SetValueCommand mySVCType = new SetValueCommand((SetRequest)myRequestType);
					mySVCType.execute(new NullProgressMonitor(), null);
				}
			} catch (ExecutionException e) {
				// TODO Auto-genera	ted catch block
				e.printStackTrace();
			}
		}
		
		for (specializationModel.Node n : myFeature.getChildren()){
			copyFeatureAndLink((GraphicalEditPart) selectedElement.findEditPart(selectedElement.getParent(), n), elementPart, getRelation(project, myFeature, n), new Point(p.x, p.y));
		}
		

//		if (elementPart != null) {
//			Display.getCurrent().asyncExec(new Runnable() {
//
//				public void run() {
//					viewer.setSelection(new StructuredSelection(elementPart));
//					Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
//					elementPart.performRequest(der);
//				}
//			});
//		}
	}
	
	public void copyFeatureAndLink(GraphicalEditPart nodeToCopy, EditPart fatherEditPart, Relation relationToCopy, Point p){
//		Feature myFeature = (Feature) ((View)selectedElement.getModel()).getElement();
//		EditPart fatherEditPart = selectedElement.findEditPart(selectedElement.getParent(), myFeature.getFather());
		Node myNode = (Node) ((View)nodeToCopy.getModel()).getElement();
		CompoundCommand cc = new CompoundCommand("Clone Feature and Link");

		// Create the new topic for the other end.
		IElementType nodeElementType = (myNode instanceof Feature)? SpecializationmodelElementTypes.Feature_2001 : SpecializationmodelElementTypes.FeatureGroup_2002;
		CreateViewRequest topicRequest = CreateViewRequestFactory.getCreateShapeRequest(nodeElementType, nodeToCopy.getDiagramPreferencesHint());
		
//		Point p = ((AbstractGraphicalEditPart) fatherEditPart).getFigure().getBounds().getTopRight().getCopy();
		((AbstractGraphicalEditPart) fatherEditPart).getFigure().translateToAbsolute(p);
		int edgeCount = ((GraphicalEditPart) fatherEditPart).getNotationView().getSourceEdges().size();
		// A quick hack to get subtopics to layout to the right, from top to bottom
		int offset = (edgeCount * 50) - 100;
		topicRequest.setLocation(p.translate(offset, 100));

		ProjectEditPart projectEditPart = (ProjectEditPart) nodeToCopy.getParent();
		Project project = (Project)((View)projectEditPart.getModel()).getElement();
		Command createTopicCmd = projectEditPart.getCommand(topicRequest);
		IAdaptable topicViewAdapter = (IAdaptable) ((List<?>) topicRequest.getNewObject()).get(0);

		cc.add(createTopicCmd);
		nodeToCopy.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		
		cc = new CompoundCommand();
		
		// create the relation link command
		IElementType relationElementType;
		if (relationToCopy instanceof RelationFG){
			relationElementType = SpecializationmodelElementTypes.RelationFG_4001;
		}else if (relationToCopy instanceof specializationModel.RelationFeature){
			relationElementType = SpecializationmodelElementTypes.RelationFeature_4002;
		}else {
			relationElementType = SpecializationmodelElementTypes.RelationFeature_4002;
		}
		ICommand createRelationCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(relationElementType,
				((IHintedType)relationElementType).getSemanticHint(), nodeToCopy.getDiagramPreferencesHint()), new EObjectAdapter((EObject)fatherEditPart.getModel()),
				topicViewAdapter, nodeToCopy.getViewer());
		
		
		cc.add(new ICommandProxy(createRelationCmd));

		nodeToCopy.getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		// set values to the new feature
		final EditPartViewer viewer = nodeToCopy.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
				
		if (myNode instanceof Feature){
			specializationModel.Feature newFeature = (Feature) ((View)((FeatureEditPart)elementPart).getModel()).getElement();
			IEditCommandRequest myRequestName = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Name(), ((Feature)myNode).getName());
			SetValueCommand mySVCName = new SetValueCommand((SetRequest) myRequestName);
			IEditCommandRequest myRequestRealName = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_RealName(), ((Feature)myNode).getRealName());
			SetValueCommand mySVCRealName = new SetValueCommand((SetRequest) myRequestRealName);
//			IEditCommandRequest myRequestClonated = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Clonated(), ((Feature)myNode).isClonated());
//			SetValueCommand mySVCClonated = new SetValueCommand((SetRequest) myRequestClonated);
			try {
				mySVCName.execute(new NullProgressMonitor(), null);
				mySVCRealName.execute(new NullProgressMonitor(), null);
//				mySVCClonated.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			specializationModel.FeatureGroup newFeature = (FeatureGroup) ((View) ((FeatureGroupEditPart)elementPart).getModel()).getElement();
			IEditCommandRequest myRequestLB = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeatureGroup_LowerBound(), ((FeatureGroup)myNode).getLowerBound());
			SetValueCommand mySVCLB = new SetValueCommand((SetRequest)myRequestLB);
			IEditCommandRequest myRequestUB = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeatureGroup_UpperBound(), ((FeatureGroup)myNode).getUpperBound());
			SetValueCommand mySVCUB = new SetValueCommand((SetRequest)myRequestUB);
			IEditCommandRequest myRequestType = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeatureGroup_Type(), ((FeatureGroup)myNode).getType());
			SetValueCommand mySVCType = new SetValueCommand((SetRequest)myRequestType);
			try {
				mySVCLB.execute(new NullProgressMonitor(), null);
				mySVCUB.execute(new NullProgressMonitor(), null);
				mySVCType.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (relationToCopy instanceof specializationModel.RelationFeature){
			Relation relationCreated = getRelation((Project)((View)projectEditPart.getModel()).getElement(), (Node)((View)fatherEditPart.getModel()).getElement(), (Node)((View)elementPart.getModel()).getElement());
			IEditCommandRequest myRequestLB = new SetRequest(nodeToCopy.getEditingDomain(), relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), ((specializationModel.RelationFeature)relationToCopy).getLowerBound());
			SetValueCommand mySVCLB = new SetValueCommand((SetRequest)myRequestLB);
			IEditCommandRequest myRequestUB = new SetRequest(nodeToCopy.getEditingDomain(), relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), ((specializationModel.RelationFeature)relationToCopy).getUpperBound());
			SetValueCommand mySVCUB = new SetValueCommand((SetRequest)myRequestUB);
			IEditCommandRequest myRequestType = new SetRequest(nodeToCopy.getEditingDomain(), relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), ((specializationModel.RelationFeature)relationToCopy).getType());
			SetValueCommand mySVCType = new SetValueCommand((SetRequest)myRequestType);
			try {
				mySVCLB.execute(new NullProgressMonitor(), null);
				mySVCUB.execute(new NullProgressMonitor(), null);
				mySVCType.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Iterator<?> myIterator = myNode.getChildren().iterator();
		while (myIterator.hasNext()){
			Node tempNode = (Node) myIterator.next();
			copyFeatureAndLink( (GraphicalEditPart) selectedElement.findEditPart(selectedElement.getParent(), tempNode), elementPart, getRelation(project, myNode, tempNode), new Point(p.x, p.y));
		}
//		for (specializationModel.Node n : myNode.getChildren()){
//			copyFeatureAndLink( (GraphicalEditPart) selectedElement.findEditPart(selectedElement.getParent(), n), elementPart);
//		}
		
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
	
	private String getNewName(Feature mainFeature){
		String result = mainFeature.getName();
		int cont = 0;
		boolean exit = false, found = false;
		
		while (!exit){
			Iterator<?> iteratorChild = mainFeature.getFather().getChildren().iterator();
			while (!found && iteratorChild.hasNext()){
				Node child = (Node) iteratorChild.next();
				if (child instanceof Feature && ((Feature)child).getName().equals(result + cont)) found = true;
			}
			exit = !found;
			found = false;
			if (!exit) cont++;
		}

		return result + cont;
	}
	
	private Relation getRelation(Project project, Node source, Node target){
		Relation result = null;
		
		Iterator<?> iterator = project.getRelations().iterator();
		while (result == null && iterator.hasNext()){
			Relation aux = (Relation) iterator.next();
			if ((aux.getSource().equals(source) && aux.getTarget().equals(target)) ||
					(aux.getSource().equals(target) && aux.getTarget().equals(source))) result = aux;
		}		
		return result;
		
	}

}