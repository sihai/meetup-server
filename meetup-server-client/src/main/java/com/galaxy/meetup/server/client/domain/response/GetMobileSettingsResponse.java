/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.MobilePreference;
import com.galaxy.meetup.server.client.domain.MobileSettingsApplication;
import com.galaxy.meetup.server.client.domain.MobileSettingsUser;
import com.galaxy.meetup.server.client.domain.ShareboxSettings;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class GetMobileSettingsResponse extends Response {

	public MobileSettingsApplication application;
	public TraceRecords backendTrace;
	public MobilePreference preference;
	public String requestError;
	public ShareboxSettings shareboxSettings;
	public String speedRacerDefaultSetting;
	public MobileSettingsUser user;

	public MobileSettingsApplication getApplication() {
		return application;
	}

	public void setApplication(MobileSettingsApplication application) {
		this.application = application;
	}

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public MobilePreference getPreference() {
		return preference;
	}

	public void setPreference(MobilePreference preference) {
		this.preference = preference;
	}

	public String getRequestError() {
		return requestError;
	}

	public void setRequestError(String requestError) {
		this.requestError = requestError;
	}

	public ShareboxSettings getShareboxSettings() {
		return shareboxSettings;
	}

	public void setShareboxSettings(ShareboxSettings shareboxSettings) {
		this.shareboxSettings = shareboxSettings;
	}

	public String getSpeedRacerDefaultSetting() {
		return speedRacerDefaultSetting;
	}

	public void setSpeedRacerDefaultSetting(String speedRacerDefaultSetting) {
		this.speedRacerDefaultSetting = speedRacerDefaultSetting;
	}

	public MobileSettingsUser getUser() {
		return user;
	}

	public void setUser(MobileSettingsUser user) {
		this.user = user;
	}
}
