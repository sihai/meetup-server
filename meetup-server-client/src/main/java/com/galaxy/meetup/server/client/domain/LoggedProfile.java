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
public class LoggedProfile extends GenericJson {

	public LoggedContactData contactData;
	public Integer numContacts;
	public LoggedProfileData profileData;

	public LoggedContactData getContactData() {
		return contactData;
	}

	public void setContactData(LoggedContactData contactData) {
		this.contactData = contactData;
	}

	public Integer getNumContacts() {
		return numContacts;
	}

	public void setNumContacts(Integer numContacts) {
		this.numContacts = numContacts;
	}

	public LoggedProfileData getProfileData() {
		return profileData;
	}

	public void setProfileData(LoggedProfileData profileData) {
		this.profileData = profileData;
	}
}
