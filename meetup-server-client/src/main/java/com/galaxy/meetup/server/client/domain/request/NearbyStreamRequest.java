/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ActivityFilters;
import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.ClientEmbedOptions;
import com.galaxy.meetup.server.client.domain.FieldRequestOptions;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.NearbyStreamRequestLatLongE7;
import com.galaxy.meetup.server.client.domain.UpdateFilter;


/**
 * 
 * @author sihai
 * 
 */
public final class NearbyStreamRequest extends Request {

	public ActivityFilters activityFilters;
	public ApiaryFields commonFields;
	public String contentFormat;
	public String continuationToken;
	public ClientEmbedOptions embedOptions;
	public Boolean enableTracing;
	public FieldRequestOptions fieldRequestOptions;
	public NearbyStreamRequestLatLongE7 latLongE7;
	public Integer maxResults;
	public UpdateFilter updateFilter;

	public ActivityFilters getActivityFilters() {
		return activityFilters;
	}

	public void setActivityFilters(ActivityFilters activityFilters) {
		this.activityFilters = activityFilters;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public String getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
	}

	public ClientEmbedOptions getEmbedOptions() {
		return embedOptions;
	}

	public void setEmbedOptions(ClientEmbedOptions embedOptions) {
		this.embedOptions = embedOptions;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public FieldRequestOptions getFieldRequestOptions() {
		return fieldRequestOptions;
	}

	public void setFieldRequestOptions(FieldRequestOptions fieldRequestOptions) {
		this.fieldRequestOptions = fieldRequestOptions;
	}

	public NearbyStreamRequestLatLongE7 getLatLongE7() {
		return latLongE7;
	}

	public void setLatLongE7(NearbyStreamRequestLatLongE7 latLongE7) {
		this.latLongE7 = latLongE7;
	}

	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public UpdateFilter getUpdateFilter() {
		return updateFilter;
	}

	public void setUpdateFilter(UpdateFilter updateFilter) {
		this.updateFilter = updateFilter;
	}
}
