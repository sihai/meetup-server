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
public final class DataPhoto extends GenericJson {

	public List activityId;
	
	public DataAlbum album;
	
	public Integer albumSummaryRank;
	
	public String caption;
	
	public DataClusterInfo clusterInfo;
	
	public List comment;
	
	public Boolean copyrightViolation;
	
	public Boolean countryAwareTakenDown;
	
	public Integer croppedAreaImageHeightPixels;
	
	public Integer croppedAreaImageWidthPixels;
	
	public Integer croppedAreaLeftPixels;
	
	public Integer croppedAreaTopPixels;
	
	public DataCurationInfo curationInfo;
	
	public String description;
	
	public Long entityVersion;
	
	public DataExifInfo exifInfo;
	
	public Long fileSize;
	
	public Integer fullPanoHeightPixels;
	
	public Integer fullPanoWidthPixels;
	
	public DataGeoInfo geoInfo;
	
	public String geoLocation;
	
	public DataHistogram histogram;
	
	public String id;
	
	public Long imageVersion;
	
	public Boolean isFaceDetectionComplete;
	
	public Boolean isPanorama;
	
	public Boolean isYouTourPhoto;
	
	public Boolean isYoutubeVideo;
	
	public DataImage original;
	
	public DataUser owner;
	
	public String pageUrl;
	
	public String photoKey;
	
	public Boolean photoWasShared;
	
	public String pixyFilter;
	
	public List plusEvent;
	
	public DataPlusOne plusOne;
	
	public Boolean plusiPublic;
	
	public String projectionType;
	
	public String provider;
	
	public String reportAbuseToken;
	
	public SafeMobileUrl safeMobileUrl;
	
	public List shape;
	
	public String softDeleteAppealStatus;
	
	public Boolean softDeleted;
	
	public List streamId;
	
	public List thumbnail;
	
	public Double timestampSeconds;
	
	public String title;
	
	public Integer totalComments;
	
	public Long totalLikes;
	
	public DataImage unfiltered;
	
	public Update update;
	
	public String uploadStatus;
	
	public Double uploadTimestampSeconds;
	
	public DataVideo video;
	
	public Long viewCount;
	
	public Boolean viewerCanComment;
	
	public Boolean viewerCanPlusOne;
	
	public Boolean viewerCanTag;

	public List getActivityId() {
		return activityId;
	}

	public void setActivityId(List activityId) {
		this.activityId = activityId;
	}

	public DataAlbum getAlbum() {
		return album;
	}

	public void setAlbum(DataAlbum album) {
		this.album = album;
	}

	public Integer getAlbumSummaryRank() {
		return albumSummaryRank;
	}

