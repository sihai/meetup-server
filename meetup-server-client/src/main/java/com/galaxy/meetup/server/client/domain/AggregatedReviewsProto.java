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
public class AggregatedReviewsProto extends GenericJson {

	public Integer numBestEver;
	
    public Integer numRatingStarsE3;
    
    public Integer numRatings;
    
    public Integer numReviews;

	public Integer getNumBestEver() {
		return numBestEver;
	}

	public void setNumBestEver(Integer numBestEver) {
		this.numBestEver = numBestEver;
	}

	public Integer getNumRatingStarsE3() {
		return numRatingStarsE3;
	}

	public void setNumRatingStarsE3(Integer numRatingStarsE3) {
		this.numRatingStarsE3 = numRatingStarsE3;
	}

	public Integer getNumRatings() {
		return numRatings;
	}

	public void setNumRatings(Integer numRatings) {
		this.numRatings = numRatings;
	}

	public Integer getNumReviews() {
		return numReviews;
	}

	public void setNumReviews(Integer numReviews) {
		this.numReviews = numReviews;
	}
}
