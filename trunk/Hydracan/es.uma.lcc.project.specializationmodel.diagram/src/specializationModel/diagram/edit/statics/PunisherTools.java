package specializationModel.diagram.edit.statics;

import java.util.ArrayList;
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
import org.eclipse.emf.edit.command.SetCommand;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
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

public class PunisherTools {
	
	IGraphicalEditPart myEditPart;
	EditingDomain otherEditingDomain;
	
	public PunisherTools(IGraphicalEditPart editPart, EditingDomain editingDomain){
		myEditPart = editPart;
		otherEditingDomain = editingDomain;
	}	
	
	private boolean haveInfiniteDomainYet(Project project){
		boolean result = false;
		Iterator<Relation> it = project.getRelations().iterator();
		while(!result && it.hasNext()){
			Relation r = it.next();
			if( r instanceof RelationFeature && r.getTarget() != null && !((RelationFeature)r).getTarget().getState().equals(ConfigState.USER_ELIMINATED) && ((RelationFeature)r).getUpperBound() < 0){
				ProjectEditPart projectEditPart;
				
				if (myEditPart instanceof ConnectionNodeEditPart){
					projectEditPart = (ProjectEditPart) ((ConnectionNodeEditPart)myEditPart).getSource().getParent();
				}else {
					projectEditPart = (ProjectEditPart) myEditPart.getParent();
				}
				
				EditPart ep = CommonCommands.getEPRelation(projectEditPart, r.getTarget());
				if (ep != null)
					result = true;
			}
		}
		return result;
	}
	
	public boolean checkInfiniteDomain(Project project){
		boolean haveInfiniteDomain = haveInfiniteDomainYet(project); 
		if (!haveInfiniteDomain)
			setValue((TransactionalEditingDomain) otherEditingDomain, project, SpecializationModelPackage.eINSTANCE.getProject_InfiniteDomain(), false);
		return haveInfiniteDomain;
	}
	
	public void mainSetRelationFG(RelationFGEditPart rfgep){
		RelationFG thisObject = (RelationFG) ((View)rfgep.getModel()).getElement();
		Project project = (Project) thisObject.eContainer();
		ProjectEditPart pep = (ProjectEditPart) rfgep.getSource().getParent();
		Feature newFather = (Feature) thisObject.getSource().getFather();
		Feature aimFeature = (Feature) thisObject.getTarget();
		
		setFeatureChildFG(rfgep, aimFeature);
		backwardPropagation(pep, newFather);
		forwardPropagation(project, aimFeature);
	}
	
	public void mainUnsetFeature(FeatureEditPart fep){
		Feature thisObject = (Feature) ((View)fep.getModel()).getElement();
		
		Relation relation = CommonCommands.getRelationTo((Project) thisObject.eContainer(), thisObject);
		
				if (relation instanceof RelationFeature){
		
					if (thisObject.getReferenciated().size() != 0){
						takeMyChilds(thisObject.getReferenciated().get(0), thisObject);
					} else if (thisObject.getReferences() != null){
						thisObject.getReferences().getReferenciated().remove(thisObject);
						cascadeDeleting(thisObject);
					} else {
						cascadeDeleting(thisObject);
					}
					setValue((TransactionalEditingDomain) otherEditingDomain, thisObject, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_ELIMINATED);
					CommonCommands.setVisibility(otherEditingDomain, fep, false);
					thisObject.getFather().getChildren().remove(thisObject);
				}else if (relation instanceof RelationFG){
					
					if (thisObject.getReferenciated().size() != 0){
						takeMyChilds(thisObject.getReferenciated().get(0), thisObject);
					} else if (thisObject.getReferences() != null){
						thisObject.getReferences().getReferenciated().remove(thisObject);
						cascadeDeleting(thisObject);
					} else {
						cascadeDeleting(thisObject);
					}
					setValue((TransactionalEditingDomain) otherEditingDomain, thisObject, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_ELIMINATED);
					CommonCommands.setVisibility(otherEditingDomain, fep, false);
					FeatureGroup featureGroupFather = (FeatureGroup) thisObject.getFather();
					featureGroupFather.getChildren().remove(thisObject);
					int lowerBound = featureGroupFather.getLowerBound();
					int upperBound = featureGroupFather.getUpperBound();
					upperBound = Math.min(upperBound, featureGroupFather.getChildren().size());
					featureGroupFather.setUpperBound(upperBound);
					
					
					if ( lowerBound == upperBound && upperBound == featureGroupFather.getChildren().size()){
						eliminateFGChildrenAlive(featureGroupFather);
					}else if ( lowerBound == 0 && upperBound == 1 && upperBound == featureGroupFather.getChildren().size()){
						eliminateFGChildrenOptional(featureGroupFather);
					}
				}
	}
	
