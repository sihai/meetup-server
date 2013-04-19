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
public class TitleProto extends GenericJson {

	public PlacePageLink linkedTitle;

	public PlacePageLink getLinkedTitle() {
		return linkedTitle;
	}

	public void setLinkedTitle(PlacePageLink linkedTitle) {
		this.linkedTitle = linkedTitle;
	}
}
