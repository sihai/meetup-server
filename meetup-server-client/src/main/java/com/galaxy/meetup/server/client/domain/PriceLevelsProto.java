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
public class PriceLevelsProto extends GenericJson {

	public String labelDisplay;
	public List priceLevel;
	public Long ratedValueId;

	public String getLabelDisplay() {
		return labelDisplay;
	}

	public void setLabelDisplay(String labelDisplay) {
		this.labelDisplay = labelDisplay;
	}

	public List getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(List priceLevel) {
		this.priceLevel = priceLevel;
	}

	public Long getRatedValueId() {
		return ratedValueId;
	}

	public void setRatedValueId(Long ratedValueId) {
		this.ratedValueId = ratedValueId;
	}
}
