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
public class ViewportData extends GenericJson {

	public Float lat;
	public Float lng;
	public Float spanLat;
	public Float spanLng;

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Float getLng() {
		return lng;
	}

	public void setLng(Float lng) {
		this.lng = lng;
	}

	public Float getSpanLat() {
		return spanLat;
	}

	public void setSpanLat(Float spanLat) {
		this.spanLat = spanLat;
	}

	public Float getSpanLng() {
		return spanLng;
	}

	public void setSpanLng(Float spanLng) {
		this.spanLng = spanLng;
	}
}
