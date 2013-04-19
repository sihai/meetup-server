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
public class PlusOnePostData extends GenericJson {

	public List author;
	public String faviconUrl;
	public String id;
	public ItemScope target;
	public Long timestampUsec;

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
	}

	public String getFaviconUrl() {
		return faviconUrl;
	}

	public void setFaviconUrl(String faviconUrl) {
		this.faviconUrl = faviconUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ItemScope getTarget() {
		return target;
	}

	public void setTarget(ItemScope target) {
		this.target = target;
	}

	public Long getTimestampUsec() {
		return timestampUsec;
	}

	public void setTimestampUsec(Long timestampUsec) {
		this.timestampUsec = timestampUsec;
	}
}
