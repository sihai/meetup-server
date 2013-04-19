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
public class UserMediaProto extends GenericJson {

	public AuthorProto author;
	public String mediaId;
	public String moderationStatus;
	public TimeProto time;

	public AuthorProto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorProto author) {
		this.author = author;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getModerationStatus() {
		return moderationStatus;
	}

	public void setModerationStatus(String moderationStatus) {
		this.moderationStatus = moderationStatus;
	}

	public TimeProto getTime() {
		return time;
	}

	public void setTime(TimeProto time) {
		this.time = time;
	}
}
