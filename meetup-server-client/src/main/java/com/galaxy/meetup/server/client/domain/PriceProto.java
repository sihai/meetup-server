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
public class PriceProto extends GenericJson {

	public String currency;
	public String currencyCode;
	public String labelDisplay;
	public String labelHintDisplay;
	public String valueDisplay;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getLabelDisplay() {
		return labelDisplay;
	}

	public void setLabelDisplay(String labelDisplay) {
		this.labelDisplay = labelDisplay;
	}

	public String getLabelHintDisplay() {
		return labelHintDisplay;
	}

	public void setLabelHintDisplay(String labelHintDisplay) {
		this.labelHintDisplay = labelHintDisplay;
	}

	public String getValueDisplay() {
		return valueDisplay;
	}

	public void setValueDisplay(String valueDisplay) {
		this.valueDisplay = valueDisplay;
	}
}
