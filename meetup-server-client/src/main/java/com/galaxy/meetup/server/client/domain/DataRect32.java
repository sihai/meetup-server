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
public final class DataRect32 extends GenericJson {

	public DataPoint32 lowerRight;
	
	public DataPoint32 upperLeft;

	public DataPoint32 getLowerRight() {
		return lowerRight;
	}

	public void setLowerRight(DataPoint32 lowerRight) {
		this.lowerRight = lowerRight;
	}

	public DataPoint32 getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(DataPoint32 upperLeft) {
		this.upperLeft = upperLeft;
	}
}
