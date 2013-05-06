/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.OzDataSettings;


/**
 * 
 * @author sihai
 * 
 */
public class SettingsSetRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public OzDataSettings settings;

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

	public OzDataSettings getSettings() {
		return settings;
	}

	public void setSettings(OzDataSettings settings) {
		this.settings = settings;
	}
}
