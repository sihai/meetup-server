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
public class PlacePageCheckin extends GenericJson {

	public AuthorProto author;
	public Long dateSec;
	public List media;
	public String permalinkUrl;
	public TimeProto time;
	public String title;

	public AuthorProto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorProto author) {
		this.author = author;
	}

	public Long getDateSec() {
		return dateSec;
	}

	public void setDateSec(Long dateSec) {
		this.dateSec = dateSec;
	}

	public List getMedia() {
		return media;
	}

	public void setMedia(List media) {
		this.media = media;
	}

	public String getPermalinkUrl() {
		return permalinkUrl;
	}

	public void setPermalinkUrl(String permalinkUrl) {
		this.permalinkUrl = permalinkUrl;
	}

	public TimeProto getTime() {
		return time;
	}

	public void setTime(TimeProto time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
