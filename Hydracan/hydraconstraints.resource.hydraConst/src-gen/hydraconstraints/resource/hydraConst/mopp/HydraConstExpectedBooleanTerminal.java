/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class HydraConstExpectedBooleanTerminal extends hydraconstraints.resource.hydraConst.mopp.HydraConstAbstractExpectedElement {
	
	private hydraconstraints.resource.hydraConst.grammar.HydraConstBooleanTerminal booleanTerminal;
	
	public HydraConstExpectedBooleanTerminal(hydraconstraints.resource.hydraConst.grammar.HydraConstBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public hydraconstraints.resource.hydraConst.grammar.HydraConstBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof HydraConstExpectedBooleanTerminal) {
			return getFeature().equals(((HydraConstExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
