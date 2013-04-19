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
public class ProductReview extends GenericJson {

	public List author;
	public String authorReviewPageUrl;
	public Integer bestRatingAsInt;
	public String description;
	public String displayUrl;
	public String imageUrl;
	public String name;
	public String productName;
	public String productPrice;
	public Integer ratingValueAsInt;
	public List reviewRating;
	public Boolean reviewTruncated;
	public String url;

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
	}

	public String getAuthorReviewPageUrl() {
		return authorReviewPageUrl;
	}

	public void setAuthorReviewPageUrl(String authorReviewPageUrl) {
		this.authorReviewPageUrl = authorReviewPageUrl;
	}

	public Integer getBestRatingAsInt() {
		return bestRatingAsInt;
	}

	public void setBestRatingAsInt(Integer bestRatingAsInt) {
		this.bestRatingAsInt = bestRatingAsInt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayUrl() {
		return displayUrl;
	}

	public void setDisplayUrl(String displayUrl) {
		this.displayUrl = displayUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getRatingValueAsInt() {
		return ratingValueAsInt;
	}

	public void setRatingValueAsInt(Integer ratingValueAsInt) {
		this.ratingValueAsInt = ratingValueAsInt;
	}

	public List getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(List reviewRating) {
		this.reviewRating = reviewRating;
	}

	public Boolean getReviewTruncated() {
		return reviewTruncated;
	}

	public void setReviewTruncated(Boolean reviewTruncated) {
		this.reviewTruncated = reviewTruncated;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
