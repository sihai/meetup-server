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
public class ListingLoyaltyInfo extends GenericJson {

	public String loyaltyChainId;
	public List loyaltyTier;

	public String getLoyaltyChainId() {
		return loyaltyChainId;
	}

	public void setLoyaltyChainId(String loyaltyChainId) {
		this.loyaltyChainId = loyaltyChainId;
	}

	public List getLoyaltyTier() {
		return loyaltyTier;
	}

	public void setLoyaltyTier(List loyaltyTier) {
		this.loyaltyTier = loyaltyTier;
	}
}
