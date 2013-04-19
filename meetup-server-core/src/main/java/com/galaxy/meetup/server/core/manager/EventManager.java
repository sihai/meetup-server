/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager;

import com.galaxy.meetup.server.client.domain.PlusEvent;
import com.galaxy.meetup.server.client.exception.ValidateException;

/**
 * 
 * @author sihai
 *
 */
public interface EventManager {

	/**
	 * 
	 * @param event
	 * @throws ValidateException
	 */
	void add(PlusEvent event) throws ValidateException;
	
	/**
	 * 
	 * @param event
	 * @throws ValidateException
	 */
	void update(PlusEvent event) throws ValidateException;
}
