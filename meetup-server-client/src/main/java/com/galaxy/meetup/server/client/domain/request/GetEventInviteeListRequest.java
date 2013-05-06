/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EventSelector;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 * 
 */
public class GetEventInviteeListRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String eventId;
	public EventSelector eventSelector;
	public Boolean includeAdminBlacklist;
	public Boolean includeSquares;
	public String invitationToken;
	public Integer maxInvitees;
	public Boolean photoContributorsOnly;
	public String resumeToken;
	public String rsvpType;
	public Boolean taggeesOnly;

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

	public Boolean getIncludeAdminBlacklist() {
		return includeAdminBlacklist;
	}

	public void setIncludeAdminBlacklist(Boolean includeAdminBlacklist) {
		this.includeAdminBlacklist = includeAdminBlacklist;
	}

	public Boolean getIncludeSquares() {
		return includeSquares;
	}

	public void setIncludeSquares(Boolean includeSquares) {
		this.includeSquares = includeSquares;
	}

	public String getInvitationToken() {
		return invitationToken;
	}

	public void setInvitationToken(String invitationToken) {
		this.invitationToken = invitationToken;
	}

	public Integer getMaxInvitees() {
		return maxInvitees;
	}

	public void setMaxInvitees(Integer maxInvitees) {
		this.maxInvitees = maxInvitees;
	}

	public Boolean getPhotoContributorsOnly() {
		return photoContributorsOnly;
	}

	public void setPhotoContributorsOnly(Boolean photoContributorsOnly) {
		this.photoContributorsOnly = photoContributorsOnly;
	}

	public String getResumeToken() {
		return resumeToken;
	}

	public void setResumeToken(String resumeToken) {
		this.resumeToken = resumeToken;
	}

	public String getRsvpType() {
		return rsvpType;
	}

	public void setRsvpType(String rsvpType) {
		this.rsvpType = rsvpType;
	}

	public Boolean getTaggeesOnly() {
		return taggeesOnly;
	}

	public void setTaggeesOnly(Boolean taggeesOnly) {
		this.taggeesOnly = taggeesOnly;
	}
}
