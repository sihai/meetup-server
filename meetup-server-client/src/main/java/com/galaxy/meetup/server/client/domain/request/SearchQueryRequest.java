/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ActivityRequestData;
import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.ClientEmbedOptions;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.PeopleRequestData;
import com.galaxy.meetup.server.client.domain.SearchQuery;


/**
 * 
 * @author sihai
 * 
 */
public class SearchQueryRequest extends GenericJson {

	public ActivityRequestData activityRequestData;
	public ApiaryFields commonFields;
	public String contentFormat;
	public ClientEmbedOptions embedOptions;
	public Boolean enableTracing;
	public PeopleRequestData peopleRequestData;
	public SearchQuery searchQuery;

	public ActivityRequestData getActivityRequestData() {
		return activityRequestData;
	}

	public void setActivityRequestData(ActivityRequestData activityRequestData) {
		this.activityRequestData = activityRequestData;
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

	public PeopleRequestData getPeopleRequestData() {
		return peopleRequestData;
	}

	public void setPeopleRequestData(PeopleRequestData peopleRequestData) {
		this.peopleRequestData = peopleRequestData;
	}

	public SearchQuery getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(SearchQuery searchQuery) {
		this.searchQuery = searchQuery;
	}
}
