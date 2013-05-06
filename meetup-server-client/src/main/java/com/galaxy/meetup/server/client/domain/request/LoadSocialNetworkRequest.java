/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.LoadSocialNetworkRequestPersonListOptions;
import com.galaxy.meetup.server.client.domain.LoadSocialNetworkRequestSystemGroupsOptions;
import com.galaxy.meetup.server.client.domain.LoadSocialNetworkRequestViewerCirclesOptions;


/**
 * 
 * @author sihai
 * 
 */
public class LoadSocialNetworkRequest extends Request {

	public LoadSocialNetworkRequestViewerCirclesOptions circlesOptions;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public LoadSocialNetworkRequestPersonListOptions personListOptions;
	public LoadSocialNetworkRequestSystemGroupsOptions systemGroupsOptions;

	public LoadSocialNetworkRequestViewerCirclesOptions getCirclesOptions() {
		return circlesOptions;
	}

	public void setCirclesOptions(
			LoadSocialNetworkRequestViewerCirclesOptions circlesOptions) {
		this.circlesOptions = circlesOptions;
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

	public LoadSocialNetworkRequestPersonListOptions getPersonListOptions() {
		return personListOptions;
	}

	public void setPersonListOptions(
			LoadSocialNetworkRequestPersonListOptions personListOptions) {
		this.personListOptions = personListOptions;
	}

	public LoadSocialNetworkRequestSystemGroupsOptions getSystemGroupsOptions() {
		return systemGroupsOptions;
	}

	public void setSystemGroupsOptions(
			LoadSocialNetworkRequestSystemGroupsOptions systemGroupsOptions) {
		this.systemGroupsOptions = systemGroupsOptions;
	}
}
