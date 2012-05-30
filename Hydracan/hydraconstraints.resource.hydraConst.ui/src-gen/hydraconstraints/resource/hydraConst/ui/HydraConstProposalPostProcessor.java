/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class HydraConstProposalPostProcessor {
	
	public java.util.List<hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal> process(java.util.List<hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
