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
public class PlacePageAddressProto extends GenericJson {

	public String address;
	public List addressLine;
	public Boolean invalidated;
	public String nameAndAddress;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(List addressLine) {
		this.addressLine = addressLine;
	}

	public Boolean getInvalidated() {
		return invalidated;
	}

	public void setInvalidated(Boolean invalidated) {
		this.invalidated = invalidated;
	}

	public String getNameAndAddress() {
		return nameAndAddress;
	}

	public void setNameAndAddress(String nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
	}
}
