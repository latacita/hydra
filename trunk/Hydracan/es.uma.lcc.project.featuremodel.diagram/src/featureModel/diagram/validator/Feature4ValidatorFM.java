package featureModel.diagram.validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import featureModel.Feature;

import choco.kernel.model.variables.integer.IntegerVariable;

public class Feature4ValidatorFM {
	private String name;
	private IntegerVariable integerVariable;
	
	private Feature4ValidatorFM father;
	private List<Feature4ValidatorFM> children;
	private List<Feature4ValidatorFM> antecesors;
	private boolean phantom;
	private int value = -1;
	
	private Feature feature;
	
	public Feature4ValidatorFM(Feature feature, IntegerVariable integerVariable, Feature4ValidatorFM father, boolean isPhantom){
		children = new ArrayList<Feature4ValidatorFM>();
		antecesors = new ArrayList<Feature4ValidatorFM>();
		
		this.phantom = isPhantom;
		this.feature = feature;
		this.name = feature.getName();
		this.integerVariable = integerVariable;
		this.father = father;
		
		if (father != null){	
			antecesors.addAll(father.getAntecesors());
			father.addChildren(this);
		}
		
		antecesors.add(this);
	}
	
	// we have to catch the feature before the not equality of both. 
	public Feature4ValidatorFM leastCommonFather(Feature4ValidatorFM anotherFeature4Validator){
		Feature4ValidatorFM result = null;
		boolean exit = false;
		Iterator<Feature4ValidatorFM> antecesorIterator = antecesors.iterator();
		Iterator<Feature4ValidatorFM> anotherAntecesorIterator = anotherFeature4Validator.getAntecesors().iterator();
		
		while (antecesorIterator.hasNext() && anotherAntecesorIterator.hasNext() && !exit){
			
			Feature4ValidatorFM one = antecesorIterator.next();
			Feature4ValidatorFM two = anotherAntecesorIterator.next();
			
			if (one.equals(two)){
				result = one;
			}else {
				exit = true;
			}
		}
		return result;
	}
	
	// at least there must be 1 elements in listOfF4V
	public static Feature4ValidatorFM leastCommonFather(List<Feature4ValidatorFM> listOfF4V){
		Iterator<Feature4ValidatorFM> iterator = listOfF4V.iterator(); 
		Feature4ValidatorFM result = iterator.next();
		
		while (iterator.hasNext()){
			result = result.leastCommonFather(iterator.next());
		}
		return result;
	}
	
	// at least there must be 1 element in listOfF4V. All elements of listOfF4V must have the same realName.
	public Feature4ValidatorFM leastCommonFatherWithTheNearestFeature( List<Feature4ValidatorFM> listOfF4V){
		Iterator<Feature4ValidatorFM> iterator = listOfF4V.iterator();
		// result have the root feature
		Feature4ValidatorFM proposedFeature = this.leastCommonFather(iterator.next());
		
		while (iterator.hasNext()){
			Feature4ValidatorFM temp = this.leastCommonFather(iterator.next());
			if (temp.getAntecesors().size() > proposedFeature.getAntecesors().size()) proposedFeature = temp;
		}
		return proposedFeature; 
	}
	
	
	// uno con lista estaría bien?
	public String leastCommonFeatureName(Feature4ValidatorFM anotherFeature4Validator){
		String result = null;
		Iterator<Feature4ValidatorFM> antecesorIterator = antecesors.iterator();
		
		while (antecesorIterator.hasNext() && result == null){
			Feature4ValidatorFM temp = antecesorIterator.next();
			if (containsRealName(anotherFeature4Validator.getAntecesors(), temp.getName())) result = temp.getName();
		}
		
		return result;
	}
	
	private boolean containsRealName (List<Feature4ValidatorFM> ancestors, String realName){
		boolean result = false;
		Iterator<Feature4ValidatorFM> if4v = ancestors.iterator();
		while (if4v.hasNext() && !result){
			Feature4ValidatorFM temp = if4v.next();
			if ( temp.getName().equals(realName)) result = true;
		}
		return result;
	}
	
	
	
	public boolean isPhantom() {
		return phantom;
	}


	public void setPhantom(boolean phantom) {
		this.phantom = phantom;
	}


	public Feature getFeature() {
		return feature;
	}


	public void setFeature(Feature feature) {
		this.feature = feature;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IntegerVariable getIntegerVariable() {
		return integerVariable;
	}
	public void setIntegerVariable(IntegerVariable integerVariable) {
		this.integerVariable = integerVariable;
	}
	public Feature4ValidatorFM getFather() {
		return father;
	}
	public void setFather(Feature4ValidatorFM father) {
		this.father = father;
	}
	public List<Feature4ValidatorFM> getChildren() {
		return children;
	}
	public void addChildren(Feature4ValidatorFM child) {
		this.children.add(child);
	}
	public List<Feature4ValidatorFM> getAntecesors() {
		return antecesors;
	}
	public void addAntecesors(Feature4ValidatorFM antecesor) {
		this.antecesors.add(antecesor);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
