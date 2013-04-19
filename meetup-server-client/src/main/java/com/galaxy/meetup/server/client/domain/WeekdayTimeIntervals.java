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
public class WeekdayTimeIntervals extends GenericJson {

	public Boolean current;
	public String dayOfWeek;
	public List intervals;

	public Boolean getCurrent() {
		return current;
	}

	public void setCurrent(Boolean current) {
		this.current = current;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public List getIntervals() {
		return intervals;
	}

	public void setIntervals(List intervals) {
		this.intervals = intervals;
	}
}
