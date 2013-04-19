/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class FileObject extends GenericJson {

	public String description;
	public String embedUrl;
	public String faviconUrl;
	public String name;
	public String playerType;
	public String proxiedFaviconUrl;
	public Thumbnail proxiedThumbnail;
	public String thumbnailUrl;
	public String url;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmbedUrl() {
		return embedUrl;
	}

	public void setEmbedUrl(String embedUrl) {
		this.embedUrl = embedUrl;
	}

	public String getFaviconUrl() {
		return faviconUrl;
	}

	public void setFaviconUrl(String faviconUrl) {
		this.faviconUrl = faviconUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public String getProxiedFaviconUrl() {
		return proxiedFaviconUrl;
	}

	public void setProxiedFaviconUrl(String proxiedFaviconUrl) {
		this.proxiedFaviconUrl = proxiedFaviconUrl;
	}

	public Thumbnail getProxiedThumbnail() {
		return proxiedThumbnail;
	}

	public void setProxiedThumbnail(Thumbnail proxiedThumbnail) {
		this.proxiedThumbnail = proxiedThumbnail;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
