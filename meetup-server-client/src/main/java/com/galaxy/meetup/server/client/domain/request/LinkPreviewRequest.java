/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.ClientEmbedOptions;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 * 
 */
public final class LinkPreviewRequest extends Request {

	public String callToActionDeepLinkId;
	public String callToActionLabel;
	public String callToActionLabelDeprecated;
	public String callToActionUrl;
	public ApiaryFields commonFields;
	public String content;
	public String deepLinkId;
	public ClientEmbedOptions embedOptions;
	public Boolean enableTracing;
	public Boolean fallbackToUrl;
	public Boolean isInteractivePost;
	public Boolean useBlackboxPreviewData;
	public Boolean useSmallPreviews;

	public String getCallToActionDeepLinkId() {
		return callToActionDeepLinkId;
	}

	public void setCallToActionDeepLinkId(String callToActionDeepLinkId) {
		this.callToActionDeepLinkId = callToActionDeepLinkId;
	}

	public String getCallToActionLabel() {
		return callToActionLabel;
	}

	public void setCallToActionLabel(String callToActionLabel) {
		this.callToActionLabel = callToActionLabel;
	}

	public String getCallToActionLabelDeprecated() {
		return callToActionLabelDeprecated;
	}

	public void setCallToActionLabelDeprecated(
			String callToActionLabelDeprecated) {
		this.callToActionLabelDeprecated = callToActionLabelDeprecated;
	}

	public String getCallToActionUrl() {
		return callToActionUrl;
	}

	public void setCallToActionUrl(String callToActionUrl) {
		this.callToActionUrl = callToActionUrl;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDeepLinkId() {
		return deepLinkId;
	}

	public void setDeepLinkId(String deepLinkId) {
		this.deepLinkId = deepLinkId;
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

	public Boolean getFallbackToUrl() {
		return fallbackToUrl;
	}

	public void setFallbackToUrl(Boolean fallbackToUrl) {
		this.fallbackToUrl = fallbackToUrl;
	}

	public Boolean getIsInteractivePost() {
		return isInteractivePost;
	}

	public void setIsInteractivePost(Boolean isInteractivePost) {
		this.isInteractivePost = isInteractivePost;
	}

	public Boolean getUseBlackboxPreviewData() {
		return useBlackboxPreviewData;
	}

	public void setUseBlackboxPreviewData(Boolean useBlackboxPreviewData) {
		this.useBlackboxPreviewData = useBlackboxPreviewData;
	}

	public Boolean getUseSmallPreviews() {
		return useSmallPreviews;
	}

	public void setUseSmallPreviews(Boolean useSmallPreviews) {
		this.useSmallPreviews = useSmallPreviews;
	}
}
