/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

public class HydraConstSequence extends hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement {
	
	public HydraConstSequence(hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality, hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return hydraconstraints.resource.hydraConst.util.HydraConstStringUtil.explode(getChildren(), " ");
	}
	
}
