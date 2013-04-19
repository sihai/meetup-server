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
public class SharingTarget extends GenericJson {

	public String displayName;
	public String email;
	public SharingTargetId id;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SharingTargetId getId() {
		return id;
	}

	public void setId(SharingTargetId id) {
		this.id = id;
	}
}
