/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EventSelector;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 * 
 */
public final class EventRespondRequest extends GenericJson {

	public ApiaryFields commonFields;
	public String deprecated1;
	public Boolean enableTracing;
	public String eventId;
	public EventSelector eventSelector;
	public String invitationToken;
	public String location;
	public Integer numAdditionalGuests;
	public String offNetworkDisplayName;
	public String response;
	public String rsvpToken;
	public String squareId;

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getDeprecated1() {
		return deprecated1;
	}

	public void setDeprecated1(String deprecated1) {
		this.deprecated1 = deprecated1;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public EventSelector getEventSelector() {
		return eventSelector;
	}

	public void setEventSelector(EventSelector eventSelector) {
		this.eventSelector = eventSelector;
	}

	public String getInvitationToken() {
		return invitationToken;
	}

	public void setInvitationToken(String invitationToken) {
		this.invitationToken = invitationToken;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNumAdditionalGuests() {
		return numAdditionalGuests;
	}

	public void setNumAdditionalGuests(Integer numAdditionalGuests) {
		this.numAdditionalGuests = numAdditionalGuests;
	}

	public String getOffNetworkDisplayName() {
		return offNetworkDisplayName;
	}

	public void setOffNetworkDisplayName(String offNetworkDisplayName) {
		this.offNetworkDisplayName = offNetworkDisplayName;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getRsvpToken() {
		return rsvpToken;
	}

	public void setRsvpToken(String rsvpToken) {
		this.rsvpToken = rsvpToken;
	}

	public String getSquareId() {
		return squareId;
	}

	public void setSquareId(String squareId) {
		this.squareId = squareId;
	}
}
