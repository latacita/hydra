/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IHydraConstExpectedElement {
	
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
	public void addFollower(hydraconstraints.resource.hydraConst.IHydraConstExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	
	/**
	 * Returns all valid followers for this element
	 */
	public java.util.Collection<hydraconstraints.resource.hydraConst.util.HydraConstPair<hydraconstraints.resource.hydraConst.IHydraConstExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
	
}
