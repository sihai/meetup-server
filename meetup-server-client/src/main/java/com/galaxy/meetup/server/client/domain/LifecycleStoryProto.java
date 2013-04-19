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
public class LifecycleStoryProto extends GenericJson {

	public PlacePageLink link;
	public String type;

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
