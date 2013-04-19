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
public class ProviderBlockProto extends GenericJson {

	public AggregatedReviewsProto aggregatedReviews;
	public List award;
	public String faviconUrl;
	public String hostName;
	public Integer originalIndex;
	public List realtimeUpdate;
	public List review;
	public PlacePageLink title;

	public AggregatedReviewsProto getAggregatedReviews() {
		return aggregatedReviews;
	}

	public void setAggregatedReviews(AggregatedReviewsProto aggregatedReviews) {
		this.aggregatedReviews = aggregatedReviews;
	}

	public List getAward() {
		return award;
	}

	public void setAward(List award) {
		this.award = award;
	}

	public String getFaviconUrl() {
		return faviconUrl;
	}

	public void setFaviconUrl(String faviconUrl) {
		this.faviconUrl = faviconUrl;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public Integer getOriginalIndex() {
		return originalIndex;
	}

	public void setOriginalIndex(Integer originalIndex) {
		this.originalIndex = originalIndex;
	}

	public List getRealtimeUpdate() {
		return realtimeUpdate;
	}

	public void setRealtimeUpdate(List realtimeUpdate) {
		this.realtimeUpdate = realtimeUpdate;
	}

	public List getReview() {
		return review;
	}

	public void setReview(List review) {
		this.review = review;
	}

	public PlacePageLink getTitle() {
		return title;
	}

	public void setTitle(PlacePageLink title) {
		this.title = title;
	}
}
