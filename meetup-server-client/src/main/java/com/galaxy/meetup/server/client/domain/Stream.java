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
public class Stream extends GenericJson {

	public String continuationToken;
	public List debugInfo;
	public List item;
	public String mixerDebugInfo;
	public StreamParams params;
	public PopularUpdates popularUpdates;
	public List<Update> update;
	public String volume;

	public String getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
	}

	public List getDebugInfo() {
		return debugInfo;
	}

	public void setDebugInfo(List debugInfo) {
		this.debugInfo = debugInfo;
	}

	public List getItem() {
		return item;
	}

	public void setItem(List item) {
		this.item = item;
	}

	public String getMixerDebugInfo() {
		return mixerDebugInfo;
	}

	public void setMixerDebugInfo(String mixerDebugInfo) {
		this.mixerDebugInfo = mixerDebugInfo;
	}

	public StreamParams getParams() {
		return params;
	}

	public void setParams(StreamParams params) {
		this.params = params;
	}

	public PopularUpdates getPopularUpdates() {
		return popularUpdates;
	}

	public void setPopularUpdates(PopularUpdates popularUpdates) {
		this.popularUpdates = popularUpdates;
	}

	public List<Update> getUpdate() {
		return update;
	}

	public void setUpdate(List<Update> update) {
		this.update = update;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
}
