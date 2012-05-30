/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class ConstraintAbstractExpectedElement implements syntax.resource.constraint.IConstraintExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<syntax.resource.constraint.util.ConstraintPair<syntax.resource.constraint.IConstraintExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<syntax.resource.constraint.util.ConstraintPair<syntax.resource.constraint.IConstraintExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public ConstraintAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(syntax.resource.constraint.IConstraintExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new syntax.resource.constraint.util.ConstraintPair<syntax.resource.constraint.IConstraintExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<syntax.resource.constraint.util.ConstraintPair<syntax.resource.constraint.IConstraintExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
