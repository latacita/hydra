package specializationModel.diagram.part;

import java.util.Iterator;

import org.eclipse.core.expressions.PropertyTester; 
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import specializationModel.Feature;
import specializationModel.diagram.edit.parts.FeatureEditPart;
import specializationModel.diagram.edit.parts.ProjectEditPart;

public class MyRestoreTester extends PropertyTester { 
	@Override 
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) { 
		FeatureEditPart fep = (FeatureEditPart)receiver;
		boolean result = false;
		Feature a = (Feature) ((View)fep.getModel()).getElement();
		Iterator<?> it = a.getChildren().iterator();
		ProjectEditPart pep = (ProjectEditPart) fep.getParent();
		
		
		Iterator<?> it2 = ((View)pep.getModel()).getChildren().iterator();	
		
		while (!result && it2.hasNext()){
			View v = (View) it2.next();
			EObject eObject = v.getElement();
			if (!v.isVisible() && eObject instanceof Feature && ((Feature)eObject).getFather().equals(a)) result = true;
		}
		
		
		
//		while (!result && it.hasNext()){
//			View v = findView((View) pep.getModel(), (EObject)it.next());
//			result = !v.isVisible();
//		}
		return result;
		
//		return false;
	} 
	
	
	private View findView(View project, EObject eObject){
		View result = null;
		Iterator<?> it = project.getChildren().iterator();
		
		while (result == null && it.hasNext()){
			View obj = (View) it.next();
			if (obj.getElement().equals(eObject)) result = obj; 
		}
		return result;
	}
	
	
	
}
