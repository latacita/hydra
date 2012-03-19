package specializationModel.diagram.edit.policies;

import java.util.Iterator;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;

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
import specializationModel.diagram.edit.parts.RelationFGEditPart;
import specializationModel.diagram.providers.SpecializationmodelElementTypes;

public class DeleteChildren extends AbstractTransactionalCommand {
	
	DestroyElementRequest req;
	EditingDomain otherEditingDomain;
	private EditPart myEditPart;
		
	public DeleteChildren(TransactionalEditingDomain editingDomain, DestroyElementRequest req, EditPart myEditPart) {
		super(editingDomain, "a message", null);
		this.req =  req;
		this.otherEditingDomain = editingDomain;
		this.myEditPart = myEditPart;
	}
	
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// TODO Auto-generated method stub
		
		EObject thisObject = req.getElementToDestroy();
		
		
		if (thisObject instanceof Feature && ((Feature)thisObject).getFather() != null && ((Feature)thisObject).getFather() instanceof FeatureGroup){
			FeatureGroup myFather = (FeatureGroup) ((Feature)thisObject).getFather();
        	EAttribute fgUpperBound = SpecializationModelPackage.eINSTANCE.getFeatureGroup_UpperBound();
        	int upperBoundValue = Math.min(myFather.getUpperBound(), myFather.getChildren().size() - 1);
        	cascadeDeleting((Node) thisObject);
			SetCommand.create(otherEditingDomain, myFather, fgUpperBound, upperBoundValue).execute();
			if ( upperBoundValue == myFather.getLowerBound() && upperBoundValue == myFather.getChildren().size()) 
				eliminateFGChildrenAlive(myFather);
		}else {
			CompoundCommand cc = new CompoundCommand();
//			cascadeDeleting((Node) thisObject);
//			cc.unwrap();
//			cc.execute();
		}
		
		return CommandResult.newOKCommandResult();
	}
	
	private void eliminateFGChildrenAlive(FeatureGroup myFeatureGroup){
		IGraphicalEditPart editPart = (IGraphicalEditPart)myEditPart;
		EList<Feature> nodeList = myFeatureGroup.getChildren();
		
		while (nodeList.size() > 0 ){
			Feature myFeature = nodeList.get(0);
			RelationFG myRelationFG = (RelationFG) getRelation((Project) myFeatureGroup.eContainer(), myFeatureGroup, myFeature);
			RelationFGEditPart myRelationFGEditPart2 = getRelationFGEditPart((ProjectEditPart) myEditPart.getParent(), myRelationFG);
			FeatureEditPart myFeatureEditPart = (FeatureEditPart) editPart.findEditPart(myEditPart.getParent(), myFeatureGroup.getFather());
			grandpaAdoptChild(myRelationFGEditPart2, myFeatureGroup, myFeatureEditPart);
		}
		
		((Feature)myFeatureGroup.getFather()).getChildren().remove(myFeatureGroup);
		FeatureGroupEditPart myFeatureGroupEditPart = (FeatureGroupEditPart) editPart.findEditPart(myEditPart.getParent(), myFeatureGroup);
		// delete the current RelationFeature. The graphical part.
    	DeleteCommand myDeleteCommand = new DeleteCommand(myFeatureGroupEditPart.getEditingDomain(), (View)myFeatureGroupEditPart.getModel());
    	try {
			myDeleteCommand.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		// delete the current RelationFeature. The model part.
		RemoveCommand.create(myFeatureGroupEditPart.getEditingDomain(), myFeatureGroup).execute();
//		cascadeDeleting(myFeatureGroup);
	}
	private RelationFGEditPart getRelationFGEditPart(ProjectEditPart myProjectEP, RelationFG myRelationFG){
		RelationFGEditPart result = null;
		
		Iterator<?> iterator = myProjectEP.getConnections().iterator();
		while (result == null && iterator.hasNext()){
			EditPart aux = (EditPart) iterator.next();
			if (((View)aux.getModel()).getElement().equals(myRelationFG)) result = (RelationFGEditPart) aux;
		}		
		return result;
	}
	private void grandpaAdoptChild(RelationFGEditPart myEditPart, FeatureGroup myFeatureGroup, FeatureEditPart grandpa){
		
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
	
	private void cascadeDeleting(Node object){

		if (object instanceof Feature){
			EList<Node> nodeList = ((Feature)object).getChildren();
			
			while (nodeList.size()> 0){
				cascadeDeleting(nodeList.get(0));
			}
		}else{ // it's a FeatureGroup
			EList<Feature> nodeList = ((FeatureGroup)object).getChildren();
			
			while (nodeList.size()> 0){
				cascadeDeleting(nodeList.get(0));
			}
		}
		Node myFather = object.getFather();
		if (myFather != null){
			if (myFather instanceof Feature){
				((Feature) myFather).getChildren().remove(object);
			}else {
				((FeatureGroup) myFather).getChildren().remove(object);
			}
		}
		Object removeCommand = RemoveCommand.create(otherEditingDomain, object);
		if (((Node)object).eContainer() != null && ((AbstractOverrideableCommand) removeCommand).canExecute())	
			((AbstractOverrideableCommand) removeCommand).execute();

	}
	
	private void cascadeDeleting2(Node object, CompoundCommand cc){

		for (Object n : object.getChildren()){
			cascadeDeleting2((Node)n, cc);
		}

//		Node myFather = object.getFather();
//		if (myFather != null){
//			if (myFather instanceof Feature){
//				((Feature) myFather).getChildren().remove(object);
//			}else {
//				((FeatureGroup) myFather).getChildren().remove(object);
//			}
//		}
		
//		DestroyElementRequest myDER = new DestroyElementRequest(  getEditingDomain(), object, false);
//		IElementType context = ElementTypeRegistry.getInstance().getElementType(myDER.getEditHelperContext());
//		ICommand command = context.getEditCommand(myDER);
//		cc.add(new ICommandProxy(command));
//		if (command != null && command.canExecute()) { 
//			
//			try {
//				command.execute(new NullProgressMonitor(), null);
//			} catch (ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
////			getDiagramCommandStack().execute(new ICommandProxy(command), new NullProgressMonitor()); 
//		}
//		Command removeCommand = RemoveCommand.create(otherEditingDomain, object);
		DestroyElementRequest myDER = new DestroyElementRequest(getEditingDomain(), object, false);
//		cc.add(new ICommandProxy(removeCommand));
		cc.add(new ICommandProxy(new DestroyElementCommand(myDER)));
//		Object algo = ((Node)object).eContainer();
//		if (((Node)object).eContainer() != null && ((AbstractOverrideableCommand) removeCommand).canExecute())	
//			((AbstractOverrideableCommand) removeCommand).execute();

	}
//	protected org.eclipse.gef.commands.Command getDestroyElementCommand(View view) {
//		EditPart editPart = (EditPart) getHost().getViewer()
//				.getEditPartRegistry().get(view);
//		DestroyElementRequest request = new DestroyElementRequest(
//				getEditingDomain(), false);
//		return editPart.getCommand(new EditCommandRequestWrapper(request,
//				Collections.EMPTY_MAP));
//	}
	
	
}
