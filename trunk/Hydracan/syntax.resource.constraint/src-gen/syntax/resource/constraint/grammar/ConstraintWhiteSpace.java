/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

public class ConstraintWhiteSpace extends syntax.resource.constraint.grammar.ConstraintFormattingElement {
	
	private final int amount;
	
	public ConstraintWhiteSpace(int amount, syntax.resource.constraint.grammar.ConstraintCardinality cardinality) {
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
