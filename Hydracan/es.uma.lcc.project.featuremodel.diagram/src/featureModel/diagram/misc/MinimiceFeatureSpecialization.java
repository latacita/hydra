package featureModel.diagram.misc;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import specializationModel.ConfigState;
import specializationModel.Feature;
import specializationModel.FeatureType;
import specializationModel.Node;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.RelationFeature;
import specializationModel.SpecializationModelFactory;
import featureModel.diagram.validator.ConfigurationSetFM;
import featureModel.diagram.validator.Feature4ValidatorFM;

public class MinimiceFeatureSpecialization {

	private ConfigurationSetFM chosen;

	public MinimiceFeatureSpecialization(ConfigurationSetFM ivi){
		chosen = ivi;
	}

	private Feature copyFeature(Node father, featureModel.Feature myFeature){
		Feature feature = SpecializationModelFactory.eINSTANCE.createFeature();
		feature.setFather(father);
		feature.setName(myFeature.getName());
		feature.setRealName(myFeature.getName());
		feature.setState(ConfigState.USER_SELECTED);
		myFeature.setSpecializationNode(feature);

		return feature;
	}

	public Project transform (){
		Project myProject = SpecializationModelFactory.eINSTANCE.createProject();

		Feature4ValidatorFM f4v = chosen.getRoot();

		nextFeature(null, f4v, myProject.getFeatures(), myProject.getRelations());
		return myProject;
	}

	private Feature nextFeature(Feature father, Feature4ValidatorFM f4v, EList<Node> myList, EList<Relation> relationList){
		featureModel.Feature me = f4v.getFeature();
		Feature myNode = null;

		if ( chosen.isSelected(f4v)){

			myNode = copyFeature(father, me);
			myList.add(myNode);

			List children  = myNode.getChildren();
			for (Feature4ValidatorFM f4vChild : f4v.getChildren()){
				Feature f = nextFeature(myNode, f4vChild, myList, relationList);
				if (f != null){
					children.add(f);
					RelationFeature newRelation = SpecializationModelFactory.eINSTANCE.createRelationFeature();
					newRelation.setLowerBound(1);
					newRelation.setType(FeatureType.MANDATORY);
					newRelation.setSource(myNode);
					newRelation.setTarget(f);
					relationList.add(newRelation);
				}
			}
		}

		return myNode;
	}
}

