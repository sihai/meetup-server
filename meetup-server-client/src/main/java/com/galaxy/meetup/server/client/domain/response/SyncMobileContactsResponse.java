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
public class SyncMobileContactsResponse extends Response {

	public Boolean aggregationSyncRequired;
	public TraceRecords backendTrace;
	public java.util.List failedContact;
	public String status;

	public Boolean getAggregationSyncRequired() {
		return aggregationSyncRequired;
	}

	public void setAggregationSyncRequired(Boolean aggregationSyncRequired) {
		this.aggregationSyncRequired = aggregationSyncRequired;
	}

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public java.util.List getFailedContact() {
		return failedContact;
	}

	public void setFailedContact(java.util.List failedContact) {
		this.failedContact = failedContact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
