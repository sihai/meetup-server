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
public class TimeProto extends GenericJson {

	public Long timeCount;
	public String timeUnit;

	public Long getTimeCount() {
		return timeCount;
	}

	public void setTimeCount(Long timeCount) {
		this.timeCount = timeCount;
	}

	public String getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}
}
