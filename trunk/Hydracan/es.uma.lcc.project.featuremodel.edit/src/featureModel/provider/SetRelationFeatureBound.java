package featureModel.provider;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import featureModel.FeatureModelPackage;
import featureModel.FeatureType;
import featureModel.RelationFeature;

public class SetRelationFeatureBound extends CompoundCommand{
	protected RelationFeature relationFeature;
	protected Object value;
	protected EditingDomain domain;
	
	
	public SetRelationFeatureBound(EditingDomain domain, RelationFeature relationFeature,
			EStructuralFeature feature, Object value) {
		super();
		this.relationFeature = relationFeature;
		this.value = value;
		this.domain = domain;
		append(new SetCommand(domain, relationFeature, feature, value));
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
		FeatureType valueType;
		
		
		if (relationFeature.getLowerBound() == 1 && relationFeature.getUpperBound() == 1){
			valueType = FeatureType.MANDATORY;
		}else if (relationFeature.getLowerBound() == 0 && relationFeature.getUpperBound() == 1){
			valueType = FeatureType.OPTIONAL;
		}else {
			valueType = FeatureType.SIMPLE;
		}
		
		appendAndExecute(new SetCommand(domain, relationFeature, FeatureModelPackage.eINSTANCE.getRelationFeature_Type(), valueType));
		
	}

}
