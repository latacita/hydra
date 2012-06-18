/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.analysis;

public class HydraConstDIRECCIONTokenResolver implements hydraconstraints.resource.hydraConst.IHydraConstTokenResolver {
	
	private hydraconstraints.resource.hydraConst.analysis.HydraConstDefaultTokenResolver defaultTokenResolver = new hydraconstraints.resource.hydraConst.analysis.HydraConstDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, hydraconstraints.resource.hydraConst.IHydraConstTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
