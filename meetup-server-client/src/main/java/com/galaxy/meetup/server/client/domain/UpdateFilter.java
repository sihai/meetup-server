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
public class UpdateFilter extends GenericJson {

	public List includeNamespace;

	public List getIncludeNamespace() {
		return includeNamespace;
	}

	public void setIncludeNamespace(List includeNamespace) {
		this.includeNamespace = includeNamespace;
	}
}
