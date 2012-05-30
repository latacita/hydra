/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstBuilderAdapter extends org.eclipse.core.resources.IncrementalProjectBuilder {
	
	/**
	 * the ID of the default, generated builder
	 */
	public final static String BUILDER_ID = "hydraconstraints.resource.hydraConst.builder";
	
	private hydraconstraints.resource.hydraConst.IHydraConstBuilder builder = new hydraconstraints.resource.hydraConst.mopp.HydraConstBuilder();
	
	public org.eclipse.core.resources.IProject[] build(int kind, @SuppressWarnings("rawtypes") java.util.Map args, final org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
		return build(kind, args, monitor, builder, getProject());
	}
	
	public org.eclipse.core.resources.IProject[] build(int kind, java.util.Map<?,?> args, final org.eclipse.core.runtime.IProgressMonitor monitor, final hydraconstraints.resource.hydraConst.IHydraConstBuilder builder, org.eclipse.core.resources.IProject project) throws org.eclipse.core.runtime.CoreException {
		org.eclipse.core.resources.IResourceDelta delta = getDelta(project);
		if (delta == null) {
			return null;
		}
		delta.accept(new org.eclipse.core.resources.IResourceDeltaVisitor() {
			public boolean visit(org.eclipse.core.resources.IResourceDelta delta) throws org.eclipse.core.runtime.CoreException {
				if (delta.getKind() == org.eclipse.core.resources.IResourceDelta.REMOVED) {
					return false;
				}
				org.eclipse.core.resources.IResource resource = delta.getResource();
				if (resource instanceof org.eclipse.core.resources.IFile && resource.getName().endsWith("." + "hydraConst")) {
					org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
					if (builder.isBuildingNeeded(uri)) {
						hydraconstraints.resource.hydraConst.mopp.HydraConstResource customResource = (hydraconstraints.resource.hydraConst.mopp.HydraConstResource) new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().getResource(uri, true);
						hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.unmark(customResource, hydraconstraints.resource.hydraConst.HydraConstEProblemType.BUILDER_ERROR);
						builder.build(customResource, monitor);
					}
					return false;
				}
				return true;
			}
		});
		return null;
	}
	
}
