/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IConstraintResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public syntax.resource.constraint.IConstraintTextResource getResource();
	
}
