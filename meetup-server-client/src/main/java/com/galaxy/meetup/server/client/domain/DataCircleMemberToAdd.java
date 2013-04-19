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
public class DataCircleMemberToAdd extends GenericJson {

	public List contactId;
	
    public String displayName;
    
    public DataCircleMemberId memberId;

	public List getContactId() {
		return contactId;
	}

	public void setContactId(List contactId) {
		this.contactId = contactId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public DataCircleMemberId getMemberId() {
		return memberId;
	}

	public void setMemberId(DataCircleMemberId memberId) {
		this.memberId = memberId;
	}
}
