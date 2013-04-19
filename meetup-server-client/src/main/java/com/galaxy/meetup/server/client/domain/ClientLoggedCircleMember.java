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
public class ClientLoggedCircleMember extends GenericJson {

	public Boolean contactInAnyCircle;
	
    public String emailAddress;
    
    public String focusContactId;
    
    public String obfuscatedGaiaId;
    
    public Integer plusPageType;

	public Boolean getContactInAnyCircle() {
		return contactInAnyCircle;
	}

	public void setContactInAnyCircle(Boolean contactInAnyCircle) {
		this.contactInAnyCircle = contactInAnyCircle;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFocusContactId() {
		return focusContactId;
	}

	public void setFocusContactId(String focusContactId) {
		this.focusContactId = focusContactId;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public Integer getPlusPageType() {
		return plusPageType;
	}

	public void setPlusPageType(Integer plusPageType) {
		this.plusPageType = plusPageType;
	}
}
