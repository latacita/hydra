/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class HydraConstDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private hydraconstraints.resource.hydraConst.debug.HydraConstDebugTarget debugTarget;
	
	private hydraconstraints.resource.hydraConst.debug.HydraConstDebugCommunicationHelper communicationHelper = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugCommunicationHelper();
	
	public HydraConstDebugProxy(hydraconstraints.resource.hydraConst.debug.HydraConstDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.EXIT);
	}
	
	public hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage getStack() {
		return sendCommandAndRead(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage message = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage message = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage response = sendCommandAndRead(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage response = sendCommandAndRead(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		hydraconstraints.resource.hydraConst.debug.HydraConstDebugVariable[] variables  = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = hydraconstraints.resource.hydraConst.util.HydraConstStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			hydraconstraints.resource.hydraConst.debug.HydraConstDebugVariable variable = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes command, String... parameters) {
		hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage message = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage sendCommandAndRead(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes command, String... parameters) {
		hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage message = new hydraconstraints.resource.hydraConst.debug.HydraConstDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
