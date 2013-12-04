package com.openteach.meetup.server.client.entity;

import java.util.List;

/**
 * 
 * @author rqq
 *
 */
public class Album extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4740723186710183104L;
	
	private String name;
	private String albumSummaryType;
	private List<String> associatedMediaList;
	private String authkey;
	private Location contentLocation;
	private String description;
	private String ownerUserId;
	private Integer photoCount;
	private String relativeUrl;
	private String url;

	public String getAlbumSummaryType() {
		return albumSummaryType;
	}

	public void setAlbumSummaryType(String albumSummaryType) {
		this.albumSummaryType = albumSummaryType;
	}

	public List<String> getAssociatedMediaList() {
		return associatedMediaList;
	}

	public void setAssociatedMedia(List<String> associatedMediaList) {
		this.associatedMediaList = associatedMediaList;
	}

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public Location getContentLocation() {
		return contentLocation;
	}

	public void setContentLocation(Location contentLocation) {
		this.contentLocation = contentLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}

	public void setRelativeUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
