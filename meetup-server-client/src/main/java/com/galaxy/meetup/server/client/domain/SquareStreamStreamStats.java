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
public class SquareStreamStreamStats extends GenericJson {

	public Integer totalPostCount;
	public Integer unreadPostCount;

	public Integer getTotalPostCount() {
		return totalPostCount;
	}

	public void setTotalPostCount(Integer totalPostCount) {
		this.totalPostCount = totalPostCount;
	}

	public Integer getUnreadPostCount() {
		return unreadPostCount;
	}

	public void setUnreadPostCount(Integer unreadPostCount) {
		this.unreadPostCount = unreadPostCount;
	}
}
