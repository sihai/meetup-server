/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class EventActivityData extends GenericJson {

	public Boolean broadcastEventActivity;
	
    public List recipientRsvpType;

	public Boolean getBroadcastEventActivity() {
		return broadcastEventActivity;
	}

	public void setBroadcastEventActivity(Boolean broadcastEventActivity) {
		this.broadcastEventActivity = broadcastEventActivity;
	}

	public List getRecipientRsvpType() {
		return recipientRsvpType;
	}

	public void setRecipientRsvpType(List recipientRsvpType) {
		this.recipientRsvpType = recipientRsvpType;
	}
}
