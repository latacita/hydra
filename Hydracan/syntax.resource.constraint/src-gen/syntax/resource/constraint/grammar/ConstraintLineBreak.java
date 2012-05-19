/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

public class ConstraintLineBreak extends syntax.resource.constraint.grammar.ConstraintFormattingElement {
	
	private final int tabs;
	
	public ConstraintLineBreak(syntax.resource.constraint.grammar.ConstraintCardinality cardinality, int tabs) {
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
