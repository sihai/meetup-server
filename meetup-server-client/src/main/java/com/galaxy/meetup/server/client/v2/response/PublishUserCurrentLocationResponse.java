/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.response;

import com.galaxy.meetup.server.client.v2.domain.Location;

/**
 * 
 * @author sihai
 *
 */
public class PublishUserCurrentLocationResponse extends Response {

	/**
	 * 
	 */
	private Location currentLocation;

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}
}
