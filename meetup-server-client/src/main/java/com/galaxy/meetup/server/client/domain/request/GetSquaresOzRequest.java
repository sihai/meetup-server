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
public class GetSquaresOzRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean consistentRead;
	public Boolean enableTracing;
	public Boolean includePeopleInCommon;
	public List squareType;

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

	public Boolean getIncludePeopleInCommon() {
		return includePeopleInCommon;
	}

	public void setIncludePeopleInCommon(Boolean includePeopleInCommon) {
		this.includePeopleInCommon = includePeopleInCommon;
	}

	public List getSquareType() {
		return squareType;
	}

	public void setSquareType(List squareType) {
		this.squareType = squareType;
	}
}
