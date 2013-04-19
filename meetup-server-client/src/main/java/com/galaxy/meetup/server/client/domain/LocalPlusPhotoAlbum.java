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
public class LocalPlusPhotoAlbum extends GenericJson {

	public String albumId;
	public List associatedMedia;
	public Place contentLocation;
	public String description;
	public String name;
	public String ownerObfuscatedId;
	public Integer photoCount;
	public String url;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public List getAssociatedMedia() {
		return associatedMedia;
	}

	public void setAssociatedMedia(List associatedMedia) {
		this.associatedMedia = associatedMedia;
	}

	public Place getContentLocation() {
		return contentLocation;
	}

	public void setContentLocation(Place contentLocation) {
		this.contentLocation = contentLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerObfuscatedId() {
		return ownerObfuscatedId;
	}

	public void setOwnerObfuscatedId(String ownerObfuscatedId) {
		this.ownerObfuscatedId = ownerObfuscatedId;
	}

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
