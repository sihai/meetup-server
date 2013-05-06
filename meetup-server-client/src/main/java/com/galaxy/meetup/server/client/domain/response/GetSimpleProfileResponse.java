/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.SimpleProfile;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class GetSimpleProfileResponse extends Response {

	public TraceRecords backendTrace;
	public SimpleProfile profile;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public SimpleProfile getProfile() {
		return profile;
	}

	public void setProfile(SimpleProfile profile) {
		this.profile = profile;
	}
}
