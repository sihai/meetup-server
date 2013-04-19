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
public final class RequestsPhotoOptions extends GenericJson {

	public String contentFormat;
	public Boolean returnAlbumInfo;
	public Boolean returnAsbeUpdates;
	public Boolean returnComments;
	public Boolean returnDownloadability;
	public Boolean returnOwnerInfo;
	public Boolean returnPhotos;
	public Boolean returnPlusOnes;
	public Boolean returnShapes;
	public Boolean returnVideoUrls;

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public Boolean getReturnAlbumInfo() {
		return returnAlbumInfo;
	}

	public void setReturnAlbumInfo(Boolean returnAlbumInfo) {
		this.returnAlbumInfo = returnAlbumInfo;
	}

	public Boolean getReturnAsbeUpdates() {
		return returnAsbeUpdates;
	}

	public void setReturnAsbeUpdates(Boolean returnAsbeUpdates) {
		this.returnAsbeUpdates = returnAsbeUpdates;
	}

	public Boolean getReturnComments() {
		return returnComments;
	}

	public void setReturnComments(Boolean returnComments) {
		this.returnComments = returnComments;
	}

	public Boolean getReturnDownloadability() {
		return returnDownloadability;
	}

	public void setReturnDownloadability(Boolean returnDownloadability) {
		this.returnDownloadability = returnDownloadability;
	}

	public Boolean getReturnOwnerInfo() {
		return returnOwnerInfo;
	}

	public void setReturnOwnerInfo(Boolean returnOwnerInfo) {
		this.returnOwnerInfo = returnOwnerInfo;
	}

	public Boolean getReturnPhotos() {
		return returnPhotos;
	}

	public void setReturnPhotos(Boolean returnPhotos) {
		this.returnPhotos = returnPhotos;
	}

	public Boolean getReturnPlusOnes() {
		return returnPlusOnes;
	}

	public void setReturnPlusOnes(Boolean returnPlusOnes) {
		this.returnPlusOnes = returnPlusOnes;
	}

	public Boolean getReturnShapes() {
		return returnShapes;
	}

	public void setReturnShapes(Boolean returnShapes) {
		this.returnShapes = returnShapes;
	}

	public Boolean getReturnVideoUrls() {
		return returnVideoUrls;
	}

	public void setReturnVideoUrls(Boolean returnVideoUrls) {
		this.returnVideoUrls = returnVideoUrls;
	}
}
