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
public class RelationshipInterests extends GenericJson {

	public List interest;
	public Metadata metadata;

	public List getInterest() {
		return interest;
	}

	public void setInterest(List interest) {
		this.interest = interest;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
