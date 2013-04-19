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
public class RatingClientDisplayData extends GenericJson {

	public String renderedRatingText;

	public String getRenderedRatingText() {
		return renderedRatingText;
	}

	public void setRenderedRatingText(String renderedRatingText) {
		this.renderedRatingText = renderedRatingText;
	}
}
