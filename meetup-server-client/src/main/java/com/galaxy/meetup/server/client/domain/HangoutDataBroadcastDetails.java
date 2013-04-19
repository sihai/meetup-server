/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class HangoutDataBroadcastDetails extends GenericJson {

	public String broadcastTitle;
	public String broadcastUrl;
	public String youtubeLiveId;

	public String getBroadcastTitle() {
		return broadcastTitle;
	}

	public void setBroadcastTitle(String broadcastTitle) {
		this.broadcastTitle = broadcastTitle;
	}

	public String getBroadcastUrl() {
		return broadcastUrl;
	}

	public void setBroadcastUrl(String broadcastUrl) {
		this.broadcastUrl = broadcastUrl;
	}

	public String getYoutubeLiveId() {
		return youtubeLiveId;
	}

	public void setYoutubeLiveId(String youtubeLiveId) {
		this.youtubeLiveId = youtubeLiveId;
	}
}
