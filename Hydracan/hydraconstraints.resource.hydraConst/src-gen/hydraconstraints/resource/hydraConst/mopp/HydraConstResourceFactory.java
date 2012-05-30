/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public HydraConstResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstResource(uri);
	}
	
}
