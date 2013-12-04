package com.openteach.meetup.server.client.entity;

/**
 * 
 * @author sihai
 * 
 */
public class HangoutStartContextInvitation {
	
	public String invitationType;
	public String inviterGaiaId;
	public String inviterPhoneNumber;
	public String inviterProfileName;
	public String phoneNumber;
	public Boolean shouldAutoAccept;
	public Long timestamp;

	public String getInvitationType() {
		return invitationType;
	}

	public void setInvitationType(String invitationType) {
		this.invitationType = invitationType;
	}

	public String getInviterGaiaId() {
		return inviterGaiaId;
	}

	public void setInviterGaiaId(String inviterGaiaId) {
		this.inviterGaiaId = inviterGaiaId;
	}

	public String getInviterPhoneNumber() {
		return inviterPhoneNumber;
	}

	public void setInviterPhoneNumber(String inviterPhoneNumber) {
		this.inviterPhoneNumber = inviterPhoneNumber;
	}

	public String getInviterProfileName() {
		return inviterProfileName;
	}

	public void setInviterProfileName(String inviterProfileName) {
		this.inviterProfileName = inviterProfileName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getShouldAutoAccept() {
		return shouldAutoAccept;
	}

	public void setShouldAutoAccept(Boolean shouldAutoAccept) {
		this.shouldAutoAccept = shouldAutoAccept;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
