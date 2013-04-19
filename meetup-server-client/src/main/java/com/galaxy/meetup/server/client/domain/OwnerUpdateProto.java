/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.math.BigInteger;

/**
 * 
 * @author sihai
 * 
 */
public class OwnerUpdateProto extends GenericJson {

	public String attribution;
	public String localizedTime;
	public String sanitizedContent;
	public BigInteger timestamp;

	public String getAttribution() {
		return attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	public String getLocalizedTime() {
		return localizedTime;
	}

	public void setLocalizedTime(String localizedTime) {
		this.localizedTime = localizedTime;
	}

	public String getSanitizedContent() {
		return sanitizedContent;
	}

	public void setSanitizedContent(String sanitizedContent) {
		this.sanitizedContent = sanitizedContent;
	}

	public BigInteger getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(BigInteger timestamp) {
		this.timestamp = timestamp;
	}
}
