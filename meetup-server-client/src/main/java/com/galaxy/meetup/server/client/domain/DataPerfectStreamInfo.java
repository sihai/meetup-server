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
public class DataPerfectStreamInfo extends GenericJson {

	public String activityId;
	
    public String perfectStreamItemId;
    
    public Integer sourceType;
    
    public String title;
    
    public String url;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getPerfectStreamItemId() {
		return perfectStreamItemId;
	}

	public void setPerfectStreamItemId(String perfectStreamItemId) {
		this.perfectStreamItemId = perfectStreamItemId;
	}

	public Integer getSourceType() {
		return sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
