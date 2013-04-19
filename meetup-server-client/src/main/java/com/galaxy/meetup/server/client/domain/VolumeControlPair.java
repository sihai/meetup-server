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
public class VolumeControlPair extends GenericJson {

	public VolumeControlKey key;
	public String value;

	public VolumeControlKey getKey() {
		return key;
	}

	public void setKey(VolumeControlKey key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
