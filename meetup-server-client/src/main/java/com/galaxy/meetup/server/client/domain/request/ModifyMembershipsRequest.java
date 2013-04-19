/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.DataCircleMembershipModificationParams;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 * 
 */
public class ModifyMembershipsRequest extends GenericJson {

	public DataCircleMembershipModificationParams circleMembershipModificationParams;
	public List circleToAdd;
	public List circleToRemove;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Boolean viewerCanSeeAdultContent;

	public DataCircleMembershipModificationParams getCircleMembershipModificationParams() {
		return circleMembershipModificationParams;
	}

	public void setCircleMembershipModificationParams(
			DataCircleMembershipModificationParams circleMembershipModificationParams) {
		this.circleMembershipModificationParams = circleMembershipModificationParams;
	}

	public List getCircleToAdd() {
		return circleToAdd;
	}

	public void setCircleToAdd(List circleToAdd) {
		this.circleToAdd = circleToAdd;
	}

	public List getCircleToRemove() {
		return circleToRemove;
	}

	public void setCircleToRemove(List circleToRemove) {
		this.circleToRemove = circleToRemove;
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

	public Boolean getViewerCanSeeAdultContent() {
		return viewerCanSeeAdultContent;
	}

	public void setViewerCanSeeAdultContent(Boolean viewerCanSeeAdultContent) {
		this.viewerCanSeeAdultContent = viewerCanSeeAdultContent;
	}
}
