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
public class InputData extends GenericJson {

	public Integer interestsAdded;
	public Integer interestsRemoved;
	public Integer invitesSent;
	public ProfileCreationInfo profileCreationInfo;
	public ProfileEdit profileEdit;
	public String socialCircleRawQuery;
	public UpgradeInfo upgradeInfo;

	public Integer getInterestsAdded() {
		return interestsAdded;
	}

	public void setInterestsAdded(Integer interestsAdded) {
		this.interestsAdded = interestsAdded;
	}

	public Integer getInterestsRemoved() {
		return interestsRemoved;
	}

	public void setInterestsRemoved(Integer interestsRemoved) {
		this.interestsRemoved = interestsRemoved;
	}

	public Integer getInvitesSent() {
		return invitesSent;
	}

	public void setInvitesSent(Integer invitesSent) {
		this.invitesSent = invitesSent;
	}

	public ProfileCreationInfo getProfileCreationInfo() {
		return profileCreationInfo;
	}

	public void setProfileCreationInfo(ProfileCreationInfo profileCreationInfo) {
		this.profileCreationInfo = profileCreationInfo;
	}

	public ProfileEdit getProfileEdit() {
		return profileEdit;
	}

	public void setProfileEdit(ProfileEdit profileEdit) {
		this.profileEdit = profileEdit;
	}

	public String getSocialCircleRawQuery() {
		return socialCircleRawQuery;
	}

	public void setSocialCircleRawQuery(String socialCircleRawQuery) {
		this.socialCircleRawQuery = socialCircleRawQuery;
	}

	public UpgradeInfo getUpgradeInfo() {
		return upgradeInfo;
	}

	public void setUpgradeInfo(UpgradeInfo upgradeInfo) {
		this.upgradeInfo = upgradeInfo;
	}
}
