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
public class LoggedSuggestionSummaryInfo extends GenericJson {

	public String experimentNames;
	public Integer numberOfSuggestionsLoaded;
	public String portraitVersion;

	public String getExperimentNames() {
		return experimentNames;
	}

	public void setExperimentNames(String experimentNames) {
		this.experimentNames = experimentNames;
	}

	public Integer getNumberOfSuggestionsLoaded() {
		return numberOfSuggestionsLoaded;
	}

	public void setNumberOfSuggestionsLoaded(Integer numberOfSuggestionsLoaded) {
		this.numberOfSuggestionsLoaded = numberOfSuggestionsLoaded;
	}

	public String getPortraitVersion() {
		return portraitVersion;
	}

	public void setPortraitVersion(String portraitVersion) {
		this.portraitVersion = portraitVersion;
	}
}
