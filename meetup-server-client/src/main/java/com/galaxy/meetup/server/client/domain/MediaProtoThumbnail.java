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
public class MediaProtoThumbnail extends GenericJson {

	public String altText;
	public Integer height;
	public String imageSourceUrl;
	public PlacePageLink targetLink;
	public Integer width;

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getImageSourceUrl() {
		return imageSourceUrl;
	}

	public void setImageSourceUrl(String imageSourceUrl) {
		this.imageSourceUrl = imageSourceUrl;
	}

	public PlacePageLink getTargetLink() {
		return targetLink;
	}

	public void setTargetLink(PlacePageLink targetLink) {
		this.targetLink = targetLink;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}
}
