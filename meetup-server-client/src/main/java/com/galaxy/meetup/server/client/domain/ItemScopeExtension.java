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
public class ItemScopeExtension extends GenericJson {

	public List itemValue;
	public String key;
	public List strValue;

	public List getItemValue() {
		return itemValue;
	}

	public void setItemValue(List itemValue) {
		this.itemValue = itemValue;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List getStrValue() {
		return strValue;
	}

	public void setStrValue(List strValue) {
		this.strValue = strValue;
	}
}
