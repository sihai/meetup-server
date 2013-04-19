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
public class ActivityResults extends GenericJson {

	public Integer activityCount;
	
    public ActivityRealTimeInfo realTimeInfo;
    
    public String shownActivitiesBlob;
    
    public Stream stream;

	public Integer getActivityCount() {
		return activityCount;
	}

	public void setActivityCount(Integer activityCount) {
		this.activityCount = activityCount;
	}

	public ActivityRealTimeInfo getRealTimeInfo() {
		return realTimeInfo;
	}

	public void setRealTimeInfo(ActivityRealTimeInfo realTimeInfo) {
		this.realTimeInfo = realTimeInfo;
	}

	public String getShownActivitiesBlob() {
		return shownActivitiesBlob;
	}

	public void setShownActivitiesBlob(String shownActivitiesBlob) {
		this.shownActivitiesBlob = shownActivitiesBlob;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}
}
