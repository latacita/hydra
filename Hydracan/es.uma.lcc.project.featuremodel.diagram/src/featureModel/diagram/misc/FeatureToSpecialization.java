package featureModel.diagram.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.View;

import specializationModel.FeatureType;
import specializationModel.Node;
import specializationModel.Project;
import specializationModel.RelationFeature;

import featureModel.Feature;
import featureModel.FeatureGroup;

public class FeatureToSpecialization {

	
	private void createRelations(featureModel.diagram.edit.parts.ProjectEditPart project, specializationModel.Project newProject){
		System.out.println("Cuidar por OCL que no pueda ser upperBound= lowerBound = 0");
		
		featureModel.Project oldModel = (featureModel.Project)((View)project.getModel()).getElement();
		EList<featureModel.Relation> relations = oldModel.getRelations();
		EList<specializationModel.Relation> relationList = newProject.getRelations();
		specializationModel.Relation newRelation = null;
		specializationModel.Node sourceFeature = null;
		specializationModel.Node targetFeature = null;
		for (featureModel.Relation rel : relations){
			sourceFeature = rel.getSource().getSpecializationNode();
			targetFeature = rel.getTarget().getSpecializationNode();
			
			
			if ( rel instanceof featureModel.RelationFG){
				newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFG();
			}else if (rel instanceof featureModel.RelationFeature){

				switch (((featureModel.RelationFeature) rel).getType().getValue()){
				case featureModel.FeatureType.MANDATORY_VALUE:
//					newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationSelected();
					newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFeature();
					((RelationFeature)newRelation).setType(specializationModel.FeatureType.MANDATORY);
					((RelationFeature)newRelation).setLowerBound(((featureModel.RelationFeature) rel).getLowerBound());
					((RelationFeature)newRelation).setUpperBound(((featureModel.RelationFeature) rel).getUpperBound());
					((specializationModel.Feature)targetFeature).setState(((specializationModel.Feature)sourceFeature).getState());
					break;
				case featureModel.FeatureType.OPTIONAL_VALUE:
					newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFeature();
					((RelationFeature)newRelation).setType(specializationModel.FeatureType.OPTIONAL);
					((RelationFeature)newRelation).setLowerBound(((featureModel.RelationFeature) rel).getLowerBound());
					((RelationFeature)newRelation).setUpperBound(((featureModel.RelationFeature) rel).getUpperBound());
					break;
				case featureModel.FeatureType.SIMPLE_VALUE:
					int lowerBound = ((featureModel.RelationFeature) rel).getLowerBound();
					int upperBound = ((featureModel.RelationFeature) rel).getUpperBound();

					if ( lowerBound < 0){
						newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFeature();
						((RelationFeature)newRelation).setType(specializationModel.FeatureType.SIMPLE);
						newProject.setInfiniteDomain(true);
						((RelationFeature)newRelation).setLowerBound(lowerBound);
						((RelationFeature)newRelation).setUpperBound(upperBound);
					} else if ( lowerBound != upperBound){
						if (upperBound < 0) newProject.setInfiniteDomain(true);
						newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFeature();
						upperBound -= lowerBound;
						specializationModel.FeatureType featureType = upperBound == 1 ? specializationModel.FeatureType.OPTIONAL : specializationModel.FeatureType.SIMPLE;
						((RelationFeature)newRelation).setType(featureType);
						for ( ;lowerBound > 0; lowerBound--){
							createReferenceNode((specializationModel.Feature)targetFeature, (specializationModel.Feature)sourceFeature, relationList, newProject.getFeatures());
						}	
						((RelationFeature)newRelation).setLowerBound(lowerBound);
						((RelationFeature)newRelation).setUpperBound(upperBound);
					} else {
						newRelation =  specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFeature();
						((RelationFeature)newRelation).setType(specializationModel.FeatureType.MANDATORY);
						((RelationFeature)newRelation).setLowerBound(((featureModel.RelationFeature) rel).getLowerBound());
						((RelationFeature)newRelation).setUpperBound(((featureModel.RelationFeature) rel).getUpperBound());
						for ( ;lowerBound > 0; lowerBound--){
							createReferenceNode((specializationModel.Feature)targetFeature, (specializationModel.Feature)sourceFeature, relationList, newProject.getFeatures());
						}	
					}
					break;
				}
			}
			if (newRelation instanceof RelationFeature){
				((RelationFeature)newRelation).setSource((specializationModel.Feature)sourceFeature);
				((RelationFeature)newRelation).setTarget((specializationModel.Feature)targetFeature);
			}else if (newRelation instanceof specializationModel.RelationFG){
				((specializationModel.RelationFG)newRelation).setSource(sourceFeature);
				((specializationModel.RelationFG)newRelation).setTarget(targetFeature);
			}
			
			relationList.add(newRelation);
		}
	}

