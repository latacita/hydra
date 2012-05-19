package featureModel.diagram.validator;

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
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
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
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;

import featureModel.diagram.edit.statics.CommonCommands;
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
					myRelationEditPart = getEPRelation(projectEditPart, actualFeature);
					setFeature(myRelationEditPart, actualF4V);
				}
				break;
			case ConfigState.USER_ELIMINATED_VALUE:
				break;
			}
			for (Feature4Validator f4v : actualF4V.getChildren()){
				execPunishment(f4v);
			}
		}else if (myConfigurationSet.isUnselected(actualF4V)){
			switch (configState.getValue()){
			case ConfigState.UNDECIDED_VALUE:
				if ( actualFeature.getFather() != null){
					myRelationEditPart = getEPRelation(projectEditPart, actualFeature);
					unsetFeature(myRelationEditPart, actualF4V);
				}
				break;
			case ConfigState.USER_SELECTED_VALUE:
				break;
			}
		}
	}
	
	private EditPart getEPRelation(ProjectEditPart project, specializationModel.Node target){
		EditPart result = null;
		Iterator iterator = project.getConnections().iterator();
		while (result == null && iterator.hasNext()){
			ConnectionEditPart aux = (ConnectionEditPart) iterator.next();
			Relation r = (Relation) ((View)aux.getModel()).getElement();

			if ( r.getTarget().equals(target)) result = aux;
		}		
		return result;
	}

	private void setFeature(EditPart myRelationEditPart, Feature4Validator f4v) {
		if (myRelationEditPart instanceof RelationFeatureEditPart){
			RelationFeature relationFeature = (RelationFeature) ((View)myRelationEditPart.getModel()).getElement();
			if ( relationFeature.getType().equals(FeatureType.OPTIONAL)){
				setFeatureOptional(myRelationEditPart);
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
			EditingDomain editingDomain = ((RelationFGEditPart)myRelationEditPart).getEditingDomain();
			
			setVisibility(editingDomain, ((RelationFGEditPart)myRelationEditPart).getTarget(), false);
		}else if (myRelationEditPart instanceof RelationFeatureEditPart){
			EditingDomain editingDomain = ((RelationFeatureEditPart)myRelationEditPart).getEditingDomain();
			
			
			EList<Node> newList = new BasicEList<Node>(feature.getFather().getChildren());
			newList.remove(feature);
			setValue((TransactionalEditingDomain) editingDomain, feature.getFather(), SpecializationModelPackage.eINSTANCE.getFeature_Children(), newList);
			
			setVisibility(editingDomain, ((RelationFeatureEditPart)myRelationEditPart).getTarget(), false);
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
			EditPart editPart =  getEPRelation(projectEditPart, node);
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

		int upperBoundValue = myFeatureGroup.getUpperBound() -1 ;
		if ( upperBoundValue > 0){
			int lowerBoundValue = Math.max( 0, myFeatureGroup.getLowerBound() -1) ;
			if ( lowerBoundValue == 0 && upperBoundValue == 1 && myFeatureGroup.getChildren().size() == 1){
				Feature aloneChild  = myFeatureGroup.getChildren().get(0);
				FeatureEditPart childFeatureEditPart = (FeatureEditPart) myFeatureGroupEditPart.findEditPart(myFeatureGroupEditPart.getParent(), aloneChild);
				// create a RelationSelected. 
				CompoundCommand cc1 = new CompoundCommand();
				ICommand createSubTopicsCmd1 = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
						((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), myFeatureGroupEditPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject)grandpa),
						new EObjectAdapter((EObject)childFeatureEditPart.getModel()), childFeatureEditPart.getViewer());
				cc1.add(new ICommandProxy(createSubTopicsCmd1));
				myFeatureGroupEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc1);
				
				setValue((TransactionalEditingDomain) editingDomain, aloneChild, SpecializationModelPackage.eINSTANCE.getNode_Father(), myFeatureGroup.getFather());
				
				Relation relationCreated = CommonCommands.getRelationFeatureTo( (Project) aloneChild.eContainer(), aloneChild  );
				setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), 0);
				setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), 1);
				setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.OPTIONAL);
				
				setVisibility(editingDomain, myFeatureGroupEditPart, false);
