/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.LocalData;
import com.galaxy.meetup.server.client.domain.ScottyMedia;


/**
 * 
 * @author sihai
 * 
 */
public class UploadMediaRequest extends Request {

	public String albumId;
	public String albumLabel;
	public String albumTitle;
	public Boolean autoResize;
	public String clientAssignedId;
	public ApiaryFields commonFields;
	public String description;
	public String displayName;
	public Boolean enableTracing;
	public String eventId;
	public LocalData localData;
	public Integer offset;
	public String ownerId;
	public ScottyMedia scottyMedia;
	public Boolean setProfilePhoto;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAlbumLabel() {
		return albumLabel;
	}

	public void setAlbumLabel(String albumLabel) {
		this.albumLabel = albumLabel;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public Boolean getAutoResize() {
		return autoResize;
	}

	public void setAutoResize(Boolean autoResize) {
		this.autoResize = autoResize;
	}

	public String getClientAssignedId() {
		return clientAssignedId;
	}

	public void setClientAssignedId(String clientAssignedId) {
		this.clientAssignedId = clientAssignedId;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public LocalData getLocalData() {
		return localData;
	}

	public void setLocalData(LocalData localData) {
		this.localData = localData;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public ScottyMedia getScottyMedia() {
		return scottyMedia;
	}

	public void setScottyMedia(ScottyMedia scottyMedia) {
		this.scottyMedia = scottyMedia;
	}

	public Boolean getSetProfilePhoto() {
		return setProfilePhoto;
	}

	public void setSetProfilePhoto(Boolean setProfilePhoto) {
		this.setProfilePhoto = setProfilePhoto;
	}
}
