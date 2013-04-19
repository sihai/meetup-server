/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public final class DataAlbum extends GenericJson {

	public String albumAcl;
	
	public String albumType;
	
	public String audience;
	
	public List audienceMember;
	
	public String authkey;
	
	public List childId;
	
	public DataPhoto cover;
	
	public Boolean coverSelectedByUser;
	
	public String deprecatedAudienceString;
	
	public String description;
	
	public String downloadUrl;
	
	public Long entityVersion;
	
	public List eventId;
	
	public String id;
	
	public Boolean isReshareDisabled;
	
	public Long modTime;
	
	public Integer namedShapeCount;
	
	public Integer numGaiaRecipients;
	
	public Integer numGeoPhotos;
	
	public Integer numNonGaiaRecipients;
	
	public Integer numSoftDeletedPhotos;
	
	public DataUser owner;
	
	public Integer photoCount;
	
	public List plusEvent;
	
	public String provider;
	
	public String pwaManageUrl;
	
	public List sample;
	
	public Boolean showGeoInfo;
	
	public Boolean showVisibilityInspector;
	
	public String timestampSeconds;
	
	public String title;
	
	public Integer unnamedShapeCount;
	
	public List update;
	
	public String visibility;

	public String getAlbumAcl() {
		return albumAcl;
	}

	public void setAlbumAcl(String albumAcl) {
		this.albumAcl = albumAcl;
	}

	public String getAlbumType() {
		return albumType;
	}

	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public List getAudienceMember() {
		return audienceMember;
	}

	public void setAudienceMember(List audienceMember) {
		this.audienceMember = audienceMember;
	}

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public List getChildId() {
		return childId;
	}

	public void setChildId(List childId) {
		this.childId = childId;
	}

	public DataPhoto getCover() {
		return cover;
	}

	public void setCover(DataPhoto cover) {
		this.cover = cover;
	}

	public Boolean getCoverSelectedByUser() {
		return coverSelectedByUser;
	}

	public void setCoverSelectedByUser(Boolean coverSelectedByUser) {
		this.coverSelectedByUser = coverSelectedByUser;
	}

	public String getDeprecatedAudienceString() {
		return deprecatedAudienceString;
	}

	public void setDeprecatedAudienceString(String deprecatedAudienceString) {
		this.deprecatedAudienceString = deprecatedAudienceString;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Long getEntityVersion() {
		return entityVersion;
	}

	public void setEntityVersion(Long entityVersion) {
		this.entityVersion = entityVersion;
	}

	public List getEventId() {
		return eventId;
	}

	public void setEventId(List eventId) {
		this.eventId = eventId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIsReshareDisabled() {
		return isReshareDisabled;
	}

	public void setIsReshareDisabled(Boolean isReshareDisabled) {
		this.isReshareDisabled = isReshareDisabled;
	}

	public Long getModTime() {
		return modTime;
	}

	public void setModTime(Long modTime) {
		this.modTime = modTime;
	}

	public Integer getNamedShapeCount() {
		return namedShapeCount;
	}

	public void setNamedShapeCount(Integer namedShapeCount) {
		this.namedShapeCount = namedShapeCount;
	}

	public Integer getNumGaiaRecipients() {
		return numGaiaRecipients;
	}

	public void setNumGaiaRecipients(Integer numGaiaRecipients) {
		this.numGaiaRecipients = numGaiaRecipients;
	}

	public Integer getNumGeoPhotos() {
		return numGeoPhotos;
	}

	public void setNumGeoPhotos(Integer numGeoPhotos) {
		this.numGeoPhotos = numGeoPhotos;
	}

	public Integer getNumNonGaiaRecipients() {
		return numNonGaiaRecipients;
	}

	public void setNumNonGaiaRecipients(Integer numNonGaiaRecipients) {
		this.numNonGaiaRecipients = numNonGaiaRecipients;
	}

	public Integer getNumSoftDeletedPhotos() {
		return numSoftDeletedPhotos;
	}

	public void setNumSoftDeletedPhotos(Integer numSoftDeletedPhotos) {
		this.numSoftDeletedPhotos = numSoftDeletedPhotos;
	}

	public DataUser getOwner() {
		return owner;
	}

	public void setOwner(DataUser owner) {
		this.owner = owner;
	}

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public List getPlusEvent() {
		return plusEvent;
	}

	public void setPlusEvent(List plusEvent) {
		this.plusEvent = plusEvent;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getPwaManageUrl() {
		return pwaManageUrl;
	}

	public void setPwaManageUrl(String pwaManageUrl) {
		this.pwaManageUrl = pwaManageUrl;
	}

	public List getSample() {
		return sample;
	}

	public void setSample(List sample) {
		this.sample = sample;
	}

	public Boolean getShowGeoInfo() {
		return showGeoInfo;
	}

	public void setShowGeoInfo(Boolean showGeoInfo) {
		this.showGeoInfo = showGeoInfo;
	}

	public Boolean getShowVisibilityInspector() {
		return showVisibilityInspector;
	}

	public void setShowVisibilityInspector(Boolean showVisibilityInspector) {
		this.showVisibilityInspector = showVisibilityInspector;
	}

	public String getTimestampSeconds() {
		return timestampSeconds;
	}

	public void setTimestampSeconds(String timestampSeconds) {
		this.timestampSeconds = timestampSeconds;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getUnnamedShapeCount() {
		return unnamedShapeCount;
	}

	public void setUnnamedShapeCount(Integer unnamedShapeCount) {
		this.unnamedShapeCount = unnamedShapeCount;
	}

	public List getUpdate() {
		return update;
	}

	public void setUpdate(List update) {
		this.update = update;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
}
