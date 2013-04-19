/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;


/**
 * 
 * @author sihai
 *
 */
public class SharingRoster extends GenericJson {

	public SharingTargetId requiredScopeId;
	
	public List<SharingTargetId> sharingTargetId;

	public SharingTargetId getRequiredScopeId() {
		return requiredScopeId;
	}

	public void setRequiredScopeId(SharingTargetId requiredScopeId) {
		this.requiredScopeId = requiredScopeId;
	}

	public List<SharingTargetId> getSharingTargetId() {
		return sharingTargetId;
	}

	public void setSharingTargetId(List<SharingTargetId> sharingTargetId) {
		this.sharingTargetId = sharingTargetId;
	}
}