	private void cascadeDeleting(specializationModel.Node node){
		Project p = (Project) ((View)myEditPart.getParent().getModel()).getElement();
		for (Object n : node.getChildren()){
			if ( n instanceof Feature && ((Feature)n).getReferenciated().size() > 0){
				List<Feature> referenceOutTree = new ArrayList<Feature>();
				List<Feature> referenceInTree = new ArrayList<Feature>();
				
				for (Feature f : ((Feature)n).getReferenciated()){
					if (imGonnaBeDeleted(f, f)){
						referenceInTree.add(f);
					}else {
						referenceOutTree.add(f);
					}
				}
				
				if (referenceOutTree.size() > 0){
					Feature newMe = referenceOutTree.get(0);
					
					takeMyChilds(newMe, ((Feature)n));
					newMe.getReferenciated().removeAll(referenceInTree);
				} else {
					cascadeDeleting((specializationModel.Node)n);
				}
				
			}else {
				if ( n instanceof Feature && ((Feature)n).getReferences() != null){
					Feature referenciated = ((Feature)n).getReferences();
					if ( !imGonnaBeDeleted(referenciated, referenciated))
						referenciated.getReferenciated().remove(((Feature)n));
				}
				cascadeDeleting((specializationModel.Node) n);
			}
			if (node instanceof Feature) setValue((TransactionalEditingDomain) otherEditingDomain, node, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_ELIMINATED);
			CommonCommands.setVisibility(otherEditingDomain,  myEditPart.findEditPart(myEditPart.getParent(), (EObject) n), false);
		}
	}
	
	private void eliminateFGChildrenOptional(FeatureGroup myFeatureGroup){
		IGraphicalEditPart editPart = (IGraphicalEditPart)myEditPart;
		EList<Feature> nodeList = myFeatureGroup.getChildren();
		
		while (nodeList.size() > 0 ){
			Feature myFeature = nodeList.get(0);
			RelationFG myRelationFG = (RelationFG) CommonCommands.getRelationTo((Project) myFeatureGroup.eContainer(), myFeature);
			RelationFGEditPart myRelationFGEditPart2 = (RelationFGEditPart) CommonCommands.getEPRelation((ProjectEditPart) myEditPart.getParent(), myRelationFG.getTarget()); 
			FeatureEditPart myFeatureEditPart = (FeatureEditPart) editPart.findEditPart(myEditPart.getParent(), myFeatureGroup.getFather());
			grandpaAdoptChildOptional(myRelationFGEditPart2, myFeatureGroup, myFeatureEditPart);
		}
		
		((Feature)myFeatureGroup.getFather()).getChildren().remove(myFeatureGroup);
		FeatureGroupEditPart myFeatureGroupEditPart = (FeatureGroupEditPart) editPart.findEditPart(myEditPart.getParent(), myFeatureGroup);
		CommonCommands.setVisibility(otherEditingDomain, myFeatureGroupEditPart, false);
	}
	
	
	private void eliminateFGChildrenAlive(FeatureGroup myFeatureGroup){
		IGraphicalEditPart editPart = (IGraphicalEditPart)myEditPart;
		EList<Feature> nodeList = myFeatureGroup.getChildren();
		
		while (nodeList.size() > 0 ){
			Feature myFeature = nodeList.get(0);
			RelationFG myRelationFG = (RelationFG) CommonCommands.getRelationTo((Project) myFeatureGroup.eContainer(), myFeature);
			RelationFGEditPart myRelationFGEditPart2 = (RelationFGEditPart) CommonCommands.getEPRelation((ProjectEditPart) myEditPart.getParent(), myRelationFG.getTarget());
			FeatureEditPart myFeatureEditPart = (FeatureEditPart) editPart.findEditPart(myEditPart.getParent(), myFeatureGroup.getFather());
			grandpaAdoptChild(myRelationFGEditPart2, myFeatureGroup, myFeatureEditPart);
		}
		
		((Feature)myFeatureGroup.getFather()).getChildren().remove(myFeatureGroup);
		FeatureGroupEditPart myFeatureGroupEditPart = (FeatureGroupEditPart) editPart.findEditPart(myEditPart.getParent(), myFeatureGroup);
		CommonCommands.setVisibility(otherEditingDomain, myFeatureGroupEditPart, false);
	}
	
