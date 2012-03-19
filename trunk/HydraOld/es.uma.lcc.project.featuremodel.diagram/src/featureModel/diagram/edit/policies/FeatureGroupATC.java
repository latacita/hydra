package featureModel.diagram.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

import featureModel.FeatureGroup;
import featureModel.FeatureGroupType;
import featureModel.FeatureModelPackage;
import featureModel.diagram.edit.parts.FeatureGroupEditPart;
import featureModel.diagram.edit.parts.FeatureGroupLowerBoundUpperBoundEditPart;

public class FeatureGroupATC extends AbstractTransactionalCommand {
	
	EditPart myEditPart;
	
	public FeatureGroupATC(TransactionalEditingDomain editingDomain, EditPart myEditPart) {
		super(editingDomain, "a message", null);
		this.myEditPart =  myEditPart;
	}
	
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		IGraphicalEditPart editPart = (IGraphicalEditPart)myEditPart;
    	FeatureGroup thisObject = (FeatureGroup) ((View)editPart.getModel()).getElement();
    	
    	FeatureGroupType oldType = thisObject.getType();
    	EAttribute featureLowerBound = FeatureModelPackage.eINSTANCE.getFeatureGroup_LowerBound();
    	EAttribute featureUpperBound = FeatureModelPackage.eINSTANCE.getFeatureGroup_UpperBound();
    	EAttribute featureType = FeatureModelPackage.eINSTANCE.getFeatureGroup_Type();
    	
    	FeatureGroupLowerBoundUpperBoundEditPart myLabel = (FeatureGroupLowerBoundUpperBoundEditPart)editPart.getChildren().get(0);
    	EditingDomain editingDomain = editPart.getEditingDomain();
    	Object newLowerBound, newUpperBound, newType;
    	
    	switch (oldType.getValue()){
    	case featureModel.FeatureGroupType.XORGROUP_VALUE:
    		newLowerBound = 1;
    		newUpperBound = (thisObject.getChildren() == null) ? 0 : thisObject.getChildren().size();
    		newType = featureModel.FeatureGroupType.ORGROUP;
    		
    		((FeatureGroupEditPart)myEditPart).setFullFGFigure();
    		
    		myLabel.setVisible(false);
    		break;
    	case featureModel.FeatureGroupType.ORGROUP_VALUE:
    		newLowerBound = 0; // si viene de mandatory no har�a falta...
    		newUpperBound = 0;
    		newType = featureModel.FeatureGroupType.SIMPLEGROUP;
    		
    		((FeatureGroupEditPart)myEditPart).setEmptyFGFigure();
    		myLabel.setVisible(true);
    		break;
    	case featureModel.FeatureGroupType.SIMPLEGROUP_VALUE:
    		newLowerBound = 1;
    		newUpperBound = 1;
    		newType = featureModel.FeatureGroupType.XORGROUP;
    		((FeatureGroupEditPart)myEditPart).setEmptyFGFigure();
    		myLabel.setVisible(false);
    		break;
    	default:
    		newLowerBound = 100;
    		newUpperBound = 101;
    		newType = featureModel.FeatureGroupType.XORGROUP;
    	}    	
    	
    	SetCommand.create(editingDomain, thisObject, featureLowerBound, newLowerBound).execute();
    	SetCommand.create(editingDomain, thisObject, featureUpperBound, newUpperBound).execute();
    	SetCommand.create(editingDomain, thisObject, featureType, newType).execute();
    	
		return CommandResult.newOKCommandResult();
	}

}
