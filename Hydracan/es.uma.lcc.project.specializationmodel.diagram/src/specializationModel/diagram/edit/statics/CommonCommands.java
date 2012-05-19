package specializationModel.diagram.edit.statics;

import java.util.Iterator;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.notation.View;

import specializationModel.Relation;
import specializationModel.RelationFeature;
import specializationModel.diagram.edit.parts.ProjectEditPart;

public class CommonCommands {
	
	
	public static specializationModel.Relation getRelationTo(specializationModel.Project project, specializationModel.Node target){
		specializationModel.Relation result = null;

		Iterator<?> iterator = project.getRelations().iterator();
		while (result == null && iterator.hasNext()){
			specializationModel.Relation aux = (specializationModel.Relation) iterator.next();
			if (aux.getTarget() != null && aux.getTarget().equals(target))  result = aux;
		}		
		return result;

	}
	
	public static specializationModel.RelationFeature getRelationFeatureTo(specializationModel.Project project, specializationModel.Node target){
		specializationModel.RelationFeature result = null;

		Iterator<?> iterator = project.getRelations().iterator();
		while (result == null && iterator.hasNext()){
			specializationModel.Relation aux = (specializationModel.Relation) iterator.next();
			if (aux instanceof specializationModel.RelationFeature && aux.getTarget() != null && aux.getTarget().equals(target))  result = (RelationFeature) aux;
		}		
		return result;

	}
	
	public static EditPart getEPRelation(ProjectEditPart project, specializationModel.Node target){
		EditPart result = null;
		Iterator<?> iterator = project.getConnections().iterator();
		while (result == null && iterator.hasNext()){
			ConnectionEditPart aux = (ConnectionEditPart) iterator.next();
			Relation r = (Relation) ((View)aux.getModel()).getElement();

			if (r.getTarget() != null && r.getTarget().equals(target)) result = aux;
		}		
		return result;
	}
	
	public static void setVisibility(final EditingDomain editingDomain, EditPart editPart , final boolean visibility) {
		final org.eclipse.gmf.runtime.notation.Node node = (org.eclipse.gmf.runtime.notation.Node) editPart.getModel();
		editingDomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) editingDomain){
			protected void doExecute(){
				node.setVisible(visibility);
			}
		});
	}
}
