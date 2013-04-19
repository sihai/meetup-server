/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class EventPhoto extends GenericJson {

	public String eventId;
	public String eventOwnerObfuscatedId;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventOwnerObfuscatedId() {
		return eventOwnerObfuscatedId;
	}

	public void setEventOwnerObfuscatedId(String eventOwnerObfuscatedId) {
		this.eventOwnerObfuscatedId = eventOwnerObfuscatedId;
	}
}
