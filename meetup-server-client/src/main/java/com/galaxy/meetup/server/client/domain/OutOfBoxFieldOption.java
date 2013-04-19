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
public class OutOfBoxFieldOption extends GenericJson {

	public String label;
	public OutOfBoxFieldValue value;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public OutOfBoxFieldValue getValue() {
		return value;
	}

	public void setValue(OutOfBoxFieldValue value) {
		this.value = value;
	}
}
