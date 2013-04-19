/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.DataAlbum;
import com.galaxy.meetup.server.client.domain.DataPhoto;
import com.galaxy.meetup.server.client.domain.DataUser;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public final class PhotosInAlbumResponse extends GenericJson {

	public DataAlbum album;
	public TraceRecords backendTrace;
	public String errorCode;
	public DataPhoto featuredPhoto;
	public Boolean isDownloadable;
	public DataUser owner;
	public List photo;

	public DataAlbum getAlbum() {
		return album;
	}

	public void setAlbum(DataAlbum album) {
		this.album = album;
	}

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public DataPhoto getFeaturedPhoto() {
		return featuredPhoto;
	}

	public void setFeaturedPhoto(DataPhoto featuredPhoto) {
		this.featuredPhoto = featuredPhoto;
	}

	public Boolean getIsDownloadable() {
		return isDownloadable;
	}

	public void setIsDownloadable(Boolean isDownloadable) {
		this.isDownloadable = isDownloadable;
	}

	public DataUser getOwner() {
		return owner;
	}

	public void setOwner(DataUser owner) {
		this.owner = owner;
	}

	public List getPhoto() {
		return photo;
	}

	public void setPhoto(List photo) {
		this.photo = photo;
	}

}
