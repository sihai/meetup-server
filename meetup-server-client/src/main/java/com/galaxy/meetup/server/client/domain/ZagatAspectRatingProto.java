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
public class ZagatAspectRatingProto extends GenericJson {

	public Boolean isEditable;
	public String labelDisplay;
	public String labelId;
	public String valueDisplay;
	public String valueExplanation;

	public Boolean getIsEditable() {
		return isEditable;
	}

	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}

	public String getLabelDisplay() {
		return labelDisplay;
	}

	public void setLabelDisplay(String labelDisplay) {
		this.labelDisplay = labelDisplay;
	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getValueDisplay() {
		return valueDisplay;
	}

	public void setValueDisplay(String valueDisplay) {
		this.valueDisplay = valueDisplay;
	}

	public String getValueExplanation() {
		return valueExplanation;
	}

	public void setValueExplanation(String valueExplanation) {
		this.valueExplanation = valueExplanation;
	}
}
