package featureModel.diagram.validator;

import choco.kernel.model.variables.integer.IntegerExpressionVariable;

public class PrettyIEV {
	IntegerExpressionVariable iev;
	String string;
	
	public PrettyIEV(IntegerExpressionVariable iev, String string) {
		this.iev = iev;
		this.string = string;
	}

	public IntegerExpressionVariable getIev() {
		return iev;
	}

	public void setIev(IntegerExpressionVariable iev) {
		this.iev = iev;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	
	
}
