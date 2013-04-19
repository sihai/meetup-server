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
public class PlusPhotosAddedToCollection extends GenericJson {

	public List associatedMedia;
	public PlusPhotoAlbum associatedMediaDisplay;
	public String collectionId;
	public String name;
	public String ownerObfuscatedId;
	public PlusEvent plusEvent;
	public String url;

	public List getAssociatedMedia() {
		return associatedMedia;
	}

	public void setAssociatedMedia(List associatedMedia) {
		this.associatedMedia = associatedMedia;
	}

	public PlusPhotoAlbum getAssociatedMediaDisplay() {
		return associatedMediaDisplay;
	}

	public void setAssociatedMediaDisplay(PlusPhotoAlbum associatedMediaDisplay) {
		this.associatedMediaDisplay = associatedMediaDisplay;
	}

	public String getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
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

	public PlusEvent getPlusEvent() {
		return plusEvent;
	}

	public void setPlusEvent(PlusEvent plusEvent) {
		this.plusEvent = plusEvent;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
