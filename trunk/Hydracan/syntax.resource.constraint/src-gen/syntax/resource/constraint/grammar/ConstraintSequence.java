/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

public class ConstraintSequence extends syntax.resource.constraint.grammar.ConstraintSyntaxElement {
	
	public ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality cardinality, syntax.resource.constraint.grammar.ConstraintSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return syntax.resource.constraint.util.ConstraintStringUtil.explode(getChildren(), " ");
	}
	
}
