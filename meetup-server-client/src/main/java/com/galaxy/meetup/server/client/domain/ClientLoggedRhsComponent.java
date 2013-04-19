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
public class ClientLoggedRhsComponent extends GenericJson {

	public Integer barType;
	
    public ClientLoggedRhsComponentType componentType;
    
    public Integer index;
    
    public List item;
    
    public List neighborInfo;
    
    public ClientLoggedSuggestionSummaryInfo suggestionSummaryInfo;

	public Integer getBarType() {
		return barType;
	}

	public void setBarType(Integer barType) {
		this.barType = barType;
	}

	public ClientLoggedRhsComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(ClientLoggedRhsComponentType componentType) {
		this.componentType = componentType;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public List getItem() {
		return item;
	}

	public void setItem(List item) {
		this.item = item;
	}

	public List getNeighborInfo() {
		return neighborInfo;
	}

	public void setNeighborInfo(List neighborInfo) {
		this.neighborInfo = neighborInfo;
	}

	public ClientLoggedSuggestionSummaryInfo getSuggestionSummaryInfo() {
		return suggestionSummaryInfo;
	}

	public void setSuggestionSummaryInfo(
			ClientLoggedSuggestionSummaryInfo suggestionSummaryInfo) {
		this.suggestionSummaryInfo = suggestionSummaryInfo;
	}
}
