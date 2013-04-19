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
public class VideoObjectDummyV2 extends GenericJson {

	public EmbedClientItem about;
	public List author;
	public String caption;
	public Place contentLocation;
	public String contentUrl;
	public String description;
	public String descriptionTruncated;
	public String duration;
	public String embedUrl;
	public String height;
	public Integer heightPx;
	public String imageUrl;
	public Boolean isFamilyFriendly;
	public String name;
	public String paid;
	public String playerType;
	public Thumbnail proxiedThumbnail;
	public String thumbnailUrl;
	public String unlisted;
	public String url;
	public String width;
	public Integer widthPx;

	public EmbedClientItem getAbout() {
		return about;
	}

	public void setAbout(EmbedClientItem about) {
		this.about = about;
	}

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Place getContentLocation() {
		return contentLocation;
	}

	public void setContentLocation(Place contentLocation) {
		this.contentLocation = contentLocation;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionTruncated() {
		return descriptionTruncated;
	}

	public void setDescriptionTruncated(String descriptionTruncated) {
		this.descriptionTruncated = descriptionTruncated;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEmbedUrl() {
		return embedUrl;
	}

	public void setEmbedUrl(String embedUrl) {
		this.embedUrl = embedUrl;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Integer getHeightPx() {
		return heightPx;
	}

	public void setHeightPx(Integer heightPx) {
		this.heightPx = heightPx;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getIsFamilyFriendly() {
		return isFamilyFriendly;
	}

	public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public Thumbnail getProxiedThumbnail() {
		return proxiedThumbnail;
	}

	public void setProxiedThumbnail(Thumbnail proxiedThumbnail) {
		this.proxiedThumbnail = proxiedThumbnail;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getUnlisted() {
		return unlisted;
	}

	public void setUnlisted(String unlisted) {
		this.unlisted = unlisted;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public Integer getWidthPx() {
		return widthPx;
	}

	public void setWidthPx(Integer widthPx) {
		this.widthPx = widthPx;
	}
}
