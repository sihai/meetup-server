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
public class GetAudienceResponse extends Response {

	public String aclJson;
	public TraceRecords backendTrace;
	public Integer gaiaAudienceCount;
	public Integer nonGaiaAudienceCount;
	public List person;
	public String updateId;

	public String getAclJson() {
		return aclJson;
	}

	public void setAclJson(String aclJson) {
		this.aclJson = aclJson;
	}

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public Integer getGaiaAudienceCount() {
		return gaiaAudienceCount;
	}

	public void setGaiaAudienceCount(Integer gaiaAudienceCount) {
		this.gaiaAudienceCount = gaiaAudienceCount;
	}

	public Integer getNonGaiaAudienceCount() {
		return nonGaiaAudienceCount;
	}

	public void setNonGaiaAudienceCount(Integer nonGaiaAudienceCount) {
		this.nonGaiaAudienceCount = nonGaiaAudienceCount;
	}

	public List getPerson() {
		return person;
	}

	public void setPerson(List person) {
		this.person = person;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
}
