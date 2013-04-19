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
public class LiveMapsProto extends GenericJson {

	public List event;
	public PlacePageLink moreEventsLink;
	public List provider;
	public StoryTitle title;

	public List getEvent() {
		return event;
	}

	public void setEvent(List event) {
		this.event = event;
	}

	public PlacePageLink getMoreEventsLink() {
		return moreEventsLink;
	}

	public void setMoreEventsLink(PlacePageLink moreEventsLink) {
		this.moreEventsLink = moreEventsLink;
	}

	public List getProvider() {
		return provider;
	}

	public void setProvider(List provider) {
		this.provider = provider;
	}

	public StoryTitle getTitle() {
		return title;
	}

	public void setTitle(StoryTitle title) {
		this.title = title;
	}
}
