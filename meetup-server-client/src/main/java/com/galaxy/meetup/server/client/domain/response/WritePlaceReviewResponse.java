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
public class WritePlaceReviewResponse extends Response {

	public TraceRecords backendTrace;
	public String zipitVersionInfo;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getZipitVersionInfo() {
		return zipitVersionInfo;
	}

	public void setZipitVersionInfo(String zipitVersionInfo) {
		this.zipitVersionInfo = zipitVersionInfo;
	}
}
