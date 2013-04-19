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
public class InterstitialRedirectorData extends GenericJson {

	public Boolean birthdayCompleted;
	public String decision;
	public Boolean hasProfilePhoto;
	public Boolean hasSeenRecently;
	public Boolean subscribeCompleted;

	public Boolean getBirthdayCompleted() {
		return birthdayCompleted;
	}

	public void setBirthdayCompleted(Boolean birthdayCompleted) {
		this.birthdayCompleted = birthdayCompleted;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public Boolean getHasProfilePhoto() {
		return hasProfilePhoto;
	}

	public void setHasProfilePhoto(Boolean hasProfilePhoto) {
		this.hasProfilePhoto = hasProfilePhoto;
	}

	public Boolean getHasSeenRecently() {
		return hasSeenRecently;
	}

	public void setHasSeenRecently(Boolean hasSeenRecently) {
		this.hasSeenRecently = hasSeenRecently;
	}

	public Boolean getSubscribeCompleted() {
		return subscribeCompleted;
	}

	public void setSubscribeCompleted(Boolean subscribeCompleted) {
		this.subscribeCompleted = subscribeCompleted;
	}
}
