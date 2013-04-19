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
public class HangoutStartContextInvitee extends GenericJson {

	public HangoutStartContextInviteeInviteeId inviteeId;
	public String profileId;
	public String profileName;

	public HangoutStartContextInviteeInviteeId getInviteeId() {
		return inviteeId;
	}

	public void setInviteeId(HangoutStartContextInviteeInviteeId inviteeId) {
		this.inviteeId = inviteeId;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
}
