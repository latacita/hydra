/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IConstraintParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>> getPostParseCommands();
	
}
