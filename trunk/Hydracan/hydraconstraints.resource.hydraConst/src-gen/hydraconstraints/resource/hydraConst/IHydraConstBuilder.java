/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst;

public interface IHydraConstBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(hydraconstraints.resource.hydraConst.mopp.HydraConstResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
