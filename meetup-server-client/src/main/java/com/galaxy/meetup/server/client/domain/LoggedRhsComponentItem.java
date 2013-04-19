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
public class LoggedRhsComponentItem extends GenericJson {

	public List circle;
	public Integer col;
	public List connectSiteId;
	public List gamesLabelId;
	public String localWriteReviewClusterId;
	public List person;
	public Integer row;
	public List square;
	public LoggedSuggestionInfo suggestionInfo;

	public List getCircle() {
		return circle;
	}

	public void setCircle(List circle) {
		this.circle = circle;
	}

	public Integer getCol() {
		return col;
	}

	public void setCol(Integer col) {
		this.col = col;
	}

	public List getConnectSiteId() {
		return connectSiteId;
	}

	public void setConnectSiteId(List connectSiteId) {
		this.connectSiteId = connectSiteId;
	}

	public List getGamesLabelId() {
		return gamesLabelId;
	}

	public void setGamesLabelId(List gamesLabelId) {
		this.gamesLabelId = gamesLabelId;
	}

	public String getLocalWriteReviewClusterId() {
		return localWriteReviewClusterId;
	}

	public void setLocalWriteReviewClusterId(String localWriteReviewClusterId) {
		this.localWriteReviewClusterId = localWriteReviewClusterId;
	}

	public List getPerson() {
		return person;
	}

	public void setPerson(List person) {
		this.person = person;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public List getSquare() {
		return square;
	}

	public void setSquare(List square) {
		this.square = square;
	}

	public LoggedSuggestionInfo getSuggestionInfo() {
		return suggestionInfo;
	}

	public void setSuggestionInfo(LoggedSuggestionInfo suggestionInfo) {
		this.suggestionInfo = suggestionInfo;
	}
}
