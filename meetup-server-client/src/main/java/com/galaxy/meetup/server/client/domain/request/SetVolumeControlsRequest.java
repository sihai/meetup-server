/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.VolumeControlMap;


/**
 * 
 * @author sihai
 * 
 */
public class SetVolumeControlsRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public VolumeControlMap values;

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

	public VolumeControlMap getValues() {
		return values;
	}

	public void setValues(VolumeControlMap values) {
		this.values = values;
	}
}
