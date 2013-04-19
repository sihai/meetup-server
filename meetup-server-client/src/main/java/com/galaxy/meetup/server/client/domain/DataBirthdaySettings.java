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
public class DataBirthdaySettings extends GenericJson {

	public String aclJson;
	
    public SharingRoster sharingRoster;

	public String getAclJson() {
		return aclJson;
	}

	public void setAclJson(String aclJson) {
		this.aclJson = aclJson;
	}

	public SharingRoster getSharingRoster() {
		return sharingRoster;
	}

	public void setSharingRoster(SharingRoster sharingRoster) {
		this.sharingRoster = sharingRoster;
	}
}
