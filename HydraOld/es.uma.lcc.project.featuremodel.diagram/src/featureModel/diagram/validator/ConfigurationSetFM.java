package featureModel.diagram.validator;

import java.util.List;

public class ConfigurationSetFM {
	private List<Feature4ValidatorFM> setFeatures, unsetFeatures;
	private Feature4ValidatorFM root;
	
	public ConfigurationSetFM(List<Feature4ValidatorFM> setFeatures,
			List<Feature4ValidatorFM> unsetFeatures, Feature4ValidatorFM root) {
		super();
		this.setFeatures = setFeatures;
		this.unsetFeatures = unsetFeatures;
		this.root = root;
	}

	public List<Feature4ValidatorFM> getSetFeatures() {
		return setFeatures;
	}

	public void setSetFeatures(List<Feature4ValidatorFM> setFeatures) {
		this.setFeatures = setFeatures;
	}

	public List<Feature4ValidatorFM> getUnsetFeatures() {
		return unsetFeatures;
	}

	public void setUnsetFeatures(List<Feature4ValidatorFM> unsetFeatures) {
		this.unsetFeatures = unsetFeatures;
	}

	public Feature4ValidatorFM getRoot() {
		return root;
	}

	public void setRoot(Feature4ValidatorFM root) {
		this.root = root;
	}

	public boolean isSelected(Feature4ValidatorFM f4v) {
		// TODO Auto-generated method stub
		return setFeatures.contains(f4v);
	}
	
	public boolean isUnselected(Feature4ValidatorFM f4v){
		return unsetFeatures.contains(f4v);
	}
	
	
}
