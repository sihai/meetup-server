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
public class Contacts extends GenericJson {

	public List address;
	
    public List email;
    
    public List instantMessage;
    
    public List phone;

	public List getAddress() {
		return address;
	}

	public void setAddress(List address) {
		this.address = address;
	}

	public List getEmail() {
		return email;
	}

	public void setEmail(List email) {
		this.email = email;
	}

	public List getInstantMessage() {
		return instantMessage;
	}

	public void setInstantMessage(List instantMessage) {
		this.instantMessage = instantMessage;
	}

	public List getPhone() {
		return phone;
	}

	public void setPhone(List phone) {
		this.phone = phone;
	}
}
