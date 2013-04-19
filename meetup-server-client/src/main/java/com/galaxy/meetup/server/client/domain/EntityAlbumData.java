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
public class EntityAlbumData extends GenericJson {

	public String albumId;
	
    public String ownerId;
    
    public Boolean updatesAlbum;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getUpdatesAlbum() {
		return updatesAlbum;
	}

	public void setUpdatesAlbum(Boolean updatesAlbum) {
		this.updatesAlbum = updatesAlbum;
	}
}
