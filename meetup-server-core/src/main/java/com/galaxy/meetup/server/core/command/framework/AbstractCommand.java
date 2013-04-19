/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import com.galaxy.meetup.server.core.client.ClientInfo;

/**
 * 
 * @author sihai
 *
 */
public abstract class AbstractCommand implements Command {

	/**
	 * 
	 */
	protected final ClientInfo clientInfo;
	
	/**
	 * String command
	 */
	protected String command;
	
	/**
	 * 
	 * @param clientInfo
	 * @param command
	 */
	public AbstractCommand(ClientInfo clientInfo, String command) {
		this.clientInfo = clientInfo;
		this.command = command;
	}
	
	@Override
	public ClientInfo getClientInfo() {
		return clientInfo;
	}

	public String getCommand() {
		return command;
	}
}
