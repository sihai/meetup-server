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
public class SquaresParams extends GenericJson {

	public String squareId;
	public List streamId;

	public String getSquareId() {
		return squareId;
	}

	public void setSquareId(String squareId) {
		this.squareId = squareId;
	}

	public List getStreamId() {
		return streamId;
	}

	public void setStreamId(List streamId) {
		this.streamId = streamId;
	}
}
