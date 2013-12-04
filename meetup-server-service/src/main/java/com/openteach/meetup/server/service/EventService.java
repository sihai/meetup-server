/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service;

import java.util.List;

import com.openteach.meetup.server.client.entity.Event;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.MeetupException;

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
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> searchNearby(Location location, double maxDistance, int currentPage, int pageSize);
	
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
	
	
	//=================================================================================
	//				
	//=================================================================================
	/**
	 * 
	 * @param userName
	 * @param currentPage
	 * @param pageSzie
	 * @return
	 */
	List<Event> getMyRunning(String userName, int currentPage, int pageSzie);
	
	/**
	 * 
	 * @param userName
	 * @param currentPage
	 * @param pageSzie
	 * @return
	 */
	List<Event> getMyUpcoming(String userName, int currentPage, int pageSzie);
	
	/**
	 * 
	 * @param userName
	 * @param currentPage
	 * @param pageSzie
	 * @return
	 */
	List<Event> getMyPast(String userName, int currentPage, int pageSzie);
	
	/**
	 * 
	 * @param userName
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Event> getMyPublished(String userName, int currentPage, int pageSize);
	
}
