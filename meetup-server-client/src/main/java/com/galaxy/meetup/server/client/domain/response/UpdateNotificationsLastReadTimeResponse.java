/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class UpdateNotificationsLastReadTimeResponse extends GenericJson {

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
