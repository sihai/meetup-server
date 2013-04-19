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
public class StreamItemFilter extends GenericJson {

	public List itemTypes;

	public List getItemTypes() {
		return itemTypes;
	}

	public void setItemTypes(List itemTypes) {
		this.itemTypes = itemTypes;
	}
}
