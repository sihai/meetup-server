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
public class DeviceLocation extends GenericJson {

	public Integer accuracyMeters;
	
    public String displayName;
    
    public Double lat;
    
    public Double lng;
    
    public Long timestampUsec;
    
    public String type;

	public Integer getAccuracyMeters() {
		return accuracyMeters;
	}

	public void setAccuracyMeters(Integer accuracyMeters) {
		this.accuracyMeters = accuracyMeters;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Long getTimestampUsec() {
		return timestampUsec;
	}

	public void setTimestampUsec(Long timestampUsec) {
		this.timestampUsec = timestampUsec;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
