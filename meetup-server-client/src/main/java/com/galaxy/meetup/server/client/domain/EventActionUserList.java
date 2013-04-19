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
public class EventActionUserList extends GenericJson {

	public EntityEventsDataChangedFields changedFields;
	
    public String eventAction;
    
    public List inviterOid;
    
    public Boolean isNew;
    
    public List user;
    
    public List userOid;

	public EntityEventsDataChangedFields getChangedFields() {
		return changedFields;
	}

	public void setChangedFields(EntityEventsDataChangedFields changedFields) {
		this.changedFields = changedFields;
	}

	public String getEventAction() {
		return eventAction;
	}

	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public List getInviterOid() {
		return inviterOid;
	}

	public void setInviterOid(List inviterOid) {
		this.inviterOid = inviterOid;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public List getUser() {
		return user;
	}

	public void setUser(List user) {
		this.user = user;
	}

	public List getUserOid() {
		return userOid;
	}

	public void setUserOid(List userOid) {
		this.userOid = userOid;
	}
}
