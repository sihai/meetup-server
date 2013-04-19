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
public final class ReadOptionsUpdateOptions extends GenericJson {

	public Boolean includeActivityId;
	public Boolean includeUpdate;

	public Boolean getIncludeActivityId() {
		return includeActivityId;
	}

	public void setIncludeActivityId(Boolean includeActivityId) {
		this.includeActivityId = includeActivityId;
	}

	public Boolean getIncludeUpdate() {
		return includeUpdate;
	}

	public void setIncludeUpdate(Boolean includeUpdate) {
		this.includeUpdate = includeUpdate;
	}
}
