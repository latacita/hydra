/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IConstraintCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
