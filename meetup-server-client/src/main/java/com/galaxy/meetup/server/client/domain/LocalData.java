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
public class LocalData extends GenericJson {

	public String cid;
	public String localReviewId;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getLocalReviewId() {
		return localReviewId;
	}

	public void setLocalReviewId(String localReviewId) {
		this.localReviewId = localReviewId;
	}
}
