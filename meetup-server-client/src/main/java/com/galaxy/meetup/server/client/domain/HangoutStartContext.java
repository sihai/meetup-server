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
public class HangoutStartContext extends GenericJson {

	public String activityId;
	public String appData;
	public String appId;
	public String callback;
	public String circleId;
	public String contextId;
	public String conversationId;
	public Boolean create;
	public Boolean deprecatedCallback;
	public ExternalEntityKey externalKey;
	public String externalUserId;
	public Boolean flippy;
	public String hangoutId;
	public String hangoutType;
	public HangoutStartContextInvitation invitation;
	public String invitedOid;
	public List invitee;
	public HangoutStartContextLatencyMarks latencyMarks;
	public String nick;
	public List profileId;
	public String referringUrl;
	public Boolean shouldAutoInvite;
	public Boolean shouldMuteVideo;
	public String source;
	public String squareId;
	public String topic;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAppData() {
		return appData;
	}

	public void setAppData(String appData) {
		this.appData = appData;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public String getContextId() {
		return contextId;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public Boolean getCreate() {
		return create;
	}

	public void setCreate(Boolean create) {
		this.create = create;
	}

	public Boolean getDeprecatedCallback() {
		return deprecatedCallback;
	}

	public void setDeprecatedCallback(Boolean deprecatedCallback) {
		this.deprecatedCallback = deprecatedCallback;
	}

	public ExternalEntityKey getExternalKey() {
		return externalKey;
	}

	public void setExternalKey(ExternalEntityKey externalKey) {
		this.externalKey = externalKey;
	}

	public String getExternalUserId() {
		return externalUserId;
	}

	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public Boolean getFlippy() {
		return flippy;
	}

	public void setFlippy(Boolean flippy) {
		this.flippy = flippy;
	}

	public String getHangoutId() {
		return hangoutId;
	}

	public void setHangoutId(String hangoutId) {
		this.hangoutId = hangoutId;
	}

	public String getHangoutType() {
		return hangoutType;
	}

	public void setHangoutType(String hangoutType) {
		this.hangoutType = hangoutType;
	}

	public HangoutStartContextInvitation getInvitation() {
		return invitation;
	}

	public void setInvitation(HangoutStartContextInvitation invitation) {
		this.invitation = invitation;
	}

	public String getInvitedOid() {
		return invitedOid;
	}

	public void setInvitedOid(String invitedOid) {
		this.invitedOid = invitedOid;
	}

	public List getInvitee() {
		return invitee;
	}

	public void setInvitee(List invitee) {
		this.invitee = invitee;
	}

	public HangoutStartContextLatencyMarks getLatencyMarks() {
		return latencyMarks;
	}

	public void setLatencyMarks(HangoutStartContextLatencyMarks latencyMarks) {
		this.latencyMarks = latencyMarks;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public List getProfileId() {
		return profileId;
	}

	public void setProfileId(List profileId) {
		this.profileId = profileId;
	}

	public String getReferringUrl() {
		return referringUrl;
	}

	public void setReferringUrl(String referringUrl) {
		this.referringUrl = referringUrl;
	}

	public Boolean getShouldAutoInvite() {
		return shouldAutoInvite;
	}

	public void setShouldAutoInvite(Boolean shouldAutoInvite) {
		this.shouldAutoInvite = shouldAutoInvite;
	}

	public Boolean getShouldMuteVideo() {
		return shouldMuteVideo;
	}

	public void setShouldMuteVideo(Boolean shouldMuteVideo) {
		this.shouldMuteVideo = shouldMuteVideo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSquareId() {
		return squareId;
	}

	public void setSquareId(String squareId) {
		this.squareId = squareId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
