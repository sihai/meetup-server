/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.OzDataSettings;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class SettingsFetchResponse extends GenericJson {

	public TraceRecords backendTrace;
	public OzDataSettings settings;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public OzDataSettings getSettings() {
		return settings;
	}

	public void setSettings(OzDataSettings settings) {
		this.settings = settings;
	}
}
