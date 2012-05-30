/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ConstraintResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new syntax.resource.constraint.mopp.ConstraintResource(uri);
	}
	
}
