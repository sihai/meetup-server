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
public class DetailProtoValue extends GenericJson {

	public PlacePageLink showLink;
	
    public PlacePageLink value;

	public PlacePageLink getShowLink() {
		return showLink;
	}

	public void setShowLink(PlacePageLink showLink) {
		this.showLink = showLink;
	}

	public PlacePageLink getValue() {
		return value;
	}

	public void setValue(PlacePageLink value) {
		this.value = value;
	}
}
