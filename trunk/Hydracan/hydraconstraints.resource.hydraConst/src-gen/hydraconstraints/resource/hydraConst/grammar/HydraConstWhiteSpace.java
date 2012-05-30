/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

public class HydraConstWhiteSpace extends hydraconstraints.resource.hydraConst.grammar.HydraConstFormattingElement {
	
	private final int amount;
	
	public HydraConstWhiteSpace(int amount, hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
