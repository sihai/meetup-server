/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.MobilePreference;

/**
 * 
 * @author sihai
 * 
 */
public class SetMobileSettingsRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public MobilePreference preference;

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

	public MobilePreference getPreference() {
		return preference;
	}

	public void setPreference(MobilePreference preference) {
		this.preference = preference;
	}
}
