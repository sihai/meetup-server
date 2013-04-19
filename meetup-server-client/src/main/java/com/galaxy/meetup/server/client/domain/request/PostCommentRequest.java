/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EditSegments;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 * 
 */
public class PostCommentRequest extends GenericJson {

	public String activityId;
	public String botGuardResponse;
	public String clientId;
	public EditSegments commentSegments;
	public String commentText;
	public ApiaryFields commonFields;
	public String contentFormat;
	public Long creationTimeMs;
	public Boolean enableTracing;
	public String renderContextLocation;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBotGuardResponse() {
		return botGuardResponse;
	}

	public void setBotGuardResponse(String botGuardResponse) {
		this.botGuardResponse = botGuardResponse;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public EditSegments getCommentSegments() {
		return commentSegments;
	}

	public void setCommentSegments(EditSegments commentSegments) {
		this.commentSegments = commentSegments;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public Long getCreationTimeMs() {
		return creationTimeMs;
	}

	public void setCreationTimeMs(Long creationTimeMs) {
		this.creationTimeMs = creationTimeMs;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getRenderContextLocation() {
		return renderContextLocation;
	}

	public void setRenderContextLocation(String renderContextLocation) {
		this.renderContextLocation = renderContextLocation;
	}
}
