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
public class OtherNames extends GenericJson {

	public Metadata metadata;
	public List name;

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List getName() {
		return name;
	}

	public void setName(List name) {
		this.name = name;
	}
}
