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
public class ClientEmbedOptions extends GenericJson {

	public List includeType;

	public List getIncludeType() {
		return includeType;
	}

	public void setIncludeType(List includeType) {
		this.includeType = includeType;
	}
}
