/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class ConstraintSyntaxElement {
	
	private ConstraintSyntaxElement[] children;
	private ConstraintSyntaxElement parent;
	private syntax.resource.constraint.grammar.ConstraintCardinality cardinality;
	
	public ConstraintSyntaxElement(syntax.resource.constraint.grammar.ConstraintCardinality cardinality, ConstraintSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (ConstraintSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(ConstraintSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public ConstraintSyntaxElement[] getChildren() {
		if (children == null) {
			return new ConstraintSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public syntax.resource.constraint.grammar.ConstraintCardinality getCardinality() {
		return cardinality;
	}
	
}
