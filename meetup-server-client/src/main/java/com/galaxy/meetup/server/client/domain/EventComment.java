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
public class EventComment extends GenericJson {

	public String eventId;
	
    public String eventOwnerObfuscatedId;
    
    public Boolean isBroadcastView;

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

	public Boolean getIsBroadcastView() {
		return isBroadcastView;
	}

	public void setIsBroadcastView(Boolean isBroadcastView) {
		this.isBroadcastView = isBroadcastView;
	}
}
