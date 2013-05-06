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
public class ReadSquareMembersOzRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean consistentRead;
	public Boolean enableTracing;
	public List memberListQuery;
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

	public List getMemberListQuery() {
		return memberListQuery;
	}

	public void setMemberListQuery(List memberListQuery) {
		this.memberListQuery = memberListQuery;
	}

	public String getObfuscatedSquareId() {
		return obfuscatedSquareId;
	}

	public void setObfuscatedSquareId(String obfuscatedSquareId) {
		this.obfuscatedSquareId = obfuscatedSquareId;
	}
}
