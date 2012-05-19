package specializationModel.diagram.part;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.IActionFilter;

public class ObjectActionFilterAdapterFactory implements IAdapterFactory { 
	@SuppressWarnings("unchecked") 
	@Override 

	public Object getAdapter(Object adaptableObject, Class adapterType) { 
		if(adapterType == IActionFilter.class) 
			return ObjectActionFilterAdapter.getInstance(); 
		return null; } 
	@SuppressWarnings("unchecked") 
	@Override 
	public Class[] getAdapterList() { 
		return new Class[] {IActionFilter.class}; 
	} 
}