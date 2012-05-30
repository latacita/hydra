/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

public class HydraConstChoice extends hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement {
	
	public HydraConstChoice(hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality, hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return hydraconstraints.resource.hydraConst.util.HydraConstStringUtil.explode(getChildren(), "|");
	}
	
}
