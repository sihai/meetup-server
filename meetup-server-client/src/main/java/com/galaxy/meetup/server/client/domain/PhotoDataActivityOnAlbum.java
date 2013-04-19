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
public class PhotoDataActivityOnAlbum extends GenericJson {

	public PhotoDataAlbum album;
	public CommonPerson ownerperson;

	public PhotoDataAlbum getAlbum() {
		return album;
	}

	public void setAlbum(PhotoDataAlbum album) {
		this.album = album;
	}

	public CommonPerson getOwnerperson() {
		return ownerperson;
	}

	public void setOwnerperson(CommonPerson ownerperson) {
		this.ownerperson = ownerperson;
	}
}
