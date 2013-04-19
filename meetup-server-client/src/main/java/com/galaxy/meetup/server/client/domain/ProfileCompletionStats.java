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
public class ProfileCompletionStats extends GenericJson {

	public List value;

	public List getValue() {
		return value;
	}

	public void setValue(List value) {
		this.value = value;
	}
}
