/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class PhotoDataAlbum extends GenericJson {

	public List eventId;
	public String id;
	public Integer photoCount;
	public String specialAlbumType;
	public String title;
	public String url;

	public List getEventId() {
		return eventId;
	}

	public void setEventId(List eventId) {
		this.eventId = eventId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public String getSpecialAlbumType() {
		return specialAlbumType;
	}

	public void setSpecialAlbumType(String specialAlbumType) {
		this.specialAlbumType = specialAlbumType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
