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
public class DataAction extends GenericJson {

	public List<DataItem> item;
	
	public String type;

	public List<DataItem> getItem() {
		return item;
	}

	public void setItem(List<DataItem> item) {
		this.item = item;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
