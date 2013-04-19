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
public class DataCircleId extends GenericJson {

	public String focusId;
	
    public String obfuscatedGaiaId;

	public String getFocusId() {
		return focusId;
	}

	public void setFocusId(String focusId) {
		this.focusId = focusId;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}
}
