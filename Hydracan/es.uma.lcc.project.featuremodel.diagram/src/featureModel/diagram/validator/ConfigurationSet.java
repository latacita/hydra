package featureModel.diagram.validator;

import java.util.List;

public class ConfigurationSet {
	private List<Feature4Validator> setFeatures, unsetFeatures;
	private Feature4Validator root;
	
	public ConfigurationSet(List<Feature4Validator> setFeatures,
			List<Feature4Validator> unsetFeatures, Feature4Validator root) {
		super();
		this.setFeatures = setFeatures;
		this.unsetFeatures = unsetFeatures;
		this.root = root;
	}

	public List<Feature4Validator> getSetFeatures() {
		return setFeatures;
	}

	public void setSetFeatures(List<Feature4Validator> setFeatures) {
		this.setFeatures = setFeatures;
	}

	public List<Feature4Validator> getUnsetFeatures() {
		return unsetFeatures;
	}

	public void setUnsetFeatures(List<Feature4Validator> unsetFeatures) {
		this.unsetFeatures = unsetFeatures;
	}

	public Feature4Validator getRoot() {
		return root;
	}

	public void setRoot(Feature4Validator root) {
		this.root = root;
	}

	public boolean isSelected(Feature4Validator f4v) {
		boolean result = false;
		if (setFeatures != null) result = setFeatures.contains(f4v);
		return result;
	}
	
	public boolean isUnselected(Feature4Validator f4v){
		boolean result = false;
		if (unsetFeatures != null ) result = unsetFeatures.contains(f4v);
		return result;
	}
	
	
}
