/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class StreamItem extends GenericJson {

	public String type;
	public Update updateItem;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Update getUpdateItem() {
		return updateItem;
	}

	public void setUpdateItem(Update updateItem) {
		this.updateItem = updateItem;
	}
}
