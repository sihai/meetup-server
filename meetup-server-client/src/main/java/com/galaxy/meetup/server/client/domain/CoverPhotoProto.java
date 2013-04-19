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
public class CoverPhotoProto extends GenericJson {

	public MediaProto coverPhoto;
	
    public MediaProtoThumbnail logoAttribution;
    
    public PlacePageLink textAttribution;

	public MediaProto getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(MediaProto coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public MediaProtoThumbnail getLogoAttribution() {
		return logoAttribution;
	}

	public void setLogoAttribution(MediaProtoThumbnail logoAttribution) {
		this.logoAttribution = logoAttribution;
	}

	public PlacePageLink getTextAttribution() {
		return textAttribution;
	}

	public void setTextAttribution(PlacePageLink textAttribution) {
		this.textAttribution = textAttribution;
	}
}
