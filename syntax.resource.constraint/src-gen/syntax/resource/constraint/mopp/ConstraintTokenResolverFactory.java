/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

/**
 * The ConstraintTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class ConstraintTokenResolverFactory implements syntax.resource.constraint.IConstraintTokenResolverFactory {
	
	private java.util.Map<String, syntax.resource.constraint.IConstraintTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, syntax.resource.constraint.IConstraintTokenResolver> featureName2CollectInTokenResolver;
	private static syntax.resource.constraint.IConstraintTokenResolver defaultResolver = new syntax.resource.constraint.analysis.ConstraintDefaultTokenResolver();
	
	public ConstraintTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, syntax.resource.constraint.IConstraintTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, syntax.resource.constraint.IConstraintTokenResolver>();
		registerTokenResolver("DIGIT", new syntax.resource.constraint.analysis.ConstraintDIGITTokenResolver());
		registerTokenResolver("TEXT", new syntax.resource.constraint.analysis.ConstraintTEXTTokenResolver());
	}
	
	public syntax.resource.constraint.IConstraintTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public syntax.resource.constraint.IConstraintTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, syntax.resource.constraint.IConstraintTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, syntax.resource.constraint.IConstraintTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected syntax.resource.constraint.IConstraintTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private syntax.resource.constraint.IConstraintTokenResolver internalCreateResolver(java.util.Map<String, syntax.resource.constraint.IConstraintTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, syntax.resource.constraint.IConstraintTokenResolver> resolverMap, String key, syntax.resource.constraint.IConstraintTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
