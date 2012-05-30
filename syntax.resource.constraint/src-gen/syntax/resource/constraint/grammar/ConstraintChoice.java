/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

public class ConstraintChoice extends syntax.resource.constraint.grammar.ConstraintSyntaxElement {
	
	public ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality cardinality, syntax.resource.constraint.grammar.ConstraintSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return syntax.resource.constraint.util.ConstraintStringUtil.explode(getChildren(), "|");
	}
	
}
