/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IHydraConstResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessor getResourcePostProcessor();
	
}
