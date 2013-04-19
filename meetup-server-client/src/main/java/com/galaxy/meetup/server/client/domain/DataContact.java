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
public class DataContact extends GenericJson {

	public List contactGroup;
	
    public String id;

	public List getContactGroup() {
		return contactGroup;
	}

	public void setContactGroup(List contactGroup) {
		this.contactGroup = contactGroup;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
