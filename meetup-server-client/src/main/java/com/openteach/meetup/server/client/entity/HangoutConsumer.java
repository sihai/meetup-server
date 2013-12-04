package com.openteach.meetup.server.client.entity;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class HangoutConsumer {

	public List<TinyUser> attendees;
	public String eventId;
	public List hangoutMediaDetails;
	public String hashedRoomId;
	public Boolean isBroadcastInvite;
	public Boolean isSelfPost;
	public Integer maxAttendees;
	public Boolean minorsNotAllowed;
	public String name;
	public String preferredLanguage;
	public String region;
	public HangoutStartContext startContext;
	public String status;
	public Boolean topicMaybeNsfw;
	public Integer totalAttendeeCount;
	public String url;
	public String youtubeLiveId;

	public List<TinyUser> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<TinyUser> attendees) {
		this.attendees = attendees;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public List getHangoutMediaDetails() {
		return hangoutMediaDetails;
	}

	public void setHangoutMediaDetails(List hangoutMediaDetails) {
		this.hangoutMediaDetails = hangoutMediaDetails;
	}

	public String getHashedRoomId() {
		return hashedRoomId;
	}

	public void setHashedRoomId(String hashedRoomId) {
		this.hashedRoomId = hashedRoomId;
	}

	public Boolean getIsBroadcastInvite() {
		return isBroadcastInvite;
	}

	public void setIsBroadcastInvite(Boolean isBroadcastInvite) {
		this.isBroadcastInvite = isBroadcastInvite;
	}

	public Boolean getIsSelfPost() {
		return isSelfPost;
	}

	public void setIsSelfPost(Boolean isSelfPost) {
		this.isSelfPost = isSelfPost;
	}

	public Integer getMaxAttendees() {
		return maxAttendees;
	}

	public void setMaxAttendees(Integer maxAttendees) {
		this.maxAttendees = maxAttendees;
	}

	public Boolean getMinorsNotAllowed() {
		return minorsNotAllowed;
	}

	public void setMinorsNotAllowed(Boolean minorsNotAllowed) {
		this.minorsNotAllowed = minorsNotAllowed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public HangoutStartContext getStartContext() {
		return startContext;
	}

	public void setStartContext(HangoutStartContext startContext) {
		this.startContext = startContext;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getTopicMaybeNsfw() {
		return topicMaybeNsfw;
	}

	public void setTopicMaybeNsfw(Boolean topicMaybeNsfw) {
		this.topicMaybeNsfw = topicMaybeNsfw;
	}

	public Integer getTotalAttendeeCount() {
		return totalAttendeeCount;
	}

	public void setTotalAttendeeCount(Integer totalAttendeeCount) {
		this.totalAttendeeCount = totalAttendeeCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getYoutubeLiveId() {
		return youtubeLiveId;
	}

	public void setYoutubeLiveId(String youtubeLiveId) {
		this.youtubeLiveId = youtubeLiveId;
	}
}
