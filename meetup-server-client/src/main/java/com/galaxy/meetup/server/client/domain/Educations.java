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
public class Educations extends GenericJson {

	public List education;
	
    public Metadata metadata;

	public List getEducation() {
		return education;
	}

	public void setEducation(List education) {
		this.education = education;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
