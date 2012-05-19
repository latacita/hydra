package featureModel.provider;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import featureModel.FeatureGroup;
import featureModel.FeatureGroupType;
import featureModel.FeatureModelPackage;

public class SetFeatureGroupBound extends CompoundCommand{
	protected FeatureGroup featureGroup;
	protected Object value;
	protected EditingDomain domain;
	
	
	public SetFeatureGroupBound(EditingDomain domain, FeatureGroup featureGroup,
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
		FeatureGroupType valueType;
		
		
		if (featureGroup.getLowerBound() == 1 && featureGroup.getUpperBound() == 1){
			valueType = FeatureGroupType.XORGROUP;
		}else if (featureGroup.getLowerBound() == 1 && featureGroup.getUpperBound() == featureGroup.getChildren().size()){
			valueType = FeatureGroupType.ORGROUP;
		}else {
			valueType = FeatureGroupType.SIMPLEGROUP;
		}
		
		appendAndExecute(new SetCommand(domain, featureGroup, FeatureModelPackage.eINSTANCE.getFeatureGroup_Type(), valueType));
		
	}

}