	private void createReferenceNode(specializationModel.Feature toBeCopied, specializationModel.Feature father, EList<specializationModel.Relation> relations, EList<specializationModel.Node> nodes){
		List children  = ((specializationModel.Feature)father).getChildren();
		specializationModel.Feature newFeature = specializationModel.SpecializationModelFactory.eINSTANCE.createFeature();
		newFeature.setFather(father);
		newFeature.setName(getNewName(toBeCopied));
		newFeature.setRealName(toBeCopied.getRealName());
		newFeature.setReferences(toBeCopied);
		newFeature.setValueType(toBeCopied.getValueType());
		newFeature.setState(father.getState());
		toBeCopied.getReferenciated().add(newFeature);
		children.add(newFeature);
		nodes.add(newFeature);
		specializationModel.RelationFeature newRelation = (RelationFeature) specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFeature();
		newRelation.setLowerBound(1);
		newRelation.setUpperBound(1);
		newRelation.setType(FeatureType.MANDATORY);
		newRelation.setSource(father);
		newRelation.setTarget(newFeature);
		relations.add(newRelation);
	}
	
	private List<Feature> getRoot(featureModel.diagram.edit.parts.ProjectEditPart project){
		featureModel.Project myModel = (featureModel.Project)((View)project.getModel()).getElement();
		List<Feature> res = new ArrayList<Feature>();
		
		for (featureModel.Node node : myModel.getFeatures()){
			if (node instanceof Feature && node.getFather() == null){
				res.add((Feature)node);
			}
		}
		return res;
	}
	
	private specializationModel.Feature copyFeature(specializationModel.Node father, featureModel.Feature myFeature){
		specializationModel.Feature feature = specializationModel.SpecializationModelFactory.eINSTANCE.createFeature();
		feature.setFather(father);
		feature.setName(myFeature.getName());
		feature.setRealName(myFeature.getName());
		specializationModel.ValueType valueTypeTemp = null;
		switch (myFeature.getValueType().getValue()){
		case (featureModel.ValueType.FEATURE_VALUE):
			valueTypeTemp = specializationModel.ValueType.FEATURE;
			break;
		case (featureModel.ValueType.FLOAT_VALUE):
			valueTypeTemp = specializationModel.ValueType.FLOAT;
			break;
		case (featureModel.ValueType.INTEGER_VALUE):
			valueTypeTemp = specializationModel.ValueType.INTEGER;
			break;
		case (featureModel.ValueType.NONE_VALUE):
			valueTypeTemp = specializationModel.ValueType.NONE;
			break;
		case (featureModel.ValueType.STRING_VALUE):
			valueTypeTemp = specializationModel.ValueType.STRING;
			break;
		}
		feature.setValueType(valueTypeTemp);
		if (father != null) feature.setState(specializationModel.ConfigState.UNDECIDED);
		else feature.setState(specializationModel.ConfigState.USER_SELECTED);
		
		myFeature.setSpecializationNode(feature);
		
		return feature;
	}
	private specializationModel.FeatureGroup copyFeatureGroup(specializationModel.Node father, featureModel.FeatureGroup myFeature){
		specializationModel.FeatureGroup feature = specializationModel.SpecializationModelFactory.eINSTANCE.createFeatureGroup();
		feature.setFather(father);
		feature.setLowerBound(myFeature.getLowerBound());
		feature.setUpperBound(myFeature.getUpperBound());
		
		
		specializationModel.FeatureGroupType valueTypeTemp = null;
		switch (myFeature.getType().getValue()){
		case (featureModel.FeatureGroupType.XORGROUP_VALUE):
			valueTypeTemp = specializationModel.FeatureGroupType.XORGROUP;
			break;
		case (featureModel.FeatureGroupType.ORGROUP_VALUE):
			valueTypeTemp = specializationModel.FeatureGroupType.ORGROUP;
			break;
		case (featureModel.FeatureGroupType.SIMPLEGROUP_VALUE):
			valueTypeTemp = specializationModel.FeatureGroupType.SIMPLEGROUP;
			break;
		}
		feature.setType(valueTypeTemp);
		myFeature.setSpecializationNode(feature);
		
		return feature;
	}
	
