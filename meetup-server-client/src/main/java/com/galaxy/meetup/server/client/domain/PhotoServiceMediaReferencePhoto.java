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
public class PhotoServiceMediaReferencePhoto extends GenericJson {

	public String obfuscatedOwnerId;
	public String photoId;

	public String getObfuscatedOwnerId() {
		return obfuscatedOwnerId;
	}

	public void setObfuscatedOwnerId(String obfuscatedOwnerId) {
		this.obfuscatedOwnerId = obfuscatedOwnerId;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}
}
