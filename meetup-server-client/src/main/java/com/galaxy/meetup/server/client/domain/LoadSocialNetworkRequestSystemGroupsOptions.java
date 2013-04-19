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
public class LoadSocialNetworkRequestSystemGroupsOptions extends GenericJson {

	public Boolean includeMemberCounts;
	public Boolean includeSystemGroups;

	public Boolean getIncludeMemberCounts() {
		return includeMemberCounts;
	}

	public void setIncludeMemberCounts(Boolean includeMemberCounts) {
		this.includeMemberCounts = includeMemberCounts;
	}

	public Boolean getIncludeSystemGroups() {
		return includeSystemGroups;
	}

	public void setIncludeSystemGroups(Boolean includeSystemGroups) {
		this.includeSystemGroups = includeSystemGroups;
	}
}
