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
public class SquareProfile extends GenericJson {

	public String aboutText;
	public String abuseAppealState;
	public String abuseState;
	public String abuseType;
	public String bannerUrl;
	public Boolean isDomainRestricted;
	public Place location;
	public String name;
	public String photoUrl;
	public List relatedLinks;
	public String tagline;

	public String getAboutText() {
		return aboutText;
	}

	public void setAboutText(String aboutText) {
		this.aboutText = aboutText;
	}

	public String getAbuseAppealState() {
		return abuseAppealState;
	}

	public void setAbuseAppealState(String abuseAppealState) {
		this.abuseAppealState = abuseAppealState;
	}

	public String getAbuseState() {
		return abuseState;
	}

	public void setAbuseState(String abuseState) {
		this.abuseState = abuseState;
	}

	public String getAbuseType() {
		return abuseType;
	}

	public void setAbuseType(String abuseType) {
		this.abuseType = abuseType;
	}

	public String getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public Boolean getIsDomainRestricted() {
		return isDomainRestricted;
	}

	public void setIsDomainRestricted(Boolean isDomainRestricted) {
		this.isDomainRestricted = isDomainRestricted;
	}

	public Place getLocation() {
		return location;
	}

	public void setLocation(Place location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public List getRelatedLinks() {
		return relatedLinks;
	}

	public void setRelatedLinks(List relatedLinks) {
		this.relatedLinks = relatedLinks;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
}
