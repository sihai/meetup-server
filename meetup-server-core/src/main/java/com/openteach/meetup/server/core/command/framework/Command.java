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
