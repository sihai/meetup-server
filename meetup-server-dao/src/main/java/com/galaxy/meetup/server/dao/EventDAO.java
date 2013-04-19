/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao;

import com.galaxy.meetup.server.client.domain.PlusEvent;

/**
 * 
 * @author sihai
 *
 */
public interface EventDAO {

	/**
	 * 
	 * @param event
	 */
	void insert(PlusEvent event);
	
	/**
	 * 
	 * @param event
	 */
	void update(PlusEvent event);
}
