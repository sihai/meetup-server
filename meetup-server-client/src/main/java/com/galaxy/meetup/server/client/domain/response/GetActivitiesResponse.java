/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.ShareboxSettings;
import com.galaxy.meetup.server.client.domain.Stream;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class GetActivitiesResponse extends GenericJson {

	public TraceRecords backendTrace;
	public ShareboxSettings shareboxSettings;
	public Stream stream;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public ShareboxSettings getShareboxSettings() {
		return shareboxSettings;
	}

	public void setShareboxSettings(ShareboxSettings shareboxSettings) {
		this.shareboxSettings = shareboxSettings;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}
}
