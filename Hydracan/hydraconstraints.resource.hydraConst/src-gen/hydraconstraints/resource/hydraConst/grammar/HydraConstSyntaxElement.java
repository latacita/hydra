/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class HydraConstSyntaxElement {
	
	private HydraConstSyntaxElement[] children;
	private HydraConstSyntaxElement parent;
	private hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality;
	
	public HydraConstSyntaxElement(hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality, HydraConstSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (HydraConstSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(HydraConstSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public HydraConstSyntaxElement[] getChildren() {
		if (children == null) {
			return new HydraConstSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality getCardinality() {
		return cardinality;
	}
	
}
