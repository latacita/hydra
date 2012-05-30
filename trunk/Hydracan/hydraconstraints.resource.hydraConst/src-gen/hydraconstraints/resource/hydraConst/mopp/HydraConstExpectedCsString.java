/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class HydraConstExpectedCsString extends hydraconstraints.resource.hydraConst.mopp.HydraConstAbstractExpectedElement {
	
	private hydraconstraints.resource.hydraConst.grammar.HydraConstKeyword keyword;
	
	public HydraConstExpectedCsString(hydraconstraints.resource.hydraConst.grammar.HydraConstKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof HydraConstExpectedCsString) {
			return getValue().equals(((HydraConstExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
