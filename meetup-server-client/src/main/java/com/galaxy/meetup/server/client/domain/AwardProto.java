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
public class AwardProto extends GenericJson {

	public PlacePageLink awardLink;

	public PlacePageLink getAwardLink() {
		return awardLink;
	}

	public void setAwardLink(PlacePageLink awardLink) {
		this.awardLink = awardLink;
	}
}
