/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.SimpleProfile;


/**
 * 
 * @author sihai
 * 
 */
public class MutateProfileRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public SimpleProfile profile;

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

	public SimpleProfile getProfile() {
		return profile;
	}

	public void setProfile(SimpleProfile profile) {
		this.profile = profile;
	}
}