	private specializationModel.Node nextFeature(specializationModel.Node father, featureModel.Node me, EList<specializationModel.Node> myList){
		specializationModel.Node myNode = null;
		if (me instanceof Feature){
			myNode = copyFeature(father, (Feature) me);
			myList.add(myNode);
			List children  = ((specializationModel.Feature)myNode).getChildren();
			for ( featureModel.Node node : ((Feature)me).getChildren()){
				children.add(nextFeature(myNode, node, myList));
			}
		}else if (me instanceof featureModel.FeatureGroup){
			myNode = copyFeatureGroup(father, (FeatureGroup) me);
			myList.add(myNode);
			List children  = ((specializationModel.FeatureGroup)myNode).getChildren();
			for ( featureModel.Node node : ((FeatureGroup)me).getChildren()){
				children.add(nextFeature(myNode, node, myList));
			}
		}
		
		return myNode;
	}
	
	private String getNewName(specializationModel.Feature mainFeature){
		String result = mainFeature.getName();
		int cont = 0;
		boolean exit = false, found = false;
		
		while (!exit){
			Iterator iteratorChild = mainFeature.getFather().getChildren().iterator();
			while (!found && iteratorChild.hasNext()){
				Node child = (Node) iteratorChild.next();
				
				if (child instanceof specializationModel.Feature && ((specializationModel.Feature)child).getName().equals(result + cont)) found = true;
			}
			exit = !found;
			found = false;
			if (!exit) cont++;
		}

		return result + cont;
	}
	
	public specializationModel.Project transform(featureModel.diagram.edit.parts.ProjectEditPart model){
		specializationModel.Project myProject = specializationModel.SpecializationModelFactory.eINSTANCE.createProject();
		featureModel.Project oldProject = (featureModel.Project)((View)model.getModel()).getElement();
		
		copyProjectAttributes(oldProject, myProject);
		
		for ( Feature feature : getRoot(model)){
			nextFeature(null, feature, myProject.getFeatures());
		}
		setReferences((featureModel.Project) ((View)model.getModel()).getElement());
		createRelations(model, myProject);
		return myProject;
	}
	
	private void copyProjectAttributes(featureModel.Project oldProject, Project newProject){
		newProject.setNameConfigFile(oldProject.getNameConfigFile());
		newProject.setNameConstraintsFile(oldProject.getNameConstraintsFile());
		newProject.setNumberOfProducts(oldProject.getNumberOfProducts());
		newProject.setValidatedOK(oldProject.isValidatedOK());
	}
	
	private void setReferences(featureModel.Project project) {
		for (featureModel.Node n : project.getFeatures()){
			if (n instanceof Feature){
				specializationModel.Feature newFeature = (specializationModel.Feature) ((Feature)n).getSpecializationNode();
				if ( ((Feature) n).getReferences() != null){
					newFeature.setReferences((specializationModel.Feature) ((Feature)n).getReferences().getSpecializationNode());
				}else if ( ((Feature) n).getReferenciated().size() > 0){
					EList<Feature> referenciated = ((Feature)n).getReferenciated();
					EList newReferenciated = newFeature.getReferenciated();
					for (Feature f : referenciated){
						newReferenciated.add(f.getSpecializationNode());
					}
				}
			}
		}
		
	}
}
