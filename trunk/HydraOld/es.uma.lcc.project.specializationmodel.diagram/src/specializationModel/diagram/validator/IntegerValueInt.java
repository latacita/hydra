package specializationModel.diagram.validator;

import choco.kernel.model.variables.integer.IntegerVariable;

public class IntegerValueInt {
	private IntegerVariable integerValue;
	private int value = -1;
	
	
	public IntegerValueInt(IntegerVariable integerValue, int value) {
		this.integerValue = integerValue;
		this.value = value;
	}
	
	public IntegerValueInt(IntegerVariable integerValue) {
		this.integerValue = integerValue;
	}
	
	public IntegerVariable getIntegerValue() {
		return integerValue;
	}
	public void setIntegerValue(IntegerVariable integerValue) {
		this.integerValue = integerValue;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isSet(){
		return value >= 0;
	}
	
	public boolean isTheSameValue(int value){
		boolean result = true;
		if ( this.value == 0 && value != 0 || this.value != 0 && value == 0) result = false; 
		return result;
	}
	
	
}
