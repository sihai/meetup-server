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
public class OwnerResponseProto extends GenericJson {

	public String comment;
	public String publishDate;
	public TimeProto time;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public TimeProto getTime() {
		return time;
	}

	public void setTime(TimeProto time) {
		this.time = time;
	}
}
