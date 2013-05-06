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
public class SearchNearbyEventResponse extends Response {

	private List<Event> eventList;

	public List<Event> getEventList() {
		return eventList;
	}

	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}
}
