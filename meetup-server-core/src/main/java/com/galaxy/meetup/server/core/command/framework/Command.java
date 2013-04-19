/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import com.galaxy.meetup.server.client.domain.GenericJson;
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
	<T extends GenericJson> T getRequest(Class<? extends GenericJson> clazz);
}
