package featureModel.diagram.misc;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.View;

import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.Node;
import specializationModel.Project;
import specializationModel.Relation;
import specializationModel.RelationFG;
import specializationModel.RelationFeature;
import specializationModel.diagram.edit.parts.ProjectEditPart;


public class SpecializationToSpecialization {

	private void createRelations(ProjectEditPart project, Project newProject){
		Project oldModel = (Project)((View)project.getModel()).getElement();
		EList<Relation> relations = oldModel.getRelations();
		EList<Relation> relationList = newProject.getRelations();

		for (Relation rel : relations){
			if ( rel instanceof RelationFG ){
				Node source = ((RelationFG)rel).getSource();
				Node target = ((RelationFG)rel).getTarget();
				if (source != null && target != null){
					RelationFG newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFG();
					newRelation.setSource(source.getSpecializationNode());
					newRelation.setTarget(target.getSpecializationNode());
					relationList.add(newRelation);
				}
			}else if (rel instanceof RelationFeature){
				Feature source = ((RelationFeature)rel).getSource();
				Feature target = ((RelationFeature)rel).getTarget();
				if (source != null && target != null){
					RelationFeature newRelation = specializationModel.SpecializationModelFactory.eINSTANCE.createRelationFeature();
					newRelation.setSource((Feature)source.getSpecializationNode());
					newRelation.setTarget((Feature)target.getSpecializationNode());
					newRelation.setLowerBound(((RelationFeature) rel).getLowerBound());
					newRelation.setUpperBound(((RelationFeature) rel).getUpperBound());
					newRelation.setType(((RelationFeature) rel).getType());
					relationList.add(newRelation);		
				}
			}
		}


	}

	private List<Feature> getRoot(ProjectEditPart project){
		Project myModel = (Project)((View)project.getModel()).getElement();
		boolean salir = false;
		Node temp;
		List<Feature> res = new ArrayList<Feature>();

		for (Node node : myModel.getFeatures()){
			if (node instanceof Feature && node.getFather() == null){
				res.add((Feature)node);
			}
		}
		return res;
	}

	private Feature copyFeature(Node father, Feature myFeature){
		Feature feature = specializationModel.SpecializationModelFactory.eINSTANCE.createFeature();
		feature.setFather(father);
		feature.setName(myFeature.getName());
		feature.setRealName(myFeature.getRealName());
		feature.setValueType(myFeature.getValueType());
		feature.setState(myFeature.getState());
		myFeature.setSpecializationNode(feature);

		return feature;
	}
	private FeatureGroup copyFeatureGroup(Node father, FeatureGroup myFeature){
		FeatureGroup feature = specializationModel.SpecializationModelFactory.eINSTANCE.createFeatureGroup();
		feature.setFather(father);
		feature.setLowerBound(myFeature.getLowerBound());
		feature.setUpperBound(myFeature.getUpperBound());
		feature.setType(myFeature.getType());
		myFeature.setSpecializationNode(feature);

		return feature;
	}

	private Node nextFeature(Node father, Node me, EList<Node> myList){
		specializationModel.Node myNode = null;
		if (me instanceof Feature){
			myNode = copyFeature(father, (Feature) me);
			myList.add(myNode);
			List children  = ((Feature)myNode).getChildren();
			for ( Node node : ((Feature)me).getChildren()){
				children.add(nextFeature(myNode, node, myList));
			}
		}else if (me instanceof FeatureGroup){
			myNode = copyFeatureGroup(father, (FeatureGroup) me);
			myList.add(myNode);
			List children  = ((FeatureGroup)myNode).getChildren();
			for ( Node node : ((FeatureGroup)me).getChildren()){
				children.add(nextFeature(myNode, node, myList));
			}
		}

		return myNode;
	}


	public Project transform(ProjectEditPart model){
		Project myOldProject = (Project)((View)model.getModel()).getElement();
		Project myProject = specializationModel.SpecializationModelFactory.eINSTANCE.createProject();

		copyProjectAttributes(myOldProject, myProject);

		for ( Feature feature : getRoot(model)){
			nextFeature(null, feature, myProject.getFeatures());
		}
		setReferences((Project) ((View)model.getModel()).getElement());
		createRelations(model, myProject);
		return myProject;
	}

	private void copyProjectAttributes(Project oldProject, Project newProject){
		newProject.setFeatureModelURI(oldProject.getFeatureModelURI());
		newProject.setInfiniteDomain(oldProject.isInfiniteDomain());
		newProject.setNameConfigFile(oldProject.getNameConfigFile());
		newProject.setNameConstraintsFile(oldProject.getNameConstraintsFile());
		newProject.setNumberOfProducts(oldProject.getNumberOfProducts());
		newProject.setValidatedOK(oldProject.isValidatedOK());
	}

	private void setReferences(Project myProject) {
		for (Node n : myProject.getFeatures()){
			if (n instanceof Feature){
				Feature newFeature = (Feature) ((Feature)n).getSpecializationNode();
				if (newFeature != null){
					if (((Feature) n).getReferences() != null){
						newFeature.setReferences((Feature) ((Feature)n).getReferences().getSpecializationNode());
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
}
