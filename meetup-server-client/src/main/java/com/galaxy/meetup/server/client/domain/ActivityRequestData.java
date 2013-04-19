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
public class ActivityRequestData extends GenericJson {

	public Boolean activityCountOnly;
	
    public ActivityFilters activityFilters;
    
    public FieldRequestOptions fieldRequestOptions;
    
    public Integer maxResults;
    
    public String shownActivitiesBlob;
    
    public UpdateFilter updateFilter;

	public Boolean getActivityCountOnly() {
		return activityCountOnly;
	}

	public void setActivityCountOnly(Boolean activityCountOnly) {
		this.activityCountOnly = activityCountOnly;
	}

	public ActivityFilters getActivityFilters() {
		return activityFilters;
	}

	public void setActivityFilters(ActivityFilters activityFilters) {
		this.activityFilters = activityFilters;
	}

	public FieldRequestOptions getFieldRequestOptions() {
		return fieldRequestOptions;
	}

	public void setFieldRequestOptions(FieldRequestOptions fieldRequestOptions) {
		this.fieldRequestOptions = fieldRequestOptions;
	}

	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getShownActivitiesBlob() {
		return shownActivitiesBlob;
	}

	public void setShownActivitiesBlob(String shownActivitiesBlob) {
		this.shownActivitiesBlob = shownActivitiesBlob;
	}

	public UpdateFilter getUpdateFilter() {
		return updateFilter;
	}

	public void setUpdateFilter(UpdateFilter updateFilter) {
		this.updateFilter = updateFilter;
	}
}
