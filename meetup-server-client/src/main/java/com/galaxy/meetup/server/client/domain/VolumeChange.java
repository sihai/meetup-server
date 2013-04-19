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
public class VolumeChange extends GenericJson {

	public Integer keyType;
	public String nextVolume;
	public String previousVolume;

	public Integer getKeyType() {
		return keyType;
	}

	public void setKeyType(Integer keyType) {
		this.keyType = keyType;
	}

	public String getNextVolume() {
		return nextVolume;
	}

	public void setNextVolume(String nextVolume) {
		this.nextVolume = nextVolume;
	}

	public String getPreviousVolume() {
		return previousVolume;
	}

	public void setPreviousVolume(String previousVolume) {
		this.previousVolume = previousVolume;
	}
}
