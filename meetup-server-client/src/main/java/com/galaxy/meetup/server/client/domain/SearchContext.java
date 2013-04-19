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
public class SearchContext extends GenericJson {

	public ClientOverrides clientOverrides;
	public LocationData location;
	public List param;
	public List whatChip;
	public String whatQuery;
	public List whereChip;
	public String whereQuery;

	public ClientOverrides getClientOverrides() {
		return clientOverrides;
	}

	public void setClientOverrides(ClientOverrides clientOverrides) {
		this.clientOverrides = clientOverrides;
	}

	public LocationData getLocation() {
		return location;
	}

	public void setLocation(LocationData location) {
		this.location = location;
	}

	public List getParam() {
		return param;
	}

	public void setParam(List param) {
		this.param = param;
	}

	public List getWhatChip() {
		return whatChip;
	}

	public void setWhatChip(List whatChip) {
		this.whatChip = whatChip;
	}

	public String getWhatQuery() {
		return whatQuery;
	}

	public void setWhatQuery(String whatQuery) {
		this.whatQuery = whatQuery;
	}

	public List getWhereChip() {
		return whereChip;
	}

	public void setWhereChip(List whereChip) {
		this.whereChip = whereChip;
	}

	public String getWhereQuery() {
		return whereQuery;
	}

	public void setWhereQuery(String whereQuery) {
		this.whereQuery = whereQuery;
	}
}
