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
public class ScrapBook extends GenericJson {

	public String albumId;
	public String albumUrl;
	public ScrapBookEntry coverPhotoEntry;
	public String defaultCoverPhotoUrl;
	public Metadata metadata;
	public List plusiEntry;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAlbumUrl() {
		return albumUrl;
	}

	public void setAlbumUrl(String albumUrl) {
		this.albumUrl = albumUrl;
	}

	public ScrapBookEntry getCoverPhotoEntry() {
		return coverPhotoEntry;
	}

	public void setCoverPhotoEntry(ScrapBookEntry coverPhotoEntry) {
		this.coverPhotoEntry = coverPhotoEntry;
	}

	public String getDefaultCoverPhotoUrl() {
		return defaultCoverPhotoUrl;
	}

	public void setDefaultCoverPhotoUrl(String defaultCoverPhotoUrl) {
		this.defaultCoverPhotoUrl = defaultCoverPhotoUrl;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List getPlusiEntry() {
		return plusiEntry;
	}

	public void setPlusiEntry(List plusiEntry) {
		this.plusiEntry = plusiEntry;
	}
}
