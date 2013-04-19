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
public class DasherDomain extends GenericJson {

	public String displayName;
	
	public String domainName;
	
	public String obfuscatedId;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getObfuscatedId() {
		return obfuscatedId;
	}

	public void setObfuscatedId(String obfuscatedId) {
		this.obfuscatedId = obfuscatedId;
	}
}
