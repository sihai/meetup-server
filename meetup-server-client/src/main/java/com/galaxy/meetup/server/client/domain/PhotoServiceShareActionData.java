/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class PhotoServiceShareActionData extends GenericJson {

	public String albumTitle;
	
    public Boolean isAlbumReshare;
    
    public Boolean isFullAlbumShare;
    
    public List mediaRef;
    
    public PhotoServiceShareActionDataAlbum targetAlbum;

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

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

	public List getMediaRef() {
		return mediaRef;
	}

	public void setMediaRef(List mediaRef) {
		this.mediaRef = mediaRef;
	}

	public PhotoServiceShareActionDataAlbum getTargetAlbum() {
		return targetAlbum;
	}

	public void setTargetAlbum(PhotoServiceShareActionDataAlbum targetAlbum) {
		this.targetAlbum = targetAlbum;
	}
}
