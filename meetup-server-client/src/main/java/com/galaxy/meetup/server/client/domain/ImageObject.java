/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class ImageObject extends GenericJson {

	public EmbedClientItem about;
	public Place contentLocation;
	public String contentUrl;
	public String description;
	public String height;
	public Integer heightPx;
	public String imageUrl;
	public String name;
	public Thumbnail proxiedImage;
	public String sourceDomain;
	public String thumbnailUrl;
	public String url;
	public String width;
	public Integer widthPx;
	
	public EmbedClientItem getAbout() {
		return about;
	}
	public void setAbout(EmbedClientItem about) {
		this.about = about;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Thumbnail getProxiedImage() {
		return proxiedImage;
	}
	public void setProxiedImage(Thumbnail proxiedImage) {
		this.proxiedImage = proxiedImage;
	}
	public String getSourceDomain() {
		return sourceDomain;
	}
	public void setSourceDomain(String sourceDomain) {
		this.sourceDomain = sourceDomain;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
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
