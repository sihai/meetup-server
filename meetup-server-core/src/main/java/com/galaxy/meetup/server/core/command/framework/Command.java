/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.core.client.ClientInfo;

/**
 * 
 * @author sihai
 *
 */
public interface Command {
	
	/**
	 * 
	 * @return
	 */
	ClientInfo getClientInfo();

	/**
	 * 
	 * @return
	 */
	User getUser();
	
	/**
	 * 
	 * @return
	 */
	String getCommand();
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	Object getParameter(String key);
	
	/**
	 * 
	 * @return
	 */
	<T> T getRequest(Class clazz);
}
