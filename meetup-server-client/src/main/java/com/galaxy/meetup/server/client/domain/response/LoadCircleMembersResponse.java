/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.DataContinuationToken;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class LoadCircleMembersResponse extends GenericJson {

	public TraceRecords backendTrace;
	public Long changesSinceMillis;
	public List circleData;
	public List circlePerson;
	public DataContinuationToken continuationToken;
	public Integer totalPeople;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public Long getChangesSinceMillis() {
		return changesSinceMillis;
	}

	public void setChangesSinceMillis(Long changesSinceMillis) {
		this.changesSinceMillis = changesSinceMillis;
	}

	public List getCircleData() {
		return circleData;
	}

	public void setCircleData(List circleData) {
		this.circleData = circleData;
	}

	public List getCirclePerson() {
		return circlePerson;
	}

	public void setCirclePerson(List circlePerson) {
		this.circlePerson = circlePerson;
	}

	public DataContinuationToken getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(DataContinuationToken continuationToken) {
		this.continuationToken = continuationToken;
	}

	public Integer getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(Integer totalPeople) {
		this.totalPeople = totalPeople;
	}
}
