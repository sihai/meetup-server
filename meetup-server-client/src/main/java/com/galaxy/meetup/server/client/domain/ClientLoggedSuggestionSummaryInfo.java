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
public class ClientLoggedSuggestionSummaryInfo extends GenericJson {

	public Integer numberOfSuggestionsLoaded;
	
    public String portraitVersion;
    
    public String scoringExperiments;

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

	public String getScoringExperiments() {
		return scoringExperiments;
	}

	public void setScoringExperiments(String scoringExperiments) {
		this.scoringExperiments = scoringExperiments;
	}
}
