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
public class OpeningHoursProto extends GenericJson {

	public PlacePageLink attribution;
	public List day;
	public TimeScheduleProto timeSchedule;
	public String title;
	public OpeningHoursProtoDay today;

	public PlacePageLink getAttribution() {
		return attribution;
	}

	public void setAttribution(PlacePageLink attribution) {
		this.attribution = attribution;
	}

	public List getDay() {
		return day;
	}

	public void setDay(List day) {
		this.day = day;
	}

	public TimeScheduleProto getTimeSchedule() {
		return timeSchedule;
	}

	public void setTimeSchedule(TimeScheduleProto timeSchedule) {
		this.timeSchedule = timeSchedule;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public OpeningHoursProtoDay getToday() {
		return today;
	}

	public void setToday(OpeningHoursProtoDay today) {
		this.today = today;
	}
}
