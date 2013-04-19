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
public class LoggedPhoto extends GenericJson {

	public BigInteger photoId;
	public String photoUrl;

	public BigInteger getPhotoId() {
		return photoId;
	}

	public void setPhotoId(BigInteger photoId) {
		this.photoId = photoId;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}
