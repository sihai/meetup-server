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
public class DataSugggestionExplanation extends GenericJson {

	public Integer activitiesByFriends;
	
    public List commonFriend;
    
    public Boolean isFirstHop;
    
    public Boolean isSecondHop;
    
    public Integer numberOfCommonFriends;

	public Integer getActivitiesByFriends() {
		return activitiesByFriends;
	}

	public void setActivitiesByFriends(Integer activitiesByFriends) {
		this.activitiesByFriends = activitiesByFriends;
	}

	public List getCommonFriend() {
		return commonFriend;
	}

	public void setCommonFriend(List commonFriend) {
		this.commonFriend = commonFriend;
	}

	public Boolean getIsFirstHop() {
		return isFirstHop;
	}

	public void setIsFirstHop(Boolean isFirstHop) {
		this.isFirstHop = isFirstHop;
	}

	public Boolean getIsSecondHop() {
		return isSecondHop;
	}

	public void setIsSecondHop(Boolean isSecondHop) {
		this.isSecondHop = isSecondHop;
	}

	public Integer getNumberOfCommonFriends() {
		return numberOfCommonFriends;
	}

	public void setNumberOfCommonFriends(Integer numberOfCommonFriends) {
		this.numberOfCommonFriends = numberOfCommonFriends;
	}
}
