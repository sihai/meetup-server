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
public class OpeningHoursProtoDay extends GenericJson {

	public Boolean currentDay;
	public String dayName;
	public List interval;

	public Boolean getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(Boolean currentDay) {
		this.currentDay = currentDay;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public List getInterval() {
		return interval;
	}

	public void setInterval(List interval) {
		this.interval = interval;
	}
}
