/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.DataRevertCookie;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class ModifyMembershipsResponse extends GenericJson {

	public TraceRecords backendTrace;
	public List circlePerson;
	public DataRevertCookie revertCookie;
	public String versionInfo;
	public Boolean viewerCanSeeAdultContent;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getCirclePerson() {
		return circlePerson;
	}

	public void setCirclePerson(List circlePerson) {
		this.circlePerson = circlePerson;
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

	public Boolean getViewerCanSeeAdultContent() {
		return viewerCanSeeAdultContent;
	}

	public void setViewerCanSeeAdultContent(Boolean viewerCanSeeAdultContent) {
		this.viewerCanSeeAdultContent = viewerCanSeeAdultContent;
	}
}
