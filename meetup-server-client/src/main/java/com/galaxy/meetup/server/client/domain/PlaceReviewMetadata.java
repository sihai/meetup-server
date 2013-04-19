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
public class PlaceReviewMetadata extends GenericJson {

	public String encryptedZipitAnnotationId;

	public String getEncryptedZipitAnnotationId() {
		return encryptedZipitAnnotationId;
	}

	public void setEncryptedZipitAnnotationId(String encryptedZipitAnnotationId) {
		this.encryptedZipitAnnotationId = encryptedZipitAnnotationId;
	}
}
