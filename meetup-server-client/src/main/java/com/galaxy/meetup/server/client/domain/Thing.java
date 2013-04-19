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
public class Thing extends GenericJson {

	public List author;
	public String description;
	public String descriptionTruncated;
	public String imageUrl;
	public String name;
	public String proxiedFaviconUrl;
	public Thumbnail proxiedImage;
	public String url;

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
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

	public String getProxiedFaviconUrl() {
		return proxiedFaviconUrl;
	}

	public void setProxiedFaviconUrl(String proxiedFaviconUrl) {
		this.proxiedFaviconUrl = proxiedFaviconUrl;
	}

	public Thumbnail getProxiedImage() {
		return proxiedImage;
	}

	public void setProxiedImage(Thumbnail proxiedImage) {
		this.proxiedImage = proxiedImage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
