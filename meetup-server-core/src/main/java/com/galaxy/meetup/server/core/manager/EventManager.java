/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager;

import java.util.List;

import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.Event;

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
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> nearby(double longitude, double latitude, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param event
	 * @throws ValidateException
	 */
	void update(Event event) throws ValidateException;
}
