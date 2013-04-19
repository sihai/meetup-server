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
public final class ReadOptions extends GenericJson {

	public ReadOptionsCommentsOptions commentsOptions;
	public ReadOptionsUpdateOptions eventUpdateOptions;
	public ReadOptionsFramesOptions framesOptions;
	public Boolean includePhotoContributors;
	public Boolean includePlusEvent;
	public ReadOptionsInviteeOptions inviteeOptions;
	public String optionsCriteria;
	public List photosOptions;
	public Boolean resolvePersons;
	public String responseFormat;

	public ReadOptionsCommentsOptions getCommentsOptions() {
		return commentsOptions;
	}

	public void setCommentsOptions(ReadOptionsCommentsOptions commentsOptions) {
		this.commentsOptions = commentsOptions;
	}

	public ReadOptionsUpdateOptions getEventUpdateOptions() {
		return eventUpdateOptions;
	}

	public void setEventUpdateOptions(
			ReadOptionsUpdateOptions eventUpdateOptions) {
		this.eventUpdateOptions = eventUpdateOptions;
	}

	public ReadOptionsFramesOptions getFramesOptions() {
		return framesOptions;
	}

	public void setFramesOptions(ReadOptionsFramesOptions framesOptions) {
		this.framesOptions = framesOptions;
	}

	public Boolean getIncludePhotoContributors() {
		return includePhotoContributors;
	}

	public void setIncludePhotoContributors(Boolean includePhotoContributors) {
		this.includePhotoContributors = includePhotoContributors;
	}

	public Boolean getIncludePlusEvent() {
		return includePlusEvent;
	}

	public void setIncludePlusEvent(Boolean includePlusEvent) {
		this.includePlusEvent = includePlusEvent;
	}

	public ReadOptionsInviteeOptions getInviteeOptions() {
		return inviteeOptions;
	}

	public void setInviteeOptions(ReadOptionsInviteeOptions inviteeOptions) {
		this.inviteeOptions = inviteeOptions;
	}

	public String getOptionsCriteria() {
		return optionsCriteria;
	}

	public void setOptionsCriteria(String optionsCriteria) {
		this.optionsCriteria = optionsCriteria;
	}

	public List getPhotosOptions() {
		return photosOptions;
	}

	public void setPhotosOptions(List photosOptions) {
		this.photosOptions = photosOptions;
	}

	public Boolean getResolvePersons() {
		return resolvePersons;
	}

	public void setResolvePersons(Boolean resolvePersons) {
		this.resolvePersons = resolvePersons;
	}

	public String getResponseFormat() {
		return responseFormat;
	}

	public void setResponseFormat(String responseFormat) {
		this.responseFormat = responseFormat;
	}

}
