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
public class NotificationTypes extends GenericJson {

	public String coalescingCode;
	public List type;

	public String getCoalescingCode() {
		return coalescingCode;
	}

	public void setCoalescingCode(String coalescingCode) {
		this.coalescingCode = coalescingCode;
	}

	public List getType() {
		return type;
	}

	public void setType(List type) {
		this.type = type;
	}
}
