package featureModel.diagram.edit.statics;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IWorkbenchWindow;

import specializationModel.RelationFeature;

import featureModel.Node;
import featureModel.Project;
import featureModel.Relation;
import featureModel.diagram.misc.Configuration;
import featureModel.diagram.misc.RenameDialog;

public class CommonCommands {
	
	public static List<String> getCharRestricted(){
		List<String> restricted = new ArrayList<String>();
		restricted.add(" ");
		restricted.add(";");
		restricted.add("(");
		restricted.add(")");
		restricted.add("<");
		restricted.add(">");
		restricted.add("=");
		restricted.add("!");
		restricted.add(",");
		restricted.add(".");
		return restricted;
	}
	
	public static List<String> getRestricted(){
		List<String> restricted = new ArrayList<String>();
		restricted.add("implies");
		restricted.add("or");
		restricted.add("and");
		restricted.add("not");
		restricted.add("count");
		restricted.add("any");
		restricted.add("all");
		return restricted;
	}
	
	public static specializationModel.Relation getRelationTo(specializationModel.Project project, specializationModel.Node target){
		specializationModel.Relation result = null;

		Iterator<?> iterator = project.getRelations().iterator();
		while (result == null && iterator.hasNext()){
			specializationModel.Relation aux = (specializationModel.Relation) iterator.next();
			if (aux.getTarget().equals(target))  result = aux;
		}		
		return result;

	}
	
	public static specializationModel.RelationFeature getRelationFeatureTo(specializationModel.Project project, specializationModel.Node target){
		specializationModel.RelationFeature result = null;

		Iterator<?> iterator = project.getRelations().iterator();
		while (result == null && iterator.hasNext()){
			specializationModel.Relation aux = (specializationModel.Relation) iterator.next();
			if (aux instanceof specializationModel.RelationFeature && aux.getTarget().equals(target))  result = (RelationFeature) aux;
		}		
		return result;

	}

	public static Relation getRelationTo(Project project, Node target) {
		featureModel.Relation result = null;

		Iterator<?> iterator = project.getRelations().iterator();
		while (result == null && iterator.hasNext()){
			featureModel.Relation aux = (featureModel.Relation) iterator.next();
			if (aux.getTarget().equals(target))  result = aux;
		}		
		return result;
	}

	public static String getNewSpecializationName(Path projectsPath, String filename, String path, IWorkbenchWindow window){
		String proposed = specializationModel.diagram.part.SpecializationmodelDiagramEditorUtil.getUniqueFileName( 
				projectsPath, filename, Configuration.diagramExtension.substring(1));

		filename = proposed.substring(0, proposed.length() - Configuration.diagramExtension.length());

		// arreglar : aparece el nombre con la extension en el dialog, y luego se pasa
		// al addpageaux todo esto. Hacer que haga un bucle hasta encontrar un nombre si due�o
		RenameDialog rd = new RenameDialog(window.getShell());
		rd.setMessage("Please, choose a name for the configuration");
		rd.setText("Configuration Name");

		String message = null;
		boolean exit = false;

		while (!exit){
			rd.setInput(filename);

			message = rd.open();

			if (message == null){
				exit = true;
			}else if (message.length() > 0){
				File auxFile = new File(path + System.getProperty("file.separator") + message + Configuration.diagramExtension);
				File auxFile2 = new File(path + System.getProperty("file.separator") + message + Configuration.modelExtension);

				if (!auxFile.exists() && !auxFile2.exists()) exit = true; 
			}

		}

		return message;

	}


}
