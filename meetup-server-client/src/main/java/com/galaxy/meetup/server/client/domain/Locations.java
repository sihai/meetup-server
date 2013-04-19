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
public class Locations extends GenericJson {

	public GeoLocation currentGeoLocation;
	public String currentLocation;
	public String locationMapUrl;
	public Metadata metadata;
	public List otherGeoLocation;
	public List otherLocation;

	public GeoLocation getCurrentGeoLocation() {
		return currentGeoLocation;
	}

	public void setCurrentGeoLocation(GeoLocation currentGeoLocation) {
		this.currentGeoLocation = currentGeoLocation;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getLocationMapUrl() {
		return locationMapUrl;
	}

	public void setLocationMapUrl(String locationMapUrl) {
		this.locationMapUrl = locationMapUrl;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List getOtherGeoLocation() {
		return otherGeoLocation;
	}

	public void setOtherGeoLocation(List otherGeoLocation) {
		this.otherGeoLocation = otherGeoLocation;
	}

	public List getOtherLocation() {
		return otherLocation;
	}

	public void setOtherLocation(List otherLocation) {
		this.otherLocation = otherLocation;
	}
}
