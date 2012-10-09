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

public class ValidateConstraintsHandler extends AbstractHandler {

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
	//HandlerUtil.getActiveWorkbenchWindow(event).close();
	    //HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().closeAllEditors(true);
		Shell s= new Shell();
		FileDialog dialog = new FileDialog(s); 
		dialog.setText("Enter the specialization xmi file");
		dialog.setFilterExtensions(new String[] { "*.xmi" });
		String selected = dialog.open();
		String printar="";
		URI uri = URI.createFileURI(selected);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri,true);
		Project modelSpecialization = (Project) resource.getContents().get(0);
		Feature f;
		for (Iterator<Node> iterator=modelSpecialization.getFeatures().iterator(); 
				iterator.hasNext(); )
		{
			Node node=iterator.next();
			if (node instanceof Feature) {
				f=(Feature) node;
				printar+=" "+f.getName();
			}
		}
		
		//MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), "string", printar);
		String fich="";
		fich=HandlerUtil.getActiveEditor(event).getEditorInput().toString();
		//MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), "string", fich);
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		String ruta=fich.substring(fich.lastIndexOf("(")+1, fich.lastIndexOf(")"));
		String direccionConstraints=workspaceDirectory.toString()+ruta;
		//MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), "string", direccionModelo);
		URI uri2 = URI.createFileURI(direccionConstraints);
		ResourceSet resSet2 = new ResourceSetImpl();
		Resource resource2 = resSet.getResource(uri2,true);
		Model modelConstraints = (Model) resource2.getContents().get(0);
		printar="";
		for (Iterator<Constraint> iterator=modelConstraints.getConstraints().iterator(); 
				iterator.hasNext(); )
		{
			Constraint c=iterator.next();
			int numero=c.getOperators().evaluate(selected,null);
			printar+=" "+numero;
		}
		MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), "string", printar);
		return null;
  }

} 