	public void setAlbumSummaryRank(Integer albumSummaryRank) {
		this.albumSummaryRank = albumSummaryRank;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public DataClusterInfo getClusterInfo() {
		return clusterInfo;
	}

	public void setClusterInfo(DataClusterInfo clusterInfo) {
		this.clusterInfo = clusterInfo;
	}

	public List getComment() {
		return comment;
	}

	public void setComment(List comment) {
		this.comment = comment;
	}

	public Boolean getCopyrightViolation() {
		return copyrightViolation;
	}

	public void setCopyrightViolation(Boolean copyrightViolation) {
		this.copyrightViolation = copyrightViolation;
	}

	public Boolean getCountryAwareTakenDown() {
		return countryAwareTakenDown;
	}

	public void setCountryAwareTakenDown(Boolean countryAwareTakenDown) {
		this.countryAwareTakenDown = countryAwareTakenDown;
	}

	public Integer getCroppedAreaImageHeightPixels() {
		return croppedAreaImageHeightPixels;
	}

	public void setCroppedAreaImageHeightPixels(Integer croppedAreaImageHeightPixels) {
		this.croppedAreaImageHeightPixels = croppedAreaImageHeightPixels;
	}

	public Integer getCroppedAreaImageWidthPixels() {
		return croppedAreaImageWidthPixels;
	}

	public void setCroppedAreaImageWidthPixels(Integer croppedAreaImageWidthPixels) {
		this.croppedAreaImageWidthPixels = croppedAreaImageWidthPixels;
	}

	public Integer getCroppedAreaLeftPixels() {
		return croppedAreaLeftPixels;
	}

	public void setCroppedAreaLeftPixels(Integer croppedAreaLeftPixels) {
		this.croppedAreaLeftPixels = croppedAreaLeftPixels;
	}

	public Integer getCroppedAreaTopPixels() {
		return croppedAreaTopPixels;
	}

	public void setCroppedAreaTopPixels(Integer croppedAreaTopPixels) {
		this.croppedAreaTopPixels = croppedAreaTopPixels;
	}

	public DataCurationInfo getCurationInfo() {
		return curationInfo;
	}

	public void setCurationInfo(DataCurationInfo curationInfo) {
		this.curationInfo = curationInfo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getEntityVersion() {
		return entityVersion;
	}

	public void setEntityVersion(Long entityVersion) {
		this.entityVersion = entityVersion;
	}

	public DataExifInfo getExifInfo() {
		return exifInfo;
	}

	public void setExifInfo(DataExifInfo exifInfo) {
		this.exifInfo = exifInfo;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public Integer getFullPanoHeightPixels() {
		return fullPanoHeightPixels;
	}

	public void setFullPanoHeightPixels(Integer fullPanoHeightPixels) {
		this.fullPanoHeightPixels = fullPanoHeightPixels;
	}

	public Integer getFullPanoWidthPixels() {
		return fullPanoWidthPixels;
	}

	public void setFullPanoWidthPixels(Integer fullPanoWidthPixels) {
		this.fullPanoWidthPixels = fullPanoWidthPixels;
	}

	public DataGeoInfo getGeoInfo() {
		return geoInfo;
	}

	public void setGeoInfo(DataGeoInfo geoInfo) {
		this.geoInfo = geoInfo;
	}

	public String getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	public DataHistogram getHistogram() {
		return histogram;
	}

	public void setHistogram(DataHistogram histogram) {
		this.histogram = histogram;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getImageVersion() {
		return imageVersion;
	}

	public void setImageVersion(Long imageVersion) {
		this.imageVersion = imageVersion;
	}

	public Boolean getIsFaceDetectionComplete() {
		return isFaceDetectionComplete;
	}

	public void setIsFaceDetectionComplete(Boolean isFaceDetectionComplete) {
		this.isFaceDetectionComplete = isFaceDetectionComplete;
	}

	public Boolean getIsPanorama() {
		return isPanorama;
	}

	public void setIsPanorama(Boolean isPanorama) {
		this.isPanorama = isPanorama;
	}

	public Boolean getIsYouTourPhoto() {
		return isYouTourPhoto;
	}

	public void setIsYouTourPhoto(Boolean isYouTourPhoto) {
		this.isYouTourPhoto = isYouTourPhoto;
	}

	public Boolean getIsYoutubeVideo() {
		return isYoutubeVideo;
	}

	public void setIsYoutubeVideo(Boolean isYoutubeVideo) {
		this.isYoutubeVideo = isYoutubeVideo;
	}

	public DataImage getOriginal() {
		return original;
	}

	public void setOriginal(DataImage original) {
		this.original = original;
	}

	public DataUser getOwner() {
		return owner;
	}

	public void setOwner(DataUser owner) {
		this.owner = owner;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getPhotoKey() {
		return photoKey;
	}

	public void setPhotoKey(String photoKey) {
		this.photoKey = photoKey;
	}

	public Boolean getPhotoWasShared() {
		return photoWasShared;
	}

	public void setPhotoWasShared(Boolean photoWasShared) {
		this.photoWasShared = photoWasShared;
	}

	public String getPixyFilter() {
		return pixyFilter;
	}

	public void setPixyFilter(String pixyFilter) {
		this.pixyFilter = pixyFilter;
	}

	public List getPlusEvent() {
		return plusEvent;
	}

	public void setPlusEvent(List plusEvent) {
		this.plusEvent = plusEvent;
	}

	public DataPlusOne getPlusOne() {
		return plusOne;
	}

	public void setPlusOne(DataPlusOne plusOne) {
		this.plusOne = plusOne;
	}

	public Boolean getPlusiPublic() {
		return plusiPublic;
	}

	public void setPlusiPublic(Boolean plusiPublic) {
		this.plusiPublic = plusiPublic;
	}

	public String getProjectionType() {
		return projectionType;
	}

	public void setProjectionType(String projectionType) {
		this.projectionType = projectionType;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getReportAbuseToken() {
		return reportAbuseToken;
	}

	public void setReportAbuseToken(String reportAbuseToken) {
		this.reportAbuseToken = reportAbuseToken;
	}

	public SafeMobileUrl getSafeMobileUrl() {
		return safeMobileUrl;
	}

	public void setSafeMobileUrl(SafeMobileUrl safeMobileUrl) {
		this.safeMobileUrl = safeMobileUrl;
	}

	public List getShape() {
		return shape;
	}

	public void setShape(List shape) {
		this.shape = shape;
	}

	public String getSoftDeleteAppealStatus() {
		return softDeleteAppealStatus;
	}

	public void setSoftDeleteAppealStatus(String softDeleteAppealStatus) {
		this.softDeleteAppealStatus = softDeleteAppealStatus;
	}

	public Boolean getSoftDeleted() {
		return softDeleted;
	}

	public void setSoftDeleted(Boolean softDeleted) {
		this.softDeleted = softDeleted;
	}

	public List getStreamId() {
		return streamId;
	}

	public void setStreamId(List streamId) {
		this.streamId = streamId;
	}

	public List getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(List thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Double getTimestampSeconds() {
		return timestampSeconds;
	}

	public void setTimestampSeconds(Double timestampSeconds) {
		this.timestampSeconds = timestampSeconds;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTotalComments() {
		return totalComments;
	}

	public void setTotalComments(Integer totalComments) {
		this.totalComments = totalComments;
	}

	public Long getTotalLikes() {
		return totalLikes;
	}

	public void setTotalLikes(Long totalLikes) {
		this.totalLikes = totalLikes;
	}

	public DataImage getUnfiltered() {
		return unfiltered;
	}

	public void setUnfiltered(DataImage unfiltered) {
		this.unfiltered = unfiltered;
	}

	public Update getUpdate() {
		return update;
	}

	public void setUpdate(Update update) {
		this.update = update;
	}

	public String getUploadStatus() {
		return uploadStatus;
	}

	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}

	public Double getUploadTimestampSeconds() {
		return uploadTimestampSeconds;
	}

	public void setUploadTimestampSeconds(Double uploadTimestampSeconds) {
		this.uploadTimestampSeconds = uploadTimestampSeconds;
	}

	public DataVideo getVideo() {
		return video;
	}

	public void setVideo(DataVideo video) {
		this.video = video;
	}

	public Long getViewCount() {
		return viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

	public Boolean getViewerCanComment() {
		return viewerCanComment;
	}

	public void setViewerCanComment(Boolean viewerCanComment) {
		this.viewerCanComment = viewerCanComment;
	}

	public Boolean getViewerCanPlusOne() {
		return viewerCanPlusOne;
	}

	public void setViewerCanPlusOne(Boolean viewerCanPlusOne) {
		this.viewerCanPlusOne = viewerCanPlusOne;
	}

	public Boolean getViewerCanTag() {
		return viewerCanTag;
	}

	public void setViewerCanTag(Boolean viewerCanTag) {
		this.viewerCanTag = viewerCanTag;
	}
}
