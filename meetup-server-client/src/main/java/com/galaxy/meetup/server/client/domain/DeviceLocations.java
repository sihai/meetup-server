/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class DeviceLocations extends GenericJson {

	public List deviceLocation;
	
    public Metadata metadata;

	public List getDeviceLocation() {
		return deviceLocation;
	}

	public void setDeviceLocation(List deviceLocation) {
		this.deviceLocation = deviceLocation;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
