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
public class GeoPoint extends GenericJson {

	public Long latitude;
	public Long longitude;
	public Metadata metadata;
	public String pointSource;
	public Boolean shouldRegeocode;

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public String getPointSource() {
		return pointSource;
	}

	public void setPointSource(String pointSource) {
		this.pointSource = pointSource;
	}

	public Boolean getShouldRegeocode() {
		return shouldRegeocode;
	}

	public void setShouldRegeocode(Boolean shouldRegeocode) {
		this.shouldRegeocode = shouldRegeocode;
	}
}
