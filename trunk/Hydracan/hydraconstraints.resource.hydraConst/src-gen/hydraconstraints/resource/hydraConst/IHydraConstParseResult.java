/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IHydraConstParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>> getPostParseCommands();
	
}
