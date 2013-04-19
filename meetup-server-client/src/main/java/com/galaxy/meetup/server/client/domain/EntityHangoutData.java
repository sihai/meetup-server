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
public class EntityHangoutData extends GenericJson {

	public List a2aData;
	
    public List update;

	public List getA2aData() {
		return a2aData;
	}

	public void setA2aData(List a2aData) {
		this.a2aData = a2aData;
	}

	public List getUpdate() {
		return update;
	}

	public void setUpdate(List update) {
		this.update = update;
	}
}
