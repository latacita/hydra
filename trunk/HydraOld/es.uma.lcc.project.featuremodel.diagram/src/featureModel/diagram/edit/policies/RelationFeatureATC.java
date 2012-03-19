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
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

import featureModel.FeatureModelPackage;
import featureModel.FeatureType;
import featureModel.RelationFeature;
import featureModel.diagram.edit.parts.OptionalLineDescriptor;
import featureModel.diagram.edit.parts.MandatoryLineDescriptor;
import featureModel.diagram.edit.parts.TargetDecorable;
import featureModel.diagram.edit.parts.RelationFeatureLowerBoundUpperBoundEditPart;

public class RelationFeatureATC extends AbstractTransactionalCommand {
	
	EditPart myEditPart;
	
	public RelationFeatureATC(TransactionalEditingDomain editingDomain, EditPart myEditPart) {
		super(editingDomain, "a message", null);
		this.myEditPart =  myEditPart;
	}
	
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// TODO Auto-generated method stub
		
		IGraphicalEditPart editPart = (IGraphicalEditPart)myEditPart;
    	RelationFeature thisObject = (RelationFeature) ((View)editPart.getModel()).getElement();
    	TargetDecorable targetDecoration = (TargetDecorable)myEditPart;
    	
    	FeatureType oldType = thisObject.getType();
    	EAttribute featureLowerBound = FeatureModelPackage.eINSTANCE.getRelationFeature_LowerBound();
    	EAttribute featureUpperBound = FeatureModelPackage.eINSTANCE.getRelationFeature_UpperBound();
    	EAttribute featureType = FeatureModelPackage.eINSTANCE.getRelationFeature_Type();
    	
    	RelationFeatureLowerBoundUpperBoundEditPart myLabel = (RelationFeatureLowerBoundUpperBoundEditPart)editPart.getChildren().get(0);
    	EditingDomain editingDomain = editPart.getEditingDomain();
    	
    	Object newLowerBound, newUpperBound, newType;
    	
    	switch (oldType.getValue()){
    	case featureModel.FeatureType.OPTIONAL_VALUE:
    		newLowerBound = 1;
    		newUpperBound = 1; // si viene de optional no har�a falta...
    		newType = featureModel.FeatureType.MANDATORY;
    		
    		
    		LineStyle myStyle = (LineStyle) ((org.eclipse.gmf.runtime.notation.Edge)myEditPart.getModel()).getStyle(NotationPackage.eINSTANCE.getLineStyle());
    		
    		myLabel.setVisible(false);
    		
    		targetDecoration.setTargetDecoration(new MandatoryLineDescriptor().createTargetDecoration());
    		break;
    	case featureModel.FeatureType.MANDATORY_VALUE:
    		newLowerBound = 0; // si viene de mandatory no har�a falta...
    		newUpperBound = 0;
    		newType = featureModel.FeatureType.SIMPLE;
    		
    		myLabel.setVisible(true);
    		targetDecoration.setTargetDecoration(null);
    		break;
    	case featureModel.FeatureType.SIMPLE_VALUE:
    		newLowerBound = 0;
    		newUpperBound = 1;
    		newType = featureModel.FeatureType.OPTIONAL;
    		
    		myLabel.setVisible(false);
    		
    		targetDecoration.setTargetDecoration(new OptionalLineDescriptor().createTargetDecoration());
    		break;
    	default:
    		newLowerBound = 100;
    		newUpperBound = 101;
    		newType = featureModel.FeatureType.MANDATORY;
    	}
    	
    	SetCommand.create(editingDomain, thisObject, featureLowerBound, newLowerBound).execute();
    	SetCommand.create(editingDomain, thisObject, featureUpperBound, newUpperBound).execute();
    	SetCommand.create(editingDomain, thisObject, featureType, newType).execute();
    	
		return CommandResult.newOKCommandResult();
	}

}
