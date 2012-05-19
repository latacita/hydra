package specializationModel.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;

import choco.kernel.model.variables.integer.IntegerVariable;

import specializationModel.ConfigState;
import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.FeatureType;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.RelationFG;
import specializationModel.RelationFeature;
import specializationModel.SpecializationModelPackage;
import specializationModel.diagram.edit.statics.CommonCommands;
import specializationModel.diagram.edit.statics.PunisherTools;
import specializationModel.diagram.providers.SpecializationmodelElementTypes;
import specializationModel.diagram.validator.ChocoValidator;

public class FeatureATC extends AbstractTransactionalCommand {

	FeatureEditPart myEditPart;
	EditingDomain otherEditingDomain;
	public FeatureATC(TransactionalEditingDomain editingDomain, EditPart myEditPart) {
		super(editingDomain, "a message", null);
		otherEditingDomain = editingDomain;
		this.myEditPart =  (FeatureEditPart) myEditPart;
	}

	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// TODO Auto-generated method stub

		FeatureEditPart editPart = (FeatureEditPart)myEditPart;
		Feature thisObject = (Feature) ((View)editPart.getModel()).getElement();
		Relation relation = CommonCommands.getRelationTo((Project) thisObject.eContainer(), thisObject);
		Project project = (Project) thisObject.eContainer();
		if (thisObject.getState().equals(ConfigState.UNDECIDED) && relation != null && !((relation instanceof RelationFeature) && ((RelationFeature)relation).getType().equals(FeatureType.MANDATORY))){

			ProjectEditPart pep = (ProjectEditPart) editPart.getParent();
			if (!project.isInfiniteDomain()){
				ChocoValidator cv = pep.getMyChocoValidator();

				if (cv.canValidate()){

					IntegerVariable iv = (IntegerVariable) thisObject.getIntegerVariable();
					cv.unselectFeatureConstraint(iv);
					cv.validate();
					pep.executePunishment();
				}
			}else{
				PunisherTools pt = new PunisherTools(myEditPart, otherEditingDomain);
				
				pt.mainUnsetFeature(myEditPart);
				if (!pt.checkInfiniteDomain(project)){
					ChocoValidator cv = pep.reloadChocoValidator();
					cv.validate();
					pep.executePunishment();
				}
			}

		}
		return CommandResult.newOKCommandResult();
	}
	
}