	private void grandpaAdoptChild(RelationFGEditPart myEditPart, FeatureGroup myFeatureGroup, FeatureEditPart grandpa){
		
		RelationFG relationFG = (RelationFG) ((View)myEditPart.getModel()).getElement();
		
    	CompoundCommand cc = new CompoundCommand();
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
				((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), ((ConnectionEditPart) myEditPart).getDiagramPreferencesHint()), new EObjectAdapter((EObject)grandpa.getModel()),
				 new EObjectAdapter((EObject)((RelationFGEditPart)myEditPart).getTarget().getModel()), myEditPart.getViewer());
		cc.add(new ICommandProxy(createSubTopicsCmd));
		((ConnectionEditPart) myEditPart).getDiagramEditDomain().getDiagramCommandStack().execute(cc);		
		
		EList<Feature> myChildrenList  = myFeatureGroup.getChildren();
		myChildrenList.remove(relationFG.getTarget());
		SetCommand.create(otherEditingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_Children(), myChildrenList);
				
		// delete the current RelationFeature. The graphical part.
    	DeleteCommand myDeleteCommand = new DeleteCommand(((ConnectionEditPart)myEditPart).getEditingDomain(), (View) myEditPart.getModel());
    	try {
			myDeleteCommand.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// delete the current RelationFeature. The model part.	
    	RemoveCommand.create(otherEditingDomain, relationFG).execute();
	}
	
	private void grandpaAdoptChildOptional(RelationFGEditPart myEditPart, FeatureGroup myFeatureGroup, FeatureEditPart grandpa){
		
		RelationFG relationFG = (RelationFG) ((View)myEditPart.getModel()).getElement();
		
		// create a RelationSelected. 
    	CompoundCommand cc = new CompoundCommand();
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(  SpecializationmodelElementTypes.RelationFeature_4002,
				((IHintedType) SpecializationmodelElementTypes.RelationFeature_4002).getSemanticHint(), ((ConnectionEditPart) myEditPart).getDiagramPreferencesHint()), new EObjectAdapter((EObject)grandpa.getModel()),
				 new EObjectAdapter((EObject)((RelationFGEditPart)myEditPart).getTarget().getModel()), myEditPart.getViewer());
		cc.add(new ICommandProxy(createSubTopicsCmd));
		((ConnectionEditPart) myEditPart).getDiagramEditDomain().getDiagramCommandStack().execute(cc);		
		
		EList<Feature> myChildrenList  = myFeatureGroup.getChildren();
		myChildrenList.remove(relationFG.getTarget());
//		SetCommand.create(otherEditingDomain, myFeatureGroup, SpecializationModelPackage.eINSTANCE.getFeatureGroup_Children(), myChildrenList);
				
