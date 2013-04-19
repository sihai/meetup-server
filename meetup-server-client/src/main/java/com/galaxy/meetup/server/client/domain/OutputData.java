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
public class OutputData extends GenericJson {

	public List circle;
	public List circleMember;
	public String containerPropertyId;
	public LoggedCircle filterCircle;
	public Integer filterType;
	public Integer getStartedStepIndex;
	public String interest;
	public List photo;
	public List photoAlbumId;
	public LoggedProfile profile;
	public String streamSort;
	public List suggestionInfo;
	public Integer tab;
	public List update;
	public List userInfo;

	public List getCircle() {
		return circle;
	}

	public void setCircle(List circle) {
		this.circle = circle;
	}

	public List getCircleMember() {
		return circleMember;
	}

	public void setCircleMember(List circleMember) {
		this.circleMember = circleMember;
	}

	public String getContainerPropertyId() {
		return containerPropertyId;
	}

	public void setContainerPropertyId(String containerPropertyId) {
		this.containerPropertyId = containerPropertyId;
	}

	public LoggedCircle getFilterCircle() {
		return filterCircle;
	}

	public void setFilterCircle(LoggedCircle filterCircle) {
		this.filterCircle = filterCircle;
	}

	public Integer getFilterType() {
		return filterType;
	}

	public void setFilterType(Integer filterType) {
		this.filterType = filterType;
	}

	public Integer getGetStartedStepIndex() {
		return getStartedStepIndex;
	}

	public void setGetStartedStepIndex(Integer getStartedStepIndex) {
		this.getStartedStepIndex = getStartedStepIndex;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public List getPhoto() {
		return photo;
	}

	public void setPhoto(List photo) {
		this.photo = photo;
	}

	public List getPhotoAlbumId() {
		return photoAlbumId;
	}

	public void setPhotoAlbumId(List photoAlbumId) {
		this.photoAlbumId = photoAlbumId;
	}

	public LoggedProfile getProfile() {
		return profile;
	}

	public void setProfile(LoggedProfile profile) {
		this.profile = profile;
	}

	public String getStreamSort() {
		return streamSort;
	}

	public void setStreamSort(String streamSort) {
		this.streamSort = streamSort;
	}

	public List getSuggestionInfo() {
		return suggestionInfo;
	}

	public void setSuggestionInfo(List suggestionInfo) {
		this.suggestionInfo = suggestionInfo;
	}

	public Integer getTab() {
		return tab;
	}

	public void setTab(Integer tab) {
		this.tab = tab;
	}

	public List getUpdate() {
		return update;
	}

	public void setUpdate(List update) {
		this.update = update;
	}

	public List getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(List userInfo) {
		this.userInfo = userInfo;
	}
}
