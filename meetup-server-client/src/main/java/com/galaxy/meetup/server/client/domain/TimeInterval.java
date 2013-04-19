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
public class TimeInterval extends GenericJson {

	public TimeEndpoint begin;
	public Boolean current;
	public TimeEndpoint end;

	public TimeEndpoint getBegin() {
		return begin;
	}

	public void setBegin(TimeEndpoint begin) {
		this.begin = begin;
	}

	public Boolean getCurrent() {
		return current;
	}

	public void setCurrent(Boolean current) {
		this.current = current;
	}

	public TimeEndpoint getEnd() {
		return end;
	}

	public void setEnd(TimeEndpoint end) {
		this.end = end;
	}
}
