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
public final class DataVideoThumbnail extends GenericJson {

	public String faceId;
	
	public Integer frameHeight;
	
	public String frameId;
	
	public Integer frameWidth;
	
	public DataRect32 rect;
	
	public Long timestampMs;

	public String getFaceId() {
		return faceId;
	}

	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public Integer getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(Integer frameHeight) {
		this.frameHeight = frameHeight;
	}

	public String getFrameId() {
		return frameId;
	}

	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}

	public Integer getFrameWidth() {
		return frameWidth;
	}

	public void setFrameWidth(Integer frameWidth) {
		this.frameWidth = frameWidth;
	}

	public DataRect32 getRect() {
		return rect;
	}

	public void setRect(DataRect32 rect) {
		this.rect = rect;
	}

	public Long getTimestampMs() {
		return timestampMs;
	}

	public void setTimestampMs(Long timestampMs) {
		this.timestampMs = timestampMs;
	}
}
