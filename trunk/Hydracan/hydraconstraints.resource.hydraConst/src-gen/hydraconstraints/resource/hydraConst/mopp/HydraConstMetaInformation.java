/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstMetaInformation implements hydraconstraints.resource.hydraConst.IHydraConstMetaInformation {
	
	public String getSyntaxName() {
		return "hydraConst";
	}
	
	public String getURI() {
		return "http://www.unican.es/personales/sanchezbp/spl/hydra/constraints";
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTextScanner createLexer() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstAntlrScanner(new hydraconstraints.resource.hydraConst.mopp.HydraConstLexer());
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstParser().createInstance(inputStream, encoding);
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTextPrinter createPrinter(java.io.OutputStream outputStream, hydraconstraints.resource.hydraConst.IHydraConstTextResource resource) {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstReferenceResolverSwitch getReferenceResolverSwitch() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstReferenceResolverSwitch();
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTokenResolverFactory getTokenResolverFactory() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "es.unican.hydracan.constraintHydra/metamodels/hydraConstraints.cs";
	}
	
	public String[] getTokenNames() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstParser(null).getTokenNames();
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTokenStyle getDefaultTokenStyle(String tokenName) {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstBracketPair> getBracketPairs() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstResourceFactory();
	}
	
	public hydraconstraints.resource.hydraConst.mopp.HydraConstNewFileContentProvider getNewFileContentProvider() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new hydraconstraints.resource.hydraConst.mopp.HydraConstResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "hydraconstraints.resource.hydraConst.ui.launchConfigurationType";
	}
	
}
