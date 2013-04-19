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
public class ReviewsHeadlineProto extends GenericJson {

	public AggregatedReviewsProto aggregatedReviews;
	public PlacePageLink moreLink;
	public Integer userRatingE3;

	public AggregatedReviewsProto getAggregatedReviews() {
		return aggregatedReviews;
	}

	public void setAggregatedReviews(AggregatedReviewsProto aggregatedReviews) {
		this.aggregatedReviews = aggregatedReviews;
	}

	public PlacePageLink getMoreLink() {
		return moreLink;
	}

	public void setMoreLink(PlacePageLink moreLink) {
		this.moreLink = moreLink;
	}

	public Integer getUserRatingE3() {
		return userRatingE3;
	}

	public void setUserRatingE3(Integer userRatingE3) {
		this.userRatingE3 = userRatingE3;
	}
}
