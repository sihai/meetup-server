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
public class Explanation extends GenericJson {

	public String type;
	public List user;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List getUser() {
		return user;
	}

	public void setUser(List user) {
		this.user = user;
	}
}
