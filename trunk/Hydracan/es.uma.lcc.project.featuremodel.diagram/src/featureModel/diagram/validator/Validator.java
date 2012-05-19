package featureModel.diagram.validator;

public class Validator {
	featureModel.Project mainProject = null;
	specializationModel.Project configuration = null;
	
	public Validator (featureModel.Project fProject, specializationModel.Project sProject){
		mainProject = fProject;
		configuration = sProject;
		mainProject.prepareToValidation();
		configuration.prepareToValidation();
	}
	
	public boolean isCorrect(){
		boolean result = true;
		
		return result;
	}
	
	public boolean validate(featureModel.Node fNode, specializationModel.Node sNode){
		boolean result = true;
		
		
		
		
		return result;
	}
	
	
	
	
	
}
