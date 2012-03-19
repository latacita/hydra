package specializationModel.diagram.part;

public class MainStatus {
	private boolean constraintState = false;
	private boolean modelState = false;
	
	public boolean isConstraintState() {
		return constraintState;
	}

	public void setConstraintState(boolean constraintState) {
		this.constraintState = constraintState;
	}

	public boolean isModelState() {
		return modelState;
	}

	public void setModelState(boolean modelState) {
		this.modelState = modelState;
	}
}
