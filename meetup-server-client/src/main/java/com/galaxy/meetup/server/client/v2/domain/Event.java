/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

import java.util.Date;

/**
 * 
 * @author sihai
 *
 */
public class Event extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8223704298376548538L;

	/**
	 * Name of this event
	 */
	private String name;
	
	/**
	 * Description for this event
	 */
	private String description;
	
	/**
	 * Start time for this event
	 */
	private Date startTime;
	
	/**
	 * End time for this event
	 */
	private Date endTime;
	
	/**
	 * Location for this event
	 */
	private Location location;
	
	/**
	 * Status of this event
	 * @see com.galaxy.meetup.server.client.v2.enums.EventStatus
	 */
	private Integer status;
	
	/**
	 * Publisher of this event
	 */
	private String publisher;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
