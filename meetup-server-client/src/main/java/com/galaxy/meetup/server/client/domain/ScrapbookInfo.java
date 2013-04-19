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
public class ScrapbookInfo extends GenericJson {

	public ScrapbookInfoFullBleedPhoto fullBleedPhoto;
	public List fullBleedPhotoId;
	public String layout;

	public ScrapbookInfoFullBleedPhoto getFullBleedPhoto() {
		return fullBleedPhoto;
	}

	public void setFullBleedPhoto(ScrapbookInfoFullBleedPhoto fullBleedPhoto) {
		this.fullBleedPhoto = fullBleedPhoto;
	}

	public List getFullBleedPhotoId() {
		return fullBleedPhotoId;
	}

	public void setFullBleedPhotoId(List fullBleedPhotoId) {
		this.fullBleedPhotoId = fullBleedPhotoId;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}
}
