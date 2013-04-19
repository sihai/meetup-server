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
public class FeaturedActivityProto extends GenericJson {

	public List activity;
	public List checkedInUser;
	public List reviewTemplate;
	public List reviewedUser;
	public Integer totalCheckins;
	public Integer totalMedia;
	public Integer totalReviews;
	public List wishlistedUser;

	public List getActivity() {
		return activity;
	}

	public void setActivity(List activity) {
		this.activity = activity;
	}

	public List getCheckedInUser() {
		return checkedInUser;
	}

	public void setCheckedInUser(List checkedInUser) {
		this.checkedInUser = checkedInUser;
	}

	public List getReviewTemplate() {
		return reviewTemplate;
	}

	public void setReviewTemplate(List reviewTemplate) {
		this.reviewTemplate = reviewTemplate;
	}

	public List getReviewedUser() {
		return reviewedUser;
	}

	public void setReviewedUser(List reviewedUser) {
		this.reviewedUser = reviewedUser;
	}

	public Integer getTotalCheckins() {
		return totalCheckins;
	}

	public void setTotalCheckins(Integer totalCheckins) {
		this.totalCheckins = totalCheckins;
	}

	public Integer getTotalMedia() {
		return totalMedia;
	}

	public void setTotalMedia(Integer totalMedia) {
		this.totalMedia = totalMedia;
	}

	public Integer getTotalReviews() {
		return totalReviews;
	}

	public void setTotalReviews(Integer totalReviews) {
		this.totalReviews = totalReviews;
	}

	public List getWishlistedUser() {
		return wishlistedUser;
	}

	public void setWishlistedUser(List wishlistedUser) {
		this.wishlistedUser = wishlistedUser;
	}
}
