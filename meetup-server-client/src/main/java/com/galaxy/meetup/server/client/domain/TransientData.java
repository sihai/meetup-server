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
public class TransientData extends GenericJson {

	public PlusPhotoAlbumTransientData plusPhotoAlbumTransientData;

	public PlusPhotoAlbumTransientData getPlusPhotoAlbumTransientData() {
		return plusPhotoAlbumTransientData;
	}

	public void setPlusPhotoAlbumTransientData(
			PlusPhotoAlbumTransientData plusPhotoAlbumTransientData) {
		this.plusPhotoAlbumTransientData = plusPhotoAlbumTransientData;
	}
}
