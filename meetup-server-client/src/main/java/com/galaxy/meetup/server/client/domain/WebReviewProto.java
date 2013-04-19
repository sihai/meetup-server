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
public class WebReviewProto extends GenericJson {

	public AuthorProto author;
	public Boolean crowded;
	public String date;
	public PlacePageLink fullReviewLink;
	public Boolean reviewNum;
	public String snippet;
	public String sourceName;
	public String title;

	public AuthorProto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorProto author) {
		this.author = author;
	}

	public Boolean getCrowded() {
		return crowded;
	}

	public void setCrowded(Boolean crowded) {
		this.crowded = crowded;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public PlacePageLink getFullReviewLink() {
		return fullReviewLink;
	}

	public void setFullReviewLink(PlacePageLink fullReviewLink) {
		this.fullReviewLink = fullReviewLink;
	}

	public Boolean getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Boolean reviewNum) {
		this.reviewNum = reviewNum;
	}

	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
