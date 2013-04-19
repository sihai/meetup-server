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
public class Review extends GenericJson {

	public EmbedClientItem about;
	public String description;
	public String imageUrl;
	public String name;
	public List reviewRating;
	public String text;
	public String url;

	public EmbedClientItem getAbout() {
		return about;
	}

	public void setAbout(EmbedClientItem about) {
		this.about = about;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(List reviewRating) {
		this.reviewRating = reviewRating;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
