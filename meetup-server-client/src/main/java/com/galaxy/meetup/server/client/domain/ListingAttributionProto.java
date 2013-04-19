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
public class ListingAttributionProto extends GenericJson {

	public List attribution;
	public String attributionPosition;
	public String attributionStyle;

	public List getAttribution() {
		return attribution;
	}

	public void setAttribution(List attribution) {
		this.attribution = attribution;
	}

	public String getAttributionPosition() {
		return attributionPosition;
	}

	public void setAttributionPosition(String attributionPosition) {
		this.attributionPosition = attributionPosition;
	}

	public String getAttributionStyle() {
		return attributionStyle;
	}

	public void setAttributionStyle(String attributionStyle) {
		this.attributionStyle = attributionStyle;
	}
}
