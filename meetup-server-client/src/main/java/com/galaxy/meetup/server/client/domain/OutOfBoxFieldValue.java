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
public class OutOfBoxFieldValue extends GenericJson {

	public Boolean boolValue;
	public MobileCoarseDate dateValue;
	public MobileGender gender;
	public String stringValue;

	public Boolean getBoolValue() {
		return boolValue;
	}

	public void setBoolValue(Boolean boolValue) {
		this.boolValue = boolValue;
	}

	public MobileCoarseDate getDateValue() {
		return dateValue;
	}

	public void setDateValue(MobileCoarseDate dateValue) {
		this.dateValue = dateValue;
	}

	public MobileGender getGender() {
		return gender;
	}

	public void setGender(MobileGender gender) {
		this.gender = gender;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
}
