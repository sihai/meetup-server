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
public class EntityLegacyClientData extends GenericJson {

	public List legacyClientField;

	public List getLegacyClientField() {
		return legacyClientField;
	}

	public void setLegacyClientField(List legacyClientField) {
		this.legacyClientField = legacyClientField;
	}
}
