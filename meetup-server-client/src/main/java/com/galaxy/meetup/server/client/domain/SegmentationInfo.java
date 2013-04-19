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
public class SegmentationInfo extends GenericJson {

	public Boolean isUserLapsed;
	public String userSegment;

	public Boolean getIsUserLapsed() {
		return isUserLapsed;
	}

	public void setIsUserLapsed(Boolean isUserLapsed) {
		this.isUserLapsed = isUserLapsed;
	}

	public String getUserSegment() {
		return userSegment;
	}

	public void setUserSegment(String userSegment) {
		this.userSegment = userSegment;
	}
}
