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
public class DataContinuationToken extends GenericJson {

	public String focusIncomingEdgesToken;
	
    public String gggStartToken;
    
    public Integer personListStartIndex;

	public String getFocusIncomingEdgesToken() {
		return focusIncomingEdgesToken;
	}

	public void setFocusIncomingEdgesToken(String focusIncomingEdgesToken) {
		this.focusIncomingEdgesToken = focusIncomingEdgesToken;
	}

	public String getGggStartToken() {
		return gggStartToken;
	}

	public void setGggStartToken(String gggStartToken) {
		this.gggStartToken = gggStartToken;
	}

	public Integer getPersonListStartIndex() {
		return personListStartIndex;
	}

	public void setPersonListStartIndex(Integer personListStartIndex) {
		this.personListStartIndex = personListStartIndex;
	}
}
