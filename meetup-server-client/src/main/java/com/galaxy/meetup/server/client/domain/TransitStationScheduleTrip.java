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
public class TransitStationScheduleTrip extends GenericJson {

	public List departure;
	public TransitStationScheduleDeparture firstDeparture;
	public String headsign;
	public TransitStationScheduleDeparture lastDeparture;
	public PlacePageLink link;

	public List getDeparture() {
		return departure;
	}

	public void setDeparture(List departure) {
		this.departure = departure;
	}

	public TransitStationScheduleDeparture getFirstDeparture() {
		return firstDeparture;
	}

	public void setFirstDeparture(TransitStationScheduleDeparture firstDeparture) {
		this.firstDeparture = firstDeparture;
	}

	public String getHeadsign() {
		return headsign;
	}

	public void setHeadsign(String headsign) {
		this.headsign = headsign;
	}

	public TransitStationScheduleDeparture getLastDeparture() {
		return lastDeparture;
	}

	public void setLastDeparture(TransitStationScheduleDeparture lastDeparture) {
		this.lastDeparture = lastDeparture;
	}

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}
}
