/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;
import com.galaxy.meetup.server.client.domain.VolumeControlMap;


/**
 * 
 * @author sihai
 * 
 */
public class GetVolumeControlsResponse extends GenericJson {

	public TraceRecords backendTrace;
	public VolumeControlMap map;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public VolumeControlMap getMap() {
		return map;
	}

	public void setMap(VolumeControlMap map) {
		this.map = map;
	}
}
