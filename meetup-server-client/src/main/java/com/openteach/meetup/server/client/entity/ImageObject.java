package com.openteach.meetup.server.client.entity;


/**
 * 
 * @author rqq
 *
 */
public class ImageObject {

	private Location contentLocation;
	private String contentUrl;
	private String description;
	private String height;
	private Integer heightPx;
	private String imageUrl;
	private String name;
	private Thumbnail proxiedImage;
	private String sourceDomain;
	private String thumbnailUrl;
	private String url;
	private String width;
	private Integer widthPx;

	public Location getContentLocation() {
		return contentLocation;
	}

	public void setContentLocation(Location contentLocation) {
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
