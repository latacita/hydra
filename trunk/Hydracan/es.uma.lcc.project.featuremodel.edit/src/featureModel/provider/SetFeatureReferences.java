package featureModel.provider;

import java.util.ArrayList;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import featureModel.Feature;
import featureModel.FeatureModelPackage;

public class SetFeatureReferences extends CompoundCommand{
	protected Feature myFeature;
	protected Object value;
	protected EditingDomain domain;
	
	
	public SetFeatureReferences(EditingDomain domain, Feature aFeature,
			EStructuralFeature feature, Object value) {
		super();
		this.myFeature = aFeature;
		this.value = value;
		this.domain = domain;
		append(new SetCommand(domain, aFeature, feature, value));
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		Feature oldReference = myFeature.getReferences();
		
		if ( oldReference != null){
			EList<Feature> oldReference_Referenciates = new BasicEList<Feature>(oldReference.getReferenciated());
			oldReference_Referenciates.remove(myFeature);
			
			appendAndExecute(new SetCommand(domain, oldReference, FeatureModelPackage.eINSTANCE.getFeature_Referenciated(), oldReference_Referenciates));
		}
		
		if (value != null) ((Feature)value).getReferenciated().add(myFeature);
		
		
//		FeatureType valueType;
//		
//		if ()
//		
//		if (myFeature.getLowerBound() == 1 && myFeature.getUpperBound() == 1){
//			valueType = FeatureType.MANDATORY;
//		}else if (myFeature.getLowerBound() == 0 && myFeature.getUpperBound() == 1){
//			valueType = FeatureType.OPTIONAL;
//		}else {
//			valueType = FeatureType.SIMPLE;
//		}
//		
//		appendAndExecute(new SetCommand(domain, myFeature, FeatureModelPackage.eINSTANCE.getRelationFeature_Type(), valueType));
		super.execute();
	}

}
