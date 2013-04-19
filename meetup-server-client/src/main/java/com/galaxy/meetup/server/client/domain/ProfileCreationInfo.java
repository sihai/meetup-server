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
public class ProfileCreationInfo extends GenericJson {

	public Integer plusPageType;
	public Integer profileType;

	public Integer getPlusPageType() {
		return plusPageType;
	}

	public void setPlusPageType(Integer plusPageType) {
		this.plusPageType = plusPageType;
	}

	public Integer getProfileType() {
		return profileType;
	}

	public void setProfileType(Integer profileType) {
		this.profileType = profileType;
	}
}
