package specializationModel.diagram.validator;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;

import specializationModel.diagram.edit.statics.CommonCommands;
import specializationModel.ConfigState;
import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.FeatureType;
import specializationModel.Node;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.RelationFG;
import specializationModel.RelationFeature;
import specializationModel.SpecializationModelPackage;
import specializationModel.diagram.edit.parts.FeatureEditPart;
import specializationModel.diagram.edit.parts.FeatureGroupEditPart;
import specializationModel.diagram.edit.parts.ProjectEditPart;
import specializationModel.diagram.edit.parts.RelationFGEditPart;
import specializationModel.diagram.edit.parts.RelationFeatureEditPart;
import specializationModel.diagram.providers.SpecializationmodelElementTypes;

public class PunisherValidator {
	
	ProjectEditPart projectEditPart;
	FeatureEditPart rootEditPart;
	ConfigurationSet myConfigurationSet;
	
	public PunisherValidator(ProjectEditPart projectEditPart, ConfigurationSet configurationSet){
		rootEditPart = (FeatureEditPart) projectEditPart.findEditPart(projectEditPart, configurationSet.getRoot().getFeature());
		this.projectEditPart = projectEditPart;
		this.myConfigurationSet = configurationSet;
	}
	
	public void vendetta(){
		execPunishment(myConfigurationSet.getRoot());
	}
	
	private void execPunishment(Feature4Validator actualF4V){
		Feature actualFeature = actualF4V.getFeature();
		EditPart myRelationEditPart = null;
		ConfigState configState = actualFeature.getState();
		
		if ( myConfigurationSet.isSelected(actualF4V)){
			switch (configState.getValue()){
			case ConfigState.UNDECIDED_VALUE:
				if ( actualFeature.getFather() != null){
					myRelationEditPart = CommonCommands.getEPRelation(projectEditPart, actualFeature);
					setFeature(myRelationEditPart, actualF4V);
				}
				break;
			case ConfigState.USER_ELIMINATED_VALUE:
				break;
			}
		}else if (myConfigurationSet.isUnselected(actualF4V)){
			switch (configState.getValue()){
			case ConfigState.UNDECIDED_VALUE:
				if ( actualFeature.getFather() != null){
					myRelationEditPart = CommonCommands.getEPRelation(projectEditPart, actualFeature);
					unsetFeature(myRelationEditPart, actualF4V);
				}
				break;
			case ConfigState.USER_SELECTED_VALUE:
				break;
			}
		}
		for (Feature4Validator f4v : actualF4V.getChildren()){
			execPunishment(f4v);
		}
	}
	
	private void setFeature(EditPart myRelationEditPart, Feature4Validator f4v) {
		if (myRelationEditPart instanceof RelationFeatureEditPart){
			RelationFeature relationFeature = (RelationFeature) ((View)myRelationEditPart.getModel()).getElement();
			if ( relationFeature.getType().equals(FeatureType.OPTIONAL)){
				setFeatureOptional(myRelationEditPart);
			}else if (relationFeature.getType().equals(FeatureType.MANDATORY)){
				setValue( ((RelationFeatureEditPart)myRelationEditPart).getEditingDomain(), f4v.getFeature(), SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);
			}else{
				setClonableFeature(myRelationEditPart, f4v);
			}
		}else if (myRelationEditPart instanceof RelationFGEditPart){
			setFeatureChildFG((RelationFGEditPart) myRelationEditPart, f4v);
		}
		
	}
	
	private void unsetFeature(EditPart myRelationEditPart, Feature4Validator f4v) {
		Feature feature = f4v.getFeature();
		
		if (feature.getReferenciated().size() != 0){
			takeMyChilds(feature.getReferenciated().get(0), feature);
		}else if (feature.getReferences() != null){
			feature.getReferences().getReferenciated().remove(feature);
		}
		
		//escribir en caso de querer recuperar los FG
		if (myRelationEditPart instanceof RelationFGEditPart){	
			unsetFeatureChildFG((RelationFGEditPart) myRelationEditPart, f4v);
		}else if (myRelationEditPart instanceof RelationFeatureEditPart){
			EditingDomain editingDomain = ((RelationFeatureEditPart)myRelationEditPart).getEditingDomain();
			
			
			EList<Node> newList = new BasicEList<Node>(feature.getFather().getChildren());
			newList.remove(feature);
			setValue((TransactionalEditingDomain) editingDomain, feature.getFather(), SpecializationModelPackage.eINSTANCE.getFeature_Children(), newList);
			
			setValue((TransactionalEditingDomain) editingDomain, feature, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_ELIMINATED);
			CommonCommands.setVisibility(editingDomain, ((RelationFeatureEditPart)myRelationEditPart).getTarget(), false);
		}
		
	}
	
