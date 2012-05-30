/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class HydraConstKeyword extends hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement {
	
	private final String value;
	
	public HydraConstKeyword(String value, hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
