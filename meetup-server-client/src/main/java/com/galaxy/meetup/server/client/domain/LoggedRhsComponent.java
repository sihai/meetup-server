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
public class LoggedRhsComponent extends GenericJson {

	public Integer barType;
	public LoggedRhsComponentType componentType;
	public Integer index;
	public List item;
	public List neighborInfo;
	public LoggedSuggestionSummaryInfo suggestionSummaryInfo;

	public Integer getBarType() {
		return barType;
	}

	public void setBarType(Integer barType) {
		this.barType = barType;
	}

	public LoggedRhsComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(LoggedRhsComponentType componentType) {
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

	public LoggedSuggestionSummaryInfo getSuggestionSummaryInfo() {
		return suggestionSummaryInfo;
	}

	public void setSuggestionSummaryInfo(
			LoggedSuggestionSummaryInfo suggestionSummaryInfo) {
		this.suggestionSummaryInfo = suggestionSummaryInfo;
	}
}