	private void takeMyChilds(Feature newSource, Feature oldSource) {
		// TODO Auto-generated method stub
		Project p = (Project) ((View) projectEditPart.getModel()).getElement();
		final FeatureEditPart featureEditPart = (FeatureEditPart) projectEditPart.findEditPart(projectEditPart, newSource);
		EditingDomain editingDomain = featureEditPart.getEditingDomain();
		for (specializationModel.Node node : oldSource.getChildren()){
			EReference eReference = null;
			Relation relation = CommonCommands.getRelationTo(p, node);
			EditPart editPart =  CommonCommands.getEPRelation(projectEditPart, node);
			if (editPart instanceof RelationFGEditPart){
				eReference = SpecializationModelPackage.eINSTANCE.getRelationFG_Source();
			}else if (editPart instanceof RelationFeatureEditPart){
				eReference = SpecializationModelPackage.eINSTANCE.getRelationFeature_Source();
			}
			final EdgeImpl o = (EdgeImpl) editPart.getModel();
			
			editingDomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) editingDomain){
				protected void doExecute(){
					o.setSource((View) ((GraphicalEditPart) featureEditPart).getModel());
				}
			});
			
			EList<Node> newList = new BasicEList<Node>();
			newList.addAll(newSource.getChildren());
			newList.add(node);
			setValue((TransactionalEditingDomain) editingDomain, newSource, SpecializationModelPackage.eINSTANCE.getFeature_Children(), newList);
			setValue((TransactionalEditingDomain) editingDomain, node, SpecializationModelPackage.eINSTANCE.getNode_Father(), newSource);
			setValue((TransactionalEditingDomain) editingDomain, relation, eReference, newSource);

		}
		
		setValue((TransactionalEditingDomain) editingDomain, oldSource, SpecializationModelPackage.eINSTANCE.getFeature_Children(), new BasicEList<Node>());
		setValue((TransactionalEditingDomain) editingDomain, oldSource, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), new BasicEList<Node>());
		setValue((TransactionalEditingDomain) editingDomain, oldSource, SpecializationModelPackage.eINSTANCE.getFeature_References(), newSource);
		
		List<Feature> referenciated = new BasicEList<Feature>(oldSource.getReferenciated());
		referenciated.remove(newSource);
		setValue((TransactionalEditingDomain) editingDomain, newSource, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), referenciated);
		setValue((TransactionalEditingDomain) editingDomain, newSource, SpecializationModelPackage.eINSTANCE.getFeature_References(), null);
		for (Feature f : referenciated ){			
			setValue((TransactionalEditingDomain) editingDomain, f, SpecializationModelPackage.eINSTANCE.getFeature_References(), newSource);
		}

	}
	
	protected void setFeatureChildFG(RelationFGEditPart myRelationEditPart, Feature4Validator f4v){
		final RelationFG thisObject = (RelationFG) ((View)myRelationEditPart.getModel()).getElement();
		final EditingDomain editingDomain = myRelationEditPart.getEditingDomain();
		FeatureGroup myFeatureGroup = (FeatureGroup) thisObject.getSource();   
		FeatureGroupEditPart myFeatureGroupEditPart = (FeatureGroupEditPart) myRelationEditPart.getSource();
		EditPart cosaaarrg = myRelationEditPart.findEditPart(myRelationEditPart.getParent(), (EObject) myFeatureGroup.getFather());
		Object grandpa = cosaaarrg.getModel();
		
		setValue((TransactionalEditingDomain) editingDomain, thisObject.getTarget(), SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);

		// create a RelationSelected. 
		CompoundCommand cc = new CompoundCommand();
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
				((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), myRelationEditPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject)grandpa),
				new EObjectAdapter((EObject)myRelationEditPart.getTarget().getModel()), myRelationEditPart.getViewer());
		cc.add(new ICommandProxy(createSubTopicsCmd));
		myRelationEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		EList<Feature> myChildrenList  = new BasicEList<Feature>(myFeatureGroup.getChildren());
		myChildrenList.remove(thisObject.getTarget());
		setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_Children(), myChildrenList);

		// delete the current RelationFeature. The graphical part.
		try {
			new DeleteCommand((TransactionalEditingDomain) editingDomain, (View) myRelationEditPart.getModel()).execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		editingDomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) editingDomain){
			protected void doExecute(){
				RemoveCommand.create(editingDomain, thisObject).execute();
			}
		});
		
		RelationFeature newRelationFeature = (RelationFeature) CommonCommands.getRelationTo((Project)f4v.getFeature().eContainer(), f4v.getFeature());
		setValue((TransactionalEditingDomain) editingDomain, newRelationFeature, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), 1);
		setValue((TransactionalEditingDomain) editingDomain, newRelationFeature, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.MANDATORY);
		
		int upperBoundValue = myFeatureGroup.getUpperBound() -1 ;
		if ( upperBoundValue > 0){
			int lowerBoundValue = Math.max( 0, myFeatureGroup.getLowerBound() -1) ;
			if ( lowerBoundValue == 0 && upperBoundValue == 1 && myFeatureGroup.getChildren().size() == 1){
				eliminateFGAdoptChild(myFeatureGroupEditPart, myFeatureGroup.getChildren().get(0), grandpa, FeatureType.OPTIONAL);
			}else {
				setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_LowerBound(), lowerBoundValue);
				setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_UpperBound(), upperBoundValue);
			}
		} else {
			EList<Node> childrenList  = new BasicEList<Node>(myFeatureGroup.getFather().getChildren());
			childrenList.remove(myFeatureGroup);
			setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup.getFather(), SpecializationModelPackage.eINSTANCE.getFeature_Children(), childrenList);
			CommonCommands.setVisibility(editingDomain, myFeatureGroupEditPart, false);
		}
	}

	protected void unsetFeatureChildFG(RelationFGEditPart myRelationEditPart, Feature4Validator f4v){
		final RelationFG thisObject = (RelationFG) ((View)myRelationEditPart.getModel()).getElement();
		final EditingDomain editingDomain = myRelationEditPart.getEditingDomain();
		FeatureGroup myFeatureGroup = (FeatureGroup) thisObject.getSource();   
		FeatureGroupEditPart myFeatureGroupEditPart = (FeatureGroupEditPart) myRelationEditPart.getSource();
		EditPart cosaaarrg = myRelationEditPart.findEditPart(myRelationEditPart.getParent(), (EObject) myFeatureGroup.getFather());
		Object grandpa = cosaaarrg.getModel();
		
		setValue((TransactionalEditingDomain) editingDomain, thisObject.getTarget(), SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_ELIMINATED);

		EList<Feature> myChildrenList  = new BasicEList<Feature>(myFeatureGroup.getChildren());
		myChildrenList.remove(thisObject.getTarget());
		setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_Children(), myChildrenList);
		
		
		if ( myChildrenList.size() < myFeatureGroup.getUpperBound()){
		
			int upperBoundValue = myFeatureGroup.getUpperBound() -1 ;
			
			if (upperBoundValue == 1){
				if (myFeatureGroup.getLowerBound() == 0){
					eliminateFGAdoptChild(myFeatureGroupEditPart, myFeatureGroup.getChildren().get(0), grandpa, FeatureType.OPTIONAL);
				}else{ // then, lowerBound must be 1
					if (myFeatureGroup.getChildren().size() > 0) eliminateFGAdoptChild(myFeatureGroupEditPart, myFeatureGroup.getChildren().get(0), grandpa, FeatureType.MANDATORY);
				}
			}else{
				setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_UpperBound(), upperBoundValue);
			}
		}
		
		CommonCommands.setVisibility(editingDomain, myRelationEditPart.getTarget(), false);
	}

	private void eliminateFGAdoptChild(FeatureGroupEditPart myFeatureGroupEditPart, Feature child, Object grandpa, FeatureType featureType) {
		TransactionalEditingDomain editingDomain = myFeatureGroupEditPart.getEditingDomain();
		Feature newFather = (Feature) ((View)grandpa).getElement();
		
		FeatureEditPart childFeatureEditPart = (FeatureEditPart) myFeatureGroupEditPart.findEditPart(myFeatureGroupEditPart.getParent(), child); 
		createRelationFeature(childFeatureEditPart, grandpa,featureType);
		
		EList<Node> childrenList  = new BasicEList<Node>(newFather.getChildren());
		childrenList.remove(newFather);
		setValue((TransactionalEditingDomain) editingDomain, newFather, SpecializationModelPackage.eINSTANCE.getFeature_Children(), childrenList);
		CommonCommands.setVisibility(editingDomain, myFeatureGroupEditPart, false);
	}

	private void createRelationFeature( FeatureEditPart childFeatureEditPart, Object newFather, FeatureType featureType) {
		Feature child = (Feature) ((View)childFeatureEditPart.getModel()).getElement();
		EditingDomain editingDomain = childFeatureEditPart.getEditingDomain();
		CompoundCommand cc1 = new CompoundCommand();
		ICommand createSubTopicsCmd1 = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
				((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), childFeatureEditPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject)newFather),
				new EObjectAdapter((EObject)childFeatureEditPart.getModel()), childFeatureEditPart.getViewer());
		cc1.add(new ICommandProxy(createSubTopicsCmd1));
		childFeatureEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc1);
		
		setValue((TransactionalEditingDomain) editingDomain, child, SpecializationModelPackage.eINSTANCE.getNode_Father(), ((View)newFather).getElement());
		
		Relation relationCreated = CommonCommands.getRelationFeatureTo( (Project) child.eContainer(), child  );
		
		int newLowerBound = 0;
		int newUpperBound = 1;
		if (featureType.equals(FeatureType.MANDATORY)) newLowerBound = 1;
		setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), newLowerBound);
		setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), newUpperBound);
		setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), featureType);
	}

	
	private void setFeatureOptional(EditPart rfep){
		RelationFeature relationFeature = (RelationFeature) ((View)rfep.getModel()).getElement();
		EditingDomain editingDomain = projectEditPart.getEditingDomain();
		
		setValue((TransactionalEditingDomain) editingDomain, relationFeature.getTarget(), SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);
		setValue((TransactionalEditingDomain) editingDomain, relationFeature, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), 1);
		setValue((TransactionalEditingDomain) editingDomain, relationFeature, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), 1);
		setValue((TransactionalEditingDomain) editingDomain, relationFeature, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.MANDATORY);
		
