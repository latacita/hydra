/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IHydraConstCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
