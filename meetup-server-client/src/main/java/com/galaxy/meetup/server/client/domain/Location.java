/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class Location extends GenericJson {

	public String bestAddress;
	
    public String clusterId;
    
    public LocationFeatureId featureId;
    
    public Boolean isAddressOnly;
    
    public String language;
    
    public Float latitude;
    
    public Integer latitudeE7;
    
    public String locationTag;
    
    public Float longitude;
    
    public Integer longitudeE7;
    
    public String mapThumbUrl;
    
    public String mapUrl;
    
    public String mapsPageUrl;
    
    public String placePageUrl;
    
    public String plusPageObfuscatedId;
    
    public Double precisionMeters;
    
    public Boolean seenIncludeLocation;

	public String getBestAddress() {
		return bestAddress;
	}

	public void setBestAddress(String bestAddress) {
		this.bestAddress = bestAddress;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public LocationFeatureId getFeatureId() {
		return featureId;
	}

	public void setFeatureId(LocationFeatureId featureId) {
		this.featureId = featureId;
	}

	public Boolean getIsAddressOnly() {
		return isAddressOnly;
	}

	public void setIsAddressOnly(Boolean isAddressOnly) {
		this.isAddressOnly = isAddressOnly;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Integer getLatitudeE7() {
		return latitudeE7;
	}

	public void setLatitudeE7(Integer latitudeE7) {
		this.latitudeE7 = latitudeE7;
	}

	public String getLocationTag() {
		return locationTag;
	}

	public void setLocationTag(String locationTag) {
		this.locationTag = locationTag;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Integer getLongitudeE7() {
		return longitudeE7;
	}

	public void setLongitudeE7(Integer longitudeE7) {
		this.longitudeE7 = longitudeE7;
	}

	public String getMapThumbUrl() {
		return mapThumbUrl;
	}

	public void setMapThumbUrl(String mapThumbUrl) {
		this.mapThumbUrl = mapThumbUrl;
	}

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public String getMapsPageUrl() {
		return mapsPageUrl;
	}

	public void setMapsPageUrl(String mapsPageUrl) {
		this.mapsPageUrl = mapsPageUrl;
	}

	public String getPlacePageUrl() {
		return placePageUrl;
	}

	public void setPlacePageUrl(String placePageUrl) {
		this.placePageUrl = placePageUrl;
	}

	public String getPlusPageObfuscatedId() {
		return plusPageObfuscatedId;
	}

	public void setPlusPageObfuscatedId(String plusPageObfuscatedId) {
		this.plusPageObfuscatedId = plusPageObfuscatedId;
	}

	public Double getPrecisionMeters() {
		return precisionMeters;
	}

	public void setPrecisionMeters(Double precisionMeters) {
		this.precisionMeters = precisionMeters;
	}

	public Boolean getSeenIncludeLocation() {
		return seenIncludeLocation;
	}

	public void setSeenIncludeLocation(Boolean seenIncludeLocation) {
		this.seenIncludeLocation = seenIncludeLocation;
	}
}
