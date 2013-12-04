/**
 * galaxy inc.
 * meetup client for android
 */
package com.openteach.meetup.server.client.entity;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class HangoutBroadcast {

	public List attendees;
	public HangoutConsumer baseHangout;
	public String hashedRoomId;
	public String name;
	public String preferredLanguage;
	public String region;
	public HangoutStartContext startContext;
	public String status;
	public Boolean topicMaybeNsfw;
	public Integer totalAttendeeCount;
	public String url;
	public String youtubeLiveId;

	public List getAttendees() {
		return attendees;
	}

	public void setAttendees(List attendees) {
		this.attendees = attendees;
	}

	public HangoutConsumer getBaseHangout() {
		return baseHangout;
	}

	public void setBaseHangout(HangoutConsumer baseHangout) {
		this.baseHangout = baseHangout;
	}

	public String getHashedRoomId() {
		return hashedRoomId;
	}

	public void setHashedRoomId(String hashedRoomId) {
		this.hashedRoomId = hashedRoomId;
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
