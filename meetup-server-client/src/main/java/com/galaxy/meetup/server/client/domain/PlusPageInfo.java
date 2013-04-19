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
public class PlusPageInfo extends GenericJson {

	public Metadata metadata;
	public Boolean plusPageBlocked;
	public String type;

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Boolean getPlusPageBlocked() {
		return plusPageBlocked;
	}

	public void setPlusPageBlocked(Boolean plusPageBlocked) {
		this.plusPageBlocked = plusPageBlocked;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
