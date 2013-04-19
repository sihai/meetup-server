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
public class ClientLoggedRhsComponentItem extends GenericJson {

	public List circle;
	
    public Integer col;
    
    public List connectSiteId;
    
    public List gamesLabelId;
    
    public ClientLoggedHangout hangout;
    
    public String localWriteReviewClusterId;
    
    public ClientLoggedLocalWriteReviewInfo localWriteReviewInfo;
    
    public List person;
    
    public Integer row;
    
    public List square;
    
    public ClientLoggedSuggestionInfo suggestionInfo;

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

	public ClientLoggedHangout getHangout() {
		return hangout;
	}

	public void setHangout(ClientLoggedHangout hangout) {
		this.hangout = hangout;
	}

	public String getLocalWriteReviewClusterId() {
		return localWriteReviewClusterId;
	}

	public void setLocalWriteReviewClusterId(String localWriteReviewClusterId) {
		this.localWriteReviewClusterId = localWriteReviewClusterId;
	}

	public ClientLoggedLocalWriteReviewInfo getLocalWriteReviewInfo() {
		return localWriteReviewInfo;
	}

	public void setLocalWriteReviewInfo(
			ClientLoggedLocalWriteReviewInfo localWriteReviewInfo) {
		this.localWriteReviewInfo = localWriteReviewInfo;
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

	public ClientLoggedSuggestionInfo getSuggestionInfo() {
		return suggestionInfo;
	}

	public void setSuggestionInfo(ClientLoggedSuggestionInfo suggestionInfo) {
		this.suggestionInfo = suggestionInfo;
	}
}
