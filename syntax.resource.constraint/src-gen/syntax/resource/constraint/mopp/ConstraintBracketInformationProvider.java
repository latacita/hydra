/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintBracketInformationProvider {
	
	public class BracketPair implements syntax.resource.constraint.IConstraintBracketPair {
		
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
	
	public java.util.Collection<syntax.resource.constraint.IConstraintBracketPair> getBracketPairs() {
		java.util.Collection<syntax.resource.constraint.IConstraintBracketPair> result = new java.util.ArrayList<syntax.resource.constraint.IConstraintBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("[", "]", true));
		return result;
	}
	
}
