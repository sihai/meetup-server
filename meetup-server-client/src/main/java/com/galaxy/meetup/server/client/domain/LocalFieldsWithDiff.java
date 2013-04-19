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
public class LocalFieldsWithDiff extends GenericJson {

	public List fields;

	public List getFields() {
		return fields;
	}

	public void setFields(List fields) {
		this.fields = fields;
	}
}
