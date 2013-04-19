/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager;

import com.galaxy.meetup.server.client.domain.User;
import com.galaxy.meetup.server.client.exception.ValidateException;

/**
 * 
 * @author sihai
 *
 */
public interface UserManager {

	/**
	 * 
	 * @param user
	 * @throws ValidateException
	 */
	void add(User user) throws ValidateException;
	
	/**
	 * 
	 * @param user
	 * @throws ValidateException
	 */
	void update(User user) throws ValidateException;
}
