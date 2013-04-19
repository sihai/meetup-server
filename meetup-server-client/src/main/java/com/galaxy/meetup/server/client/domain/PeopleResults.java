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
public class PeopleResults extends GenericJson {

	public List result;
	public String shownPeopleBlob;

	public List getResult() {
		return result;
	}

	public void setResult(List result) {
		this.result = result;
	}

	public String getShownPeopleBlob() {
		return shownPeopleBlob;
	}

	public void setShownPeopleBlob(String shownPeopleBlob) {
		this.shownPeopleBlob = shownPeopleBlob;
	}
}
