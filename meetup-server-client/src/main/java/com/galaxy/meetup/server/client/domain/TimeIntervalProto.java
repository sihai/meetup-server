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
public class TimeIntervalProto extends GenericJson {

	public TimeEndpointProto begin;
	public TimeEndpointProto end;
	public Boolean inverted;
	public String occasion;
	public String type;

	public TimeEndpointProto getBegin() {
		return begin;
	}

	public void setBegin(TimeEndpointProto begin) {
		this.begin = begin;
	}

	public TimeEndpointProto getEnd() {
		return end;
	}

	public void setEnd(TimeEndpointProto end) {
		this.end = end;
	}

	public Boolean getInverted() {
		return inverted;
	}

	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
