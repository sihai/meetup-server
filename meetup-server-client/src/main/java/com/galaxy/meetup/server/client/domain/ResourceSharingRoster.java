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
public class ResourceSharingRoster extends GenericJson {

	public SharedResourceId id;
	public SharingRoster sharingRoster;

	public SharedResourceId getId() {
		return id;
	}

	public void setId(SharedResourceId id) {
		this.id = id;
	}

	public SharingRoster getSharingRoster() {
		return sharingRoster;
	}

	public void setSharingRoster(SharingRoster sharingRoster) {
		this.sharingRoster = sharingRoster;
	}
}
