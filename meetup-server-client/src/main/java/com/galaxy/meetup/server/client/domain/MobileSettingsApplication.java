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
public class MobileSettingsApplication extends GenericJson {

	public Integer latestAppVersion;
	public Integer mandatoryAppVersion;

	public Integer getLatestAppVersion() {
		return latestAppVersion;
	}

	public void setLatestAppVersion(Integer latestAppVersion) {
		this.latestAppVersion = latestAppVersion;
	}

	public Integer getMandatoryAppVersion() {
		return mandatoryAppVersion;
	}

	public void setMandatoryAppVersion(Integer mandatoryAppVersion) {
		this.mandatoryAppVersion = mandatoryAppVersion;
	}
}
