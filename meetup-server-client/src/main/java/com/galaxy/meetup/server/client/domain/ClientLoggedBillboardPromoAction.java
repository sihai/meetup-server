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
public class ClientLoggedBillboardPromoAction extends GenericJson {

	public String actionArea;
	
    public String promoId;

	public String getActionArea() {
		return actionArea;
	}

	public void setActionArea(String actionArea) {
		this.actionArea = actionArea;
	}

	public String getPromoId() {
		return promoId;
	}

	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}
}
