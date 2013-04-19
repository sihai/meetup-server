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
public class SearchResults extends GenericJson {

	public ActivityResults activityResults;
	public String debugInfoHtml;
	public String decorationMode;
	public PeopleResults peopleResults;
	public SpellingSuggestions spellingSuggestions;
	public SquareResults squareResults;
	public String status;

	public ActivityResults getActivityResults() {
		return activityResults;
	}

	public void setActivityResults(ActivityResults activityResults) {
		this.activityResults = activityResults;
	}

	public String getDebugInfoHtml() {
		return debugInfoHtml;
	}

	public void setDebugInfoHtml(String debugInfoHtml) {
		this.debugInfoHtml = debugInfoHtml;
	}

	public String getDecorationMode() {
		return decorationMode;
	}

	public void setDecorationMode(String decorationMode) {
		this.decorationMode = decorationMode;
	}

	public PeopleResults getPeopleResults() {
		return peopleResults;
	}

	public void setPeopleResults(PeopleResults peopleResults) {
		this.peopleResults = peopleResults;
	}

	public SpellingSuggestions getSpellingSuggestions() {
		return spellingSuggestions;
	}

	public void setSpellingSuggestions(SpellingSuggestions spellingSuggestions) {
		this.spellingSuggestions = spellingSuggestions;
	}

	public SquareResults getSquareResults() {
		return squareResults;
	}

	public void setSquareResults(SquareResults squareResults) {
		this.squareResults = squareResults;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
