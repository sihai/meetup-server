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
public class Reservation extends GenericJson {

	public Integer attendeeCount;
	public String name;
	public String startDate;
	public String url;

	public Integer getAttendeeCount() {
		return attendeeCount;
	}

	public void setAttendeeCount(Integer attendeeCount) {
		this.attendeeCount = attendeeCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
