/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class ReportAbuseActivityResponse extends Response {

	public TraceRecords backendTrace;
	public Boolean isUndo;
	public List itemIds;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public Boolean getIsUndo() {
		return isUndo;
	}

	public void setIsUndo(Boolean isUndo) {
		this.isUndo = isUndo;
	}

	public List getItemIds() {
		return itemIds;
	}

	public void setItemIds(List itemIds) {
		this.itemIds = itemIds;
	}
}
