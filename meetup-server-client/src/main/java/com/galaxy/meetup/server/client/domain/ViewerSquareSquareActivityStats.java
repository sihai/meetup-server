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
public class ViewerSquareSquareActivityStats extends GenericJson {

	public String lastPostAuthorObfuscatedGaiaId;
	public Long lastPostTimeUsec;
	public Long lastVisitTimeUsec;
	public Integer totalPostCount;
	public Integer unreadPostCount;

	public String getLastPostAuthorObfuscatedGaiaId() {
		return lastPostAuthorObfuscatedGaiaId;
	}

	public void setLastPostAuthorObfuscatedGaiaId(
			String lastPostAuthorObfuscatedGaiaId) {
		this.lastPostAuthorObfuscatedGaiaId = lastPostAuthorObfuscatedGaiaId;
	}

	public Long getLastPostTimeUsec() {
		return lastPostTimeUsec;
	}

	public void setLastPostTimeUsec(Long lastPostTimeUsec) {
		this.lastPostTimeUsec = lastPostTimeUsec;
	}

	public Long getLastVisitTimeUsec() {
		return lastVisitTimeUsec;
	}

	public void setLastVisitTimeUsec(Long lastVisitTimeUsec) {
		this.lastVisitTimeUsec = lastVisitTimeUsec;
	}

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