		// delete the current RelationFeature. The graphical part.
    	DeleteCommand myDeleteCommand = new DeleteCommand(((ConnectionEditPart)myEditPart).getEditingDomain(), (View) myEditPart.getModel());
    	try {
			myDeleteCommand.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// delete the current RelationFeature. The model part.	
    	RemoveCommand.create(otherEditingDomain, relationFG).execute();
    	
    	
    	Feature target = (Feature) ((View)((RelationFGEditPart)myEditPart).getTarget().getModel()).getElement();
    	Relation relationCreated = CommonCommands.getRelationTo( (Project) target.eContainer(), target  );
    	
    	setValue((TransactionalEditingDomain) otherEditingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), 0);
    	setValue((TransactionalEditingDomain) otherEditingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), 1);
    	setValue((TransactionalEditingDomain) otherEditingDomain, relationCreated, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.OPTIONAL);    	
	}
	
	private void backwardPropagation(ProjectEditPart projectEditPart, Feature feature){
		EditPart relationEditPart = CommonCommands.getEPRelation(projectEditPart, feature);
		
		if (relationEditPart != null){
			Feature nextFeature;
			if (relationEditPart instanceof RelationFeatureEditPart){
				RelationFeature relationFeature = (RelationFeature) ((View)relationEditPart.getModel()).getElement();
				if (!relationFeature.getType().equals(FeatureType.SIMPLE)){
					nextFeature = (Feature) feature.getFather();
					setRelationFeature((RelationFeatureEditPart)relationEditPart, (RelationFeature) ((View)relationEditPart.getModel()).getElement());
					backwardPropagation(projectEditPart, nextFeature);
				}
			}else{
				nextFeature = (Feature) feature.getFather().getFather();
				setFeatureChildFG((RelationFGEditPart) relationEditPart, feature);
				backwardPropagation(projectEditPart, nextFeature);
			}
		}
		
	}
	
	private void forwardPropagation(Project project, Feature feature){
		for (Node n : feature.getChildren()){
			if (n instanceof Feature){
				RelationFeature r = (RelationFeature)CommonCommands.getRelationTo(project, (Feature)n);
				if (r.getType().equals(FeatureType.MANDATORY)){
					setValue( (TransactionalEditingDomain) otherEditingDomain, (Feature) n, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);
					forwardPropagation(project, (Feature) n);
				}
			}
		}
	}
	
	private void setFeatureChildFG(RelationFGEditPart myRelationEditPart, Feature feature){
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
		
		RelationFeature newRelationFeature = (RelationFeature) CommonCommands.getRelationTo((Project)feature.eContainer(), feature);
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
			cascadeDeleting(myFeatureGroup, myFeatureGroupEditPart, myFeatureGroup);
//			CommonCommands.setVisibility(editingDomain, myFeatureGroupEditPart, false);
		}
	}
	
	private void eliminateFGAdoptChild(FeatureGroupEditPart myFeatureGroupEditPart, Feature child, Object grandpa, FeatureType featureType) {
		TransactionalEditingDomain editingDomain = myFeatureGroupEditPart.getEditingDomain();
		RelationFG relationFG = (RelationFG) CommonCommands.getRelationTo((Project) child.eContainer(), child);
		setValue((TransactionalEditingDomain) editingDomain, relationFG, SpecializationModelPackage.eINSTANCE.getRelationFG_Target(), null);
		Feature newFather = (Feature) ((View)grandpa).getElement();
		
		FeatureEditPart childFeatureEditPart = (FeatureEditPart) myFeatureGroupEditPart.findEditPart(myFeatureGroupEditPart.getParent(), child); 
		createRelationFeature(childFeatureEditPart, grandpa,featureType);
		
		EList<Node> childrenList  = new BasicEList<Node>(newFather.getChildren());
		childrenList.remove(((View)myFeatureGroupEditPart.getModel()).getElement());
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
	
	public void mainSetRelationFeature(RelationFeatureEditPart rfep){
		RelationFeature thisObject = (RelationFeature) ((View)rfep.getModel()).getElement();
		Project project = (Project) thisObject.eContainer();
		ProjectEditPart pep = (ProjectEditPart) rfep.getSource().getParent();
		
		setRelationFeature(rfep, thisObject);
		backwardPropagation(pep, thisObject.getSource());
		forwardPropagation(project, thisObject.getTarget());
	}
	
	private void setRelationFeature(RelationFeatureEditPart rfep, RelationFeature thisObject) {
		if (thisObject.getType().equals(FeatureType.SIMPLE)){
			setClonableFeature(rfep);
		}else{
			if (thisObject.getType().equals(FeatureType.OPTIONAL)){
				setValue( (TransactionalEditingDomain) otherEditingDomain, thisObject, SpecializationModelPackage.eINSTANCE.getRelationFeature_LowerBound(), 1);
				setValue( (TransactionalEditingDomain) otherEditingDomain, thisObject, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.MANDATORY);
			}
			setValue( (TransactionalEditingDomain) otherEditingDomain, thisObject.getTarget(), SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);
		}
	}
	
	private void setClonableFeature(RelationFeatureEditPart rfep) {
		final RelationFeature relationFeature = (RelationFeature) ((View)rfep.getModel()).getElement();
		final EditingDomain editingDomain =  rfep.getEditingDomain();
		
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
		clonableFeature.getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		specializationModel.Feature newFeature = (Feature) ((View)topicViewAdapter.getAdapter(View.class)).getElement();

		setFeatureValues(myFeature, fatherFeature, newFeature);

		int upperBound = relationFeature.getUpperBound() -1;
		setValue((TransactionalEditingDomain) editingDomain, relationFeature, SpecializationModelPackage.eINSTANCE.getRelationFeature_UpperBound(), upperBound);
			
		if (upperBound == 1)
				setValue((TransactionalEditingDomain) editingDomain, relationFeature, SpecializationModelPackage.eINSTANCE.getRelationFeature_Type(), FeatureType.OPTIONAL);
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
	private void setFeatureValues(Feature myFeature, Feature fatherFeature, Feature newFeature) {
		setValue((TransactionalEditingDomain) otherEditingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_Name(), getNewName(myFeature));
		setValue((TransactionalEditingDomain) otherEditingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_RealName(), ((Feature)myFeature).getName());
		setValue((TransactionalEditingDomain) otherEditingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_SELECTED);
		setValue((TransactionalEditingDomain) otherEditingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getNode_Father(), fatherFeature);

		EList<Node> childrenList = new BasicEList<Node>(fatherFeature.getChildren());
		childrenList.add(newFeature);
		setValue((TransactionalEditingDomain) otherEditingDomain, fatherFeature,SpecializationModelPackage.eINSTANCE.getFeature_Children(), childrenList);
		
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
		setValue((TransactionalEditingDomain) otherEditingDomain, newFeature, SpecializationModelPackage.eINSTANCE.getFeature_References(), newReference);
		setValue((TransactionalEditingDomain) otherEditingDomain, newReference, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), referenciatedList);
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
	
	private boolean imGonnaBeDeleted(Node mainFeature, specializationModel.Node node){
		List<specializationModel.Node> ancestros = new ArrayList<specializationModel.Node>();
		specializationModel.Node auxNode = node.getFather();
		while (auxNode != null ){
			ancestros.add(auxNode);
			auxNode = auxNode.getFather();
		}
		
		return ancestros.contains(mainFeature);
	}
	
	private void takeMyChilds(Feature newSource, Feature oldSource) {
		// TODO Auto-generated method stub
		Project p = (Project) ((View)myEditPart.getParent().getModel()).getElement();
		FeatureEditPart featureEditPart = (FeatureEditPart) myEditPart.findEditPart(myEditPart.getParent(), newSource);
		for (specializationModel.Node node : oldSource.getChildren()){
			EReference eReference = null;
			Relation relation = CommonCommands.getRelationTo(p, node);
			EditPart editPart =  CommonCommands.getEPRelation((ProjectEditPart) myEditPart.getParent(), node);
			if (editPart instanceof RelationFGEditPart){
				eReference = SpecializationModelPackage.eINSTANCE.getRelationFG_Source();
			}else if (editPart instanceof RelationFeatureEditPart){
				eReference = SpecializationModelPackage.eINSTANCE.getRelationFeature_Source();
			}
			EdgeImpl o = (EdgeImpl) editPart.getModel();
			o.setSource((View) ((GraphicalEditPart) featureEditPart).getModel());
			
			EList<Node> newChildrenList = new BasicEList<Node>(newSource.getChildren());
			newChildrenList.add(node);
			setValue((TransactionalEditingDomain) otherEditingDomain, newSource, SpecializationModelPackage.eINSTANCE.getFeature_Children(), newChildrenList);
			setValue((TransactionalEditingDomain) otherEditingDomain, node, SpecializationModelPackage.eINSTANCE.getNode_Father(), newSource);
			setValue((TransactionalEditingDomain) otherEditingDomain, relation, eReference, newSource);
		}
		setValue((TransactionalEditingDomain) otherEditingDomain, oldSource, SpecializationModelPackage.eINSTANCE.getFeature_Children(), new BasicEList<Node>());
		
		List<Feature> referenciated = new BasicEList<Feature>(oldSource.getReferenciated());
		
		setValue((TransactionalEditingDomain) otherEditingDomain, oldSource, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), new BasicEList<Node>());
		setValue((TransactionalEditingDomain) otherEditingDomain, oldSource, SpecializationModelPackage.eINSTANCE.getFeature_References(), newSource);
		
		referenciated.remove(newSource);
		referenciated.addAll(newSource.getReferenciated());
		setValue((TransactionalEditingDomain) otherEditingDomain, newSource, SpecializationModelPackage.eINSTANCE.getFeature_References(), null);
		setValue((TransactionalEditingDomain) otherEditingDomain, newSource, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), referenciated);

		for (Feature f : referenciated ) setValue((TransactionalEditingDomain) otherEditingDomain, f, SpecializationModelPackage.eINSTANCE.getFeature_References(), newSource);
	}	

	private void cascadeDeleting(Node mainFeature, EditPart editPart, specializationModel.Node node){
		for (Object n : node.getChildren()){
			EditPart nodeEditPart =  ((GraphicalEditPart) editPart).findEditPart(myEditPart.getParent(), (EObject) n);

			if ( n instanceof Feature && ((Feature)n).getReferenciated().size() > 0){
				List<Feature> referenceOutTree = new ArrayList<Feature>();
				List<Feature> referenceInTree = new ArrayList<Feature>();
				
				for (Feature f : ((Feature)n).getReferenciated()){
					if (imGonnaBeDeleted(mainFeature, f)){
						referenceInTree.add(f);
					}else {
						referenceOutTree.add(f);
					}
				}
				
				if (referenceOutTree.size() > 0){
					Feature newMe = referenceOutTree.get(0);
					
					takeMyChilds(newMe, ((Feature)n));
					EList<Feature> newReferences = new BasicEList<Feature>(newMe.getReferenciated());
					newReferences.removeAll(referenceInTree);
					setValue((TransactionalEditingDomain) otherEditingDomain, newMe, SpecializationModelPackage.eINSTANCE.getFeature_Referenciated(), newReferences);
					newMe.getReferenciated().removeAll(referenceInTree);
				} else {
					cascadeDeleting(mainFeature, nodeEditPart, (specializationModel.Node)n);
				}
				
			}else {
				if ( n instanceof Feature && ((Feature)n).getReferences() != null){
					Feature referenciated = ((Feature)n).getReferences();
					if ( !imGonnaBeDeleted(mainFeature, referenciated))
						referenciated.getReferenciated().remove(((Feature)n));
				}
				cascadeDeleting(mainFeature, nodeEditPart, (specializationModel.Node) n);
			}
					
		}
		if (node instanceof Feature)	setValue((TransactionalEditingDomain) otherEditingDomain, (Feature)node, SpecializationModelPackage.eINSTANCE.getFeature_State(), ConfigState.USER_ELIMINATED);
		CommonCommands.setVisibility(otherEditingDomain, editPart, false);
	}
	
	
}
