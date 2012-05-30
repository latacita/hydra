/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class ConstraintProposalPostProcessor {
	
	public java.util.List<syntax.resource.constraint.ui.ConstraintCompletionProposal> process(java.util.List<syntax.resource.constraint.ui.ConstraintCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
