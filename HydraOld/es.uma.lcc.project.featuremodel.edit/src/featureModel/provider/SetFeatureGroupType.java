package featureModel.provider;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import featureModel.FeatureGroup;
import featureModel.FeatureGroupType;
import featureModel.FeatureModelPackage;

public class SetFeatureGroupType extends CompoundCommand{
	protected FeatureGroup featureGroup;
	protected Object value;
	protected EditingDomain domain;
	
	
	public SetFeatureGroupType(EditingDomain domain, FeatureGroup featureGroup,
			EStructuralFeature feature, Object value) {
		super();
		this.featureGroup = featureGroup;
		this.value = value;
		this.domain = domain;
		append(new SetCommand(domain, featureGroup, feature, value));
		// TODO Auto-generated constructor stub
	}
	
//	public void doExecute(){
//		RelationFeature relationFeature = (RelationFeature)owner;
//		if (relationFeature.getLowerBound() == 1 && relationFeature.getUpperBound() == 1){
//			relationFeature.setType(FeatureType.MANDATORY);
//		}else if (relationFeature.getLowerBound() == 0 && relationFeature.getUpperBound() == 1){
//			relationFeature.setType(FeatureType.OPTIONAL);
//		}else {
//			relationFeature.setType(FeatureType.SIMPLE);
//		}
//		
//		
//		super.doExecute();
//	}
	
	public void execute(){
		super.execute();
		int valueLowerBound, valueUpperBound;
		
		if (featureGroup.getType() == FeatureGroupType.XORGROUP){
			valueLowerBound = valueUpperBound = 1;
		}else if (featureGroup.getType() == FeatureGroupType.ORGROUP){
			valueLowerBound = 1;
			valueUpperBound = featureGroup.getChildren().size();
		}else {
			valueLowerBound = 0;
			valueUpperBound = 0;
		}
		
		appendAndExecute(new SetCommand(domain, featureGroup, FeatureModelPackage.eINSTANCE.getFeatureGroup_LowerBound(), valueLowerBound));
		appendAndExecute(new SetCommand(domain, featureGroup, FeatureModelPackage.eINSTANCE.getFeatureGroup_UpperBound(), valueUpperBound));
	}

}
