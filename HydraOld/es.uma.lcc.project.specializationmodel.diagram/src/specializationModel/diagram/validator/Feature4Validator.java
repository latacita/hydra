package specializationModel.diagram.validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import specializationModel.ConfigState;
import specializationModel.Feature;

import choco.kernel.model.variables.integer.IntegerVariable;

public class Feature4Validator {
	private String name, realName;
	private IntegerVariable integerVariable;
	
	private Feature4Validator father;
	private List<Feature4Validator> children;
	private List<Feature4Validator> antecesors;
	private boolean phantom;
	private int value = -1;
	
	private Feature feature;
	
	public Feature4Validator(Feature feature, IntegerVariable integerVariable, Feature4Validator father, boolean isPhantom){
		children = new ArrayList<Feature4Validator>();
		antecesors = new ArrayList<Feature4Validator>();
		
		this.phantom = isPhantom;
		this.feature = feature;
		this.name = feature.getName();
		this.realName = feature.getRealName();
		this.integerVariable = integerVariable;
		this.father = father;
		
		if (father != null){	
			antecesors.addAll(father.getAntecesors());
			father.addChildren(this);
		}
		
		antecesors.add(this);
	}
	
	// we have to catch the feature before the not equality of both. 
	public Feature4Validator leastCommonFather(Feature4Validator anotherFeature4Validator){
		Feature4Validator result = null;
		boolean exit = false;
		Iterator<Feature4Validator> antecesorIterator = antecesors.iterator();
		Iterator<Feature4Validator> anotherAntecesorIterator = anotherFeature4Validator.getAntecesors().iterator();
		
		while (antecesorIterator.hasNext() && anotherAntecesorIterator.hasNext() && !exit){
			
			Feature4Validator one = antecesorIterator.next();
			Feature4Validator two = anotherAntecesorIterator.next();
			
			if (one.equals(two)){
				result = one;
			}else {
				exit = true;
			}
		}
		return result;
	}
	
	public String toString(){
		String result = " [ " + name;
		for (Feature4Validator f4v : children){
			result += f4v.toString();
		}
		return result + " ] ";
		
	}
	
	// at least there must be 1 elements in listOfF4V
	public static Feature4Validator leastCommonFather(List<Feature4Validator> listOfF4V){
		Iterator<Feature4Validator> iterator = listOfF4V.iterator(); 
		Feature4Validator result = iterator.next();
		
		while (iterator.hasNext()){
			result = result.leastCommonFather(iterator.next());
		}
		return result;
	}
	
	// at least there must be 1 element in listOfF4V. All elements of listOfF4V must have the same realName.
	public Feature4Validator leastCommonFatherWithTheNearestFeature( List<Feature4Validator> listOfF4V){
		Iterator<Feature4Validator> iterator = listOfF4V.iterator();
		// result have the root feature
		Feature4Validator proposedFeature = this.leastCommonFather(iterator.next());
		
		while (iterator.hasNext()){
			Feature4Validator temp = this.leastCommonFather(iterator.next());
			if (temp.getAntecesors().size() > proposedFeature.getAntecesors().size()) proposedFeature = temp;
		}
		return proposedFeature; 
	}
	
	
	// uno con lista estar�a bien?
	public String leastCommonFeatureName(Feature4Validator anotherFeature4Validator){
		String result = null;
		Iterator<Feature4Validator> antecesorIterator = antecesors.iterator();
		
		while (antecesorIterator.hasNext() && result == null){
			Feature4Validator temp = antecesorIterator.next();
			if (containsRealName(anotherFeature4Validator.getAntecesors(), temp.getRealName())) result = temp.getRealName();
		}
		
		return result;
	}
	
	private boolean containsRealName (List<Feature4Validator> ancestors, String realName){
		boolean result = false;
		Iterator<Feature4Validator> if4v = ancestors.iterator();
		while (if4v.hasNext() && !result){
			Feature4Validator temp = if4v.next();
			if ( temp.getRealName().equals(realName)) result = true;
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public IntegerVariable getIntegerVariable() {
		return integerVariable;
	}
	public void setIntegerVariable(IntegerVariable integerVariable) {
		this.integerVariable = integerVariable;
	}
	public Feature4Validator getFather() {
		return father;
	}
	public void setFather(Feature4Validator father) {
		this.father = father;
	}
	public List<Feature4Validator> getChildren() {
		return children;
	}
	public void addChildren(Feature4Validator child) {
		this.children.add(child);
	}
	public List<Feature4Validator> getAntecesors() {
		return antecesors;
	}
	public void addAntecesors(Feature4Validator antecesor) {
		this.antecesors.add(antecesor);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isConsistent(){
		boolean result = false;
		
		switch(this.getFeature().getState().getValue()){
		case ConfigState.USER_ELIMINATED_VALUE:
			result = 0 == value;
			break;
		case ConfigState.USER_SELECTED_VALUE:
			result = 1 == value;
			break;
		case ConfigState.UNDECIDED_VALUE:
			result = -1 == value;
		}
		
		return result;
	}
	
}
