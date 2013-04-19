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
public class ProviderBlocksProto extends GenericJson {

	public PlacePageLink moreReviewsLink;
	public NavbarProto navbar;
	public List providerBlock;
	public ResultsRangeProto resultsRange;
	public StoryTitle title;

	public PlacePageLink getMoreReviewsLink() {
		return moreReviewsLink;
	}

	public void setMoreReviewsLink(PlacePageLink moreReviewsLink) {
		this.moreReviewsLink = moreReviewsLink;
	}

	public NavbarProto getNavbar() {
		return navbar;
	}

	public void setNavbar(NavbarProto navbar) {
		this.navbar = navbar;
	}

	public List getProviderBlock() {
		return providerBlock;
	}

	public void setProviderBlock(List providerBlock) {
		this.providerBlock = providerBlock;
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
}
