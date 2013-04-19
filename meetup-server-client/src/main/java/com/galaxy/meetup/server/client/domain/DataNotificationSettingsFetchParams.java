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
public class DataNotificationSettingsFetchParams extends GenericJson {

	public Boolean fetchAlternateEmailAddress;
	
    public Boolean fetchPlusPageSettings;
    
    public Boolean fetchSettingsDescription;
    
    public Boolean fetchWhoCanNotifyMe;
    
    public String settingsType;
    
    public List typeGroupToFetch;

	public Boolean getFetchAlternateEmailAddress() {
		return fetchAlternateEmailAddress;
	}

	public void setFetchAlternateEmailAddress(Boolean fetchAlternateEmailAddress) {
		this.fetchAlternateEmailAddress = fetchAlternateEmailAddress;
	}

	public Boolean getFetchPlusPageSettings() {
		return fetchPlusPageSettings;
	}

	public void setFetchPlusPageSettings(Boolean fetchPlusPageSettings) {
		this.fetchPlusPageSettings = fetchPlusPageSettings;
	}

	public Boolean getFetchSettingsDescription() {
		return fetchSettingsDescription;
	}

	public void setFetchSettingsDescription(Boolean fetchSettingsDescription) {
		this.fetchSettingsDescription = fetchSettingsDescription;
	}

	public Boolean getFetchWhoCanNotifyMe() {
		return fetchWhoCanNotifyMe;
	}

	public void setFetchWhoCanNotifyMe(Boolean fetchWhoCanNotifyMe) {
		this.fetchWhoCanNotifyMe = fetchWhoCanNotifyMe;
	}

	public String getSettingsType() {
		return settingsType;
	}

	public void setSettingsType(String settingsType) {
		this.settingsType = settingsType;
	}

	public List getTypeGroupToFetch() {
		return typeGroupToFetch;
	}

	public void setTypeGroupToFetch(List typeGroupToFetch) {
		this.typeGroupToFetch = typeGroupToFetch;
	}
}
