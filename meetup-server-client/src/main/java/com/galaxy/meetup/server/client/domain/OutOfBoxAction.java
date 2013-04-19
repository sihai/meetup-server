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
public class OutOfBoxAction extends GenericJson {

	public Integer displayDelayMs;
	public String text;
	public String type;
	public String url;

	public Integer getDisplayDelayMs() {
		return displayDelayMs;
	}

	public void setDisplayDelayMs(Integer displayDelayMs) {
		this.displayDelayMs = displayDelayMs;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
