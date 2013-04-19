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
public class PhotoDataChangedProfilePhoto extends GenericJson {

	public PhotoDataGender gender;
	public CommonPerson person;
	public String profilePhotoUrl;

	public PhotoDataGender getGender() {
		return gender;
	}

	public void setGender(PhotoDataGender gender) {
		this.gender = gender;
	}

	public CommonPerson getPerson() {
		return person;
	}

	public void setPerson(CommonPerson person) {
		this.person = person;
	}

	public String getProfilePhotoUrl() {
		return profilePhotoUrl;
	}

	public void setProfilePhotoUrl(String profilePhotoUrl) {
		this.profilePhotoUrl = profilePhotoUrl;
	}
}
