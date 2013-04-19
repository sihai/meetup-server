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
public class EntityGadgetData extends GenericJson {

	public List gadgetMessage;

	public List getGadgetMessage() {
		return gadgetMessage;
	}

	public void setGadgetMessage(List gadgetMessage) {
		this.gadgetMessage = gadgetMessage;
	}
}
