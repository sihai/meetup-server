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
public class LocationData extends GenericJson {

	public String displayAddress;
	public ViewportData viewport;

	public String getDisplayAddress() {
		return displayAddress;
	}

	public void setDisplayAddress(String displayAddress) {
		this.displayAddress = displayAddress;
	}

	public ViewportData getViewport() {
		return viewport;
	}

	public void setViewport(ViewportData viewport) {
		this.viewport = viewport;
	}
}
