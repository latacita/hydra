/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

public class HydraConstCompound extends hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement {
	
	public HydraConstCompound(hydraconstraints.resource.hydraConst.grammar.HydraConstChoice choice, hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality) {
		super(cardinality, new hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
