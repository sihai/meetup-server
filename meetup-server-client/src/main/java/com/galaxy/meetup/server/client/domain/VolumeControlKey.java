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
public class VolumeControlKey extends GenericJson {

	public String focusGroupId;
	public String type;

	public String getFocusGroupId() {
		return focusGroupId;
	}

	public void setFocusGroupId(String focusGroupId) {
		this.focusGroupId = focusGroupId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
