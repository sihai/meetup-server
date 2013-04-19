/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 * 
 */
public class LoadPeopleRequest extends GenericJson {

	public List circleMemberId;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Boolean includeIsFollowing;
	public Boolean includeMemberships;

	public List getCircleMemberId() {
		return circleMemberId;
	}

	public void setCircleMemberId(List circleMemberId) {
		this.circleMemberId = circleMemberId;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public Boolean getIncludeIsFollowing() {
		return includeIsFollowing;
	}

	public void setIncludeIsFollowing(Boolean includeIsFollowing) {
		this.includeIsFollowing = includeIsFollowing;
	}

	public Boolean getIncludeMemberships() {
		return includeMemberships;
	}

	public void setIncludeMemberships(Boolean includeMemberships) {
		this.includeMemberships = includeMemberships;
	}
}
