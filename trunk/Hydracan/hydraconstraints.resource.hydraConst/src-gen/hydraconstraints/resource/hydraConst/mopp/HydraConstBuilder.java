/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstBuilder implements hydraconstraints.resource.hydraConst.IHydraConstBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri) {
		// change this to return true to enable building of all resources
		return false;
	}
	
	public org.eclipse.core.runtime.IStatus build(hydraconstraints.resource.hydraConst.mopp.HydraConstResource resource, org.eclipse.core.runtime.IProgressMonitor monitor) {
		// set option overrideBuilder to 'false' and then perform build here
		return org.eclipse.core.runtime.Status.OK_STATUS;
	}
	
}
