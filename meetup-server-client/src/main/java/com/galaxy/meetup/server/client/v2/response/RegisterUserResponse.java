/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.response;

import com.galaxy.meetup.server.client.v2.domain.User;

/**
 * 
 * @author sihai
 *
 */
public class RegisterUserResponse extends Response {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
