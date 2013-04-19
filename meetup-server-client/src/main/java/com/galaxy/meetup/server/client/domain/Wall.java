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
public class Wall extends GenericJson {

	public BooleanField enableRead;
	public BooleanField enableWrite;

	public BooleanField getEnableRead() {
		return enableRead;
	}

	public void setEnableRead(BooleanField enableRead) {
		this.enableRead = enableRead;
	}

	public BooleanField getEnableWrite() {
		return enableWrite;
	}

	public void setEnableWrite(BooleanField enableWrite) {
		this.enableWrite = enableWrite;
	}
}
