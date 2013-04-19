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
public final class DataComment extends GenericJson {

	public String asbeActivityId;
	
	public String commentType;
	
	public String contentType;
	
	public Long creationTimestamp;
	
	public String id;
	
	public Long lastUpdateTimestamp;
	
	public String originalText;
	
	public EditSegments originalTextSegments;
	
	public DataPlusOne plusOne;
	
	public String text;
	
	public ViewSegments textSegments;
	
	public String timestamp;
	
	public DataUser user;

	public String getAsbeActivityId() {
		return asbeActivityId;
	}

	public void setAsbeActivityId(String asbeActivityId) {
		this.asbeActivityId = asbeActivityId;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
	}

	public void setLastUpdateTimestamp(Long lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

	public String getOriginalText() {
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public EditSegments getOriginalTextSegments() {
		return originalTextSegments;
	}

	public void setOriginalTextSegments(EditSegments originalTextSegments) {
		this.originalTextSegments = originalTextSegments;
	}

	public DataPlusOne getPlusOne() {
		return plusOne;
	}

	public void setPlusOne(DataPlusOne plusOne) {
		this.plusOne = plusOne;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ViewSegments getTextSegments() {
		return textSegments;
	}

	public void setTextSegments(ViewSegments textSegments) {
		this.textSegments = textSegments;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public DataUser getUser() {
		return user;
	}

	public void setUser(DataUser user) {
		this.user = user;
	}
}
