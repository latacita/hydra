/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.debug;

public class HydraConstSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof hydraconstraints.resource.hydraConst.debug.HydraConstStackFrame) {
			hydraconstraints.resource.hydraConst.debug.HydraConstStackFrame frame = (hydraconstraints.resource.hydraConst.debug.HydraConstStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
