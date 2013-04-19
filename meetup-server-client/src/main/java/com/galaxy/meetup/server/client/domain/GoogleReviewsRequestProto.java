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
public class GoogleReviewsRequestProto extends GenericJson {

	public CommonReviewOptionsProto commonOptions;
	public Double qualityScoreThreshold;
	public Boolean requestOwnerResponses;
	public Boolean requestZagatReviews;
	public String sortBy;
	public Boolean suppressRatingOnlyReviews;

	public CommonReviewOptionsProto getCommonOptions() {
		return commonOptions;
	}

	public void setCommonOptions(CommonReviewOptionsProto commonOptions) {
		this.commonOptions = commonOptions;
	}

	public Double getQualityScoreThreshold() {
		return qualityScoreThreshold;
	}

	public void setQualityScoreThreshold(Double qualityScoreThreshold) {
		this.qualityScoreThreshold = qualityScoreThreshold;
	}

	public Boolean getRequestOwnerResponses() {
		return requestOwnerResponses;
	}

	public void setRequestOwnerResponses(Boolean requestOwnerResponses) {
		this.requestOwnerResponses = requestOwnerResponses;
	}

	public Boolean getRequestZagatReviews() {
		return requestZagatReviews;
	}

	public void setRequestZagatReviews(Boolean requestZagatReviews) {
		this.requestZagatReviews = requestZagatReviews;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public Boolean getSuppressRatingOnlyReviews() {
		return suppressRatingOnlyReviews;
	}

	public void setSuppressRatingOnlyReviews(Boolean suppressRatingOnlyReviews) {
		this.suppressRatingOnlyReviews = suppressRatingOnlyReviews;
	}
}
