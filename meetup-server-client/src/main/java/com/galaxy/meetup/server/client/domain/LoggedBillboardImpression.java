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
public class LoggedBillboardImpression extends GenericJson {

	public String billboardId;

	public String getBillboardId() {
		return billboardId;
	}

	public void setBillboardId(String billboardId) {
		this.billboardId = billboardId;
	}
}
