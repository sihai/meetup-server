/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EventSelector;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 *
 */
public final class EventReadRequest extends GenericJson {

	public String authToken;
	public ApiaryFields commonFields;
	public String contentFormat;
	public Boolean enableTracing;
	public EventSelector eventSelector;
	public String invitationToken;
	public String pollingToken;
	public List readOptions;
	public Boolean requestAnonymously;
	public String resumeToken;

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
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

	public String getPollingToken() {
		return pollingToken;
	}

	public void setPollingToken(String pollingToken) {
		this.pollingToken = pollingToken;
	}

	public List getReadOptions() {
		return readOptions;
	}

	public void setReadOptions(List readOptions) {
		this.readOptions = readOptions;
	}

	public Boolean getRequestAnonymously() {
		return requestAnonymously;
	}

	public void setRequestAnonymously(Boolean requestAnonymously) {
		this.requestAnonymously = requestAnonymously;
	}

	public String getResumeToken() {
		return resumeToken;
	}

	public void setResumeToken(String resumeToken) {
		this.resumeToken = resumeToken;
	}

}
