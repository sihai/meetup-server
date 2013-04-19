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
public class LoyaltyTierInfo extends GenericJson {

	public Integer loyaltyTier;
	public String loyaltyTierImageUrl;
	public String loyaltyTierName;

	public Integer getLoyaltyTier() {
		return loyaltyTier;
	}

	public void setLoyaltyTier(Integer loyaltyTier) {
		this.loyaltyTier = loyaltyTier;
	}

	public String getLoyaltyTierImageUrl() {
		return loyaltyTierImageUrl;
	}

	public void setLoyaltyTierImageUrl(String loyaltyTierImageUrl) {
		this.loyaltyTierImageUrl = loyaltyTierImageUrl;
	}

	public String getLoyaltyTierName() {
		return loyaltyTierName;
	}

	public void setLoyaltyTierName(String loyaltyTierName) {
		this.loyaltyTierName = loyaltyTierName;
	}
}
