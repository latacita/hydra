/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.debug;

public class ConstraintDebugProcess extends syntax.resource.constraint.debug.ConstraintDebugElement implements org.eclipse.debug.core.model.IProcess, syntax.resource.constraint.debug.IConstraintDebugEventListener {
	
	private org.eclipse.debug.core.ILaunch launch;
	
	private boolean terminated = false;
	
	public ConstraintDebugProcess(org.eclipse.debug.core.ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public org.eclipse.debug.core.ILaunch getLaunch() {
		return launch;
	}
	
	public org.eclipse.debug.core.model.IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws org.eclipse.debug.core.DebugException {
		return 0;
	}
	
	public void handleMessage(syntax.resource.constraint.debug.ConstraintDebugMessage message) {
		if (message.hasType(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.TERMINATED)) {
			terminated = true;
		} else {
			// ignore other events
		}
	}
	
}
