/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.debug;

public class ConstraintDebugCommunicationHelper {
	
	public void sendEvent(syntax.resource.constraint.debug.ConstraintDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public syntax.resource.constraint.debug.ConstraintDebugMessage sendAndReceive(syntax.resource.constraint.debug.ConstraintDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			syntax.resource.constraint.debug.ConstraintDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public syntax.resource.constraint.debug.ConstraintDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			syntax.resource.constraint.debug.ConstraintDebugMessage receivedMessage = syntax.resource.constraint.debug.ConstraintDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
