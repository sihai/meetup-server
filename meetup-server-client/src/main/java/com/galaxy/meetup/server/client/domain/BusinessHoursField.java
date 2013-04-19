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
public class BusinessHoursField extends GenericJson {

	public List days;
	
    public Metadata metadata;

	public List getDays() {
		return days;
	}

	public void setDays(List days) {
		this.days = days;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
