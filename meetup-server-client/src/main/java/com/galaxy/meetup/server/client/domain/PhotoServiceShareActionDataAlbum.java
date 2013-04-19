/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class PhotoServiceShareActionDataAlbum extends GenericJson {

	public String albumId;
	
    public String obfuscatedOwnerId;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getObfuscatedOwnerId() {
		return obfuscatedOwnerId;
	}

	public void setObfuscatedOwnerId(String obfuscatedOwnerId) {
		this.obfuscatedOwnerId = obfuscatedOwnerId;
	}
}
