/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.ui;

public class HydraConstAnnotationModelFactory implements org.eclipse.core.filebuffers.IAnnotationModelFactory {
	
	public org.eclipse.jface.text.source.IAnnotationModel createAnnotationModel(org.eclipse.core.runtime.IPath location) {
		org.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
		org.eclipse.core.resources.IWorkspaceRoot root = workspace.getRoot();
		org.eclipse.core.resources.IResource resource = root.findMember(location);
		return new hydraconstraints.resource.hydraConst.ui.HydraConstAnnotationModel(resource);
	}
	
}
