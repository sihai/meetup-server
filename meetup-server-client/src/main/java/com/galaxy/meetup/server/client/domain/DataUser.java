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
public final class DataUser extends GenericJson {

	public String detectedFaceUrl;
	
	public String displayName;
	
	public String givenName;
	
	public String id;
	
	public Integer photoResultCount;
	
	public String profilePhotoUrl;
	
	public String profileUrl;

	public String getDetectedFaceUrl() {
		return detectedFaceUrl;
	}

	public void setDetectedFaceUrl(String detectedFaceUrl) {
		this.detectedFaceUrl = detectedFaceUrl;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPhotoResultCount() {
		return photoResultCount;
	}

	public void setPhotoResultCount(Integer photoResultCount) {
		this.photoResultCount = photoResultCount;
	}

	public String getProfilePhotoUrl() {
		return profilePhotoUrl;
	}

	public void setProfilePhotoUrl(String profilePhotoUrl) {
		this.profilePhotoUrl = profilePhotoUrl;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
}
