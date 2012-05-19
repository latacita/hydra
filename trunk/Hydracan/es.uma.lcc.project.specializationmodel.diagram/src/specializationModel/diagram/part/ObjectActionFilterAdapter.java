package specializationModel.diagram.part;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IActionFilter;

import specializationModel.Feature;
import specializationModel.diagram.edit.parts.FeatureEditPart;

public class ObjectActionFilterAdapter implements IActionFilter { 
	private static final Object MYOBJECT_TYPE = "objectType"; 
	private static ObjectActionFilterAdapter INSTANCE = new ObjectActionFilterAdapter();

	private ObjectActionFilterAdapter() {
	} 

	@Override 
	public boolean testAttribute(Object target, String name, String value) { 
		if (target instanceof FeatureEditPart) { 
			FeatureEditPart obj = (FeatureEditPart) target; 
			if(MYOBJECT_TYPE.equals(name)) { 
				Feature f = (Feature) ((View)obj.getModel()).getElement();
				return value.equals(f.getName()); 
			} 
		} 
		return false; 
	} 
	public static ObjectActionFilterAdapter getInstance() { 
		return INSTANCE; 
	} 
} 
