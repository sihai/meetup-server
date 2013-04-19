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
public class Rating extends GenericJson {

	public String attributeId;
	public String bestRating;
	public RatingClientDisplayData clientDisplayData;
	public String name;
	public String ratingValue;
	public String url;
	public String worstRating;

	public String getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(String attributeId) {
		this.attributeId = attributeId;
	}

	public String getBestRating() {
		return bestRating;
	}

	public void setBestRating(String bestRating) {
		this.bestRating = bestRating;
	}

	public RatingClientDisplayData getClientDisplayData() {
		return clientDisplayData;
	}

	public void setClientDisplayData(RatingClientDisplayData clientDisplayData) {
		this.clientDisplayData = clientDisplayData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWorstRating() {
		return worstRating;
	}

	public void setWorstRating(String worstRating) {
		this.worstRating = worstRating;
	}
}
