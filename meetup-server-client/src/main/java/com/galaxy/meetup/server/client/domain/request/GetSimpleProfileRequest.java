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
public class GetSimpleProfileRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Boolean includeAclData;
	public Boolean includeIncomingMembership;
	public Boolean includeViewerCircles;
	public String ownerId;
	public Boolean useCachedDataForCircles;

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

	public Boolean getIncludeAclData() {
		return includeAclData;
	}

	public void setIncludeAclData(Boolean includeAclData) {
		this.includeAclData = includeAclData;
	}

	public Boolean getIncludeIncomingMembership() {
		return includeIncomingMembership;
	}

	public void setIncludeIncomingMembership(Boolean includeIncomingMembership) {
		this.includeIncomingMembership = includeIncomingMembership;
	}

	public Boolean getIncludeViewerCircles() {
		return includeViewerCircles;
	}

	public void setIncludeViewerCircles(Boolean includeViewerCircles) {
		this.includeViewerCircles = includeViewerCircles;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getUseCachedDataForCircles() {
		return useCachedDataForCircles;
	}

	public void setUseCachedDataForCircles(Boolean useCachedDataForCircles) {
		this.useCachedDataForCircles = useCachedDataForCircles;
	}
}
