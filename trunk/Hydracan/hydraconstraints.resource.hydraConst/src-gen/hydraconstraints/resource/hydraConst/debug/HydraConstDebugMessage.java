/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class HydraConstDebugMessage {
	
	private static final char DELIMITER = ':';
	private hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes messageType;
	private String[] arguments;
	
	public HydraConstDebugMessage(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public HydraConstDebugMessage(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes getMessageType() {
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
		return hydraconstraints.resource.hydraConst.util.HydraConstStringUtil.encode(DELIMITER, parts);
	}
	
	public static HydraConstDebugMessage deserialize(String response) {
		java.util.List<String> parts = hydraconstraints.resource.hydraConst.util.HydraConstStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes type = hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes.valueOf(messageType);
		HydraConstDebugMessage message = new HydraConstDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(hydraconstraints.resource.hydraConst.debug.EHydraConstDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + hydraconstraints.resource.hydraConst.util.HydraConstStringUtil.explode(arguments, ", ") + "]";
	}
	
}
