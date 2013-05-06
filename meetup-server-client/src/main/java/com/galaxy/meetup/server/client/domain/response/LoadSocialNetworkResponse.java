/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.DataPersonList;
import com.galaxy.meetup.server.client.domain.DataSystemGroups;
import com.galaxy.meetup.server.client.domain.DataViewerCircles;
import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class LoadSocialNetworkResponse extends Response {

	public TraceRecords backendTrace;
	public DataPersonList personList;
	public DataSystemGroups systemGroups;
	public DataViewerCircles viewerCircles;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public DataPersonList getPersonList() {
		return personList;
	}

	public void setPersonList(DataPersonList personList) {
		this.personList = personList;
	}

	public DataSystemGroups getSystemGroups() {
		return systemGroups;
	}

	public void setSystemGroups(DataSystemGroups systemGroups) {
		this.systemGroups = systemGroups;
	}

	public DataViewerCircles getViewerCircles() {
		return viewerCircles;
	}

	public void setViewerCircles(DataViewerCircles viewerCircles) {
		this.viewerCircles = viewerCircles;
	}
}
