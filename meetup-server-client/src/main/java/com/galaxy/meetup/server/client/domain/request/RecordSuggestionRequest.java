/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.DataSuggestionAction;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 * 
 */
public class RecordSuggestionRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public DataSuggestionAction suggestionAction;

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

	public DataSuggestionAction getSuggestionAction() {
		return suggestionAction;
	}

	public void setSuggestionAction(DataSuggestionAction suggestionAction) {
		this.suggestionAction = suggestionAction;
	}
}
