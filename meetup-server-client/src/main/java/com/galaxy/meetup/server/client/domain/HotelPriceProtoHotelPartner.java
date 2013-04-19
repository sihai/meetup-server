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
public class HotelPriceProtoHotelPartner extends GenericJson {

	public String currencyString;
	public String formattedBasePrice;
	public String formattedPrice;
	public String formattedTaxes;
	public Boolean isOwner;
	public String name;
	public Float price;
	public Float taxes;
	public String url;

	public String getCurrencyString() {
		return currencyString;
	}

	public void setCurrencyString(String currencyString) {
		this.currencyString = currencyString;
	}

	public String getFormattedBasePrice() {
		return formattedBasePrice;
	}

	public void setFormattedBasePrice(String formattedBasePrice) {
		this.formattedBasePrice = formattedBasePrice;
	}

	public String getFormattedPrice() {
		return formattedPrice;
	}

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}

	public String getFormattedTaxes() {
		return formattedTaxes;
	}

	public void setFormattedTaxes(String formattedTaxes) {
		this.formattedTaxes = formattedTaxes;
	}

	public Boolean getIsOwner() {
		return isOwner;
	}

	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getTaxes() {
		return taxes;
	}

	public void setTaxes(Float taxes) {
		this.taxes = taxes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
