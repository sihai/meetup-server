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
public class InterestData extends GenericJson {

	public List author;
	public String sourceName;
	public String sourceUrl;
	public Long timestampMs;

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public Long getTimestampMs() {
		return timestampMs;
	}

	public void setTimestampMs(Long timestampMs) {
		this.timestampMs = timestampMs;
	}
}
