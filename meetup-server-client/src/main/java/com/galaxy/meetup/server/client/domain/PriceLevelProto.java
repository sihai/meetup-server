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
public class PriceLevelProto extends GenericJson {

	public String labelDisplay;
	public String labelHintDisplay;
	public Integer valueId;

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

	public Integer getValueId() {
		return valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}
}
