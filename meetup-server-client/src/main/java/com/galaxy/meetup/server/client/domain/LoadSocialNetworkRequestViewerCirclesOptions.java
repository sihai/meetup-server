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
public class LoadSocialNetworkRequestViewerCirclesOptions extends GenericJson {

	public Boolean includeCircles;
	public Boolean includeMemberCounts;

	public Boolean getIncludeCircles() {
		return includeCircles;
	}

	public void setIncludeCircles(Boolean includeCircles) {
		this.includeCircles = includeCircles;
	}

	public Boolean getIncludeMemberCounts() {
		return includeMemberCounts;
	}

	public void setIncludeMemberCounts(Boolean includeMemberCounts) {
		this.includeMemberCounts = includeMemberCounts;
	}
}
