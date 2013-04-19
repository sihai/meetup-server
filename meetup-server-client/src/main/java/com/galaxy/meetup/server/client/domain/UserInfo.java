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
public final class UserInfo extends GenericJson {

	public Integer entityTypeId;
	public BigInteger gaiaId;
	public Integer plusPageType;
	public String userContext;

	public Integer getEntityTypeId() {
		return entityTypeId;
	}

	public void setEntityTypeId(Integer entityTypeId) {
		this.entityTypeId = entityTypeId;
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

	public String getUserContext() {
		return userContext;
	}

	public void setUserContext(String userContext) {
		this.userContext = userContext;
	}
}
