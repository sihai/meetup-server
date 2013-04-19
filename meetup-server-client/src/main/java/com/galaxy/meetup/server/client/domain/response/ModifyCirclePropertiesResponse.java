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
public class ModifyCirclePropertiesResponse extends GenericJson {

	public TraceRecords backendTrace;
	public Integer category;
	public String nameSortKey;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getNameSortKey() {
		return nameSortKey;
	}

	public void setNameSortKey(String nameSortKey) {
		this.nameSortKey = nameSortKey;
	}
}
