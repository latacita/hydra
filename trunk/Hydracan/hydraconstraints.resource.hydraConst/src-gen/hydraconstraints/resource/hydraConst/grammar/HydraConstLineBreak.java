/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

public class HydraConstLineBreak extends hydraconstraints.resource.hydraConst.grammar.HydraConstFormattingElement {
	
	private final int tabs;
	
	public HydraConstLineBreak(hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
