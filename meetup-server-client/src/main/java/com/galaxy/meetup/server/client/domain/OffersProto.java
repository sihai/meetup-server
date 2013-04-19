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
public class OffersProto extends GenericJson {

	public Integer desktopRedeemable;
	public ListingLoyaltyInfo listingLoyaltyInfo;
	public Integer mobileRedeemable;
	public PlacePageLink moreLink;
	public NavbarProto navbar;
	public List offer;
	public ResultsRangeProto resultsRange;
	public StoryTitle title;
	public UserLoyaltyInfo userLoyaltyInfo;

	public Integer getDesktopRedeemable() {
		return desktopRedeemable;
	}

	public void setDesktopRedeemable(Integer desktopRedeemable) {
		this.desktopRedeemable = desktopRedeemable;
	}

	public ListingLoyaltyInfo getListingLoyaltyInfo() {
		return listingLoyaltyInfo;
	}

	public void setListingLoyaltyInfo(ListingLoyaltyInfo listingLoyaltyInfo) {
		this.listingLoyaltyInfo = listingLoyaltyInfo;
	}

	public Integer getMobileRedeemable() {
		return mobileRedeemable;
	}

	public void setMobileRedeemable(Integer mobileRedeemable) {
		this.mobileRedeemable = mobileRedeemable;
	}

	public PlacePageLink getMoreLink() {
		return moreLink;
	}

	public void setMoreLink(PlacePageLink moreLink) {
		this.moreLink = moreLink;
	}

	public NavbarProto getNavbar() {
		return navbar;
	}

	public void setNavbar(NavbarProto navbar) {
		this.navbar = navbar;
	}

	public List getOffer() {
		return offer;
	}

	public void setOffer(List offer) {
		this.offer = offer;
	}

	public ResultsRangeProto getResultsRange() {
		return resultsRange;
	}

	public void setResultsRange(ResultsRangeProto resultsRange) {
		this.resultsRange = resultsRange;
	}

	public StoryTitle getTitle() {
		return title;
	}

	public void setTitle(StoryTitle title) {
		this.title = title;
	}

	public UserLoyaltyInfo getUserLoyaltyInfo() {
		return userLoyaltyInfo;
	}

	public void setUserLoyaltyInfo(UserLoyaltyInfo userLoyaltyInfo) {
		this.userLoyaltyInfo = userLoyaltyInfo;
	}
}
