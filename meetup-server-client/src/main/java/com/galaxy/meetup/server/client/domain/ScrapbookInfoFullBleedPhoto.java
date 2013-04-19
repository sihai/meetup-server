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
public class ScrapbookInfoFullBleedPhoto extends GenericJson {

	public String id;
	public ScrapbookInfoOffset offset;
	public String photoOwnerType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ScrapbookInfoOffset getOffset() {
		return offset;
	}

	public void setOffset(ScrapbookInfoOffset offset) {
		this.offset = offset;
	}

	public String getPhotoOwnerType() {
		return photoOwnerType;
	}

	public void setPhotoOwnerType(String photoOwnerType) {
		this.photoOwnerType = photoOwnerType;
	}
}
