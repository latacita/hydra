package featureModel.diagram.misc;

public class Configuration {
	private String baseName, path; 
	public static String modelExtension = ".hydra_cfg", diagramExtension = ".hydra_cfg_diagram";
	
	public Configuration(String basename, String path) {
		super();
		this.baseName = basename;
		this.path = path;
	}

	public String getBaseName() {
		return baseName;
	}



	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}



	public String getModelExtension() {
		return modelExtension;
	}



	public void setModelExtension(String modelExtension) {
		this.modelExtension = modelExtension;
	}



	public String getDiagramExtension() {
		return diagramExtension;
	}



	public void setDiagramExtension(String diagramExtension) {
		this.diagramExtension = diagramExtension;
	}



	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
}
