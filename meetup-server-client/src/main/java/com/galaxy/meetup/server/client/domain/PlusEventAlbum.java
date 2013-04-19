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
public class PlusEventAlbum extends GenericJson {

	public String albumId;
	public Integer unnamedShapeCount;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public Integer getUnnamedShapeCount() {
		return unnamedShapeCount;
	}

	public void setUnnamedShapeCount(Integer unnamedShapeCount) {
		this.unnamedShapeCount = unnamedShapeCount;
	}
}
