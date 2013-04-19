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
public class CrossStreetsProto extends GenericJson {

	public CrossStreetProto begin;
	
    public CrossStreetProto end;
    
    public String formattedCrossStreets;

	public CrossStreetProto getBegin() {
		return begin;
	}

	public void setBegin(CrossStreetProto begin) {
		this.begin = begin;
	}

	public CrossStreetProto getEnd() {
		return end;
	}

	public void setEnd(CrossStreetProto end) {
		this.end = end;
	}

	public String getFormattedCrossStreets() {
		return formattedCrossStreets;
	}

	public void setFormattedCrossStreets(String formattedCrossStreets) {
		this.formattedCrossStreets = formattedCrossStreets;
	}
}
