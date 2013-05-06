/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.response;

import com.galaxy.meetup.server.client.v2.domain.Event;

/**
 * 
 * @author sihai
 *
 */
public class UpdateEventResponse extends Response {

	/**
	 * XXX No need return event to client
	 */
	private Event event;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
}
