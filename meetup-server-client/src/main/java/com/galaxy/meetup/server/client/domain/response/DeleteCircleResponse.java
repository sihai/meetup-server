/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.DataRevertCookie;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 *
 */
public class DeleteCircleResponse extends GenericJson {

	public TraceRecords backendTrace;
	
    public DataRevertCookie revertCookie;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public DataRevertCookie getRevertCookie() {
		return revertCookie;
	}

	public void setRevertCookie(DataRevertCookie revertCookie) {
		this.revertCookie = revertCookie;
	}
}
