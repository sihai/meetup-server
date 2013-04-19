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
public class LoggedSquare extends GenericJson {

	public BigInteger gaiaId;

	public BigInteger getGaiaId() {
		return gaiaId;
	}

	public void setGaiaId(BigInteger gaiaId) {
		this.gaiaId = gaiaId;
	}
}
