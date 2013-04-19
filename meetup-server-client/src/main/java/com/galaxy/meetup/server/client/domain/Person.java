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
public class Person extends GenericJson {

	public String gender;
	public Boolean isContactSafe;
	public Boolean isViewerFollowing;
	public String obfuscatedId;
	public String photoUrl;
	public String profileUrl;
	public String userName;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getIsContactSafe() {
		return isContactSafe;
	}

	public void setIsContactSafe(Boolean isContactSafe) {
		this.isContactSafe = isContactSafe;
	}

	public Boolean getIsViewerFollowing() {
		return isViewerFollowing;
	}

	public void setIsViewerFollowing(Boolean isViewerFollowing) {
		this.isViewerFollowing = isViewerFollowing;
	}

	public String getObfuscatedId() {
		return obfuscatedId;
	}

	public void setObfuscatedId(String obfuscatedId) {
		this.obfuscatedId = obfuscatedId;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
