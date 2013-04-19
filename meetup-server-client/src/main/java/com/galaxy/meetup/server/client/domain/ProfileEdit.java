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
public class ProfileEdit extends GenericJson {

	public String coverPhotoOffset;
	public String coverPhotoOwnerType;
	public String currentLocation;
	public List education;
	public List employment;
	public String familyName;
	public List fullBleedPhotoId;
	public String givenName;
	public String scrapbookLayout;
	public List visibility;

	public String getCoverPhotoOffset() {
		return coverPhotoOffset;
	}

	public void setCoverPhotoOffset(String coverPhotoOffset) {
		this.coverPhotoOffset = coverPhotoOffset;
	}

	public String getCoverPhotoOwnerType() {
		return coverPhotoOwnerType;
	}

	public void setCoverPhotoOwnerType(String coverPhotoOwnerType) {
		this.coverPhotoOwnerType = coverPhotoOwnerType;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public List getEducation() {
		return education;
	}

	public void setEducation(List education) {
		this.education = education;
	}

	public List getEmployment() {
		return employment;
	}

	public void setEmployment(List employment) {
		this.employment = employment;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public List getFullBleedPhotoId() {
		return fullBleedPhotoId;
	}

	public void setFullBleedPhotoId(List fullBleedPhotoId) {
		this.fullBleedPhotoId = fullBleedPhotoId;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getScrapbookLayout() {
		return scrapbookLayout;
	}

	public void setScrapbookLayout(String scrapbookLayout) {
		this.scrapbookLayout = scrapbookLayout;
	}

	public List getVisibility() {
		return visibility;
	}

	public void setVisibility(List visibility) {
		this.visibility = visibility;
	}
}
