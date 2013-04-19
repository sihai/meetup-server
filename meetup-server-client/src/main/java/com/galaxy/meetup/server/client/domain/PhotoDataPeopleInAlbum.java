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
public class PhotoDataPeopleInAlbum extends GenericJson {

	public PhotoDataAlbum album;
	public CommonPerson ownerperson;
	public List taggeeperson;

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

	public List getTaggeeperson() {
		return taggeeperson;
	}

	public void setTaggeeperson(List taggeeperson) {
		this.taggeeperson = taggeeperson;
	}
}
