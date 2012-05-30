/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class ConstraintDebugMessage {
	
	private static final char DELIMITER = ':';
	private syntax.resource.constraint.debug.EConstraintDebugMessageTypes messageType;
	private String[] arguments;
	
	public ConstraintDebugMessage(syntax.resource.constraint.debug.EConstraintDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public ConstraintDebugMessage(syntax.resource.constraint.debug.EConstraintDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public syntax.resource.constraint.debug.EConstraintDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return syntax.resource.constraint.util.ConstraintStringUtil.encode(DELIMITER, parts);
	}
	
	public static ConstraintDebugMessage deserialize(String response) {
		java.util.List<String> parts = syntax.resource.constraint.util.ConstraintStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		syntax.resource.constraint.debug.EConstraintDebugMessageTypes type = syntax.resource.constraint.debug.EConstraintDebugMessageTypes.valueOf(messageType);
		ConstraintDebugMessage message = new ConstraintDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(syntax.resource.constraint.debug.EConstraintDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + syntax.resource.constraint.util.ConstraintStringUtil.explode(arguments, ", ") + "]";
	}
	
}
