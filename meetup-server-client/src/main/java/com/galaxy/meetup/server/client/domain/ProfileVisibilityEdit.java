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
public class ProfileVisibilityEdit extends GenericJson {

	public Boolean madeVisible;
	public String setting;

	public Boolean getMadeVisible() {
		return madeVisible;
	}

	public void setMadeVisible(Boolean madeVisible) {
		this.madeVisible = madeVisible;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}
}
