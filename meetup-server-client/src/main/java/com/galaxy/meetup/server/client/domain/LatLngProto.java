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
public class LatLngProto extends GenericJson {

	public Integer latitudeE7;
    public Integer longitudeE7;
    
	public Integer getLatitudeE7() {
		return latitudeE7;
	}
	public void setLatitudeE7(Integer latitudeE7) {
		this.latitudeE7 = latitudeE7;
	}
	public Integer getLongitudeE7() {
		return longitudeE7;
	}
	public void setLongitudeE7(Integer longitudeE7) {
		this.longitudeE7 = longitudeE7;
	}
}
