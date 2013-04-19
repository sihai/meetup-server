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
public class Description extends GenericJson {

	public String additionalAttributionText;
	
    public PlacePageLink attribution;
    
    public String text;

	public String getAdditionalAttributionText() {
		return additionalAttributionText;
	}

	public void setAdditionalAttributionText(String additionalAttributionText) {
		this.additionalAttributionText = additionalAttributionText;
	}

	public PlacePageLink getAttribution() {
		return attribution;
	}

	public void setAttribution(PlacePageLink attribution) {
		this.attribution = attribution;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
