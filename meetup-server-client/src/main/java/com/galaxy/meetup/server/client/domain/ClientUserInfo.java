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
public class ClientUserInfo extends GenericJson {

	public Integer entityTypeId;
	
    public String obfuscatedGaiaId;
    
    public Integer plusPageType;
    
    public String userContext;

	public Integer getEntityTypeId() {
		return entityTypeId;
	}

	public void setEntityTypeId(Integer entityTypeId) {
		this.entityTypeId = entityTypeId;
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

	public String getUserContext() {
		return userContext;
	}

	public void setUserContext(String userContext) {
		this.userContext = userContext;
	}
}
