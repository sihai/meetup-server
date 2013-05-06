/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.ClientEmbedOptions;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.GetActivitiesCommonParams;
import com.galaxy.meetup.server.client.domain.RenderContext;


/**
 * 
 * @author sihai
 * 
 */
public class GetActivityRequest extends Request {

	public String activityId;
	public Long activityMaxResharers;
	public ApiaryFields commonFields;
	public GetActivitiesCommonParams commonParams;
	public String deprecatedRenderContextLocation;
	public ClientEmbedOptions embedOptions;
	public Boolean enableTracing;
	public Boolean fetchReadState;
	public String ownerId;
	public RenderContext renderContext;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getActivityMaxResharers() {
		return activityMaxResharers;
	}

	public void setActivityMaxResharers(Long activityMaxResharers) {
		this.activityMaxResharers = activityMaxResharers;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public GetActivitiesCommonParams getCommonParams() {
		return commonParams;
	}

	public void setCommonParams(GetActivitiesCommonParams commonParams) {
		this.commonParams = commonParams;
	}

	public String getDeprecatedRenderContextLocation() {
		return deprecatedRenderContextLocation;
	}

	public void setDeprecatedRenderContextLocation(
			String deprecatedRenderContextLocation) {
		this.deprecatedRenderContextLocation = deprecatedRenderContextLocation;
	}

	public ClientEmbedOptions getEmbedOptions() {
		return embedOptions;
	}

	public void setEmbedOptions(ClientEmbedOptions embedOptions) {
		this.embedOptions = embedOptions;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public Boolean getFetchReadState() {
		return fetchReadState;
	}

	public void setFetchReadState(Boolean fetchReadState) {
		this.fetchReadState = fetchReadState;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public RenderContext getRenderContext() {
		return renderContext;
	}

	public void setRenderContext(RenderContext renderContext) {
		this.renderContext = renderContext;
	}
}
