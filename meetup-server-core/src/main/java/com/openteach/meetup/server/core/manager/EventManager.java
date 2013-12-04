/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.manager;

import java.util.List;

import com.openteach.meetup.server.client.entity.Event;
import com.openteach.meetup.server.client.exception.ValidateException;

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
	void add(Event event) throws ValidateException;
	
	/**
	 * 
	 * @param publisher
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> getByPublisher(String publisher, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param idList
	 * @return
	 */
	List<Event> getByIdList(List<String> idList);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param event
	 * @throws ValidateException
	 */
	void update(Event event) throws ValidateException;
}
