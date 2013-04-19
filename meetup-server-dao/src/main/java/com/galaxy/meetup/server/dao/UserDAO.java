/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao;

import com.galaxy.meetup.server.client.domain.User;

/**
 * 
 * @author sihai
 *
 */
public interface UserDAO {

	/**
	 * 
	 * @param user
	 */
	void insert(User user);
	
	/**
	 * 
	 * @param user
	 */
	void update(User user);
}
