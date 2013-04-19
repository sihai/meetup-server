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
public class SquareUpdate extends GenericJson {

	public String obfuscatedSquareId;
	public String squareName;
	public String squareStreamId;
	public String squareStreamName;

	public String getObfuscatedSquareId() {
		return obfuscatedSquareId;
	}

	public void setObfuscatedSquareId(String obfuscatedSquareId) {
		this.obfuscatedSquareId = obfuscatedSquareId;
	}

	public String getSquareName() {
		return squareName;
	}

	public void setSquareName(String squareName) {
		this.squareName = squareName;
	}

	public String getSquareStreamId() {
		return squareStreamId;
	}

	public void setSquareStreamId(String squareStreamId) {
		this.squareStreamId = squareStreamId;
	}

	public String getSquareStreamName() {
		return squareStreamName;
	}

	public void setSquareStreamName(String squareStreamName) {
		this.squareStreamName = squareStreamName;
	}
}
