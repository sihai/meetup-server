/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EventSelector;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.SharingRoster;


/**
 * 
 * @author sihai
 * 
 */
public class InviteEventRequest extends Request {

	public String aclDelta;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String eventId;
	public EventSelector eventSelector;
	public SharingRoster inviteRoster;
	public String location;
	public String organizerId;

	public String getAclDelta() {
		return aclDelta;
	}

	public void setAclDelta(String aclDelta) {
		this.aclDelta = aclDelta;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
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

	public SharingRoster getInviteRoster() {
		return inviteRoster;
	}

	public void setInviteRoster(SharingRoster inviteRoster) {
		this.inviteRoster = inviteRoster;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(String organizerId) {
		this.organizerId = organizerId;
	}
}
