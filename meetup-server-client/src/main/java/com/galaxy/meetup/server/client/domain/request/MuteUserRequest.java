/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 * 
 */
public class MuteUserRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String obfuscatedGaiaId;
	public Boolean shouldMute;

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

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public Boolean getShouldMute() {
		return shouldMute;
	}

	public void setShouldMute(Boolean shouldMute) {
		this.shouldMute = shouldMute;
	}
}
