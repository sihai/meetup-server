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
public class DataTimedTextMetaData extends GenericJson {

	public List track;
	
    public String ttsUrl;

	public List getTrack() {
		return track;
	}

	public void setTrack(List track) {
		this.track = track;
	}

	public String getTtsUrl() {
		return ttsUrl;
	}

	public void setTtsUrl(String ttsUrl) {
		this.ttsUrl = ttsUrl;
	}
}
