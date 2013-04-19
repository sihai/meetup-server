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
public class WebPage extends GenericJson {

	public EmbedClientItem about;
	public List author;
	public String canonicalFountainStream;
	public String description;
	public String descriptionTruncated;
	public String imageUrl;
	public List inboxFountainStream;
	public String name;
	public List postmodFountainStream;
	public List premodFountainStream;
	public String proxiedFaviconUrl;
	public Thumbnail proxiedImage;
	public List relatedImage;
	public String sourceName;
	public List unfilteredFountainStream;
	public String url;

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

	public String getCanonicalFountainStream() {
		return canonicalFountainStream;
	}

	public void setCanonicalFountainStream(String canonicalFountainStream) {
		this.canonicalFountainStream = canonicalFountainStream;
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

	public List getInboxFountainStream() {
		return inboxFountainStream;
	}

	public void setInboxFountainStream(List inboxFountainStream) {
		this.inboxFountainStream = inboxFountainStream;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getPostmodFountainStream() {
		return postmodFountainStream;
	}

	public void setPostmodFountainStream(List postmodFountainStream) {
		this.postmodFountainStream = postmodFountainStream;
	}

	public List getPremodFountainStream() {
		return premodFountainStream;
	}

	public void setPremodFountainStream(List premodFountainStream) {
		this.premodFountainStream = premodFountainStream;
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

	public List getRelatedImage() {
		return relatedImage;
	}

	public void setRelatedImage(List relatedImage) {
		this.relatedImage = relatedImage;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public List getUnfilteredFountainStream() {
		return unfilteredFountainStream;
	}

	public void setUnfilteredFountainStream(List unfilteredFountainStream) {
		this.unfilteredFountainStream = unfilteredFountainStream;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
