/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class PlacePageOffer extends GenericJson {

	public List details;
	public String detailsSnippet;
	public Date endDate;
	public Date expiryDate;
	public String fullTitle;
	public String id;
	public String imageUrl;
	public Boolean isRelevant;
	public PlacePageLink link;
	public Integer loyaltyTier;
	public String offerSummary;
	public List redemptionAvailability;
	public String requiredClientCapabilities;
	public String source;
	public Date startDate;
	public String type;

	public List getDetails() {
		return details;
	}

	public void setDetails(List details) {
		this.details = details;
	}

	public String getDetailsSnippet() {
		return detailsSnippet;
	}

	public void setDetailsSnippet(String detailsSnippet) {
		this.detailsSnippet = detailsSnippet;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFullTitle() {
		return fullTitle;
	}

	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getIsRelevant() {
		return isRelevant;
	}

	public void setIsRelevant(Boolean isRelevant) {
		this.isRelevant = isRelevant;
	}

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}

	public Integer getLoyaltyTier() {
		return loyaltyTier;
	}

	public void setLoyaltyTier(Integer loyaltyTier) {
		this.loyaltyTier = loyaltyTier;
	}

	public String getOfferSummary() {
		return offerSummary;
	}

	public void setOfferSummary(String offerSummary) {
		this.offerSummary = offerSummary;
	}

	public List getRedemptionAvailability() {
		return redemptionAvailability;
	}

	public void setRedemptionAvailability(List redemptionAvailability) {
		this.redemptionAvailability = redemptionAvailability;
	}

	public String getRequiredClientCapabilities() {
		return requiredClientCapabilities;
	}

	public void setRequiredClientCapabilities(String requiredClientCapabilities) {
		this.requiredClientCapabilities = requiredClientCapabilities;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
