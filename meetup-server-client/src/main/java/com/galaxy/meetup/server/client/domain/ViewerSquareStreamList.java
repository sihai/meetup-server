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
public class ViewerSquareStreamList extends GenericJson {

	public List squareStream;

	public List getSquareStream() {
		return squareStream;
	}

	public void setSquareStream(List squareStream) {
		this.squareStream = squareStream;
	}
}
