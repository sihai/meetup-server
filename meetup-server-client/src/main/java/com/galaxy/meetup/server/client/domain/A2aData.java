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
public class A2aData extends GenericJson {

	public HangoutData hangoutData;

	public HangoutData getHangoutData() {
		return hangoutData;
	}

	public void setHangoutData(HangoutData hangoutData) {
		this.hangoutData = hangoutData;
	}
}
