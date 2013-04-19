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
public class EntityEventsDataChangedFields extends GenericJson {

	public Boolean location;
	
    public Boolean startTime;

	public Boolean getLocation() {
		return location;
	}

	public void setLocation(Boolean location) {
		this.location = location;
	}

	public Boolean getStartTime() {
		return startTime;
	}

	public void setStartTime(Boolean startTime) {
		this.startTime = startTime;
	}
}
