package specializationModel.diagram.part;

import org.eclipse.core.expressions.PropertyTester; 
import org.eclipse.gmf.runtime.notation.View;
import specializationModel.Feature;
import specializationModel.diagram.edit.parts.FeatureEditPart;

public class MyUnreferenceTester extends PropertyTester { 
	@Override 
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) { 
		FeatureEditPart fep = (FeatureEditPart)receiver;
		Feature a = (Feature) ((View)fep.getModel()).getElement();	
		return a.getReferences() != null;
	}
	
}
