/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao;

import java.util.List;

import com.galaxy.meetup.server.client.v2.domain.Event;

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
	void insert(Event event);
	
	/**
	 * 
	 * @param publisher
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> query(String publisher, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param idList
	 * @return
	 */
	List<Event> query(List<String> idList);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> queryNearby(double longitude, double latitude, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param event
	 */
	void update(Event event);
}
