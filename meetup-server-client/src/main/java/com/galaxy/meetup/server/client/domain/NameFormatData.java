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
public class NameFormatData extends GenericJson {

	public Boolean familyNameFirst;
	public List templates;

	public Boolean getFamilyNameFirst() {
		return familyNameFirst;
	}

	public void setFamilyNameFirst(Boolean familyNameFirst) {
		this.familyNameFirst = familyNameFirst;
	}

	public List getTemplates() {
		return templates;
	}

	public void setTemplates(List templates) {
		this.templates = templates;
	}
}
