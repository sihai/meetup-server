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
public class LiveMapsPPEvent extends GenericJson {

	public PlacePageLink calendarLink;
	public String category;
	public String dateSectionTitle;
	public String description;
	public String formattedDate;
	public String formattedDow;
	public String formattedFullTime;
	public String formattedTime;
	public String fullDescription;
	public List providerData;
	public PlacePageLink titleLink;

	public PlacePageLink getCalendarLink() {
		return calendarLink;
	}

	public void setCalendarLink(PlacePageLink calendarLink) {
		this.calendarLink = calendarLink;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDateSectionTitle() {
		return dateSectionTitle;
	}

	public void setDateSectionTitle(String dateSectionTitle) {
		this.dateSectionTitle = dateSectionTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFormattedDate() {
		return formattedDate;
	}

	public void setFormattedDate(String formattedDate) {
		this.formattedDate = formattedDate;
	}

	public String getFormattedDow() {
		return formattedDow;
	}

	public void setFormattedDow(String formattedDow) {
		this.formattedDow = formattedDow;
	}

	public String getFormattedFullTime() {
		return formattedFullTime;
	}

	public void setFormattedFullTime(String formattedFullTime) {
		this.formattedFullTime = formattedFullTime;
	}

	public String getFormattedTime() {
		return formattedTime;
	}

	public void setFormattedTime(String formattedTime) {
		this.formattedTime = formattedTime;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public List getProviderData() {
		return providerData;
	}

	public void setProviderData(List providerData) {
		this.providerData = providerData;
	}

	public PlacePageLink getTitleLink() {
		return titleLink;
	}

	public void setTitleLink(PlacePageLink titleLink) {
		this.titleLink = titleLink;
	}
}
