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
public class PlaceActivityStreamEntryProto extends GenericJson {

	public PlacePageCheckin checkin;
	public UploadedMedia media;
	public GoogleReviewProto review;

	public PlacePageCheckin getCheckin() {
		return checkin;
	}

	public void setCheckin(PlacePageCheckin checkin) {
		this.checkin = checkin;
	}

	public UploadedMedia getMedia() {
		return media;
	}

	public void setMedia(UploadedMedia media) {
		this.media = media;
	}

	public GoogleReviewProto getReview() {
		return review;
	}

	public void setReview(GoogleReviewProto review) {
		this.review = review;
	}
}
