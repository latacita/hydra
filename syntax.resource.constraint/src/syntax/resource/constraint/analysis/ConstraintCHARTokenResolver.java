/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.analysis;

public class ConstraintCHARTokenResolver implements syntax.resource.constraint.IConstraintTokenResolver {
	
	private syntax.resource.constraint.analysis.ConstraintDefaultTokenResolver defaultTokenResolver = new syntax.resource.constraint.analysis.ConstraintDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, syntax.resource.constraint.IConstraintTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
