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
public class MediaProto extends GenericJson {

	public String authorName;
	public LatLngProto latLng;
	public Integer originalIndex;
	public String reviewId;
	public Integer sourceId;
	public String sourceName;
	public MediaProtoThumbnail thumbnail;
	public List thumbnails;
	public String title;
	public String type;
	public UserMediaProto userMedia;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public LatLngProto getLatLng() {
		return latLng;
	}

	public void setLatLng(LatLngProto latLng) {
		this.latLng = latLng;
	}

	public Integer getOriginalIndex() {
		return originalIndex;
	}

	public void setOriginalIndex(Integer originalIndex) {
		this.originalIndex = originalIndex;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public MediaProtoThumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(MediaProtoThumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(List thumbnails) {
		this.thumbnails = thumbnails;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserMediaProto getUserMedia() {
		return userMedia;
	}

	public void setUserMedia(UserMediaProto userMedia) {
		this.userMedia = userMedia;
	}
}
