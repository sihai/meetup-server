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
public class PriceRangeProto extends GenericJson {

	public String currency;
	public Double lowerPrice;
	public String units;
	public Double upperPrice;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getLowerPrice() {
		return lowerPrice;
	}

	public void setLowerPrice(Double lowerPrice) {
		this.lowerPrice = lowerPrice;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Double getUpperPrice() {
		return upperPrice;
	}

	public void setUpperPrice(Double upperPrice) {
		this.upperPrice = upperPrice;
	}
}
