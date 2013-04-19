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
public class CrossStreetProto extends GenericJson {

	public Double metersAway;
	
    public String name;

	public Double getMetersAway() {
		return metersAway;
	}

	public void setMetersAway(Double metersAway) {
		this.metersAway = metersAway;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
