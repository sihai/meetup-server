/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service;

import java.util.List;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.client.v2.domain.Location;

/**
 * 
 * @author sihai
 *
 */
public interface EventService {

	/**
	 * Publish one event
	 * @param event
	 * @throws MeetupException
	 */
	void publish(Event event) throws MeetupException;
	
	/**
	 * 
	 * @param location
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> searchNearby(Location location, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param idList
	 * @return
	 */
	List<Event> getByIdList(List<String> idList);
	
	/**
	 * 
	 * @param event
	 * @throws MeetupException
	 */
	void update(Event event) throws MeetupException;
	
}
