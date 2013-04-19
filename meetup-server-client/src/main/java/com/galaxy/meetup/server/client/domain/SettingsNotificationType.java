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
public class SettingsNotificationType extends GenericJson {

	public Integer bucket;
	public String channel;

	public Integer getBucket() {
		return bucket;
	}

	public void setBucket(Integer bucket) {
		this.bucket = bucket;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
}
