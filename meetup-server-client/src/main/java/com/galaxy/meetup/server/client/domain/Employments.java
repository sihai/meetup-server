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
public class Employments extends GenericJson {

	public List employment;
	
    public Metadata metadata;

	public List getEmployment() {
		return employment;
	}

	public void setEmployment(List employment) {
		this.employment = employment;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
