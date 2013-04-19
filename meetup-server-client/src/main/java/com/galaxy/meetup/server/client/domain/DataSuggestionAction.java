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
public class DataSuggestionAction extends GenericJson {

	public Boolean accepted;
	
    public String actionType;
    
    public DataCircleId circleId;
    
    public List suggestedEntityId;
    
    public String suggestionContext;
    
    public List suggestionId;
    
    public String suggestionUi;

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public DataCircleId getCircleId() {
		return circleId;
	}

	public void setCircleId(DataCircleId circleId) {
		this.circleId = circleId;
	}

	public List getSuggestedEntityId() {
		return suggestedEntityId;
	}

	public void setSuggestedEntityId(List suggestedEntityId) {
		this.suggestedEntityId = suggestedEntityId;
	}

	public String getSuggestionContext() {
		return suggestionContext;
	}

	public void setSuggestionContext(String suggestionContext) {
		this.suggestionContext = suggestionContext;
	}

	public List getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(List suggestionId) {
		this.suggestionId = suggestionId;
	}

	public String getSuggestionUi() {
		return suggestionUi;
	}

	public void setSuggestionUi(String suggestionUi) {
		this.suggestionUi = suggestionUi;
	}
}