//				eliminateFGChildrenOptional(myFeatureGroup);
			}else {
				setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_LowerBound(), lowerBoundValue);
				setValue((TransactionalEditingDomain) editingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_UpperBound(), upperBoundValue);
			}
		} else {
			setVisibility(editingDomain, myFeatureGroupEditPart, false);
		}
	}

	protected void unsetFeatureChildFG(RelationFGEditPart myRelationEditPart, Feature4Validator f4v){
		final RelationFG relationFG = (RelationFG) ((View)myRelationEditPart.getModel()).getElement();
		FeatureEditPart featureEditPart = (FeatureEditPart) myRelationEditPart.getTarget();
		Feature feature = (Feature) relationFG.getTarget();
		FeatureGroup featureGroupFather = (FeatureGroup) feature.getFather();
		final EditingDomain editingDomain = myRelationEditPart.getEditingDomain();
		FeatureEditPart grandpaEditPart = (FeatureEditPart) myRelationEditPart.findEditPart(myRelationEditPart.getParent(), featureGroupFather.getFather());
		Feature granpdaFeature = (Feature) featureGroupFather.getFather();
		
		EList<Feature> newListChildren = new BasicEList<Feature>(featureGroupFather.getChildren());
		newListChildren.remove(feature);
		setValue((TransactionalEditingDomain) editingDomain, featureGroupFather, SpecializationModelPackage.eINSTANCE.getFeatureGroup_Children(), newListChildren);
		int lowerBound = featureGroupFather.getLowerBound();
		int upperBound = Math.min(featureGroupFather.getUpperBound(), newListChildren.size());
		setValue((TransactionalEditingDomain) editingDomain, featureGroupFather, SpecializationModelPackage.eINSTANCE.getFeatureGroup_UpperBound(), upperBound);
		
		CompoundCommand cc = new CompoundCommand();
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
				((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), myRelationEditPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject)grandpaEditPart.getModel()),
				new EObjectAdapter((EObject)featureEditPart.getModel()), myRelationEditPart.getViewer());
		cc.add(new ICommandProxy(createSubTopicsCmd));
		myRelationEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		
		// delete the current RelationFeature. The graphical part.
		DeleteCommand myDeleteCommand = new DeleteCommand(myRelationEditPart.getEditingDomain(), (View) myRelationEditPart.getModel());
		try {
			myDeleteCommand.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		editingDomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) editingDomain){
			protected void doExecute(){
				RemoveCommand.create(editingDomain, relationFG).execute();
			}
		});
		
		
		if ( lowerBound == upperBound && upperBound == newListChildren.size()){
			
			EList<Node> grandpaChildren = new BasicEList<Node>(granpdaFeature.getChildren());
			grandpaChildren.remove(featureGroupFather);
			
			for (Feature f: newListChildren){
				FeatureEditPart childFeatureEditPart = (FeatureEditPart) myRelationEditPart.findEditPart(myRelationEditPart.getParent(), f);
				
				CompoundCommand cc1 = new CompoundCommand();
				ICommand createSubTopicsCmd1 = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
						((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), myRelationEditPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject)grandpaEditPart.getModel()),
						new EObjectAdapter((EObject)childFeatureEditPart.getModel()), myRelationEditPart.getViewer());
				cc1.add(new ICommandProxy(createSubTopicsCmd1));
				myRelationEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc1);
				setValue((TransactionalEditingDomain) editingDomain, feature, SpecializationModelPackage.eINSTANCE.getNode_Father(), granpdaFeature);
				grandpaChildren.add(f);
			}
			setValue((TransactionalEditingDomain) editingDomain, granpdaFeature, SpecializationModelPackage.eINSTANCE.getFeature_Children(), grandpaChildren);
			setVisibility(editingDomain, myRelationEditPart.getSource(), false);
		}else if ( lowerBound == 0 && upperBound == 1 && upperBound == featureGroupFather.getChildren().size()){
			EList<Node> grandpaChildren = new BasicEList<Node>(granpdaFeature.getChildren());
			grandpaChildren.remove(featureGroupFather);
			
			Feature aloneChild  = featureGroupFather.getChildren().get(0);
			FeatureEditPart childFeatureEditPart = (FeatureEditPart) myRelationEditPart.findEditPart(myRelationEditPart.getParent(), aloneChild);
			
			
			CompoundCommand cc1 = new CompoundCommand();
			ICommand createSubTopicsCmd1 = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
					((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), myRelationEditPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject)grandpaEditPart.getModel()),
					new EObjectAdapter((EObject)childFeatureEditPart.getModel()), myRelationEditPart.getViewer());
			cc1.add(new ICommandProxy(createSubTopicsCmd1));
			myRelationEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc1);
			setValue((TransactionalEditingDomain) editingDomain, feature, SpecializationModelPackage.eINSTANCE.getNode_Father(), granpdaFeature);
			grandpaChildren.add(aloneChild);
			
			Relation relationCreated = CommonCommands.getRelationFeatureTo( (Project) feature.eContainer(), feature  );
			setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), 0);
			setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), 1);
			setValue((TransactionalEditingDomain) editingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.OPTIONAL);
			
			setValue((TransactionalEditingDomain) editingDomain, granpdaFeature, SpecializationModelPackage.eINSTANCE.getFeature_Children(), grandpaChildren);
			setVisibility(editingDomain, myRelationEditPart.getSource(), false);
		}
	}
	
	
	private void setVisibility(final EditingDomain editingDomain, EditPart editPart , final boolean visibility) {
		final org.eclipse.gmf.runtime.notation.Node node = (org.eclipse.gmf.runtime.notation.Node) editPart.getModel();
		editingDomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) editingDomain){
			protected void doExecute(){
				node.setVisible(visibility);
			}
		});
	}
	
	private void setFeatureOptional(EditPart rfep){
		final RelationFeature relationFeature = (RelationFeature) ((View)rfep.getModel()).getElement();
		final EditingDomain editingDomain = projectEditPart.getEditingDomain();
		
		setValue((TransactionalEditingDomain) editingDomain, relationFeature.getTarget(), SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);
		
		CompoundCommand cc = new CompoundCommand();
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
				((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), ((ConnectionEditPart) rfep).getDiagramPreferencesHint()), new EObjectAdapter((EObject)((RelationFeatureEditPart)rfep).getSource().getModel()),
				new EObjectAdapter((EObject)((RelationFeatureEditPart)rfep).getTarget().getModel()), rfep.getViewer());
		cc.add(new ICommandProxy(createSubTopicsCmd));
		((ConnectionEditPart) rfep).getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		// delete the current RelationFeature. The graphical part.
		DeleteCommand myDeleteCommand = new DeleteCommand(((ConnectionEditPart)rfep).getEditingDomain(), (View) rfep.getModel());
		try {
			myDeleteCommand.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		editingDomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) editingDomain){
			protected void doExecute(){
				RemoveCommand.create(editingDomain, relationFeature).execute();
			}
		});
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
		
		// create the relation link command�
		// Atenci�n!! en realidad la acci�n s�lo deber�a de producirse cuando relation instanceof relationFeature !!
		IElementType relationElementType;
		relationElementType = SpecializationmodelElementTypes.RelationFeature_4002;
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(relationElementType,
				((IHintedType) relationElementType).getSemanticHint(), clonableFeature.getDiagramPreferencesHint()), new EObjectAdapter((EObject)fatherEditPart.getModel()),
				topicViewAdapter, clonableFeature.getViewer());
		
		
		cc.add(new ICommandProxy(createSubTopicsCmd));

		clonableFeature.getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		setFeatureValues(myFeature, fatherFeature, topicViewAdapter, clonableFeature);
		
		setRelationValues(fatherEditPart, project, relationFeature, clonableFeature);
		
		f4v.setFeature(myFeature);
	}
	
	private void setRelationValues(EditPart fatherEditPart, Project project, Relation relationToCopy, FeatureEditPart clonableFeature) {
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
	
	private void setFeatureValues(Feature myFeature, Feature fatherFeature,IAdaptable topicViewAdapter, FeatureEditPart clonableFeature) {
		final EditPartViewer viewer = clonableFeature.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
		TransactionalEditingDomain editingDomain = clonableFeature.getEditingDomain();
		
		specializationModel.Feature newFeature = (Feature) ((View)((FeatureEditPart)elementPart).getModel()).getElement();
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
