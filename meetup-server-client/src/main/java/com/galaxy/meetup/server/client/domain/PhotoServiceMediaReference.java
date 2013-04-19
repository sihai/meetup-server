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
public class PhotoServiceMediaReference extends GenericJson {

	public String clientAssignedUniqueId;
	public String imageData;
	public String imageStatus;
	public String mediaType;
	public PhotoServiceMediaReferencePhoto sourcePhoto;

	public String getClientAssignedUniqueId() {
		return clientAssignedUniqueId;
	}

	public void setClientAssignedUniqueId(String clientAssignedUniqueId) {
		this.clientAssignedUniqueId = clientAssignedUniqueId;
	}

	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	public String getImageStatus() {
		return imageStatus;
	}

	public void setImageStatus(String imageStatus) {
		this.imageStatus = imageStatus;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public PhotoServiceMediaReferencePhoto getSourcePhoto() {
		return sourcePhoto;
	}

	public void setSourcePhoto(PhotoServiceMediaReferencePhoto sourcePhoto) {
		this.sourcePhoto = sourcePhoto;
	}
}
