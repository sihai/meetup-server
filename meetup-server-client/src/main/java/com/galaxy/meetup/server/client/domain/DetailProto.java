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
public class DetailProto extends GenericJson {

	public PlacePageLink attribution;
	
    public String canonicalLabelId;
    
    public String displayLabel;
    
    public PlacePageLink hoverAttribution;
    
    public List value;

	public PlacePageLink getAttribution() {
		return attribution;
	}

	public void setAttribution(PlacePageLink attribution) {
		this.attribution = attribution;
	}

	public String getCanonicalLabelId() {
		return canonicalLabelId;
	}

	public void setCanonicalLabelId(String canonicalLabelId) {
		this.canonicalLabelId = canonicalLabelId;
	}

	public String getDisplayLabel() {
		return displayLabel;
	}

	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}

	public PlacePageLink getHoverAttribution() {
		return hoverAttribution;
	}

	public void setHoverAttribution(PlacePageLink hoverAttribution) {
		this.hoverAttribution = hoverAttribution;
	}

	public List getValue() {
		return value;
	}

	public void setValue(List value) {
		this.value = value;
	}
}
