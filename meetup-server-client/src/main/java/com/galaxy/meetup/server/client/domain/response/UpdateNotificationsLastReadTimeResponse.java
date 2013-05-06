/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class UpdateNotificationsLastReadTimeResponse extends Response {

	public TraceRecords backendTrace;
	public Double lastReadTime;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public Double getLastReadTime() {
		return lastReadTime;
	}

	public void setLastReadTime(Double lastReadTime) {
		this.lastReadTime = lastReadTime;
	}
}
