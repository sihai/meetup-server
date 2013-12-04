package com.openteach.meetup.server.client.entity;


/**
 * 
 * @author rqq
 *
 */
public class Photo extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2571056385004285923L;
	
	private String name;
	private Boolean isVideo;
	private String mediaType;
	private String onepickMediaId;
	private String originalContentUrl;
	private String originalLightboxPhotoId;
	private String originalMediaContainerUrl;
	private String originalMediaPlayerUrl;
	private String ownerUserId;
	private String albumId;
	private ImageObject thumbnail;
	private String url;
	private Location contentLocation;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public Boolean getIsVideo() {
		return isVideo;
	}

	public void setIsVideo(Boolean isVideo) {
		this.isVideo = isVideo;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOnepickMediaId() {
		return onepickMediaId;
	}

	public void setOnepickMediaId(String onepickMediaId) {
		this.onepickMediaId = onepickMediaId;
	}

	public String getOriginalContentUrl() {
		return originalContentUrl;
	}

	public void setOriginalContentUrl(String originalContentUrl) {
		this.originalContentUrl = originalContentUrl;
	}

	public String getOriginalLightboxPhotoId() {
		return originalLightboxPhotoId;
	}

	public void setOriginalLightboxPhotoId(String originalLightboxPhotoId) {
		this.originalLightboxPhotoId = originalLightboxPhotoId;
	}

	public String getOriginalMediaContainerUrl() {
		return originalMediaContainerUrl;
	}

	public void setOriginalMediaContainerUrl(String originalMediaContainerUrl) {
		this.originalMediaContainerUrl = originalMediaContainerUrl;
	}

	public String getOriginalMediaPlayerUrl() {
		return originalMediaPlayerUrl;
	}

	public void setOriginalMediaPlayerUrl(String originalMediaPlayerUrl) {
		this.originalMediaPlayerUrl = originalMediaPlayerUrl;
	}

	public String getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public ImageObject getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(ImageObject thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public Location getContentLocation() {
		return contentLocation;
	}

	public void setContentLocation(Location contentLocation) {
		this.contentLocation = contentLocation;
	}
}
