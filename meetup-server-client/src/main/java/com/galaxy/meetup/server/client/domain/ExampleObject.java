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
public class ExampleObject extends GenericJson {

	public ExampleObject about;
	public List additionalName;
	public List attendee;
	public List author;
	public List contributor;
	public String description;
	public String forClientOnly;
	public String forOwnerOnly;
	public String imageUrl;
	public ExampleObject itemExtensionField;
	public List itemRepeatedExtensionField;
	public Place location;
	public String name;
	public String stringExtensionField;
	public List stringRepeatedExtensionField;
	public EmbedClientItem thumbnail;
	public String url;

	public ExampleObject getAbout() {
		return about;
	}

	public void setAbout(ExampleObject about) {
		this.about = about;
	}

	public List getAdditionalName() {
		return additionalName;
	}

	public void setAdditionalName(List additionalName) {
		this.additionalName = additionalName;
	}

	public List getAttendee() {
		return attendee;
	}

	public void setAttendee(List attendee) {
		this.attendee = attendee;
	}

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
	}

	public List getContributor() {
		return contributor;
	}

	public void setContributor(List contributor) {
		this.contributor = contributor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getForClientOnly() {
		return forClientOnly;
	}

	public void setForClientOnly(String forClientOnly) {
		this.forClientOnly = forClientOnly;
	}

	public String getForOwnerOnly() {
		return forOwnerOnly;
	}

	public void setForOwnerOnly(String forOwnerOnly) {
		this.forOwnerOnly = forOwnerOnly;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public ExampleObject getItemExtensionField() {
		return itemExtensionField;
	}

	public void setItemExtensionField(ExampleObject itemExtensionField) {
		this.itemExtensionField = itemExtensionField;
	}

	public List getItemRepeatedExtensionField() {
		return itemRepeatedExtensionField;
	}

	public void setItemRepeatedExtensionField(List itemRepeatedExtensionField) {
		this.itemRepeatedExtensionField = itemRepeatedExtensionField;
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

	public String getStringExtensionField() {
		return stringExtensionField;
	}

	public void setStringExtensionField(String stringExtensionField) {
		this.stringExtensionField = stringExtensionField;
	}

	public List getStringRepeatedExtensionField() {
		return stringRepeatedExtensionField;
	}

	public void setStringRepeatedExtensionField(
			List stringRepeatedExtensionField) {
		this.stringRepeatedExtensionField = stringRepeatedExtensionField;
	}

	public EmbedClientItem getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(EmbedClientItem thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
