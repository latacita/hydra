package es.unican.hydracan.constraintHydra;

import hydraconstraints.Constraint;
import hydraconstraints.Model;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import specializationModel.Feature;
import specializationModel.Node;
import specializationModel.Project;

/**
 * @author Daniel Tejedo Gonzalez
 * This implements the event that takes place after pressing the "validate" button
 */

public class ValidateConstraintsHandler extends AbstractHandler {

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
	  
	    // Invoke the window that will read the specialization file
		Shell s= new Shell();
		FileDialog dialog = new FileDialog(s); 
		dialog.setText("Enter the specialization xmi file");
		dialog.setFilterExtensions(new String[] { "*.xmi" });
		String selected = dialog.open(); // selected has the route of the file
		
		// Get the route of the constraint file from the name of the active window
		String constraintRouteAux="";
		constraintRouteAux=HandlerUtil.getActiveEditor(event).getEditorInput().toString();
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		String constraintRouteAux2=constraintRouteAux.substring(constraintRouteAux.lastIndexOf("(")+1, constraintRouteAux.lastIndexOf(")"));
		String constraintFileRoute=workspaceDirectory.toString()+constraintRouteAux2;
		
		// Open the constraint file
		URI uri2 = URI.createFileURI(constraintFileRoute);
		ResourceSet resSet2 = new ResourceSetImpl();
		Resource resource2 = resSet2.getResource(uri2,true);
		Model modelConstraints = (Model) resource2.getContents().get(0);

		// Evaluate all the constraints
		int counter=0;
		String result="";
		for (Iterator<Constraint> iterator=modelConstraints.getConstraints().iterator(); 
				iterator.hasNext(); )
		{
			Constraint c=iterator.next();
			int constraintValue=c.getOperators().evaluate(selected,null);
			counter++;
			result+="Constraint number "+counter+": ";
			if (constraintValue == 0) {
				result+="false";
			} else if (constraintValue==1) {
				result+="true";
			} else {
				result+="error during the validation";
			}
			result+="\n";
		}
		MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), "Constraint Validation", result);
		return null;
  }

} 