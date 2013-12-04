/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.client.request;

import com.openteach.meetup.server.client.entity.Event;

/**
 * 
 * @author sihai
 *
 */
public class PublishEventRequest extends Request {

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
