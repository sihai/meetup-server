/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EventSelector;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 *
 */
public class DeleteEventRequest extends Request {

	public ApiaryFields commonFields;
	
    public Boolean enableTracing;
    
    public String eventId;
    
    public EventSelector eventSelector;

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
}
