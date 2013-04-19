/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class EventTime extends GenericJson {

	public Long offsetMs;
	
	public Long timeMs;
    
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
