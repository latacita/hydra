/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IConstraintExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Adds an element that is a valid follower for this element
	 */
	public void addFollower(syntax.resource.constraint.IConstraintExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	
	/**
	 * Returns all valid followers for this element
	 */
	public java.util.Collection<syntax.resource.constraint.util.ConstraintPair<syntax.resource.constraint.IConstraintExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
	
}
