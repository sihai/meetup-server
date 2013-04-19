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
public class PeopleRequestData extends GenericJson {

	public String shownPeopleBlob;

	public String getShownPeopleBlob() {
		return shownPeopleBlob;
	}

	public void setShownPeopleBlob(String shownPeopleBlob) {
		this.shownPeopleBlob = shownPeopleBlob;
	}
}
