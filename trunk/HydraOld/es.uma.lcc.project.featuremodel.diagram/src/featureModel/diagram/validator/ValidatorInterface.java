package featureModel.diagram.validator;

public interface ValidatorInterface {

	public void loadModel();

	public Object getMinConfiguration();

	public void loadUserConstraints(
			tef.project.expressions.Model userConstraints);
	
	
	public void validate();
	
	public void setFeature(String featureName);

}