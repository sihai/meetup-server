/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class PlusPhoto extends GenericJson {

	public String albumId;
	public Boolean isVideo;
	public String mediaType;
	public String name;
	public String onepickMediaId;
	public String originalContentUrl;
	public String originalLightboxPhotoId;
	public String originalMediaContainerUrl;
	public String originalMediaPlayerUrl;
	public String ownerObfuscatedId;
	public String photoId;
	public ImageObject thumbnail;
	public String url;
	
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
	public String getOwnerObfuscatedId() {
		return ownerObfuscatedId;
	}
	public void setOwnerObfuscatedId(String ownerObfuscatedId) {
		this.ownerObfuscatedId = ownerObfuscatedId;
	}
	public String getPhotoId() {
		return photoId;
	}
	public void setPhotoId(String photoId) {
		this.photoId = photoId;
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
	
}
