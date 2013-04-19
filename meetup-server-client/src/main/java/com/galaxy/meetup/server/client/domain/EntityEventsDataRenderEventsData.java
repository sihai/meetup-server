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
public class EntityEventsDataRenderEventsData extends GenericJson {

	public String displayType;
	
    public List eventActionUserList;
    
    public Boolean isEventCreator;
    
    public Integer numNewUpdates;

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public List getEventActionUserList() {
		return eventActionUserList;
	}

	public void setEventActionUserList(List eventActionUserList) {
		this.eventActionUserList = eventActionUserList;
	}

	public Boolean getIsEventCreator() {
		return isEventCreator;
	}

	public void setIsEventCreator(Boolean isEventCreator) {
		this.isEventCreator = isEventCreator;
	}

	public Integer getNumNewUpdates() {
		return numNewUpdates;
	}

	public void setNumNewUpdates(Integer numNewUpdates) {
		this.numNewUpdates = numNewUpdates;
	}
}
