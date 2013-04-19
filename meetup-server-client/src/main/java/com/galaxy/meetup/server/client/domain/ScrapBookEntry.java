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
public class ScrapBookEntry extends GenericJson {

	public String cropUrl;
	public Integer photoHeight;
	public String photoId;
	public Integer photoWidth;
	public String url;

	public String getCropUrl() {
		return cropUrl;
	}

	public void setCropUrl(String cropUrl) {
		this.cropUrl = cropUrl;
	}

	public Integer getPhotoHeight() {
		return photoHeight;
	}

	public void setPhotoHeight(Integer photoHeight) {
		this.photoHeight = photoHeight;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public Integer getPhotoWidth() {
		return photoWidth;
	}

	public void setPhotoWidth(Integer photoWidth) {
		this.photoWidth = photoWidth;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
