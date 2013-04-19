/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class DataCircleMembershipModificationParams extends GenericJson {

	public String addCircleMembersActionSource;
	
    public Boolean includeIsFollowing;
    
    public List person;

	public String getAddCircleMembersActionSource() {
		return addCircleMembersActionSource;
	}

	public void setAddCircleMembersActionSource(String addCircleMembersActionSource) {
		this.addCircleMembersActionSource = addCircleMembersActionSource;
	}

	public Boolean getIncludeIsFollowing() {
		return includeIsFollowing;
	}

	public void setIncludeIsFollowing(Boolean includeIsFollowing) {
		this.includeIsFollowing = includeIsFollowing;
	}

	public List getPerson() {
		return person;
	}

	public void setPerson(List person) {
		this.person = person;
	}
}
