package com.openteach.meetup.server.client.entity;

/**
 * 
 * @author sihai
 *
 */
public class EventTime {

	/**
	 * 
	 */
	public Long offsetMs;
	
	/**
	 * 
	 */
	public Long timeMs;
    
	/**
	 * 
	 */
	public String timezone;

	public Long getOffsetMs() {
		return offsetMs;
	}

	public void setOffsetMs(Long offsetMs) {
		this.offsetMs = offsetMs;
	}

	public Long getTimeMs() {
		return timeMs;
	}

	public void setTimeMs(Long timeMs) {
		this.timeMs = timeMs;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
}
