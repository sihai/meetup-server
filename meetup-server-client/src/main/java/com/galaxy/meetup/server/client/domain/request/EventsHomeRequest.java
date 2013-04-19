/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 * 
 */
public class EventsHomeRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Integer maxDeclinedUpcomingEvents;
	public Integer maxPastEvents;
	public Integer maxUpcomingEvents;
	public String pastResumeToken;

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

	public Integer getMaxDeclinedUpcomingEvents() {
		return maxDeclinedUpcomingEvents;
	}

	public void setMaxDeclinedUpcomingEvents(Integer maxDeclinedUpcomingEvents) {
		this.maxDeclinedUpcomingEvents = maxDeclinedUpcomingEvents;
	}

	public Integer getMaxPastEvents() {
		return maxPastEvents;
	}

	public void setMaxPastEvents(Integer maxPastEvents) {
		this.maxPastEvents = maxPastEvents;
	}

	public Integer getMaxUpcomingEvents() {
		return maxUpcomingEvents;
	}

	public void setMaxUpcomingEvents(Integer maxUpcomingEvents) {
		this.maxUpcomingEvents = maxUpcomingEvents;
	}

	public String getPastResumeToken() {
		return pastResumeToken;
	}

	public void setPastResumeToken(String pastResumeToken) {
		this.pastResumeToken = pastResumeToken;
	}
}
