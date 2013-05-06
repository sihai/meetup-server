/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.response;

import java.util.List;

import com.galaxy.meetup.server.client.v2.domain.User;

/**
 * 
 * @author sihai
 *
 */
public class SearchNearbyPeopleResponse extends Response {

	private List<User> peopleList;

	public List<User> getPeopleList() {
		return peopleList;
	}

	public void setPeopleList(List<User> peopleList) {
		this.peopleList = peopleList;
	}
}
