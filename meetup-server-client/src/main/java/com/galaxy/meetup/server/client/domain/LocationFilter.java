/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class LocationFilter extends GenericJson {

	public LocationFilterLatLongE7 latLongE7;
	public String location;
	public Integer searchRadiusMeters;

	public LocationFilterLatLongE7 getLatLongE7() {
		return latLongE7;
	}

	public void setLatLongE7(LocationFilterLatLongE7 latLongE7) {
		this.latLongE7 = latLongE7;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getSearchRadiusMeters() {
		return searchRadiusMeters;
	}

	public void setSearchRadiusMeters(Integer searchRadiusMeters) {
		this.searchRadiusMeters = searchRadiusMeters;
	}
}
