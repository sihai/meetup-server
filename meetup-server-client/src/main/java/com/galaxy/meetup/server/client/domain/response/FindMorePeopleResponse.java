/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class FindMorePeopleResponse extends Response {

	public TraceRecords backendTrace;
	public String experimentNames;
	public Double experimentThreshold;
	public List imported;
	public String portraitVersion;
	public List promotedSuggestion;
	public String queryId;
	public List suggestion;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getExperimentNames() {
		return experimentNames;
	}

	public void setExperimentNames(String experimentNames) {
		this.experimentNames = experimentNames;
	}

	public Double getExperimentThreshold() {
		return experimentThreshold;
	}

	public void setExperimentThreshold(Double experimentThreshold) {
		this.experimentThreshold = experimentThreshold;
	}

	public List getImported() {
		return imported;
	}

	public void setImported(List imported) {
		this.imported = imported;
	}

	public String getPortraitVersion() {
		return portraitVersion;
	}

	public void setPortraitVersion(String portraitVersion) {
		this.portraitVersion = portraitVersion;
	}

	public List getPromotedSuggestion() {
		return promotedSuggestion;
	}

	public void setPromotedSuggestion(List promotedSuggestion) {
		this.promotedSuggestion = promotedSuggestion;
	}

	public String getQueryId() {
		return queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public List getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(List suggestion) {
		this.suggestion = suggestion;
	}
}
