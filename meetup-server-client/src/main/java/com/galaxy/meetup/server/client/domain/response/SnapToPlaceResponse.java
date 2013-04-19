/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.LocationResult;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class SnapToPlaceResponse extends GenericJson {

	public TraceRecords backendTrace;
	public LocationResult cityLocation;
	public List localPlace;
	public LocationResult preciseLocation;
	public Boolean userIsAtFirstPlace;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public LocationResult getCityLocation() {
		return cityLocation;
	}

	public void setCityLocation(LocationResult cityLocation) {
		this.cityLocation = cityLocation;
	}

	public List getLocalPlace() {
		return localPlace;
	}

	public void setLocalPlace(List localPlace) {
		this.localPlace = localPlace;
	}

	public LocationResult getPreciseLocation() {
		return preciseLocation;
	}

	public void setPreciseLocation(LocationResult preciseLocation) {
		this.preciseLocation = preciseLocation;
	}

	public Boolean getUserIsAtFirstPlace() {
		return userIsAtFirstPlace;
	}

	public void setUserIsAtFirstPlace(Boolean userIsAtFirstPlace) {
		this.userIsAtFirstPlace = userIsAtFirstPlace;
	}
}
