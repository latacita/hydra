/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint;

public interface IConstraintBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(syntax.resource.constraint.mopp.ConstraintResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
