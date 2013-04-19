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
public class Date extends GenericJson {

	public String date;
	
    public String iso8601;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIso8601() {
		return iso8601;
	}

	public void setIso8601(String iso8601) {
		this.iso8601 = iso8601;
	}
}
