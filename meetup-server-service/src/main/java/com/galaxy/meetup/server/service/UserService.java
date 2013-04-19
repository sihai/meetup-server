/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service;

import com.galaxy.meetup.server.client.domain.User;
import com.galaxy.meetup.server.client.exception.ValidateException;

/**
 * 
 * @author sihai
 *
 */
public interface UserService {

	/**
	 * 
	 * @param user
	 * @throws ValidateException
	 */
	void register(User user) throws ValidateException;
}
