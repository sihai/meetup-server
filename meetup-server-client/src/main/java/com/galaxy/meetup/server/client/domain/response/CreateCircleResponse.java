/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.DataCircleId;
import com.galaxy.meetup.server.client.domain.DataRevertCookie;
import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 *
 */
public class CreateCircleResponse extends Response {

	public TraceRecords backendTrace;
	
    public Integer category;
    
    public DataCircleId circleId;
    
    public List circlePerson;
    
    public String nameSortKey;
    
    public DataRevertCookie revertCookie;
    
    public String versionInfo;

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

	public DataCircleId getCircleId() {
		return circleId;
	}

	public void setCircleId(DataCircleId circleId) {
		this.circleId = circleId;
	}

	public List getCirclePerson() {
		return circlePerson;
	}

	public void setCirclePerson(List circlePerson) {
		this.circlePerson = circlePerson;
	}

	public String getNameSortKey() {
		return nameSortKey;
	}

	public void setNameSortKey(String nameSortKey) {
		this.nameSortKey = nameSortKey;
	}

	public DataRevertCookie getRevertCookie() {
		return revertCookie;
	}

	public void setRevertCookie(DataRevertCookie revertCookie) {
		this.revertCookie = revertCookie;
	}

	public String getVersionInfo() {
		return versionInfo;
	}

	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}
}
