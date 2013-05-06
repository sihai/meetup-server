/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;

/**
 * 
 * @author sihai
 *
 */
public class EditSquareMembershipOzRequest extends Request {

	public String action;
	
    public ApiaryFields commonFields;
    
    public Boolean enableTracing;
    
    public String obfuscatedSquareId;
    
    public List targetObfuscatedGaiaId;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public String getObfuscatedSquareId() {
		return obfuscatedSquareId;
	}

	public void setObfuscatedSquareId(String obfuscatedSquareId) {
		this.obfuscatedSquareId = obfuscatedSquareId;
	}

	public List getTargetObfuscatedGaiaId() {
		return targetObfuscatedGaiaId;
	}

	public void setTargetObfuscatedGaiaId(List targetObfuscatedGaiaId) {
		this.targetObfuscatedGaiaId = targetObfuscatedGaiaId;
	}
}
