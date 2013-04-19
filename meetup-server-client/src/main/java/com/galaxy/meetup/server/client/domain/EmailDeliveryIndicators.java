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
public class EmailDeliveryIndicators extends GenericJson {

	public String email;
	
    public String obfuscatedGaiaUserId;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObfuscatedGaiaUserId() {
		return obfuscatedGaiaUserId;
	}

	public void setObfuscatedGaiaUserId(String obfuscatedGaiaUserId) {
		this.obfuscatedGaiaUserId = obfuscatedGaiaUserId;
	}
}
