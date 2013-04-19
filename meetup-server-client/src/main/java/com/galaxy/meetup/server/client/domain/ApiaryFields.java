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
public class ApiaryFields extends GenericJson {

	public Integer appVersion;
	
	public String effectiveUser;

	public Integer getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(Integer appVersion) {
		this.appVersion = appVersion;
	}

	public String getEffectiveUser() {
		return effectiveUser;
	}

	public void setEffectiveUser(String effectiveUser) {
		this.effectiveUser = effectiveUser;
	}
}
