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
public class AttributeProto extends GenericJson {

	public PlacePageLink attribution;
	
    public String labelAttribution;
    
    public String labelDisplay;
    
    public String labelId;
    
    public AttributeProtoCanonicalValue value;
    
    public String valueAttribution;
    
    public String valueDisplay;
    
    public String valueDisplaySuffix;
    
    public String valueSpaceId;
    
    public String ved;

	public PlacePageLink getAttribution() {
		return attribution;
	}

	public void setAttribution(PlacePageLink attribution) {
		this.attribution = attribution;
	}

	public String getLabelAttribution() {
		return labelAttribution;
	}

	public void setLabelAttribution(String labelAttribution) {
		this.labelAttribution = labelAttribution;
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

	public AttributeProtoCanonicalValue getValue() {
		return value;
	}

	public void setValue(AttributeProtoCanonicalValue value) {
		this.value = value;
	}

	public String getValueAttribution() {
		return valueAttribution;
	}

	public void setValueAttribution(String valueAttribution) {
		this.valueAttribution = valueAttribution;
	}

	public String getValueDisplay() {
		return valueDisplay;
	}

	public void setValueDisplay(String valueDisplay) {
		this.valueDisplay = valueDisplay;
	}

	public String getValueDisplaySuffix() {
		return valueDisplaySuffix;
	}

	public void setValueDisplaySuffix(String valueDisplaySuffix) {
		this.valueDisplaySuffix = valueDisplaySuffix;
	}

	public String getValueSpaceId() {
		return valueSpaceId;
	}

	public void setValueSpaceId(String valueSpaceId) {
		this.valueSpaceId = valueSpaceId;
	}

	public String getVed() {
		return ved;
	}

	public void setVed(String ved) {
		this.ved = ved;
	}
}
