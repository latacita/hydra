/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * The HydraConstTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class HydraConstTokenResolverFactory implements hydraconstraints.resource.hydraConst.IHydraConstTokenResolverFactory {
	
	private java.util.Map<String, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver> featureName2CollectInTokenResolver;
	private static hydraconstraints.resource.hydraConst.IHydraConstTokenResolver defaultResolver = new hydraconstraints.resource.hydraConst.analysis.HydraConstDefaultTokenResolver();
	
	public HydraConstTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver>();
		registerTokenResolver("DIGIT", new hydraconstraints.resource.hydraConst.analysis.HydraConstDIGITTokenResolver());
		registerTokenResolver("TEXT", new hydraconstraints.resource.hydraConst.analysis.HydraConstTEXTTokenResolver());
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected hydraconstraints.resource.hydraConst.IHydraConstTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private hydraconstraints.resource.hydraConst.IHydraConstTokenResolver internalCreateResolver(java.util.Map<String, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver> resolverMap, String key, hydraconstraints.resource.hydraConst.IHydraConstTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
