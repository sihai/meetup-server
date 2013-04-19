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
public class PhotoDataTaggerOfPhoto extends GenericJson {

	public PhotoDataAlbum album;
	public Boolean isVideo;
	public CommonPerson ownerperson;
	public CommonPerson taggeeperson;
	public CommonPerson taggerperson;

	public PhotoDataAlbum getAlbum() {
		return album;
	}

	public void setAlbum(PhotoDataAlbum album) {
		this.album = album;
	}

	public Boolean getIsVideo() {
		return isVideo;
	}

	public void setIsVideo(Boolean isVideo) {
		this.isVideo = isVideo;
	}

	public CommonPerson getOwnerperson() {
		return ownerperson;
	}

	public void setOwnerperson(CommonPerson ownerperson) {
		this.ownerperson = ownerperson;
	}

	public CommonPerson getTaggeeperson() {
		return taggeeperson;
	}

	public void setTaggeeperson(CommonPerson taggeeperson) {
		this.taggeeperson = taggeeperson;
	}

	public CommonPerson getTaggerperson() {
		return taggerperson;
	}

	public void setTaggerperson(CommonPerson taggerperson) {
		this.taggerperson = taggerperson;
	}
}
