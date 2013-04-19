/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.ClientEmbedOptions;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.StreamParams;


/**
 * 
 * @author sihai
 * 
 */
public class GetActivitiesRequest extends GenericJson {

	public ApiaryFields commonFields;
	public String continuesToken;
	public ClientEmbedOptions embedOptions;
	public Boolean enableTracing;
	public Boolean isUserInitiated;
	public String ownerId;
	public String perspectiveId;
	public Boolean skipPopularMixin;
	public StreamParams streamParams;

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContinuesToken() {
		return continuesToken;
	}

	public void setContinuesToken(String continuesToken) {
		this.continuesToken = continuesToken;
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

	public Boolean getIsUserInitiated() {
		return isUserInitiated;
	}

	public void setIsUserInitiated(Boolean isUserInitiated) {
		this.isUserInitiated = isUserInitiated;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPerspectiveId() {
		return perspectiveId;
	}

	public void setPerspectiveId(String perspectiveId) {
		this.perspectiveId = perspectiveId;
	}

	public Boolean getSkipPopularMixin() {
		return skipPopularMixin;
	}

	public void setSkipPopularMixin(Boolean skipPopularMixin) {
		this.skipPopularMixin = skipPopularMixin;
	}

	public StreamParams getStreamParams() {
		return streamParams;
	}

	public void setStreamParams(StreamParams streamParams) {
		this.streamParams = streamParams;
	}
}
