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
public class PhotoDataActivityOnPhoto extends GenericJson {

	public PhotoDataAlbum album;
	public List commenter;
	public CommonPerson ownerperson;

	public PhotoDataAlbum getAlbum() {
		return album;
	}

	public void setAlbum(PhotoDataAlbum album) {
		this.album = album;
	}

	public List getCommenter() {
		return commenter;
	}

	public void setCommenter(List commenter) {
		this.commenter = commenter;
	}

	public CommonPerson getOwnerperson() {
		return ownerperson;
	}

	public void setOwnerperson(CommonPerson ownerperson) {
		this.ownerperson = ownerperson;
	}
}
