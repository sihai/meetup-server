/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.math.BigInteger;

/**
 * 
 * @author sihai
 * 
 */
public class LoggedCircleMember extends GenericJson {

	public Boolean contactInAnyCircle;
	public String emailId;
	public BigInteger focusContactId;
	public BigInteger gaiaId;
	public Integer plusPageType;

	public Boolean getContactInAnyCircle() {
		return contactInAnyCircle;
	}

	public void setContactInAnyCircle(Boolean contactInAnyCircle) {
		this.contactInAnyCircle = contactInAnyCircle;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigInteger getFocusContactId() {
		return focusContactId;
	}

	public void setFocusContactId(BigInteger focusContactId) {
		this.focusContactId = focusContactId;
	}

	public BigInteger getGaiaId() {
		return gaiaId;
	}

	public void setGaiaId(BigInteger gaiaId) {
		this.gaiaId = gaiaId;
	}

	public Integer getPlusPageType() {
		return plusPageType;
	}

	public void setPlusPageType(Integer plusPageType) {
		this.plusPageType = plusPageType;
	}
}
