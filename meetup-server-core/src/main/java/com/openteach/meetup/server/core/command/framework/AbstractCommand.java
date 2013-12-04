/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.command.framework;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.core.client.ClientInfo;

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
	 * 
	 */
	protected final User user;
	
	/**
	 * String command
	 */
	protected String command;
	
	/**
	 * 
	 * @param clientInfo
	 * @param user
	 * @param command
	 */
	public AbstractCommand(ClientInfo clientInfo, User user, String command) {
		this.clientInfo = clientInfo;
		this.user = user;
		this.command = command;
	}
	
	@Override
	public ClientInfo getClientInfo() {
		return clientInfo;
	}
	
	@Override
	public User getUser() {
		return user;
	}

	public String getCommand() {
		return command;
	}
}
