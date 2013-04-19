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
public class GoogleReviewsProto extends GenericJson {

	public PlacePageLink moreReviewsLink;
	public NavbarProto navbar;
	public ResultsRangeProto resultsRange;
	public List review;
	public ReviewsDataProto reviewData;
	public AggregatedReviewsProto stats;
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

	public ResultsRangeProto getResultsRange() {
		return resultsRange;
	}

	public void setResultsRange(ResultsRangeProto resultsRange) {
		this.resultsRange = resultsRange;
	}

	public List getReview() {
		return review;
	}

	public void setReview(List review) {
		this.review = review;
	}

	public ReviewsDataProto getReviewData() {
		return reviewData;
	}

	public void setReviewData(ReviewsDataProto reviewData) {
		this.reviewData = reviewData;
	}

	public AggregatedReviewsProto getStats() {
		return stats;
	}

	public void setStats(AggregatedReviewsProto stats) {
		this.stats = stats;
	}

	public StoryTitle getTitle() {
		return title;
	}

	public void setTitle(StoryTitle title) {
		this.title = title;
	}
}
