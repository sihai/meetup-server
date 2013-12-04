/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.client;

/**
 * 
 * @author sihai
 *
 */
public class ClientInfo {

	/**
	 * Id of client
	 */
	protected String clientId;
	
	/**
	 * Version of client
	 */
	protected String clientVersion;
	
	/**
	 * OS of client
	 */
	protected String clientOS;
	
	/**
	 * Version of client os
	 */
	protected String clientOsVersion;
	
	/**
	 * 
	 * @param clientId
	 * @param clientVersion
	 * @param clientOS
	 * @param clientOsVersion
	 */
	public ClientInfo(String clientId, String clientVersion, String clientOS, String clientOsVersion) {
		this.clientId = clientId;
		this.clientVersion = clientVersion;
		this.clientOS = clientOS;
		this.clientOsVersion = clientOsVersion;
	}

	public String getClientId() {
		return clientId;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public String getClientOS() {
		return clientOS;
	}

	public String getClientOsVersion() {
		return clientOsVersion;
	}
}
