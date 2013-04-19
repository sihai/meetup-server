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
public class LoggedCircle extends GenericJson {

	public Integer circleSize;
	public Integer circleType;
	public BigInteger focusId;
	public BigInteger gaiaId;
	public String type;

	public Integer getCircleSize() {
		return circleSize;
	}

	public void setCircleSize(Integer circleSize) {
		this.circleSize = circleSize;
	}

	public Integer getCircleType() {
		return circleType;
	}

	public void setCircleType(Integer circleType) {
		this.circleType = circleType;
	}

	public BigInteger getFocusId() {
		return focusId;
	}

	public void setFocusId(BigInteger focusId) {
		this.focusId = focusId;
	}

	public BigInteger getGaiaId() {
		return gaiaId;
	}

	public void setGaiaId(BigInteger gaiaId) {
		this.gaiaId = gaiaId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
