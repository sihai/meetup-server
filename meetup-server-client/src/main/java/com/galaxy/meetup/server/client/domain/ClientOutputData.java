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
public class ClientOutputData extends GenericJson {

	public List circle;
	
    public List circleMember;
    
    public ClientLoggedCircle streamFilterCircle;
    
    public List suggestionInfo;
    
    public List userInfo;

	public List getCircle() {
		return circle;
	}

	public void setCircle(List circle) {
		this.circle = circle;
	}

	public List getCircleMember() {
		return circleMember;
	}

	public void setCircleMember(List circleMember) {
		this.circleMember = circleMember;
	}

	public ClientLoggedCircle getStreamFilterCircle() {
		return streamFilterCircle;
	}

	public void setStreamFilterCircle(ClientLoggedCircle streamFilterCircle) {
		this.streamFilterCircle = streamFilterCircle;
	}

	public List getSuggestionInfo() {
		return suggestionInfo;
	}

	public void setSuggestionInfo(List suggestionInfo) {
		this.suggestionInfo = suggestionInfo;
	}

	public List getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(List userInfo) {
		this.userInfo = userInfo;
	}
}
