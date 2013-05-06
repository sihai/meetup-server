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
public class DeletePhotosResponse extends Response {

	public TraceRecords backendTrace;
	
    public String kansasVersionInfo;
    
    public Boolean success;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getKansasVersionInfo() {
		return kansasVersionInfo;
	}

	public void setKansasVersionInfo(String kansasVersionInfo) {
		this.kansasVersionInfo = kansasVersionInfo;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
}
