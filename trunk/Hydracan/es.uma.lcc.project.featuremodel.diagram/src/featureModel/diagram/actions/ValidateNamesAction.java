package featureModel.diagram.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;

import featureModel.diagram.misc.ValidateNames;
import featureModel.diagram.part.MultiPageEditor;
import featureModel.diagram.part.MultiPageEditorContributor;

public class ValidateNamesAction extends Action{

	MultiPageEditorContributor myContributor;
	IEditorPart myEditor;
	
	public ValidateNamesAction(MultiPageEditorContributor multiPageEditorContributor){
		myContributor = multiPageEditorContributor;
	}

	public void setEditorPart (IEditorPart editor){
		myEditor = editor;
	}
	
	public void run() {		
		
		IEditorPart multipageEditor = myContributor.getPage().getActiveEditor();
		ValidateNames vn = new ValidateNames((MultiPageEditor) multipageEditor);
		vn.validate();
	}

}