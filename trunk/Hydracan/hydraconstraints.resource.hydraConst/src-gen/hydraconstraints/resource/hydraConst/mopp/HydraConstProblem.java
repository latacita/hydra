/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstProblem implements hydraconstraints.resource.hydraConst.IHydraConstProblem {
	
	private String message;
	private hydraconstraints.resource.hydraConst.HydraConstEProblemType type;
	private hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity severity;
	private java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> quickFixes;
	
	public HydraConstProblem(String message, hydraconstraints.resource.hydraConst.HydraConstEProblemType type, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<hydraconstraints.resource.hydraConst.IHydraConstQuickFix>emptySet());
	}
	
	public HydraConstProblem(String message, hydraconstraints.resource.hydraConst.HydraConstEProblemType type, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity severity, hydraconstraints.resource.hydraConst.IHydraConstQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public HydraConstProblem(String message, hydraconstraints.resource.hydraConst.HydraConstEProblemType type, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity severity, java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<hydraconstraints.resource.hydraConst.IHydraConstQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public hydraconstraints.resource.hydraConst.HydraConstEProblemType getType() {
		return type;
	}
	
	public hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
