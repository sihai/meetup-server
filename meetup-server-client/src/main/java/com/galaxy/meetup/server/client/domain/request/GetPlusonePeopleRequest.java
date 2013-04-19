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
public class GetPlusonePeopleRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Integer numPeopleToReturn;
	public String plusoneId;

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

	public Integer getNumPeopleToReturn() {
		return numPeopleToReturn;
	}

	public void setNumPeopleToReturn(Integer numPeopleToReturn) {
		this.numPeopleToReturn = numPeopleToReturn;
	}

	public String getPlusoneId() {
		return plusoneId;
	}

	public void setPlusoneId(String plusoneId) {
		this.plusoneId = plusoneId;
	}
}
