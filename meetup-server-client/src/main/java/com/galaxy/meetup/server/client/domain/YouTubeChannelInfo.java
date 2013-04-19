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
public class YouTubeChannelInfo extends GenericJson {

	public Links channelLinks;
	public Boolean isRestricted;

	public Links getChannelLinks() {
		return channelLinks;
	}

	public void setChannelLinks(Links channelLinks) {
		this.channelLinks = channelLinks;
	}

	public Boolean getIsRestricted() {
		return isRestricted;
	}

	public void setIsRestricted(Boolean isRestricted) {
		this.isRestricted = isRestricted;
	}
}
