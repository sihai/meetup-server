/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 * 
 */
public class FindMorePeopleRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Integer maxSuggestions;
	public Boolean onlyEsUsers;
	public Boolean onlyHighQualitySuggestions;

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public Integer getMaxSuggestions() {
		return maxSuggestions;
	}

	public void setMaxSuggestions(Integer maxSuggestions) {
		this.maxSuggestions = maxSuggestions;
	}

	public Boolean getOnlyEsUsers() {
		return onlyEsUsers;
	}

	public void setOnlyEsUsers(Boolean onlyEsUsers) {
		this.onlyEsUsers = onlyEsUsers;
	}

	public Boolean getOnlyHighQualitySuggestions() {
		return onlyHighQualitySuggestions;
	}

	public void setOnlyHighQualitySuggestions(Boolean onlyHighQualitySuggestions) {
		this.onlyHighQualitySuggestions = onlyHighQualitySuggestions;
	}
}
