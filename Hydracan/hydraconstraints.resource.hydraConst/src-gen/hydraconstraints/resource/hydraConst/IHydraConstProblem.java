/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst;

public interface IHydraConstProblem {
	public String getMessage();
	public hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity getSeverity();
	public hydraconstraints.resource.hydraConst.HydraConstEProblemType getType();
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> getQuickFixes();
}
