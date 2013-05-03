/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service;

import java.util.List;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.domain.User;

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
	 * @param publisher
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> getEventOfPublisher(String publisher, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param joiner
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> getEventOfJoiner(String joiner, int currentPage, int pageSize);
	
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
	 * @param eventId
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<User> getJoiners(String eventId, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param event
	 * @throws MeetupException
	 */
	void update(Event event) throws MeetupException;
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	List<Event> getRunningEventOfJoiner(String userName);
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	List<Event> getUpcomingEventOfJoiner(String userName);
}
