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
public class TimeEndpoint extends GenericJson {

	public Integer hour;
	public String localizedstring;
	public Integer minute;

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public String getLocalizedstring() {
		return localizedstring;
	}

	public void setLocalizedstring(String localizedstring) {
		this.localizedstring = localizedstring;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}
}
