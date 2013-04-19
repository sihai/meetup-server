/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class EntityRecommendedPeopleData extends GenericJson {

	public List recommendedPerson;
	
    public String suggestionMessage;

	public List getRecommendedPerson() {
		return recommendedPerson;
	}

	public void setRecommendedPerson(List recommendedPerson) {
		this.recommendedPerson = recommendedPerson;
	}

	public String getSuggestionMessage() {
		return suggestionMessage;
	}

	public void setSuggestionMessage(String suggestionMessage) {
		this.suggestionMessage = suggestionMessage;
	}
}
