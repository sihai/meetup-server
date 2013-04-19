/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class SquareTargetId extends GenericJson {

	public String obfuscatedSquareId;

	public String getObfuscatedSquareId() {
		return obfuscatedSquareId;
	}

	public void setObfuscatedSquareId(String obfuscatedSquareId) {
		this.obfuscatedSquareId = obfuscatedSquareId;
	}
}
