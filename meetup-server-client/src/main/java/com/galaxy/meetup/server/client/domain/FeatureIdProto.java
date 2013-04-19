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
public class FeatureIdProto extends GenericJson {

	public BigInteger cellId;
	public BigInteger fprint;

	public BigInteger getCellId() {
		return cellId;
	}

	public void setCellId(BigInteger cellId) {
		this.cellId = cellId;
	}

	public BigInteger getFprint() {
		return fprint;
	}

	public void setFprint(BigInteger fprint) {
		this.fprint = fprint;
	}
}
