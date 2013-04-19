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
public class LoggedLocalWriteReviewInfo extends GenericJson {

	public Boolean alsoShared;
	public String clusterId;
	public Boolean newReview;
	public Integer source;
	public Integer textCommentLength;

	public Boolean getAlsoShared() {
		return alsoShared;
	}

	public void setAlsoShared(Boolean alsoShared) {
		this.alsoShared = alsoShared;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public Boolean getNewReview() {
		return newReview;
	}

	public void setNewReview(Boolean newReview) {
		this.newReview = newReview;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getTextCommentLength() {
		return textCommentLength;
	}

	public void setTextCommentLength(Integer textCommentLength) {
		this.textCommentLength = textCommentLength;
	}
}
