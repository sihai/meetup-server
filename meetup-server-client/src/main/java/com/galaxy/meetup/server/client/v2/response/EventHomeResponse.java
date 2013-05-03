/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.response;

import java.util.List;

import com.galaxy.meetup.server.client.v2.domain.Event;

/**
 * 
 * @author sihai
 *
 */
public class EventHomeResponse extends Response {

	/**
	 * 
	 */
	private List<Event> runningEventList;
	
	/**
	 * 
	 */
	private List<Event> upcomingEventList;

	public List<Event> getRunningEventList() {
		return runningEventList;
	}

	public void setRunningEventList(List<Event> runningEventList) {
		this.runningEventList = runningEventList;
	}

	public List<Event> getUpcomingEventList() {
		return upcomingEventList;
	}

	public void setUpcomingEventList(List<Event> upcomingEventList) {
		this.upcomingEventList = upcomingEventList;
	}
}
