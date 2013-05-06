/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.request;

import com.galaxy.meetup.server.client.v2.domain.Event;

/**
 * 
 * @author sihai
 *
 */
public class UpdateEventRequest extends Request {

	/**
	 * 
	 */
	private Event event;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}
