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
public class OwnerUpdatesProto extends GenericJson {

	public List updates;

	public List getUpdates() {
		return updates;
	}

	public void setUpdates(List updates) {
		this.updates = updates;
	}
}
