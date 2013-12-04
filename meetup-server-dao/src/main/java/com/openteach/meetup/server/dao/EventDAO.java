/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao;

import java.util.List;

import com.openteach.meetup.server.client.entity.Event;

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
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param event
	 */
	void update(Event event);
}
