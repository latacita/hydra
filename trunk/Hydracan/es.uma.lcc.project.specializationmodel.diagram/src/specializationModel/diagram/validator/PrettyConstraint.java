package specializationModel.diagram.validator;

import choco.kernel.model.constraints.Constraint;

public class PrettyConstraint {
	Constraint myConstraint;
	String myString;
	
	public PrettyConstraint(Constraint constraint, String string){
		myConstraint = constraint;
		myString = string;
	}

	public Constraint getMyConstraint() {
		return myConstraint;
	}

	public void setMyConstraint(Constraint myConstraint) {
		this.myConstraint = myConstraint;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
}
