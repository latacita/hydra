/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintBuilder implements syntax.resource.constraint.IConstraintBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri) {
		// change this to return true to enable building of all resources
		return false;
	}
	
	public org.eclipse.core.runtime.IStatus build(syntax.resource.constraint.mopp.ConstraintResource resource, org.eclipse.core.runtime.IProgressMonitor monitor) {
		// set option overrideBuilder to 'false' and then perform build here
		return org.eclipse.core.runtime.Status.OK_STATUS;
	}
	
}
