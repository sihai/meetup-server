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
public class ClientOverrides extends GenericJson {

	public CompositeStoryRequestProto compositeStory;

	public CompositeStoryRequestProto getCompositeStory() {
		return compositeStory;
	}

	public void setCompositeStory(CompositeStoryRequestProto compositeStory) {
		this.compositeStory = compositeStory;
	}
}
