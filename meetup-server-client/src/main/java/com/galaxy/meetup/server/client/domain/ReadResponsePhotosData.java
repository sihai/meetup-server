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
public final class ReadResponsePhotosData extends GenericJson {

	public EmbedsPerson person;
	public List photos;
	public String sortType;

	public EmbedsPerson getPerson() {
		return person;
	}

	public void setPerson(EmbedsPerson person) {
		this.person = person;
	}

	public List getPhotos() {
		return photos;
	}

	public void setPhotos(List photos) {
		this.photos = photos;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

}
