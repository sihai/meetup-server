/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class SquaresMembership extends GenericJson {

	public List square;

	public List getSquare() {
		return square;
	}

	public void setSquare(List square) {
		this.square = square;
	}
}
