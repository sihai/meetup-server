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
public final class DataGeoInfo extends GenericJson {

	public Double altitude;
	
	public Boolean fromExif;
	
	public Double latitude;
	
	public Double latitudeSpan;
	
	public Double longitude;
	
	public Double longitudeSpan;

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Boolean getFromExif() {
		return fromExif;
	}

	public void setFromExif(Boolean fromExif) {
		this.fromExif = fromExif;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLatitudeSpan() {
		return latitudeSpan;
	}

	public void setLatitudeSpan(Double latitudeSpan) {
		this.latitudeSpan = latitudeSpan;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLongitudeSpan() {
		return longitudeSpan;
	}

	public void setLongitudeSpan(Double longitudeSpan) {
		this.longitudeSpan = longitudeSpan;
	}
}
