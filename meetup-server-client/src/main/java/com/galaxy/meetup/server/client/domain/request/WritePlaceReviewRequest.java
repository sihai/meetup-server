/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.AbuseSignals;
import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.PriceLevelsProto;
import com.galaxy.meetup.server.client.domain.PriceProto;

/**
 * 
 * @author sihai
 * 
 */
public class WritePlaceReviewRequest extends GenericJson {

	public AbuseSignals abuseSignals;
	public String cid;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public List experimentId;
	public Boolean includeSuggestedPlaces;
	public List oldZagatAspectRatings;
	public PriceProto price;
	public PriceLevelsProto priceLevel;
	public String reviewText;
	public String source;
	public String userCountryCode;
	public String userLanguage;
	public List zagatAspectRatings;

	public AbuseSignals getAbuseSignals() {
		return abuseSignals;
	}

	public void setAbuseSignals(AbuseSignals abuseSignals) {
		this.abuseSignals = abuseSignals;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public List getExperimentId() {
		return experimentId;
	}

	public void setExperimentId(List experimentId) {
		this.experimentId = experimentId;
	}

	public Boolean getIncludeSuggestedPlaces() {
		return includeSuggestedPlaces;
	}

	public void setIncludeSuggestedPlaces(Boolean includeSuggestedPlaces) {
		this.includeSuggestedPlaces = includeSuggestedPlaces;
	}

	public List getOldZagatAspectRatings() {
		return oldZagatAspectRatings;
	}

	public void setOldZagatAspectRatings(List oldZagatAspectRatings) {
		this.oldZagatAspectRatings = oldZagatAspectRatings;
	}

	public PriceProto getPrice() {
		return price;
	}

	public void setPrice(PriceProto price) {
		this.price = price;
	}

	public PriceLevelsProto getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(PriceLevelsProto priceLevel) {
		this.priceLevel = priceLevel;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUserCountryCode() {
		return userCountryCode;
	}

	public void setUserCountryCode(String userCountryCode) {
		this.userCountryCode = userCountryCode;
	}

	public String getUserLanguage() {
		return userLanguage;
	}

	public void setUserLanguage(String userLanguage) {
		this.userLanguage = userLanguage;
	}

	public List getZagatAspectRatings() {
		return zagatAspectRatings;
	}

	public void setZagatAspectRatings(List zagatAspectRatings) {
		this.zagatAspectRatings = zagatAspectRatings;
	}
}
