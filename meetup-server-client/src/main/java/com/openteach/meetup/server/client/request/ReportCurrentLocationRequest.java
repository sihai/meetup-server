package com.openteach.meetup.server.client.request;

import com.openteach.meetup.server.client.entity.Location;

/**
 * 
 * @author sihai
 *
 */
public class ReportCurrentLocationRequest extends Request {

	private Location currentLocation;

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

}
