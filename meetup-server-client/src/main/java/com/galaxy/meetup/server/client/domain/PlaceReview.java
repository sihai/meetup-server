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
public class PlaceReview extends GenericJson {

	public List author;
	public String dateModified;
	public String dateModifiedMilliseconds;
	public String description;
	public EmbedClientItem itemReviewed;
	public PlaceReviewMetadata meta;
	public String name;
	public String price;
	public String reviewBody;
	public List reviewRating;
	public String url;

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

	public String getDateModifiedMilliseconds() {
		return dateModifiedMilliseconds;
	}

	public void setDateModifiedMilliseconds(String dateModifiedMilliseconds) {
		this.dateModifiedMilliseconds = dateModifiedMilliseconds;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EmbedClientItem getItemReviewed() {
		return itemReviewed;
	}

	public void setItemReviewed(EmbedClientItem itemReviewed) {
		this.itemReviewed = itemReviewed;
	}

	public PlaceReviewMetadata getMeta() {
		return meta;
	}

	public void setMeta(PlaceReviewMetadata meta) {
		this.meta = meta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public List getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(List reviewRating) {
		this.reviewRating = reviewRating;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
