/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;
import com.galaxy.meetup.server.client.domain.Update;


/**
 * 
 * @author sihai
 * 
 */
public class GetActivityResponse extends Response {

	public TraceRecords backendTrace;
	public Update update;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public Update getUpdate() {
		return update;
	}

	public void setUpdate(Update update) {
		this.update = update;
	}
}