//		CompoundCommand cc = new CompoundCommand();
//		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationSelected_4003,
//				((IHintedType) SpecializationmodelElementTypes.RelationSelected_4003).getSemanticHint(), ((ConnectionEditPart) rfep).getDiagramPreferencesHint()), new EObjectAdapter((EObject)((RelationFeatureEditPart)rfep).getSource().getModel()),
//				new EObjectAdapter((EObject)((RelationFeatureEditPart)rfep).getTarget().getModel()), rfep.getViewer());
//		cc.add(new ICommandProxy(createSubTopicsCmd));
//		((ConnectionEditPart) rfep).getDiagramEditDomain().getDiagramCommandStack().execute(cc);
//
//		// delete the current RelationFeature. The graphical part.
//		DeleteCommand myDeleteCommand = new DeleteCommand(((ConnectionEditPart)rfep).getEditingDomain(), (View) rfep.getModel());
//		try {
//			myDeleteCommand.execute(new NullProgressMonitor(), null);
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		editingDomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) editingDomain){
//			@SuppressWarnings("unchecked")
//			protected void doExecute(){
//				RemoveCommand.create(editingDomain, relationFeature).execute();
//			}
//		});
	}
	
	private void setClonableFeature(EditPart rfep, Feature4Validator f4v) {
		final RelationFeature relationFeature = (RelationFeature) ((View)rfep.getModel()).getElement();
		final EditingDomain editingDomain = projectEditPart.getEditingDomain();
		
		FeatureEditPart clonableFeature = (FeatureEditPart) ((RelationFeatureEditPart)rfep).getTarget();
		Feature myFeature = (Feature) ((View)clonableFeature.getModel()).getElement();
		EditPart fatherEditPart = ((RelationFeatureEditPart)rfep).getSource();
		Feature fatherFeature = (Feature)((View)fatherEditPart.getModel()).getElement();
		
		CompoundCommand cc = new CompoundCommand("Clone Feature and Link");

		// Create the new topic for the other end.
		CreateViewRequest topicRequest = CreateViewRequestFactory.getCreateShapeRequest(SpecializationmodelElementTypes.Feature_2001, clonableFeature.getDiagramPreferencesHint());

		Point p = ((AbstractGraphicalEditPart) fatherEditPart).getFigure().getBounds().getTopRight().getCopy();
		((AbstractGraphicalEditPart) fatherEditPart).getFigure().translateToAbsolute(p);
		int edgeCount = ((GraphicalEditPart) fatherEditPart).getNotationView().getSourceEdges().size();
		// A quick hack to get subtopics to layout to the right, from top to bottom
		int offset = (edgeCount * 50) - 100;
		topicRequest.setLocation(p.translate(offset, 100));

		ProjectEditPart projectEditPart = (ProjectEditPart) clonableFeature.getParent();
		Project project = (Project)((View)projectEditPart.getModel()).getElement();
		Command createTopicCmd = projectEditPart.getCommand(topicRequest);
		IAdaptable topicViewAdapter = (IAdaptable) ((List) topicRequest.getNewObject()).get(0);

		cc.add(createTopicCmd);
		
//		// create the relation link command�
//		// Atenci�n!! en realidad la acci�n s�lo deber�a de producirse cuando relation instanceof relationFeature !!
//		IElementType relationElementType;
//		relationElementType = SpecializationmodelElementTypes.RelationFeature_4002;
//		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(relationElementType,
//				((IHintedType) relationElementType).getSemanticHint(), clonableFeature.getDiagramPreferencesHint()), new EObjectAdapter((EObject)fatherEditPart.getModel()),
//				topicViewAdapter, clonableFeature.getViewer());
//		
//		final EditPart elementPart = (EditPart) clonableFeature.getViewer().getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
//		
//		specializationModel.Feature newFeature = (Feature) ((View)((FeatureEditPart)elementPart).getModel()).getElement();
//		Relation relationCreated = CommonCommands.getRelationFeatureTo( (Project) newFeature.eContainer(),  newFeature );
//		
//		setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), 1);
//		setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.MANDATORY);
//		
//		cc.add(new ICommandProxy(createSubTopicsCmd));

		clonableFeature.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		
		
		specializationModel.Feature newFeature = (Feature) ((View)topicViewAdapter.getAdapter(View.class)).getElement();
		setFeatureValues(myFeature, fatherFeature, newFeature);
		
		setRelationValues(relationFeature, clonableFeature);
		
		f4v.setFeature(myFeature);
		
		
		EditPart ep = clonableFeature.findEditPart(clonableFeature.getParent(), newFeature);
		ep.refresh();
		
	}
	
	private void setRelationValues(Relation relationToCopy, FeatureEditPart clonableFeature) {
		if (relationToCopy instanceof specializationModel.RelationFeature){
			int lowerBound = ((specializationModel.RelationFeature) relationToCopy).getLowerBound();
			int upperBound = ((specializationModel.RelationFeature) relationToCopy).getUpperBound();
			if ( lowerBound > 0)lowerBound = Math.max(lowerBound -1, 0);
			if (upperBound > 0) upperBound = Math.max(upperBound -1 , 0);
			
			EditingDomain editingDomain = clonableFeature.getEditingDomain();
			
			setValue((TransactionalEditingDomain) editingDomain, relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), lowerBound);
			setValue((TransactionalEditingDomain) editingDomain, relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), upperBound);
			
			if (lowerBound == 0 && upperBound == 1)
				setValue((TransactionalEditingDomain) editingDomain, relationToCopy, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.OPTIONAL);
		}
	}
	
	private void setFeatureValues(Feature myFeature, Feature fatherFeature, Feature newFeature) {
		TransactionalEditingDomain editingDomain = projectEditPart.getEditingDomain();
		setValue(editingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Name(), getNewName(myFeature));
		setValue(editingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_RealName(), ((Feature)myFeature).getName());
//		setValue(editingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Clonated(), true);
		setValue(editingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);
		setValue(editingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getNode_Father(), fatherFeature);

		EList<Node> childrenList = new BasicEList<Node>(fatherFeature.getChildren());
		childrenList.add(newFeature);
		setValue(editingDomain, fatherFeature,SpecializationModelPackage.eINSTANCE.getFeature_Children(), childrenList);
		
		EList<Feature> referenciatedList;
		Feature newReference;
		if ( myFeature.getReferences() != null){
			referenciatedList = new BasicEList<Feature>(myFeature.getReferences().getReferenciated());
			newReference = myFeature.getReferences();
		}else {
			referenciatedList = new BasicEList<Feature>(myFeature.getReferenciated());
			newReference = myFeature;
		}
		
		referenciatedList.add(newFeature);
		setValue(editingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_References(), newReference);
		setValue(editingDomain, newReference, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), referenciatedList);
	}
	private SetValueCommand setValue( TransactionalEditingDomain transactionalEditingDomain, EObject eObject, EStructuralFeature eStructuralFeature, Object value) {
		IEditCommandRequest myRequest = new SetRequest(transactionalEditingDomain, eObject, eStructuralFeature, value);
		SetValueCommand mySVC = new SetValueCommand((SetRequest) myRequest);
		try {
			mySVC.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return mySVC;
	}
	private String getNewName(Feature mainFeature){
		String result = mainFeature.getName();
		int cont = 0;
		boolean exit = false, found = false;
		
		while (!exit){
			Iterator iteratorChild = mainFeature.getFather().getChildren().iterator();
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
	
}
