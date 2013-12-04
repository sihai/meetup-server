package com.openteach.meetup.server.core.push.framework;

/**
 * 
 * @author sihai
 *
 */
public interface Handler {
	
	/**
	 * 
	 * @param message
	 */
	void handle(String message, ClientConnection connection);
}
