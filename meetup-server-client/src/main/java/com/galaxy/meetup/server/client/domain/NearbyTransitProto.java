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
public class NearbyTransitProto extends GenericJson {

	public Boolean hasMoreStations;
	public Boolean isStation;
	public Integer startIndex;
	public List station;

	public Boolean getHasMoreStations() {
		return hasMoreStations;
	}

	public void setHasMoreStations(Boolean hasMoreStations) {
		this.hasMoreStations = hasMoreStations;
	}

	public Boolean getIsStation() {
		return isStation;
	}

	public void setIsStation(Boolean isStation) {
		this.isStation = isStation;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public List getStation() {
		return station;
	}

	public void setStation(List station) {
		this.station = station;
	}
}
