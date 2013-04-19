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
public class AttributesProto extends GenericJson {

	public List attribute;

	public List getAttribute() {
		return attribute;
	}

	public void setAttribute(List attribute) {
		this.attribute = attribute;
	}
}
