/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class RenderContext extends GenericJson {

	public Boolean deprecatedIsViewerLoggedIn;
	public Boolean disableExplanation;
	public Boolean disableHeader;
	public Boolean disableReshare;
	public Boolean disableVisibilityLink;
	public Boolean isSummaryFormat;
	public String location;
	public String moderationViewType;
	public String renderKey;
	public Boolean showMuted;
	public Boolean showSectionHeaders;
	public Boolean showStreamModerationControls;
	public Boolean showUnreadIndicator;
	public List streamId;
	public Boolean viewerIsModerator;

	public Boolean getDeprecatedIsViewerLoggedIn() {
		return deprecatedIsViewerLoggedIn;
	}

	public void setDeprecatedIsViewerLoggedIn(Boolean deprecatedIsViewerLoggedIn) {
		this.deprecatedIsViewerLoggedIn = deprecatedIsViewerLoggedIn;
	}

	public Boolean getDisableExplanation() {
		return disableExplanation;
	}

	public void setDisableExplanation(Boolean disableExplanation) {
		this.disableExplanation = disableExplanation;
	}

	public Boolean getDisableHeader() {
		return disableHeader;
	}

	public void setDisableHeader(Boolean disableHeader) {
		this.disableHeader = disableHeader;
	}

	public Boolean getDisableReshare() {
		return disableReshare;
	}

	public void setDisableReshare(Boolean disableReshare) {
		this.disableReshare = disableReshare;
	}

	public Boolean getDisableVisibilityLink() {
		return disableVisibilityLink;
	}

	public void setDisableVisibilityLink(Boolean disableVisibilityLink) {
		this.disableVisibilityLink = disableVisibilityLink;
	}

	public Boolean getIsSummaryFormat() {
		return isSummaryFormat;
	}

	public void setIsSummaryFormat(Boolean isSummaryFormat) {
		this.isSummaryFormat = isSummaryFormat;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getModerationViewType() {
		return moderationViewType;
	}

	public void setModerationViewType(String moderationViewType) {
		this.moderationViewType = moderationViewType;
	}

	public String getRenderKey() {
		return renderKey;
	}

	public void setRenderKey(String renderKey) {
		this.renderKey = renderKey;
	}

	public Boolean getShowMuted() {
		return showMuted;
	}

	public void setShowMuted(Boolean showMuted) {
		this.showMuted = showMuted;
	}

	public Boolean getShowSectionHeaders() {
		return showSectionHeaders;
	}

	public void setShowSectionHeaders(Boolean showSectionHeaders) {
		this.showSectionHeaders = showSectionHeaders;
	}

	public Boolean getShowStreamModerationControls() {
		return showStreamModerationControls;
	}

	public void setShowStreamModerationControls(
			Boolean showStreamModerationControls) {
		this.showStreamModerationControls = showStreamModerationControls;
	}

	public Boolean getShowUnreadIndicator() {
		return showUnreadIndicator;
	}

	public void setShowUnreadIndicator(Boolean showUnreadIndicator) {
		this.showUnreadIndicator = showUnreadIndicator;
	}

	public List getStreamId() {
		return streamId;
	}

	public void setStreamId(List streamId) {
		this.streamId = streamId;
	}

	public Boolean getViewerIsModerator() {
		return viewerIsModerator;
	}

	public void setViewerIsModerator(Boolean viewerIsModerator) {
		this.viewerIsModerator = viewerIsModerator;
	}
}
