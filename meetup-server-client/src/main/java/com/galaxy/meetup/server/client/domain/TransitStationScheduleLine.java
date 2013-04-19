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
public class TransitStationScheduleLine extends GenericJson {

	public String destinations;
	public String lineId;
	public LineSnippet lineSnippet;
	public PlacePageLink link;
	public List trip;

	public String getDestinations() {
		return destinations;
	}

	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public LineSnippet getLineSnippet() {
		return lineSnippet;
	}

	public void setLineSnippet(LineSnippet lineSnippet) {
		this.lineSnippet = lineSnippet;
	}

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}

	public List getTrip() {
		return trip;
	}

	public void setTrip(List trip) {
		this.trip = trip;
	}
}
