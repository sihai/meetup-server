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
public class LoadSocialNetworkRequestPersonListOptions extends GenericJson {

	public Boolean includeExtendedProfileInfo;
	public Boolean includePeople;
	public Integer maxPeople;
	public List profileTypesToFilter;
	public DataSyncStateToken syncStateToken;

	public Boolean getIncludeExtendedProfileInfo() {
		return includeExtendedProfileInfo;
	}

	public void setIncludeExtendedProfileInfo(Boolean includeExtendedProfileInfo) {
		this.includeExtendedProfileInfo = includeExtendedProfileInfo;
	}

	public Boolean getIncludePeople() {
		return includePeople;
	}

	public void setIncludePeople(Boolean includePeople) {
		this.includePeople = includePeople;
	}

	public Integer getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}

	public List getProfileTypesToFilter() {
		return profileTypesToFilter;
	}

	public void setProfileTypesToFilter(List profileTypesToFilter) {
		this.profileTypesToFilter = profileTypesToFilter;
	}

	public DataSyncStateToken getSyncStateToken() {
		return syncStateToken;
	}

	public void setSyncStateToken(DataSyncStateToken syncStateToken) {
		this.syncStateToken = syncStateToken;
	}
}
