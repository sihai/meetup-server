/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.client.request;

import com.openteach.meetup.server.client.entity.Location;


/**
 * 
 * @author sihai
 *
 */
public class PublishUserCurrentLocationRequest extends Request {

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
