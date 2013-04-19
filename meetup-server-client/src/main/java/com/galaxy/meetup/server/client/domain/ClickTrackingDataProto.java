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
public class ClickTrackingDataProto extends GenericJson {

	public String additionalData;
	
    public ClickTrackingCGI clickTrackingCgi;
    
    public String geocode;
    
    public String originalUrl;
    
    public String provider;

	public String getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public ClickTrackingCGI getClickTrackingCgi() {
		return clickTrackingCgi;
	}

	public void setClickTrackingCgi(ClickTrackingCGI clickTrackingCgi) {
		this.clickTrackingCgi = clickTrackingCgi;
	}

	public String getGeocode() {
		return geocode;
	}

	public void setGeocode(String geocode) {
		this.geocode = geocode;
	}

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
}
