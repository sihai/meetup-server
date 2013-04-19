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
public class TransitStationScheduleDeparture extends GenericJson {

	public String headway;
	public Boolean interpolated;
	public Boolean isNextDay;
	public String realtimeStatus;
	public String time;
	public Long timestamp;

	public String getHeadway() {
		return headway;
	}

	public void setHeadway(String headway) {
		this.headway = headway;
	}

	public Boolean getInterpolated() {
		return interpolated;
	}

	public void setInterpolated(Boolean interpolated) {
		this.interpolated = interpolated;
	}

	public Boolean getIsNextDay() {
		return isNextDay;
	}

	public void setIsNextDay(Boolean isNextDay) {
		this.isNextDay = isNextDay;
	}

	public String getRealtimeStatus() {
		return realtimeStatus;
	}

	public void setRealtimeStatus(String realtimeStatus) {
		this.realtimeStatus = realtimeStatus;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
