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
public class Verb extends GenericJson {

	public VerbId id;
	public String type;

	public VerbId getId() {
		return id;
	}

	public void setId(VerbId id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
