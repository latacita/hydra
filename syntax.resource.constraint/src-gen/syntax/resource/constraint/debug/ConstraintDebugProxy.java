/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class ConstraintDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private syntax.resource.constraint.debug.ConstraintDebugTarget debugTarget;
	
	private syntax.resource.constraint.debug.ConstraintDebugCommunicationHelper communicationHelper = new syntax.resource.constraint.debug.ConstraintDebugCommunicationHelper();
	
	public ConstraintDebugProxy(syntax.resource.constraint.debug.ConstraintDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
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
		sendCommand(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.EXIT);
	}
	
	public syntax.resource.constraint.debug.ConstraintDebugMessage getStack() {
		return sendCommandAndRead(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		syntax.resource.constraint.debug.ConstraintDebugMessage message = new syntax.resource.constraint.debug.ConstraintDebugMessage(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		syntax.resource.constraint.debug.ConstraintDebugMessage message = new syntax.resource.constraint.debug.ConstraintDebugMessage(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		syntax.resource.constraint.debug.ConstraintDebugMessage response = sendCommandAndRead(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		syntax.resource.constraint.debug.ConstraintDebugMessage response = sendCommandAndRead(syntax.resource.constraint.debug.EConstraintDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		syntax.resource.constraint.debug.ConstraintDebugVariable[] variables  = new syntax.resource.constraint.debug.ConstraintDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = syntax.resource.constraint.util.ConstraintStringUtil.convertFromString(varString);
			
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
			org.eclipse.debug.core.model.IValue value = new syntax.resource.constraint.debug.ConstraintDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			syntax.resource.constraint.debug.ConstraintDebugVariable variable = new syntax.resource.constraint.debug.ConstraintDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(syntax.resource.constraint.debug.EConstraintDebugMessageTypes command, String... parameters) {
		syntax.resource.constraint.debug.ConstraintDebugMessage message = new syntax.resource.constraint.debug.ConstraintDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private syntax.resource.constraint.debug.ConstraintDebugMessage sendCommandAndRead(syntax.resource.constraint.debug.EConstraintDebugMessageTypes command, String... parameters) {
		syntax.resource.constraint.debug.ConstraintDebugMessage message = new syntax.resource.constraint.debug.ConstraintDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
