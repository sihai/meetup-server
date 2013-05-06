/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.PlusEvent;


/**
 * 
 * @author sihai
 * 
 */
public class UpdateEventRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public PlusEvent event;

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

	public PlusEvent getEvent() {
		return event;
	}

	public void setEvent(PlusEvent event) {
		this.event = event;
	}
}
