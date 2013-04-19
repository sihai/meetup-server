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
public class DataHuddleSettings extends GenericJson {

	public String acl;
	
    public Boolean isUsingHuddle;

	public String getAcl() {
		return acl;
	}

	public void setAcl(String acl) {
		this.acl = acl;
	}

	public Boolean getIsUsingHuddle() {
		return isUsingHuddle;
	}

	public void setIsUsingHuddle(Boolean isUsingHuddle) {
		this.isUsingHuddle = isUsingHuddle;
	}
}
