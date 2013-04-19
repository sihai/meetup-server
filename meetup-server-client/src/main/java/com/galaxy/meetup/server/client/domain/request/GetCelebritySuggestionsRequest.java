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
public class GetCelebritySuggestionsRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Integer maxPerCategory;

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

	public Integer getMaxPerCategory() {
		return maxPerCategory;
	}

	public void setMaxPerCategory(Integer maxPerCategory) {
		this.maxPerCategory = maxPerCategory;
	}
}
