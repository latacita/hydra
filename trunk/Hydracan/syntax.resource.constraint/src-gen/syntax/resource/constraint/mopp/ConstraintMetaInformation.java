/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintMetaInformation implements syntax.resource.constraint.IConstraintMetaInformation {
	
	public String getSyntaxName() {
		return "constraint";
	}
	
	public String getURI() {
		return "http://constLang/syntax";
	}
	
	public syntax.resource.constraint.IConstraintTextScanner createLexer() {
		return new syntax.resource.constraint.mopp.ConstraintAntlrScanner(new syntax.resource.constraint.mopp.ConstraintLexer());
	}
	
	public syntax.resource.constraint.IConstraintTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new syntax.resource.constraint.mopp.ConstraintParser().createInstance(inputStream, encoding);
	}
	
	public syntax.resource.constraint.IConstraintTextPrinter createPrinter(java.io.OutputStream outputStream, syntax.resource.constraint.IConstraintTextResource resource) {
		return new syntax.resource.constraint.mopp.ConstraintPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new syntax.resource.constraint.mopp.ConstraintSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new syntax.resource.constraint.mopp.ConstraintSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public syntax.resource.constraint.IConstraintReferenceResolverSwitch getReferenceResolverSwitch() {
		return new syntax.resource.constraint.mopp.ConstraintReferenceResolverSwitch();
	}
	
	public syntax.resource.constraint.IConstraintTokenResolverFactory getTokenResolverFactory() {
		return new syntax.resource.constraint.mopp.ConstraintTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "constraintHydra/metamodelos/syntax.cs";
	}
	
	public String[] getTokenNames() {
		return new syntax.resource.constraint.mopp.ConstraintParser(null).getTokenNames();
	}
	
	public syntax.resource.constraint.IConstraintTokenStyle getDefaultTokenStyle(String tokenName) {
		return new syntax.resource.constraint.mopp.ConstraintTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<syntax.resource.constraint.IConstraintBracketPair> getBracketPairs() {
		return new syntax.resource.constraint.mopp.ConstraintBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new syntax.resource.constraint.mopp.ConstraintFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new syntax.resource.constraint.mopp.ConstraintResourceFactory();
	}
	
	public syntax.resource.constraint.mopp.ConstraintNewFileContentProvider getNewFileContentProvider() {
		return new syntax.resource.constraint.mopp.ConstraintNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new syntax.resource.constraint.mopp.ConstraintResourceFactory());
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
		return "syntax.resource.constraint.ui.launchConfigurationType";
	}
	
}
