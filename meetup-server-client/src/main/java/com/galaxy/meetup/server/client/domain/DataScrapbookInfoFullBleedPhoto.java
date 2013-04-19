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
public class DataScrapbookInfoFullBleedPhoto extends GenericJson {

	public String id;
	
    public DataScrapbookInfoOffset offset;
    
    public String photoOwnerType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DataScrapbookInfoOffset getOffset() {
		return offset;
	}

	public void setOffset(DataScrapbookInfoOffset offset) {
		this.offset = offset;
	}

	public String getPhotoOwnerType() {
		return photoOwnerType;
	}

	public void setPhotoOwnerType(String photoOwnerType) {
		this.photoOwnerType = photoOwnerType;
	}
}
