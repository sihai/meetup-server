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
public class Justification extends GenericJson {

	public List fragment;
	public LinkFragment fullText;
	public PlacePageLink photoLink;
	public String photoUrl;

	public List getFragment() {
		return fragment;
	}

	public void setFragment(List fragment) {
		this.fragment = fragment;
	}

	public LinkFragment getFullText() {
		return fullText;
	}

	public void setFullText(LinkFragment fullText) {
		this.fullText = fullText;
	}

	public PlacePageLink getPhotoLink() {
		return photoLink;
	}

	public void setPhotoLink(PlacePageLink photoLink) {
		this.photoLink = photoLink;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}
