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
public class PhoneProto extends GenericJson {

	public Boolean invalidated;
	public List phoneNumber;

	public Boolean getInvalidated() {
		return invalidated;
	}

	public void setInvalidated(Boolean invalidated) {
		this.invalidated = invalidated;
	}

	public List getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
