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
public class PlusPhotoAlbumTransientData extends GenericJson {

	public Boolean isAlbumReshare;
	public Boolean isFullAlbumShare;

	public Boolean getIsAlbumReshare() {
		return isAlbumReshare;
	}

	public void setIsAlbumReshare(Boolean isAlbumReshare) {
		this.isAlbumReshare = isAlbumReshare;
	}

	public Boolean getIsFullAlbumShare() {
		return isFullAlbumShare;
	}

	public void setIsFullAlbumShare(Boolean isFullAlbumShare) {
		this.isFullAlbumShare = isFullAlbumShare;
	}
}
