package specializationModel.diagram.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.Node;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.RelationFG;
import specializationModel.SpecializationModelPackage;
import specializationModel.diagram.edit.parts.FeatureEditPart;
import specializationModel.diagram.edit.parts.FeatureGroupEditPart;
import specializationModel.diagram.edit.parts.ProjectEditPart;
import specializationModel.diagram.edit.statics.CommonCommands;
import specializationModel.diagram.providers.SpecializationmodelElementTypes;

public class MyUnreferenceHandler extends AbstractHandler { 

	FeatureEditPart selectedElement;
	Feature selectedFeature;
	
	@Override 
	public Object execute(ExecutionEvent event) throws ExecutionException { 
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event); 
		
		selectedElement = (FeatureEditPart) selection.getFirstElement();
		selectedFeature = (Feature) ((View)selectedElement.getModel()).getElement();
		FeatureEditPart referenceNode = (FeatureEditPart) selectedElement.findEditPart(selectedElement.getParent(), selectedFeature.getReferences());
		Feature referenceFeature = (Feature) ((View)referenceNode.getModel()).getElement();
		ProjectEditPart projectEditPart = (ProjectEditPart) selectedElement.getParent();
		Project project = (Project) ((View)projectEditPart.getModel()).getElement();
		Point p = ((AbstractGraphicalEditPart) selectedElement).getFigure().getBounds().getTopRight().getCopy();
		
		for (Node node : referenceFeature.getChildren()){
			EditPart nodeToCopy = selectedElement.findEditPart(projectEditPart, node);
			Relation relation = CommonCommands.getRelationTo(project, node);
			copyFeatureAndLink((GraphicalEditPart) nodeToCopy, selectedElement, relation, p); 
		}
		EList<?> newReferenciated = new BasicEList(referenceFeature.getReferenciated());
		newReferenciated.remove(selectedFeature);
		
		setReferences(referenceFeature);
		
		
		IEditCommandRequest myRequestRef = new SetRequest(selectedElement.getEditingDomain(), selectedFeature, SpecializationModelPackage.eINSTANCE.getFeature_References(), null);
		SetValueCommand mySVCR = new SetValueCommand((SetRequest)myRequestRef);
		IEditCommandRequest myRequestRefed = new SetRequest(selectedElement.getEditingDomain(), referenceFeature, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), newReferenciated);
		SetValueCommand mySVCRe = new SetValueCommand((SetRequest)myRequestRefed);
		try {
			mySVCR.execute(new NullProgressMonitor(), null);
			mySVCRe.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-genera	ted catch block
			e.printStackTrace();
		}
		
		
		projectEditPart.loadModel();
		
		return null;
	} 

	private void setReferences(Node referenceFeature) {
		
		for ( Object node : referenceFeature.getChildren()){
			if ( node instanceof Feature){
				Feature reference = ((Feature)node).getReferences();
				EList<Feature> listReference = ((Feature)node).getReferenciated();
				if ( reference != null){
					Feature newReference;
					if (iAmInSubTree(reference, selectedFeature.getReferences())){
						newReference = (Feature) reference.getSpecializationNode();
					}else {
						newReference = reference;
					}
					
					IEditCommandRequest myRequestRef = new SetRequest(selectedElement.getEditingDomain(), ((Node) node).getSpecializationNode(), SpecializationModelPackage.eINSTANCE.getFeature_References(), newReference);
					SetValueCommand mySVCRef = new SetValueCommand((SetRequest)myRequestRef);
					try {
						mySVCRef.execute(new NullProgressMonitor(), null);
					} catch (ExecutionException e) {
						// TODO Auto-genera	ted catch block
						e.printStackTrace();
					}
				} else if (listReference.size() > 0){
					List<Feature> newReferenciated = new ArrayList<Feature>();
					for (Feature f : listReference){
						if (iAmInSubTree(f, selectedFeature.getReferences())){
							newReferenciated.add((Feature) f.getSpecializationNode());
						}else {
							newReferenciated.add(f);
						}
					}
					
					IEditCommandRequest myRequestRef = new SetRequest(selectedElement.getEditingDomain(), ((Node) node).getSpecializationNode(), SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), newReferenciated);
					SetValueCommand mySVCRef = new SetValueCommand((SetRequest)myRequestRef);
					try {
						mySVCRef.execute(new NullProgressMonitor(), null);
					} catch (ExecutionException e) {
						// TODO Auto-genera	ted catch block
						e.printStackTrace();
					}
				}
			}
			setReferences((Node) node);
		}
		
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
			myNode.setSpecializationNode(newFeature);
			
			
			IEditCommandRequest myRequestName = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Name(), ((Feature)myNode).getName());
			SetValueCommand mySVCName = new SetValueCommand((SetRequest) myRequestName);
			IEditCommandRequest myRequestRealName = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_RealName(), ((Feature)myNode).getRealName());
			SetValueCommand mySVCRealName = new SetValueCommand((SetRequest) myRequestRealName);
			IEditCommandRequest myRequestReference = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_References(), ((Feature)myNode).getReferences());
			SetValueCommand mySVCReference = new SetValueCommand((SetRequest) myRequestReference);
			IEditCommandRequest myRequestReferenciated = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), ((Feature)myNode).getReferenciated());
			SetValueCommand mySVCReferenciated = new SetValueCommand((SetRequest) myRequestReferenciated);
			IEditCommandRequest myRequestState = new SetRequest(nodeToCopy.getEditingDomain(), newFeature, SpecializationModelPackage.eINSTANCE.getFeature_State(), ((Feature)myNode).getState());
			SetValueCommand mySVCState = new SetValueCommand((SetRequest) myRequestState);
			try {
				mySVCName.execute(new NullProgressMonitor(), null);
				mySVCRealName.execute(new NullProgressMonitor(), null);
//				mySVCClonated.execute(new NullProgressMonitor(), null);
				mySVCReferenciated.execute(new NullProgressMonitor(), null);
				mySVCReference.execute(new NullProgressMonitor(), null);
				mySVCState.execute(new NullProgressMonitor(), null);
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
			Relation relationCreated = CommonCommands.getRelationTo((Project)((View)projectEditPart.getModel()).getElement(), (Node)((View)elementPart.getModel()).getElement());
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
			copyFeatureAndLink( (GraphicalEditPart) selectedElement.findEditPart(selectedElement.getParent(), tempNode), elementPart, CommonCommands.getRelationTo(project, tempNode), new Point(p.x, p.y));
		}
		
	}
	
	private boolean iAmInSubTree(specializationModel.Node node, Feature root){
		List<specializationModel.Node> ancestros = new ArrayList<specializationModel.Node>();
		specializationModel.Node auxNode = node.getFather();
		while (auxNode != null ){
			ancestros.add(auxNode);
			auxNode = auxNode.getFather();
		}
		
		return ancestros.contains(root);
	}
	
	

}