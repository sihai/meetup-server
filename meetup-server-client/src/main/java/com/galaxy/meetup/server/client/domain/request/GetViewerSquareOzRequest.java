/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 * 
 */
public class GetViewerSquareOzRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean consistentRead;
	public Boolean enableTracing;
	public String obfuscatedSquareId;

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getConsistentRead() {
		return consistentRead;
	}

	public void setConsistentRead(Boolean consistentRead) {
		this.consistentRead = consistentRead;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getObfuscatedSquareId() {
		return obfuscatedSquareId;
	}

	public void setObfuscatedSquareId(String obfuscatedSquareId) {
		this.obfuscatedSquareId = obfuscatedSquareId;
	}
}
