/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstBracketInformationProvider {
	
	public class BracketPair implements hydraconstraints.resource.hydraConst.IHydraConstBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstBracketPair> getBracketPairs() {
		java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstBracketPair> result = new java.util.ArrayList<hydraconstraints.resource.hydraConst.IHydraConstBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("[", "]", true));
		return result;
	}
	
}
