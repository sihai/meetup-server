/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.DataNotificationsData;
import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;
import com.galaxy.meetup.server.client.domain.ViewerData;


/**
 * 
 * @author sihai
 * 
 */
public class GetNotificationsResponse extends Response {

	public TraceRecords backendTrace;
	public DataNotificationsData notificationsData;
	public String obfuscatedGaiaId;
	public Boolean refreshRequired;
	public ViewerData viewerData;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public DataNotificationsData getNotificationsData() {
		return notificationsData;
	}

	public void setNotificationsData(DataNotificationsData notificationsData) {
		this.notificationsData = notificationsData;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public Boolean getRefreshRequired() {
		return refreshRequired;
	}

	public void setRefreshRequired(Boolean refreshRequired) {
		this.refreshRequired = refreshRequired;
	}

	public ViewerData getViewerData() {
		return viewerData;
	}

	public void setViewerData(ViewerData viewerData) {
		this.viewerData = viewerData;
	}
}
